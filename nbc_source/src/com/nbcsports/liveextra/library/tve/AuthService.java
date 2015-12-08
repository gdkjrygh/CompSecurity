// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.AccessEnablerContext;
import com.adobe.adobepass.accessenabler.api.AccessEnablerException;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.Event;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.adobe.adobepass.accessenabler.utils.SerializableNameValuePair;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            MvpdLookups, Channel, Logo

public class AuthService
{

    private final OkHttpClient client;
    private RuntimeConfiguration config;
    private final Application context;
    private Channel currentChannel;
    private final List delegates = new ArrayList();
    private AccessEnabler instance;
    private boolean isStarted;
    private final MvpdLookups lookups;
    private final SharedPreferences preferences;
    private String resourceIdTemplate;
    private int retry;
    private Mvpd selectedMvpd;
    private IAccessEnablerDelegate serviceDelegate;
    private TrackingHelper trackingHelper;
    private String zipData;

    public AuthService(AccessEnabler accessenabler, RuntimeConfiguration runtimeconfiguration, TrackingHelper trackinghelper, MvpdLookups mvpdlookups, OkHttpClient okhttpclient, Application application, SharedPreferences sharedpreferences)
    {
        retry = 0;
        serviceDelegate = new IAccessEnablerDelegate() {

            final AuthService this$0;

            public void displayProviderDialog(ArrayList arraylist)
            {
                Iterator iterator = arraylist.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Mvpd mvpd = (Mvpd)iterator.next();
                    Logo logo = (Logo)lookups.getLogos().get(mvpd.getId().toLowerCase());
                    if (logo != null)
                    {
                        mvpd.setLogoUrl(logo.getPicker());
                    }
                } while (true);
                for (int i = 0; i < delegates.size(); i++)
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).displayProviderDialog(arraylist);
                }

            }

            public void navigateToUrl(String s)
            {
                for (int i = 0; i < delegates.size(); i++)
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).navigateToUrl(s);
                }

            }

            public void preauthorizedResources(ArrayList arraylist)
            {
                for (int i = 0; i < delegates.size(); i++)
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).preauthorizedResources(arraylist);
                }

            }

            public void selectedProvider(Mvpd mvpd)
            {
                int i;
                if (mvpd != null)
                {
                    selectedMvpd = mvpd;
                } else
                {
                    zipData = null;
                    selectedMvpd = null;
                }
                for (i = 0; i < delegates.size(); i++)
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).selectedProvider(mvpd);
                }

            }

            public void sendTrackingData(Event event, ArrayList arraylist)
            {
                trackLink(event, arraylist);
                for (int i = 0; i < delegates.size(); i++)
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).sendTrackingData(event, arraylist);
                }

            }

            public void setAuthenticationStatus(int i, String s)
            {
                int j;
                if (i == 1)
                {
                    if (selectedMvpd != null && !selectedMvpd.getId().startsWith("TempPass"))
                    {
                        preferences.edit().putBoolean("TempPassEnabled", false).commit();
                    }
                } else
                {
                    selectedMvpd = null;
                }
                for (j = 0; j < delegates.size(); j++)
                {
                    ((IAccessEnablerDelegate)delegates.get(j)).setAuthenticationStatus(i, s);
                }

            }

            public void setMetadataStatus(MetadataKey metadatakey, MetadataStatus metadatastatus)
            {
                StringBuilder stringbuilder = (new StringBuilder()).append("setMetadataStatus(");
                Object obj;
                if (metadatakey != null)
                {
                    obj = Integer.valueOf(metadatakey.getKey());
                } else
                {
                    obj = "";
                }
                Timber.d(stringbuilder.append(obj).append(", ").append(metadatastatus).append(")").toString(), new Object[0]);
                if (metadatastatus != null) goto _L2; else goto _L1
_L1:
                Timber.d("No Metadata Value Available", new Object[0]);
_L10:
                return;
_L2:
                if (metadatakey == null) goto _L4; else goto _L3
_L3:
                metadatakey.getKey();
                JVM INSTR tableswitch 0 3: default 116
            //                           0 169
            //                           1 203
            //                           2 116
            //                           3 237;
                   goto _L5 _L6 _L7 _L5 _L8
_L5:
                break; /* Loop/switch isn't completed */
_L6:
                break; /* Loop/switch isn't completed */
_L4:
                int i = 0;
                while (i < delegates.size()) 
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).setMetadataStatus(metadatakey, metadatastatus);
                    i++;
                }
                if (true) goto _L10; else goto _L9
