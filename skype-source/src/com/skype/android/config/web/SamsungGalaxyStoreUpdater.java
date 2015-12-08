// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.web;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.skype.android.SkypeApplication;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.config.FileUtil;
import com.skype.android.config.UpdateConfig;
import com.skype.android.util.Charsets;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SamsungGalaxyStoreUpdater
{

    private static final String CSC_FILE_PATH = "/system/csc/sales_code.dat";
    private static final String DEFAULT_CSC = "WIFI";
    private static final int FIVE_MINUTES = 0x493e0;
    public static final String GALAXY_STORE = "GALAXY_STORE";
    public static final String GALAXY_STORE_TRACKING_ID = "537";
    public static final String SAMSUNG_PRELOAD_TRACKING_ID = "534";
    private static final int TWENTY_FOUR_HOURS = 0x5265c00;
    private static final int WHITELIST_MAX_AGE = 0x5265c00;
    private ApplicationConfig appConfig;
    private ConfigUpdater configUpdater;
    private Context context;
    private TelephonyManager telephonyManager;

    public SamsungGalaxyStoreUpdater(Application application, ApplicationConfig applicationconfig, ConfigUpdater configupdater)
    {
        context = application;
        appConfig = applicationconfig;
        configUpdater = configupdater;
        telephonyManager = (TelephonyManager)application.getSystemService("phone");
    }

    private String getCSC()
    {
        String s1 = "WIFI";
        String s2 = getCSCVersion();
        String s = s1;
        if (s2 != null)
        {
            s = s1;
            if (!"FAIL".equalsIgnoreCase(s2))
            {
                try
                {
                    s2 = s2.substring(0, 3);
                }
                catch (IndexOutOfBoundsException indexoutofboundsexception)
                {
                    return "WIFI";
                }
                s = s1;
                if (!TextUtils.isEmpty(s2))
                {
                    s = s2;
                }
            }
        }
        return s;
    }

    private String getCSCVersion()
    {
        Object obj;
        String s;
        Object obj2;
        obj = new File("/system/csc/sales_code.dat");
        if (!((File) (obj)).exists() || !((File) (obj)).isFile() || ((File) (obj)).length() == 0L)
        {
            return "";
        }
        obj2 = null;
        s = null;
        byte abyte0[];
        abyte0 = new byte[4096];
        obj = new FileInputStream(((File) (obj)));
        if (((InputStream) (obj)).read(abyte0) == 0) goto _L2; else goto _L1
_L1:
        s = new String(abyte0, Charsets.a);
_L4:
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        return s;
_L2:
        s = "FAIL";
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj = s;
_L8:
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        return "";
        Object obj1;
        obj1;
        obj = obj2;
_L6:
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static String getDeviceId()
    {
        String s = Build.MODEL;
        if ("OMAP_SS".equals(s))
        {
            return readModelCMCC();
        } else
        {
            return s.replaceFirst("SAMSUNG-", "");
        }
    }

    private String getMcc()
    {
        String s;
        String s1;
label0:
        {
            s1 = "";
            String s2 = telephonyManager.getSimOperator();
            if (s2 != null)
            {
                s = s2;
                if (s2.length() >= 3)
                {
                    break label0;
                }
            }
            s = "";
        }
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                s1 = s.substring(0, 3);
            }
            catch (IndexOutOfBoundsException indexoutofboundsexception)
            {
                indexoutofboundsexception.printStackTrace();
                return "";
            }
        }
        return s1;
    }

    private String getMnc()
    {
        String s1 = "";
        String s2 = telephonyManager.getSimOperator();
        String s = s1;
        if (s2 != null)
        {
            s = s1;
            if (s2.length() != 0)
            {
                try
                {
                    s = s2.substring(3);
                }
                catch (IndexOutOfBoundsException indexoutofboundsexception)
                {
                    return "";
                }
            }
        }
        return s;
    }

    public static boolean isUpdatableFromStore(Context context1)
    {
        context1 = ((SkypeApplication)context1.getApplicationContext()).f();
        return !TextUtils.isEmpty(context1) && context1.equals("534") && !TextUtils.isEmpty("0") && "0".equals("537");
    }

    private static String readModelCMCC()
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        byte abyte0[];
        obj = "";
        obj4 = new File("/system/version");
        obj2 = obj;
        if (!((File) (obj4)).exists())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj2 = obj;
        if (!((File) (obj4)).isFile())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        abyte0 = new byte[128];
        obj3 = null;
        obj2 = null;
        obj4 = new FileInputStream(((File) (obj4)));
        obj3 = obj;
        int i = ((InputStream) (obj4)).read(abyte0);
        obj2 = obj;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj3 = obj;
        obj2 = new String(abyte0, 0, i, Charsets.a);
        obj3 = obj2;
        ((InputStream) (obj4)).close();
        try
        {
            ((InputStream) (obj4)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return ((String) (obj2));
        }
_L2:
        return ((String) (obj2));
        obj3;
        obj4 = obj2;
_L5:
        obj2 = obj;
        if (obj4 == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((InputStream) (obj4)).close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return ((String) (obj));
        }
        return ((String) (obj));
        Object obj1;
        obj1;
        ioexception = ((IOException) (obj3));
_L4:
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw obj1;
        obj1;
        ioexception = ((IOException) (obj4));
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        obj1 = obj3;
          goto _L5
    }

    public static void startStoreIntent(Context context1)
    {
        Intent intent = new Intent();
        intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
        intent.putExtra("directcall", true);
        intent.putExtra("CallerType", 1);
        intent.putExtra("GUID", context1.getPackageName());
        intent.addFlags(0x14000020);
        context1.startActivity(intent);
    }

    private boolean updateVersionInfo(String s)
    {
        try
        {
            SAXParserFactory.newInstance().newSAXParser().parse(s, new DefaultHandler() {

                private int RESULT_CODE_OK;
                StringBuilder buffer;
                private boolean inResultCode;
                private boolean inVersionName;
                private boolean resultCodeOk;
                final SamsungGalaxyStoreUpdater this$0;

                public final void characters(char ac[], int i, int j)
                    throws SAXException
                {
                    buffer.append(ac, i, j);
                }

                public final void endElement(String s1, String s2, String s3)
                    throws SAXException
                {
                    if ("resultCode".equals(s2))
                    {
                        inResultCode = false;
                        resultCodeOk = isResultCodeOkAvailable(buffer.toString());
                    } else
                    if ("versionName".equals(s2))
                    {
                        inVersionName = false;
                        updateConfig(buffer.toString());
                        return;
                    }
                }

                public final boolean isResultCodeOkAvailable(String s1)
                {
                    int i = -1;
                    int j = Integer.parseInt(s1);
                    i = j;
_L2:
                    return i == RESULT_CODE_OK;
                    s1;
                    if (true) goto _L2; else goto _L1
_L1:
                }

                public final void startElement(String s1, String s2, String s3, Attributes attributes)
                    throws SAXException
                {
                    if ("resultCode".equals(s2))
                    {
                        inResultCode = true;
                        buffer.setLength(0);
                    } else
                    if (resultCodeOk && "versionName".equals(s2))
                    {
                        inVersionName = true;
                        buffer.setLength(0);
                        return;
                    }
                }

                public final void updateConfig(String s1)
                {
                    UpdateConfig updateconfig = appConfig.getUpdateConfig();
                    updateconfig.setSuggestedUpgradeVersion(s1);
                    updateconfig.setStoreName("GALAXY_STORE");
                    updateconfig.setAlwaysShow(true);
                    updateconfig.setLastUpdateTimestamp(System.currentTimeMillis());
                    updateconfig.setUpdateConfigurationRefreshed(true);
                    configUpdater.saveLocalConfig();
                    appConfig.sendConfigUpdatedEvent();
                }

            
            {
                this$0 = SamsungGalaxyStoreUpdater.this;
                super();
                inResultCode = false;
                inVersionName = false;
                RESULT_CODE_OK = 2;
                resultCodeOk = false;
                buffer = new StringBuilder();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return false;
    }

    public void checkVersionInfo()
    {
        if (shouldRefreshConfig())
        {
            String s = getUri();
            if (!TextUtils.isEmpty(s) && updateVersionInfo(s))
            {
                configUpdater.saveLocalConfig();
                appConfig.sendConfigUpdatedEvent();
            }
        }
    }

    String getUri()
    {
        String s2 = getMcc();
        String s3 = getMnc();
        String s1 = s2;
        String s = s3;
        if (TextUtils.isEmpty(s2))
        {
            s1 = s2;
            s = s3;
            if (TextUtils.isEmpty(s3))
            {
                s1 = "";
                s = "00";
            }
        }
        s3 = getDeviceId();
        String s4 = getCSC();
        s2 = context.getPackageName();
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(s2, 0).versionCode;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        s = (new StringBuilder("&versionCode=")).append(i).append("&deviceId=").append(s3).append("&mcc=").append(s1).append("&mnc=").append(s).append("&csc=").append(s4).append("&sdkVer=").append(android.os.Build.VERSION.SDK_INT).toString();
        s = (new StringBuilder()).append(s).append("&pd=").toString();
        return (new StringBuilder()).append("http://vas.samsungapps.com/stub/stubUpdateCheck.as?appId=").append(s2).append(s).toString();
    }

    public boolean shouldRefreshConfig()
    {
        boolean flag2 = false;
        UpdateConfig updateconfig = appConfig.getUpdateConfig();
        boolean flag;
        boolean flag1;
        if (updateconfig.getLastOsVersion() != android.os.Build.VERSION.SDK_INT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (System.currentTimeMillis() - updateconfig.getLastUpdateTimestamp() > 0x5265c00L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }


}
