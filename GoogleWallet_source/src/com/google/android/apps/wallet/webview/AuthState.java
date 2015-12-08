// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.accounts.Account;
import com.google.android.apps.wallet.logging.WLog;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            ServiceAuthInfo, ServiceAuthState, HybridWebViewManager, HybridWebViewCookieManager

public final class AuthState
{
    public static interface Client
    {

        public abstract boolean isPreloading();

        public abstract boolean onAuthCompleted(ServiceAuthInfo serviceauthinfo, boolean flag, boolean flag1);
    }


    private final Account account;
    private final Map authServices = new HashMap();
    private final Set clients = new HashSet();
    private final HybridWebViewManager webViewManager;

    public AuthState(Account account1, HybridWebViewManager hybridwebviewmanager)
    {
        account = account1;
        webViewManager = hybridwebviewmanager;
    }

    private boolean checkCookiesExpired(ServiceAuthInfo serviceauthinfo)
    {
        for (Iterator iterator = serviceauthinfo.cookiesToCheck.iterator(); iterator.hasNext();)
        {
            Object obj = (ServiceAuthInfo.CookieInfo)iterator.next();
            if (((ServiceAuthInfo.CookieInfo) (obj)).allowedAgeInSeconds > 0)
            {
                ServiceAuthState serviceauthstate = getServiceState(serviceauthinfo);
                if (serviceauthstate.getAuthState() != ServiceAuthState.State.Authenticated)
                {
                    obj = ((ServiceAuthInfo.CookieInfo) (obj)).name;
                    serviceauthinfo = serviceauthinfo.service;
                    WLog.d("AuthState", (new StringBuilder(String.valueOf(obj).length() + 61 + String.valueOf(serviceauthinfo).length())).append("Cookie ").append(((String) (obj))).append(" requires service ").append(serviceauthinfo).append(" to be authenticated in this session").toString());
                    return true;
                }
                if (serviceauthstate.timeSinceLastAuthSecs() > (long)((ServiceAuthInfo.CookieInfo) (obj)).allowedAgeInSeconds)
                {
                    serviceauthinfo = ((ServiceAuthInfo.CookieInfo) (obj)).name;
                    String s = String.valueOf(String.valueOf(((ServiceAuthInfo.CookieInfo) (obj)).allowedAgeInSeconds));
                    obj = String.valueOf(String.valueOf(((ServiceAuthInfo.CookieInfo) (obj)).allowedAgeInSeconds));
                    WLog.d("AuthState", (new StringBuilder(String.valueOf(serviceauthinfo).length() + 54 + String.valueOf(s).length() + String.valueOf(obj).length())).append("Cookie ").append(serviceauthinfo).append(" allows max age of ").append(s).append(" sec. but it has been ").append(((String) (obj))).append(" secs.").toString());
                    return true;
                }
            }
        }

        return false;
    }

    private boolean checkIfNeedAuth(ServiceAuthInfo serviceauthinfo)
    {
        if (!serviceauthinfo.cookiesToCheck.isEmpty())
        {
            if (!webViewManager.getCookieManager().containsCookies(serviceauthinfo.cookiesToCheck))
            {
                return true;
            }
            if (checkCookiesExpired(serviceauthinfo))
            {
                return true;
            }
        }
        return false;
    }