_L9:
                String s = metadatastatus.getSimpleResult();
                Timber.d((new StringBuilder()).append("METADATA_KEY_TTL_AUTHN: ").append(s).toString(), new Object[0]);
                  goto _L4
_L7:
                String s1 = metadatastatus.getSimpleResult();
                Timber.d((new StringBuilder()).append("METADATA_KEY_TTL_AUTHZ: ").append(s1).toString(), new Object[0]);
                  goto _L4
_L8:
                zipData = null;
                Object obj1 = metadatastatus.getUserMetadataResult();
label0:
                {
                    if (obj1 == null)
                    {
                        break label0;
                    }
                    try
                    {
                        retry = 0;
                        Timber.d((new StringBuilder()).append("Zip Data Found: ").append(obj1.toString()).toString(), new Object[0]);
                        zipData = obj1.toString();
                    }
                    catch (Exception exception)
                    {
                        Timber.d((new StringBuilder()).append("Failed to set metadata result: ").append(exception.toString()).toString(), new Object[0]);
                    }
                }
                  goto _L4
                if (3 > int i = ((Mvpd) (this)).getId)
                {
                    getUserMetadata();
                }
                Timber.d("MetadataStatus zip not available", new Object[0]);
                  goto _L4
            }

            public void setRequestorComplete(int i)
            {
                if (i == 1)
                {
                    instance.checkAuthentication();
                }
                for (int j = 0; j < delegates.size(); j++)
                {
                    ((IAccessEnablerDelegate)delegates.get(j)).setRequestorComplete(i);
                }

            }

            public void setToken(String s, String s1)
            {
                for (int i = 0; i < delegates.size(); i++)
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).setToken(s, s1);
                }

            }

            public void tokenRequestFailed(String s, String s1, String s2)
            {
                for (int i = 0; i < delegates.size(); i++)
                {
                    ((IAccessEnablerDelegate)delegates.get(i)).tokenRequestFailed(s, s1, s2);
                }

            }

            
            {
                this$0 = AuthService.this;
                super();
            }
        };
        instance = accessenabler;
        config = runtimeconfiguration;
        trackingHelper = trackinghelper;
        lookups = mvpdlookups;
        client = okhttpclient;
        context = application;
        preferences = sharedpreferences;
    }

    private void checkResourceAuthorization(String s)
    {
        resourceIdTemplate = resourceIdTemplate.replaceAll("\\r|\\n", "");
        if ("nbcentertainment".equalsIgnoreCase(s))
        {
            s = resourceIdTemplate.replaceFirst("<title>([a-zA-Z0-9\\s]*)</title>", "<title>nbc_linear</title>");
        } else
        {
            s = resourceIdTemplate.replaceFirst("<title>([a-zA-Z0-9\\s]*)</title>", (new StringBuilder()).append("<title>").append(s).append("</title>").toString());
        }
        s = s.replaceAll(">\\s*", ">");
        instance.checkAuthorization(s);
    }

    private void requestTemplate(final String channel)
    {
        Request request = (new com.squareup.okhttp.Request.Builder()).get().url(config.get().getAdobePassAuthURL()).build();
        client.newCall(request).enqueue(new Callback() {

            final AuthService this$0;
            final String val$channel;

            public void onFailure(Request request1, IOException ioexception)
            {
                instance.checkAuthorization(channel);
            }

            public void onResponse(Response response)
                throws IOException
            {
                resourceIdTemplate = response.body().string();
                checkResourceAuthorization(channel);
            }

            
            {
                this$0 = AuthService.this;
                channel = s;
                super();
            }
        });
    }

    private void setRequestor()
    {
        if (instance == null)
        {
            return;
        } else
        {
            setRequestor((Channel)lookups.getChannels().get(context.getString(0x7f070056).toLowerCase()));
            return;
        }
    }

    private void trackLink(Event event, ArrayList arraylist)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        Timber.d((new StringBuilder()).append("sendTrackingData : ").append(event.getErrorDetail()).toString(), new Object[0]);
        obj = obj1;
        String s = (String)arraylist.get(2);
        obj = s;
        Timber.d((new StringBuilder()).append("event:").append(event.toString()).toString(), new Object[0]);
        obj = s;
        Timber.d((new StringBuilder()).append("event_type:").append(event.getType()).toString(), new Object[0]);
        int i = 0;
