// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.ui.Callback;
import com.netflix.mediaclient.javabridge.ui.Device;
import com.netflix.mediaclient.javabridge.ui.android.device.FactoryResetCompleteCommand;
import com.netflix.mediaclient.repository.UserLocale;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdObject

public final class NativeDevice extends NativeNrdObject
    implements Device
{

    public static final String METHOD_factoryReset = "factoryReset";
    public static final String PROPERTY_UILanguages = "UILanguages";
    public static final String PROPERTY_UIVersion = "UIVersion";
    public static final String SDK_VERSION = "12.1";
    private static final String TAG = "nf-bridge";
    private String uiLanguages[];
    private String uiVersion;

    public NativeDevice(Bridge bridge)
    {
        super(bridge);
    }

    private int handleEvent(JSONObject jsonobject)
        throws Exception
    {
        JSONObject jsonobject1 = getJSONObject(jsonobject, "data", null);
        jsonobject = getString(jsonobject, "name", null);
        if (jsonobject1 != null && jsonobject1.has("idx") && "factoryReset".equalsIgnoreCase(jsonobject))
        {
            return handleCallback(new FactoryResetCompleteCommand(jsonobject1));
        } else
        {
            return 1;
        }
    }

    private int handlePropertyUpdate(JSONObject jsonobject)
        throws JSONException
    {
        if (getJSONObject(jsonobject, "properties", null) == null)
        {
            Log.w("nf-bridge", "handlePropertyUpdate:: properties does not exist");
            return 0;
        } else
        {
            Log.d("nf-bridge", "Not updating properties for now. That may change");
            return 1;
        }
    }

    public void factoryReset(Callback callback)
    {
        invokeMethodWithCallback("device", "factoryReset", null, callback);
    }

    public String getCertificationVersion()
    {
        String s1 = getSoftwareVersion().trim();
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("SV: ").append(s1).toString());
        }
        int i = s1.indexOf(" ");
        String s = s1;
        if (i > 0)
        {
            s = s1.substring(0, i);
        }
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("CV: ").append(s).toString());
        }
        return s;
    }

    public String getDeviceModel()
    {
        EsnProvider esnprovider = bridge.getEsnProvider();
        if (esnprovider == null)
        {
            return "N/A";
        } else
        {
            return esnprovider.getModelId();
        }
    }

    public String getESN()
    {
        EsnProvider esnprovider = bridge.getEsnProvider();
        if (esnprovider == null)
        {
            return "N/A";
        } else
        {
            return esnprovider.getEsn();
        }
    }

    public String getESNPrefix()
    {
        return EsnProvider.ESN_PREFIX;
    }

    public String getFriendlyName()
    {
        return "Android";
    }

    public String getLanguage()
    {
        Object obj;
        if (bridge == null)
        {
            Log.d("nf-bridge", "bridge is gone, probably destroyed. Ignoring");
            obj = Locale.ENGLISH.getLanguage();
        } else
        {
            obj = bridge.getDeviceLocale();
            String s = "en";
            if (obj != null)
            {
                s = UserLocale.toUserLocale(((Locale) (obj)));
            } else
            {
                Log.e("nf-bridge", "Device locale can not be null! Default to 'en'.");
            }
            obj = s;
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-bridge", (new StringBuilder()).append("Current device locale as raw user locale: ").append(s).toString());
                return s;
            }
        }
        return ((String) (obj));
    }

    public String getName()
    {
        return "device";
    }

    public String getPath()
    {
        return "nrdp.device";
    }

    public String getSDKVersion()
    {
        return "12.1";
    }

    public String getSoftwareVersion()
    {
        String s1 = bridge.getSoftwareVersion();
        String s = s1;
        if (s1 == null)
        {
            s = "N/A";
        }
        return s;
    }

    public String[] getUILanguages()
    {
        return uiLanguages;
    }

    public String getUIVersion()
    {
        return uiVersion;
    }

    public int processUpdate(JSONObject jsonobject)
    {
        int i;
        try
        {
            String s = getString(jsonobject, "type", null);
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-bridge", (new StringBuilder()).append("processUpdate: handle type ").append(s).toString());
            }
            if (!"PropertyUpdate".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_99;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf-bridge", "Failed with JSON", jsonobject);
            return 1;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("processUpdate: handle prop update ").append(jsonobject.toString()).toString());
        }
        return handlePropertyUpdate(jsonobject);
        Log.d("nf-bridge", "processUpdate: handle event");
        i = handleEvent(jsonobject);
        return i;
    }

    public void setUILanguages(String as[])
    {
        uiLanguages = as;
        as = StringUtils.joinArray(as);
        bridge.getNrdProxy().setProperty("device", "UILanguages", as);
    }

    public void setUIVersion(String s)
    {
        uiVersion = s;
        bridge.getNrdProxy().setProperty("device", "UIVersion", s);
    }
}
