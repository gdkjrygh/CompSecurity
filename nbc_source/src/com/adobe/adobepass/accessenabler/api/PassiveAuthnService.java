// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.CookieManager;
import com.adobe.adobepass.accessenabler.models.AuthenticationToken;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.adobe.adobepass.accessenabler.models.Requestor;
import com.adobe.adobepass.accessenabler.storage.StorageManager;
import com.adobe.adobepass.accessenabler.utils.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnablerContext, AccessEnablerService, AccessEnabler

public class PassiveAuthnService
{
    public static final class PassiveAuthnState extends Enum
    {

        private static final PassiveAuthnState $VALUES[];
        public static final PassiveAuthnState PASSIVE_IN_PROGRESS;
        public static final PassiveAuthnState PASSIVE_STOPPED;

        public static PassiveAuthnState valueOf(String s)
        {
            return (PassiveAuthnState)Enum.valueOf(com/adobe/adobepass/accessenabler/api/PassiveAuthnService$PassiveAuthnState, s);
        }

        public static PassiveAuthnState[] values()
        {
            return (PassiveAuthnState[])$VALUES.clone();
        }

        static 
        {
            PASSIVE_IN_PROGRESS = new PassiveAuthnState("PASSIVE_IN_PROGRESS", 0);
            PASSIVE_STOPPED = new PassiveAuthnState("PASSIVE_STOPPED", 1);
            $VALUES = (new PassiveAuthnState[] {
                PASSIVE_IN_PROGRESS, PASSIVE_STOPPED
            });
        }

        private PassiveAuthnState(String s, int i)
        {
            super(s, i);
        }
    }


    private static PassiveAuthnService instance;
    private final String COOKIE_EXPIRED = "; Expires=Thu, 01-Jan-1970 00:00:01 GMT";
    private final String COOKIE_SECURE = "; secure";
    private final String LOG_TAG = "PassiveAuthnService";
    private AccessEnablerContext aeContext;
    private AccessEnablerService aeService;

    private PassiveAuthnService(AccessEnablerContext accessenablercontext, AccessEnablerService accessenablerservice)
    {
        aeContext = accessenablercontext;
        aeService = accessenablerservice;
    }

    private Bundle buildPassiveAuthnHandlerBundle(String s, Map map)
    {
        Bundle bundle = new Bundle();
        bundle.putString("url", s);
        bundle.putStringArrayList("domains", new ArrayList(map.keySet()));
        String s1;
        for (s = map.keySet().iterator(); s.hasNext(); bundle.putStringArrayList(s1, (ArrayList)map.get(s1)))
        {
            s1 = (String)s.next();
        }

        return bundle;
    }