_L2:
        obj = s;
        obj1 = s;
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s;
        Timber.d((new StringBuilder()).append("data_").append(i).append(":").append((String)arraylist.get(i)).toString(), new Object[0]);
        i++;
        if (true) goto _L2; else goto _L1
        obj1;
        Timber.w("errors while tracking auth event", new Object[] {
            obj1
        });
        obj1 = obj;
_L1:
        HashMap hashmap;
        hashmap = new HashMap();
        s = null;
        obj = null;
        if (event.getType() != 1) goto _L4; else goto _L3
_L3:
        if ("true".equalsIgnoreCase((String)arraylist.get(0)))
        {
            hashmap.put("nbcs.passauthorizesuccess", "true");
            hashmap.put("nbcs.passmvpd", arraylist.get(1));
            hashmap.put("nbcs.passauthorize", "Authorized");
            hashmap.put("nbcs.passguid", arraylist.get(2));
            obj = "Pass:Authorize:Success";
            Timber.d("Pass:Authorize:Success", new Object[0]);
        } else
        {
            hashmap.put("nbcs.passauthorizefail", "true");
            hashmap.put("nbcs.passmvpd", arraylist.get(1));
            hashmap.put("nbcs.passauthorize", "Not Authorized");
            hashmap.put("nbcs.passguid", arraylist.get(2));
            obj = "Authorization Pass (Fail)";
        }
_L6:
        if (obj != null)
        {
            trackingHelper.trackLink(((String) (obj)), hashmap);
        }
        return;
