// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.util.Log;

// Referenced classes of package com.nielsen.app.sdk:
//            AppConfig, h, AppNative, c, 
//            AppScheduler, a, AppLogUploader, e, 
//            AppTaskUploader, AppSdk, AppRequestManager

public class uestHandler extends uestHandler
{

    public static final int BUFFER_SIZE = 0x3e800;
    public static final String REQUEST_NAME = "ConfigRequest";
    public static final int TIMEOUT_CONNECTION = 60000;
    public static final int TIMEOUT_DATA = 60000;
    final AppConfig a;
    private uest b;

    private void a()
    {
        if (AppConfig.f(a) < 4)
        {
            if (AppConfig.g(a) != null)
            {
                AppConfig.g(a).a("AppTaskConfig");
            }
            AppConfig.h(a);
        } else
        {
            if (AppConfig.f(a) == 4)
            {
                AppLogUploader apploguploader = com.nielsen.app.sdk.a.r();
                if (apploguploader != null)
                {
                    apploguploader.b();
                }
                com.nielsen.app.sdk.c.a(2, 'E', "Config not received, %s", new Object[] {
                    AppConfig.i(a)
                });
                if (AppConfig.g(a).c("AppTaskConfig") != null)
                {
                    AppConfig.g(a).b("AppTaskConfig");
                }
                AppConfig.a(a, new a(a, AppConfig.g(a), 0x927c0L));
                if (AppConfig.j(a) == null)
                {
                    throw new Exception("Could not instantiate config retry task. No config request will happen");
                }
                AppConfig.h(a);
            }
            if (AppConfig.g(a) != null)
            {
                AppConfig.g(a).a("AppTaskConfig");
                return;
            }
        }
    }

    private void b()
    {
        Object obj = com.nielsen.app.sdk.a.r();
        if (obj != null)
        {
            ((AppLogUploader) (obj)).b();
        }
        obj = com.nielsen.app.sdk.a.s();
        ((e) (obj)).e();
        long l = a.a("nol_sendTimer", 90L);
        String s = a.a();
        new AppTaskUploader(AppConfig.g(a), 1000L * l, s);
        AppConfig.g(a).a("AppUpload");
        com.nielsen.app.sdk.c.a('I', "START UPLOAD task now. Period(%d)", new Object[] {
            Long.valueOf(l)
        });
        ((e) (obj)).f();
        a.g();
        com.nielsen.app.sdk.c.a(1, "Config file successfully loaded and parsed.", new Object[0]);
    }

    private void c()
    {
        com.nielsen.app.sdk.a.s().e();
        com.nielsen.app.sdk.c.a('I', "STOP UPLOAD task now", new Object[0]);
        a a1 = AppConfig.g(a).c("AppUpload");
        if (a1 != null)
        {
            a1.cute();
        }
    }

    public void onError(String s, long l, Exception exception)
    {
        try
        {
            com.nielsen.app.sdk.c.a(9, 'E', "Failed to get config response", new Object[0]);
            if (AppSdk.a())
            {
                Log.d("AppSdk", "AppConfig Nielsen AppSDK: Failed sending config request");
            }
            a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.nielsen.app.sdk.c.a(exception, true, 9, 'E', "Failed to get config response; failed retry", new Object[0]);
        }
    }