    private HashSet extractCookiesforDomain(CookieManager cookiemanager, String s)
    {
        HashSet hashset2 = new HashSet();
        Iterator iterator;
        String s2;
        if (s.startsWith("http://"))
        {
            s = formatCookiesIntoHttpHeader(cookiemanager.getCookie(s));
            cookiemanager = new HashSet();
        } else
        if (s.startsWith("https://"))
        {
            HashSet hashset = new HashSet();
            cookiemanager = formatCookiesIntoHttpHeader(cookiemanager.getCookie(s));
            s = hashset;
        } else
        {
            HashSet hashset1 = formatCookiesIntoHttpHeader(cookiemanager.getCookie((new StringBuilder()).append("http://").append(s).toString()));
            cookiemanager = formatCookiesIntoHttpHeader(cookiemanager.getCookie((new StringBuilder()).append("https://").append(s).toString()));
            cookiemanager.removeAll(hashset1);
            s = hashset1;
        }
        for (iterator = cookiemanager.iterator(); iterator.hasNext(); hashset2.add((new StringBuilder()).append(s2).append("; secure").toString()))
        {
            s2 = (String)iterator.next();
        }

        s = s.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s1 = (String)s.next();
            if (!cookiemanager.contains(s1))
            {
                hashset2.add(s1);
            }
        } while (true);
        return hashset2;
    }

    private HashSet formatCookiesIntoHttpHeader(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = new HashSet();
_L4:
        return s;
_L2:
        String as[] = s.split(";");
        HashSet hashset = new HashSet();
        int j = as.length;
        int i = 0;
        do
        {
            s = hashset;
            if (i >= j)
            {
                continue;
            }
            String s1 = as[i];
            s = s1.substring(0, s1.indexOf('=')).trim();
            s1 = s1.substring(s1.indexOf('=') + 1).trim();
            hashset.add((new StringBuilder()).append(s).append("=").append(s1).toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static PassiveAuthnService getInstance(AccessEnablerContext accessenablercontext, AccessEnablerService accessenablerservice)
    {
        if (instance == null)
        {
            instance = new PassiveAuthnService(accessenablercontext, accessenablerservice);
        }
        return instance;
    }

    public boolean canPerformPassiveAuthentication()
    {
        boolean flag = true;
        aeContext.storageManager.readFromStorage();
        aeContext.storageManager.clearInvalidEntitlementDataAfterEnablingAuthnPerRequestor();
        String s = aeContext.storageManager.getCurrentMvpdId();
        Mvpd mvpd = aeContext.requestor.getMvpd(s);
        if (mvpd == null || mvpd.hasAuthPerAggregator())
        {
            Object obj = aeContext.storageManager.findValidAuthnToken(aeContext.requestor, s, com.adobe.adobepass.accessenabler.models.AuthenticationToken.TokenType.AUTHN_PER_REQUESTOR, false);
            if (obj != null)
            {
                obj = aeContext.requestor.getMvpd(((AuthenticationToken) (obj)).getMvpdId());
            } else
            {
                obj = null;
            }
            if (mvpd == null)
            {
                if (obj != null && ((Mvpd) (obj)).hasPassiveAuthnEnabled())
                {
                    aeContext.storageManager.setCurrentMvpdId(((Mvpd) (obj)).getId());
                    return true;
                }
            } else
            {
                if (aeContext.storageManager.getAuthenticationToken(true) != null || obj == null || !((Mvpd) (obj)).getId().equals(s) || !((Mvpd) (obj)).hasPassiveAuthnEnabled())
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public void clearPassiveCookies()
    {
        CookieManager cookiemanager = CookieManager.getInstance();
        Map map = aeContext.storageManager.getPassiveAuthnCookies();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Iterator iterator1 = ((ArrayList)map.get(s)).iterator();
            while (iterator1.hasNext()) 
            {
                String as[] = ((String)iterator1.next()).split(";");
                if (as != null && as.length > 1)
                {
                    cookiemanager.setCookie(s, (new StringBuilder()).append(as[0]).append("; Expires=Thu, 01-Jan-1970 00:00:01 GMT").toString());
                }
            }
        }

    }

    public void doPassiveAuthentication()
    {
        aeContext.passiveAuthnState = PassiveAuthnState.PASSIVE_IN_PROGRESS;
        Object obj = aeContext.storageManager.getCurrentMvpdId();
        obj = aeContext.requestor.getMvpd(((String) (obj)));
        obj = aeService.buildAuthnUrl(((Mvpd) (obj)), true);
        Map map = aeContext.storageManager.getPassiveAuthnCookies();
        try
        {
            Handler handler = AccessEnabler.Factory.getInstance(null).getHandler();
            Message message = handler.obtainMessage();
            message.setData(buildPassiveAuthnHandlerBundle(((String) (obj)), map));
            handler.sendMessage(message);
            return;
        }
        catch (Exception exception)
        {
            Log.e("PassiveAuthnService", "Passive AuthN failed while grabbing the AccessEnabler singleton");
        }
        aeService.setRequestorComplete();
    }

    public void persistCookies(List list)
    {
        CookieManager cookiemanager;
        HashMap hashmap;
        Object obj;
        int i;
        int k;
        cookiemanager = CookieManager.getInstance();
        hashmap = new HashMap();
        i = 0;
        obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String as[] = ((String)((Iterator) (obj)).next()).split("\\.");
            int j;
            int l;
            int k1;
            if (as != null)
            {
                j = as.length;
            } else
            {
                j = -1;
            }
            list = "";
            l = j - 1;
            k1 = i;
            do
            {
                i = k1;
                if (l < 0)
                {
                    break;
                }
                int i2 = j - l;
                i = k1;
                if (i2 > k1)
                {
                    i = i2;
                }
                StringBuilder stringbuilder = (new StringBuilder()).append(as[l]);
                if (i2 > 1)
                {
                    list = (new StringBuilder()).append(".").append(list).toString();
                } else
                {
                    list = "";
                }
                list = stringbuilder.append(list).toString();
                if (i2 > 1)
                {
                    if (hashmap.get(Integer.valueOf(i2)) == null)
                    {
                        hashmap.put(Integer.valueOf(i2), new HashSet());
                    }
                    ((HashSet)hashmap.get(Integer.valueOf(i2))).add(list);
                }
                l--;
                k1 = i;
            } while (true);
        } while (true);
        obj = new HashMap();
        k = 2;
_L2:
        int i1;
        if (k > i)
        {
            break MISSING_BLOCK_LABEL_533;
        }
        list = (HashSet)hashmap.get(Integer.valueOf(k));
        if (list != null)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = i;
_L4:
        k++;
        i = i1;
        if (true) goto _L2; else goto _L1
_L1:
        Iterator iterator = list.iterator();
_L6:
        i1 = i;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        String s = (String)iterator.next();
        ArrayList arraylist = new ArrayList(extractCookiesforDomain(cookiemanager, s));
        ((HashMap) (obj)).put(s, arraylist);
        String as1[] = s.split("\\.");
        StringBuilder stringbuilder1;
        int j1;
        int l1;
        int j2;
        int k2;
        if (as1 != null)
        {
            j1 = as1.length;
        } else
        {
            j1 = -1;
        }
        list = "";
        l1 = j1 - 1;
        j2 = i;
        i = j2;
        if (l1 < 0) goto _L6; else goto _L5
_L5:
        k2 = j1 - l1;
        i = j2;
        if (k2 > j2)
        {
            i = k2;
        }
        stringbuilder1 = (new StringBuilder()).append(as1[l1]);
        if (k2 > 1)
        {
            list = (new StringBuilder()).append(".").append(list).toString();
        } else
        {
            list = "";
        }
        list = stringbuilder1.append(list).toString();
        if (k2 > 1 && !list.equals(s) && ((HashMap) (obj)).get(list) != null)
        {
            arraylist.removeAll((Collection)((HashMap) (obj)).get(list));
        }
        l1--;
        j2 = i;
        break MISSING_BLOCK_LABEL_383;
          goto _L6
        aeContext.storageManager.setPassiveAuthnCookies(((Map) (obj)));
        return;
    }
}