_L4:
        if (event.getType() == 0)
        {
            if ("true".equals(arraylist.get(0)))
            {
                hashmap.put("nbcs.passauthensuccess", "true");
                hashmap.put("nbcs.passmvpd", arraylist.get(1));
                hashmap.put("nbcs.passauthen", "Authenticated");
                hashmap.put("nbcs.passguid", arraylist.get(2));
                event = "Pass:Authenticate:Success";
            } else
            {
                hashmap.put("nbcs.passauthenfail", "true");
                hashmap.put("nbcs.passmvpd", "Not-Auth");
                hashmap.put("nbcs.passauthen", "Not Authenticated");
                hashmap.put("nbcs.passguid", arraylist.get(2));
                event = s;
                if (selectedMvpd != null)
                {
                    event = "Pass:Authenticate:Fail";
                }
            }
            obj = event;
            if (selectedMvpd != null)
            {
                arraylist = selectedMvpd.getId();
                obj = event;
                if (arraylist.startsWith("TempPass"))
                {
                    hashmap.put("nbcs.passguid", obj1);
                    obj = (new StringBuilder()).append("Pass:Authenticate:");
                    if (arraylist.equals("TempPass-LongTTL"))
                    {
                        arraylist = "SuccessTemp30";
                    } else
                    {
                        arraylist = "SuccessTemp5";
                    }
                    hashmap.put("nbcs.section", ((StringBuilder) (obj)).append(arraylist).toString());
                    obj = event;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        if (event.getType() == 2)
        {
            hashmap.put("nbcs.section", (new StringBuilder()).append("Pass:Select").append((String)arraylist.get(0)).toString());
            hashmap.put("nbcs.passmvpd", arraylist.get(0));
            hashmap.put("nbcs.passselected", "true");
            obj = (new StringBuilder()).append("Pass:Select:").append((String)arraylist.get(0)).toString();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void cancelAuthN()
    {
        instance.getContext().setAuthenticationInProgress(false);
    }

    public void checkAuthorization(String s)
    {
        if (TextUtils.isEmpty(resourceIdTemplate))
        {
            requestTemplate(s);
            return;
        } else
        {
            checkResourceAuthorization(s);
            return;
        }
    }

    public void getAuthNTTL()
    {
        MetadataKey metadatakey = new MetadataKey(0);
        instance.getMetadata(metadatakey);
    }

    public void getAuthZTTL(String s)
    {
        MetadataKey metadatakey = new MetadataKey(1);
        metadatakey.addArgument(new SerializableNameValuePair("resource_id", s));
        instance.getMetadata(metadatakey);
    }

    public Channel getCurrentChannel()
    {
        return currentChannel;
    }

    public AccessEnabler getInstance()
    {
        return instance;
    }

    public String getMvpdLogo(Mvpd mvpd)
    {
        Object obj = null;
        if (mvpd == null)
        {
            return null;
        }
        Logo logo = (Logo)lookups.getLogos().get(mvpd.getId().toLowerCase());
        mvpd = obj;
        if (logo != null)
        {
            mvpd = logo.getTopBar();
        }
        return mvpd;
    }

    public String getMvpdUrl(Mvpd mvpd)
    {
        if (mvpd != null)
        {
            if ((mvpd = (Logo)lookups.getLogos().get(mvpd.getId().toLowerCase())) != null)
            {
                return mvpd.getUrl();
            }
        }
        return null;
    }

    public Mvpd getSelectedMvpd()
    {
        return selectedMvpd;
    }

    public void getUserMetadata()
    {
        if (selectedMvpd == null)
        {
            return;
        }
        MetadataKey metadatakey = new MetadataKey(3);
        if (isComcast())
        {
            metadatakey.addArgument(new SerializableNameValuePair("user_metadata_name", "encryptedZip"));
        } else
        {
            metadatakey.addArgument(new SerializableNameValuePair("user_metadata_name", "zip"));
        }
        instance.getMetadata(metadatakey);
    }

    public String getZipData()
    {
        return zipData;
    }

    public boolean isBlacklisted(Mvpd mvpd)
    {
        return mvpd.getId().startsWith("TempPass");
    }

    public boolean isComcast()
    {
        return selectedMvpd != null && selectedMvpd.getId().equalsIgnoreCase("Comcast_SSO");
    }

    public boolean isStarted()
    {
        return isStarted;
    }

    public boolean isTempPassEnabled()
    {
        if (selectedMvpd != null && !selectedMvpd.getId().startsWith("TempPass"))
        {
            return false;
        } else
        {
            return preferences.getBoolean("TempPassEnabled", true);
        }
    }

    public void register(IAccessEnablerDelegate iaccessenablerdelegate)
    {
        synchronized (delegates)
        {
            if (!delegates.contains(iaccessenablerdelegate))
            {
                delegates.add(iaccessenablerdelegate);
            }
        }
        if (!isStarted)
        {
            start();
        }
        return;
        iaccessenablerdelegate;
        list;
        JVM INSTR monitorexit ;
        throw iaccessenablerdelegate;
    }

    public void registerPassive(IAccessEnablerDelegate iaccessenablerdelegate)
    {
        synchronized (delegates)
        {
            if (!delegates.contains(iaccessenablerdelegate))
            {
                delegates.add(iaccessenablerdelegate);
            }
        }
        if (!isStarted && config.get().isInitAdobePassOnAppStart())
        {
            start();
        }
        return;
        iaccessenablerdelegate;
        list;
        JVM INSTR monitorexit ;
        throw iaccessenablerdelegate;
    }

    public void setDefaultRequestor()
    {
        setRequestor();
    }

    public boolean setRequestor(Channel channel)
    {
        if (instance == null || channel == null)
        {
            return false;
        }
        while (selectedMvpd == null || selectedMvpd.getId().startsWith("TempPass") || channel.hasMvpd(selectedMvpd)) 
        {
            if (channel.equals(currentChannel))
            {
                return true;
            } else
            {
                instance.setRequestor(channel.getRequestorId(), channel.getSignedRequestorId(), new ArrayList(Arrays.asList(new String[] {
                    config.get().getAdobePassEndpoint()
                })));
                currentChannel = channel;
                return true;
            }
        }
        return false;
    }

    public void start()
    {
        if (isStarted)
        {
            return;
        }
        if (instance == null)
        {
            Timber.e(new AccessEnablerException(), "Access enabler was null", new Object[0]);
            return;
        } else
        {
            instance.enableLogging(false);
            instance.useHttps(true);
            setRequestor();
            instance.setDelegate(serviceDelegate);
            isStarted = true;
            return;
        }
    }

    public void unregister(IAccessEnablerDelegate iaccessenablerdelegate)
    {
        synchronized (delegates)
        {
            delegates.remove(iaccessenablerdelegate);
        }
        return;
        iaccessenablerdelegate;
        list;
        JVM INSTR monitorexit ;
        throw iaccessenablerdelegate;
    }





/*
    static Mvpd access$202(AuthService authservice, Mvpd mvpd)
    {
        authservice.selectedMvpd = mvpd;
        return mvpd;
    }

*/



/*
    static String access$402(AuthService authservice, String s)
    {
        authservice.zipData = s;
        return s;
    }

*/




/*
    static int access$702(AuthService authservice, int i)
    {
        authservice.retry = i;
        return i;
    }

*/


/*
    static int access$708(AuthService authservice)
    {
        int i = authservice.retry;
        authservice.retry = i + 1;
        return i;
    }

*/


/*
    static String access$802(AuthService authservice, String s)
    {
        authservice.resourceIdTemplate = s;
        return s;
    }

*/

}