    public void onFinish(String s, long l, String s1)
    {
        boolean flag;
        boolean flag1;
        try
        {
            com.nielsen.app.sdk.c.a('I', "CONFIG response: %s", new Object[] {
                s1
            });
            flag = AppConfig.c(a).e();
            flag1 = AppConfig.c(a).c();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.nielsen.app.sdk.c.a(s, true, 2, 'E', "Could not finalize download of config file", new Object[0]);
            return;
        }
        if (!flag && !flag1)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        AppConfig.c(a).b(false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        AppConfig.c(a).c(false);
        if (AppConfig.d(a) || AppConfig.e(a))
        {
            if (AppSdk.a())
            {
                Log.d("AppSdk", "AppConfig Nielsen AppSDK: Successfully sent opt out/disable ping");
            }
            com.nielsen.app.sdk.c.a('I', "Goodbye ping... USER OPT OUT / APP SDK DISABLE finished", new Object[0]);
            AppConfig.a(a, false);
            c();
            return;
        }
        com.nielsen.app.sdk.c.a('I', "Hello ping... USER OPT IN / APP SDK ENABLE finished", new Object[0]);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        if (s1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_253;
        }
        com.nielsen.app.sdk.c.a('I', "Receive content to parse.", new Object[0]);
        if (!a.c(s1))
        {
            if (AppSdk.a())
            {
                Log.d("AppSdk", "AppConfig Nielsen AppSDK: Successfully received config; failed parsing");
            }
            a();
            return;
        }
        if (AppSdk.a())
        {
            Log.d("AppSdk", "AppConfig Nielsen AppSDK: Successfully received config; parse succesful");
        }
        b();
        return;
        com.nielsen.app.sdk.c.a('I', "Received empty config file. Keep retrying", new Object[0]);
        if (AppSdk.a())
        {
            Log.d("AppSdk", "AppConfig Nielsen AppSDK: Received empty config");
        }
        a();
        return;
    }

    public void onIdle(String s, long l)
    {
    }

    public void onStart(String s, long l)
    {
    }

    public void onUpdate(String s, long l, long l1, long l2, 
            String s1)
    {
    }

    public void startRequest()
    {
        String s = (new StringBuilder("%%%")).append(AppConfig.c(a).getNuid()).append("%%%").toString();
        try
        {
            b.get(s, AppConfig.i(a));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            com.nielsen.app.sdk.c.a('E', "startRequest failed. Exception: %s", new Object[] {
                interruptedexception
            });
        }
    }

    public uestHandler(AppConfig appconfig, AppRequestManager apprequestmanager)
    {
        a = appconfig;
        apprequestmanager.getClass();
        super(apprequestmanager, "ConfigRequest");
        b = null;
        if (!AppConfig.c(appconfig).r())
        {
            throw new Exception("No Network connection. Device is currently offline");
        }
        long l = AppConfig.b(appconfig).a();
        if (l == 0L)
        {
            throw new Exception("No URL parser object instantiated");
        }
        AppConfig.k(appconfig).b(l);
        boolean flag = AppConfig.c(appconfig).c();
        if (flag)
        {
            uestHandler uesthandler = AppConfig.k(appconfig);
            boolean aflag[];
            int i;
            boolean flag1;
            if (AppConfig.e(appconfig))
            {
                apprequestmanager = "true";
            } else
            {
                apprequestmanager = "false";
            }
            uesthandler.b("nol_appdisable", apprequestmanager);
        } else
        {
            AppConfig.k(appconfig).b("nol_appdisable", "");
        }
        flag1 = AppConfig.c(appconfig).e();
        if (flag1)
        {
            uesthandler = AppConfig.k(appconfig);
            if (AppConfig.d(appconfig))
            {
                apprequestmanager = "true";
            } else
            {
                apprequestmanager = "false";
            }
            uesthandler.b("nol_useroptout", apprequestmanager);
        } else
        {
            AppConfig.k(appconfig).b("nol_useroptout", "");
        }
        if (!flag && !flag1 || !AppConfig.e(appconfig) && !AppConfig.d(appconfig))
        {
            apprequestmanager = AppConfig.k(appconfig).b("latitude");
            AppConfig.k(appconfig).b("nol_latitude", apprequestmanager);
            apprequestmanager = AppConfig.k(appconfig).b("longitude");
            AppConfig.k(appconfig).b("nol_longitude", apprequestmanager);
        } else
        {
            AppConfig.k(appconfig).b("nol_latitude", "");
            AppConfig.k(appconfig).b("nol_longitude", "");
        }
        apprequestmanager = AppConfig.k(appconfig).b("nol_url_override");
        if (apprequestmanager == null || apprequestmanager.isEmpty())
        {
            i = h.s();
            apprequestmanager = (new StringBuilder()).append("https://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/cfg?cfgv=150&longitude=|![nol_longitude]!|&latitude=|![nol_latitude]!|&apid=|!nol_appid!|&apv=|!nol_appversion!|&apn=|!nol_appname!|&sdkv=|!nol_sdkversion!|&nuid=|!nol_nuid!|&osver=|!nol_osversion!|&devtypid=|!nol_devtypeid!|&devid=|![nol_deviceId]!|&fmt=json&adf=|![nol_appdisable]!|&uoo=|![nol_useroptout]!|&sfcode=|![nol_sfcode]!|&ccode=|![nol_countrycode]!|&dma=|![nol_dma]!||![nol_appParams]!|").append("&rnd=").append(String.valueOf(i)).toString();
        } else
        {
            com.nielsen.app.sdk.c.a('I', "USING URL OVERRIDE", new Object[0]);
        }
        aflag = new boolean[1];
        aflag[0] = false;
        AppConfig.a(appconfig, AppConfig.k(appconfig).b(apprequestmanager, aflag));
        if (aflag[0] && AppConfig.i(appconfig) != null && !AppConfig.i(appconfig).isEmpty())
        {
            if (AppConfig.i(appconfig).contains("?"))
            {
                com.nielsen.app.sdk.c.a('I', "Config request. Sending message: %s", new Object[] {
                    AppConfig.i(appconfig)
                });
                apprequestmanager = AppConfig.a(appconfig);
                apprequestmanager.getClass();
                b = new uest(apprequestmanager, "ConfigRequest", this, 60000, 60000, 0x3e800);
            } else
            {
                com.nielsen.app.sdk.c.a(3, 'E', "Missing query string in config url (%s)", new Object[] {
                    AppConfig.i(appconfig)
                });
            }
        }
        AppConfig.b(appconfig).b(l);
        AppConfig.k(appconfig).uestHandler();
    }
}