    private ServiceAuthState getOrInsertEntryForService(ServiceAuthInfo serviceauthinfo)
    {
        String s = serviceauthinfo.getServiceKey();
        ServiceAuthState serviceauthstate = (ServiceAuthState)authServices.get(s);
        Object obj = serviceauthstate;
        if (serviceauthstate == null)
        {
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "new service: ".concat(((String) (obj)));
            } else
            {
                obj = new String("new service: ");
            }
            WLog.d("AuthState", ((String) (obj)));
            obj = new ServiceAuthState(serviceauthinfo);
            authServices.put(s, obj);
        }
        return ((ServiceAuthState) (obj));
    }

    private ServiceAuthState getServiceState(ServiceAuthInfo serviceauthinfo)
    {
        return getOrInsertEntryForService(serviceauthinfo);
    }

    private void notifyClientsOfAuthCompletion(ServiceAuthInfo serviceauthinfo, boolean flag)
    {
        boolean flag1 = false;
        Iterator iterator = clients.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Client client = (Client)iterator.next();
            if (!client.isPreloading())
            {
                flag1 |= client.onAuthCompleted(serviceauthinfo, flag, flag1);
            }
        } while (true);
        iterator = clients.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Client client1 = (Client)iterator.next();
            if (client1.isPreloading())
            {
                client1.onAuthCompleted(serviceauthinfo, flag, flag1);
            }
        } while (true);
    }

    final void addClient(Client client)
    {
        clients.add(client);
    }

    public final ServiceAuthState checkAndGetServiceState(ServiceAuthInfo serviceauthinfo)
    {
        ServiceAuthState serviceauthstate = getServiceState(serviceauthinfo);
        if (serviceauthstate.getAuthState() == ServiceAuthState.State.InProgress && !ServiceAuthState.isInProgressStateStillValid(serviceauthstate.timeSinceLastAuthProcesssStartSecs()))
        {
            serviceauthstate.setAuthState(ServiceAuthState.State.NotAuthenticated);
        } else
        if (serviceauthstate.getAuthState() == ServiceAuthState.State.Authenticated && checkIfNeedAuth(serviceauthinfo))
        {
            serviceauthstate.setAuthState(ServiceAuthState.State.NotAuthenticated);
            return serviceauthstate;
        }
        return serviceauthstate;
    }

    public final Account getAccount()
    {
        return account;
    }

    public final ServiceAuthInfo getAuthInfo(String s)
    {
        s = (ServiceAuthState)authServices.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return ((ServiceAuthState) (s)).info;
        }
    }

    final void handleAuthCompletion(ServiceAuthInfo serviceauthinfo, boolean flag)
    {
        Object obj1 = serviceauthinfo.getServiceKey();
        Object obj = String.valueOf(obj1);
        if (((String) (obj)).length() != 0)
        {
            obj = "Processing auth completion for ".concat(((String) (obj)));
        } else
        {
            obj = new String("Processing auth completion for ");
        }
        WLog.d("AuthState", ((String) (obj)));
        obj1 = (ServiceAuthState)authServices.get(obj1);
        if (flag)
        {
            obj = ServiceAuthState.State.Authenticated;
        } else
        {
            obj = ServiceAuthState.State.NotAuthenticated;
        }
        ((ServiceAuthState) (obj1)).setAuthState(((ServiceAuthState.State) (obj)));
        notifyClientsOfAuthCompletion(serviceauthinfo, flag);
    }

    public final boolean isAuthenticatedForAtLeastOneService()
    {
        for (Iterator iterator = authServices.values().iterator(); iterator.hasNext();)
        {
            if (((ServiceAuthState)iterator.next()).getAuthState() == ServiceAuthState.State.Authenticated)
            {
                return true;
            }
        }

        return false;
    }

    public final void prepareCookiesBeforeTokenUrlLoad(ServiceAuthInfo serviceauthinfo)
    {
        if (checkCookiesExpired(serviceauthinfo))
        {
            webViewManager.getCookieManager().clearStaleCookies(serviceauthinfo.removeSessionCookies, serviceauthinfo.cookiesToCheck);
        }
    }

    final void removeClient(Client client)
    {
        clients.remove(client);
    }

    public final void reset()
    {
        for (Iterator iterator = authServices.values().iterator(); iterator.hasNext(); ((ServiceAuthState)iterator.next()).setAuthState(ServiceAuthState.State.NotAuthenticated)) { }
    }

    public final boolean shouldDoAuth(ServiceAuthInfo serviceauthinfo, String s)
    {
        return serviceauthinfo.preloadPolicy == ServiceAuthInfo.PreloadAuthPolicy.Always || serviceauthinfo.preloadPolicy == ServiceAuthInfo.PreloadAuthPolicy.Check && checkIfNeedAuth(serviceauthinfo);
    }

    final void startAuthForService(ServiceAuthInfo serviceauthinfo, ServiceAuthInfo serviceauthinfo1)
    {
        getServiceState(serviceauthinfo).setAuthState(ServiceAuthState.State.InProgress);
        if (serviceauthinfo1 != null)
        {
            serviceauthinfo = (ServiceAuthState)authServices.get(serviceauthinfo1.getServiceKey());
            if (serviceauthinfo != null && serviceauthinfo.getAuthState() == ServiceAuthState.State.InProgress)
            {
                handleAuthCompletion(serviceauthinfo1, false);
            }
        }
    }
}
