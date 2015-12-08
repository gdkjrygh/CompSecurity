// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nielsen.app.sdk:
//            AppLogUploader, AppConfig, AppCache, c, 
//            AppNative, h, b, AppRequestManager

public class b extends andler
{

    public static final int BUFFER_SIZE = 0x3e800;
    public static final String REQUEST_NAME = "AppLogRequest";
    public static final int TIMEOUT_CONNECTION = 60000;
    public static final int TIMEOUT_DATA = 60000;
    List a;
    String b;
    final AppLogUploader c;

    public void onError(String s, long l, Exception exception)
    {
        com.nielsen.app.sdk.c.a(exception, true, 9, 'E', "Log upload error, name(%s)", new Object[] {
            s
        });
    }

    public void onFinish(String s, long l, String s1)
    {
        com.nielsen.app.sdk.c.a('I', "LOG UPLOAD received", new Object[0]);
        if (a != null)
        {
            s = a.iterator();
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                s1 = (a)s.next();
                if ((long)s1.a() > 0L)
                {
                    s1.a(s1.a());
                    AppLogUploader.a(c).a(s1);
                }
            } while (true);
        }
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
        try
        {
            AppLogUploader.i(c).get("", b);
        }
        catch (InterruptedException interruptedexception)
        {
            com.nielsen.app.sdk.c.a(interruptedexception, true, 'E', (new StringBuilder("startRequest() failed. Exception:")).append(interruptedexception).toString(), new Object[0]);
        }
        com.nielsen.app.sdk.c.a('I', "Posted HTTP GET Log (%s)", new Object[] {
            b
        });
    }

    public andler(AppLogUploader apploguploader, AppRequestManager apprequestmanager)
    {
        andler andler;
        long l;
        long l1;
        c = apploguploader;
        apprequestmanager.getClass();
        super(apprequestmanager, "AppLogRequest");
        a = null;
        b = null;
        andler = AppLogUploader.b(apploguploader).c();
        l1 = 0L;
        l = l1;
        a = AppLogUploader.a(apploguploader).e();
        l = l1;
        if (a == null) goto _L2; else goto _L1
_L1:
        l = l1;
        if (!a.isEmpty()) goto _L3; else goto _L2
_L2:
        l = l1;
        throw new Exception("No error logs to send to Census");
        apprequestmanager;
_L10:
        l = l1;
        com.nielsen.app.sdk.c.a(apprequestmanager, true, 'I', "Failed sending logs to Census", new Object[0]);
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        AppLogUploader.g(apploguploader).b(l1);
        andler.a();
_L9:
        return;
_L3:
        l = l1;
        if (AppLogUploader.c(apploguploader).r()) goto _L5; else goto _L4
_L4:
        l = l1;
        throw new Exception("No Network connection. Device is currently offline");
        apprequestmanager;
        l = l1;
_L12:
        throw new Exception("Could NOT post request to send logs to Census", apprequestmanager);
        apprequestmanager;
_L11:
        long l2;
        Object obj;
        boolean aflag[];
        Object obj1;
        Iterator iterator;
        boolean flag;
        int i;
        long l3;
        if (l != 0L)
        {
            try
            {
                AppLogUploader.g(apploguploader).b(l);
                andler.a();
            }
            // Misplaced declaration of an exception variable
            catch (AppLogUploader apploguploader)
            {
                throw new Exception("URL parser on post Logs request failed releasing", apploguploader);
            }
        }
        throw apprequestmanager;
_L5:
        l = l1;
        com.nielsen.app.sdk.c.a('I', "Sending errors to Census", new Object[0]);
        l = l1;
        iterator = a.iterator();
        apprequestmanager = "";
        flag = true;
_L7:
        l = l1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        l = l1;
        obj = (a)iterator.next();
        l = l1;
        l2 = ((a) (obj)).a();
        if (l2 <= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = l1;
        l3 = ((a) (obj)).a();
        l = l1;
        obj1 = (new StringBuilder("code=")).append(String.valueOf(l3)).append(",count=").append(String.valueOf(l2)).append(",t1=").append(String.valueOf(((a) (obj)).())).append(",t2=").append(String.valueOf((() (obj))._mth2())).append(",t3=").append(String.valueOf(((_cls2) (obj))._mth3())).append(",msg=").append(((_cls3) (obj))._mth3()).toString();
        l = l1;
        obj = obj1;
        if ((long)((String) (obj1)).length() <= AppLogUploader.d(apploguploader))
        {
            break MISSING_BLOCK_LABEL_498;
        }
        l = l1;
        obj = (new StringBuilder()).append(((String) (obj1)).substring(0, (int)(AppLogUploader.d(apploguploader) - 1L - 20L))).append("...").toString();
        l = l1;
        obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1)).substring((int)(AppLogUploader.d(apploguploader) - 1L - 60L), (int)(AppLogUploader.d(apploguploader) - 1L))).toString();
        l = l1;
        if ((long)(apprequestmanager.length() + ((String) (obj)).length()) > AppLogUploader.e(apploguploader))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = apprequestmanager;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        l = l1;
        obj1 = (new StringBuilder()).append(apprequestmanager).append("|").toString();
        l = l1;
        apprequestmanager = (new StringBuilder()).append(((String) (obj1))).append(((String) (obj))).toString();
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        l = l1;
        andler._mth3("nol_error_message", apprequestmanager);
        l = l1;
        obj = AppLogUploader.f(apploguploader).b("nol_errorURL", "http://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/error?message=|!(nol_error_message)!|,c13_|![nol_appid]!|,c16_|![nol_sdkv]!|,c8_|![nol_devGroup]!|,c7_|![nol_osGroup]!|,c10_|![nol_platform]!|,c17_|![nol_stationId]!|,c18_|![nol_assetid]!|,c6_|![nol_product]!|,ci_|![nol_clientid]!|");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_628;
        }
        l = l1;
        apprequestmanager = ((AppRequestManager) (obj));
        if (!((String) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_640;
        }
        l = l1;
        apprequestmanager = andler._mth3("nol_errorURL");
        l2 = l1;
        if (apprequestmanager == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = l1;
        l2 = l1;
        if (apprequestmanager.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        l = l1;
        l2 = AppLogUploader.g(apploguploader).a();
        andler._mth3(l2);
        aflag = new boolean[1];
        aflag[0] = false;
        apprequestmanager = andler._mth3(apprequestmanager, aflag);
        if (!aflag[0] || apprequestmanager == null)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        if (apprequestmanager.isEmpty())
        {
            break MISSING_BLOCK_LABEL_820;
        }
        i = h.s();
        apprequestmanager = (new StringBuilder()).append(apprequestmanager).append("&rnd=").append(String.valueOf(i)).toString();
        aflag = AppLogUploader.h(apploguploader);
        aflag.getClass();
        AppLogUploader.a(apploguploader, new <init>(aflag, "AppLogRequest", this, 60000, 60000, 0x3e800));
        b = apprequestmanager;
        if (l2 == 0L) goto _L9; else goto _L8
_L8:
        try
        {
            AppLogUploader.g(apploguploader).b(l2);
            andler.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AppLogUploader apploguploader)
        {
            throw new Exception("URL parser on post Logs request failed releasing", apploguploader);
        }
        throw new Exception("Failed sending logs due to failed parsing");
        apprequestmanager;
        l1 = l2;
          goto _L10
        apploguploader;
        throw new Exception("URL parser on post Logs request failed releasing", apploguploader);
        apprequestmanager;
        l = l2;
          goto _L11
        apprequestmanager;
        l = l2;
          goto _L12
    }
}
