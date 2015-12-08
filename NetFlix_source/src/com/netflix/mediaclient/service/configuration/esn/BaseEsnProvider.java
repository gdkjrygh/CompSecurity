// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.esn;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.util.CryptoUtils;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.netflix.mediaclient.service.configuration.esn:
//            EsnProvider

public abstract class BaseEsnProvider
    implements EsnProvider
{

    protected static final String DELIM = SecurityRepository.getModelDelim();
    protected static final int DEVICE_MODEL_LIMIT = 31;
    protected static final int DEVICE_MODEL_LIMIT_BRAND = 10;
    protected static final String ESN_DELIM = SecurityRepository.getEsnDelim();
    public static final String ESN_PREFIX = SecurityRepository.getEsnPrefix();
    protected static final int MANUFACTURER_LIMIT = 5;
    protected static final int MODEL_LIMIT = 45;
    protected static final String TAG = "ESN";
    protected static final String UKNOWN = "unknown";
    protected String deviceId;
    protected String esn;
    protected String fesn;
    protected String fesnModelId;
    protected String modelId;
    protected String nrdpDeviceModel;

    protected BaseEsnProvider()
    {
    }

    public static String buildFesnModelId()
    {
        return validateChars(findBaseModelId());
    }

    public static String findBaseModelId()
    {
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("Display ").append(Build.DISPLAY).toString());
            Log.d("ESN", (new StringBuilder()).append("ID ").append(Build.ID).toString());
            Log.d("ESN", (new StringBuilder()).append("MANUFACTURER ").append(Build.MANUFACTURER).toString());
            Log.d("ESN", (new StringBuilder()).append("Model ").append(Build.MODEL).toString());
            Log.d("ESN", (new StringBuilder()).append("PRODUCT ").append(Build.PRODUCT).toString());
            Log.d("ESN", (new StringBuilder()).append("USER ").append(Build.USER).toString());
            Log.d("ESN", (new StringBuilder()).append("BOARD ").append(Build.BOARD).toString());
            Log.d("ESN", (new StringBuilder()).append("BOOTLOADER ").append(Build.BOOTLOADER).toString());
            Log.d("ESN", (new StringBuilder()).append("BRAND ").append(Build.BRAND).toString());
            Log.d("ESN", (new StringBuilder()).append("FINGERPRINT ").append(Build.FINGERPRINT).toString());
            Log.d("ESN", (new StringBuilder()).append("CPU_ABI ").append(Build.CPU_ABI).toString());
            Log.d("ESN", (new StringBuilder()).append("CPU_ABI2 ").append(Build.CPU_ABI2).toString());
            Log.d("ESN", (new StringBuilder()).append("HARDWARE ").append(Build.HARDWARE).toString());
            Log.d("ESN", (new StringBuilder()).append("TYPE ").append(Build.TYPE).toString());
            Log.d("ESN", (new StringBuilder()).append("TAGS ").append(Build.TAGS).toString());
        }
        String s1 = Build.MODEL;
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("Model: ").append(s1).toString());
        }
        String s = s1;
        if (s1.length() > 45)
        {
            s1 = s1.substring(0, 45);
            s = s1;
            if (Log.isLoggable("ESN", 3))
            {
                Log.d("ESN", (new StringBuilder()).append("Model was bigger than: 45. Using first 45 characters: ").append(s1).toString());
                s = s1;
            }
        }
        s = (new StringBuilder()).append(getManufactorer()).append(StringUtils.replaceWhiteSpace(s, DELIM)).append("S").toString();
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("Model ID: ").append(s).toString());
        }
        return s;
    }

    public static String findDeviceModel()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        Log.d("ESN", (new StringBuilder()).append("BRAND ").append(s).toString());
        Log.d("ESN", (new StringBuilder()).append("MODEL ").append(s1).toString());
        int i = 0;
        if (s != null && !"".equals(s.trim()))
        {
            if (s.length() <= 10)
            {
                i = s.length();
                stringbuilder.append(s);
            } else
            {
                i = 10;
                stringbuilder.append(s.substring(0, 10));
            }
        } else
        {
            stringbuilder.append("unknown");
        }
        stringbuilder.append("_");
        if (s1 != null && !"".equals(s1.trim()))
        {
            i = 31 - i;
            if (s1.length() <= i)
            {
                stringbuilder.append(s1);
            } else
            {
                stringbuilder.append(s1.substring(0, i));
            }
        } else
        {
            stringbuilder.append("unknown");
        }
        return stringbuilder.toString();
    }

    private String findFutureDeviceId(Context context)
    {
        String s1 = getIMEA(context);
        String s = s1;
        if (s1 == null)
        {
            s = getMacAddressAndSerial(context);
        }
        s1 = s;
        if (s == null)
        {
            s1 = getAndroidId(context);
        }
        if (s1 == null)
        {
            Log.w("ESN", "Device ID not found, use and save random id");
            return getRandom(context);
        }
        if ("000000000000000".equalsIgnoreCase(s1))
        {
            Log.w("ESN", "Emulator");
            return "1012UAR71QB0A91";
        } else
        {
            return StringUtils.replaceWhiteSpace(s1, DELIM);
        }
    }

    private String getMacAddressAndSerial(Context context)
    {
        context = getMacAddress(context);
        String s = Build.SERIAL;
        if (context == null && s == null)
        {
            Log.w("ESN", "Both mac address and SERIAL are null!");
            context = null;
        } else
        if (context == null)
        {
            context = s;
            if (Log.isLoggable("ESN", 3))
            {
                Log.d("ESN", (new StringBuilder()).append("MAC address is NULL, but SERIAL exist: ").append(s).toString());
                return s;
            }
        } else
        {
            if (s == null)
            {
                if (Log.isLoggable("ESN", 3))
                {
                    Log.d("ESN", (new StringBuilder()).append("SERIAL is NULL, but MAC address exist: ").append(context).toString());
                }
                return context;
            }
            context = (new StringBuilder()).append(context).append(s).toString();
            if (Log.isLoggable("ESN", 3))
            {
                Log.d("ESN", (new StringBuilder()).append("SERIAL and MAC address both exist, return : ").append(context).toString());
            }
            return context;
        }
        return context;
    }

    protected static String getManufactorer()
    {
        String s1 = Build.MANUFACTURER;
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("manufacturer: ").append(s1).append("'").toString());
        }
        String s = s1;
        if (s1.length() < 5)
        {
            s = (new StringBuilder()).append(s1).append("       ").toString();
        }
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("manufacturer: ").append(s).append("'").toString());
        }
        s = s.substring(0, 5);
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("manufacturer: ").append(s).append("'").toString());
        }
        s = StringUtils.replaceWhiteSpace(s, DELIM, false);
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("manufacturer: ").append(s).append("'").toString());
        }
        return s;
    }

    private String getRandom(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = PreferenceUtils.getStringPref(context, "nf_rnd_device_id", null);
        String s;
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        s = UUID.randomUUID().toString();
        PreferenceUtils.putStringPref(context, "nf_rnd_device_id", s);
        this;
        JVM INSTR monitorexit ;
        return s;
        context;
        throw context;
    }

    private void init(Context context)
    {
        modelId = validateChars(findModelId());
        Object obj = findDeviceId(context);
        Log.d("ESN", (new StringBuilder()).append("===> Device ID: ").append(((String) (obj))).toString());
        Log.d("ESN", (new StringBuilder()).append("Token: ").append(SecurityRepository.getDeviceIdToken()).toString());
        try
        {
            context = CryptoUtils.hashSHA256(((String) (obj)), SecurityRepository.getDeviceIdToken());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("ESN", "===> Failed to hash device id. Use plain and report this", context);
            context = ((Context) (obj));
        }
        context = validateChars(context);
        deviceId = validateChars(((String) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append(ESN_PREFIX);
        ((StringBuilder) (obj)).append(modelId).append(ESN_DELIM).append(context);
        esn = ((StringBuilder) (obj)).toString();
        nrdpDeviceModel = findDeviceModel();
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("NRDP device model: '").append(nrdpDeviceModel).append("'").toString());
        }
        if (esn != null && esn.equals(fesn))
        {
            Log.d("ESN", "==> ESN and future ESN are the same!");
        }
    }

    private void initFutureEsn(Context context)
    {
        context = findFutureDeviceId(context);
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("===> Future Device ID: ").append(context).toString());
        }
        String s = CryptoUtils.hashSHA256(context, SecurityRepository.getDeviceIdToken());
        context = s;
_L2:
        context = validateChars(context);
        fesnModelId = validateChars(findBaseModelId());
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(ESN_PREFIX);
        stringbuilder.append(fesnModelId).append(ESN_DELIM).append(context);
        fesn = stringbuilder.toString();
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("===> Future ESN: ").append(fesn).toString());
        }
        return;
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        Log.e("ESN", "===> Failed to hash device id. Use plain and report this", nosuchalgorithmexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String validateChars(String s)
    {
        if (s == null || "".equals(s.trim()))
        {
            return "";
        }
        s = s.toUpperCase(Locale.ENGLISH);
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '-' || c == '=')
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append('=');
            }
            i++;
        }
        return stringbuilder.toString();
    }

    protected abstract String findDeviceId(Context context);

    protected abstract String findModelId();

    protected String getAndroidId(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("Android ID is ").append(context).toString());
        }
        return context;
    }

    public abstract int getCryptoFactoryType();

    public String getDeviceId()
    {
        return deviceId;
    }

    public String getDeviceModel()
    {
        return nrdpDeviceModel;
    }

    public String getESNPrefix()
    {
        return ESN_PREFIX;
    }

    public String getEsn()
    {
        return esn;
    }

    public String getFesn()
    {
        return fesn;
    }

    public String getFesnModelId()
    {
        return fesnModelId;
    }

    protected String getIMEA(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            Log.d("ESN", "Device is not a phone");
            context = null;
        } else
        {
            String s = context.getDeviceId();
            context = s;
            if (Log.isLoggable("ESN", 3))
            {
                Log.d("ESN", (new StringBuilder()).append("IMEA is ").append(s).toString());
                return s;
            }
        }
        return context;
    }

    protected String getMacAddress(Context context)
    {
        return ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
    }

    public String getManufacturer()
    {
        return validateChars(StringUtils.replaceWhiteSpace(Build.MANUFACTURER, DELIM));
    }

    public String getModelId()
    {
        return validateChars(StringUtils.replaceWhiteSpace(Build.MODEL, DELIM));
    }

    void initialize(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context can not be null");
        } else
        {
            init(context);
            initFutureEsn(context);
            return;
        }
    }

}
