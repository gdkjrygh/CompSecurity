// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            a, AppCache, h, b, 
//            c, AppRequestManager, AppNative, AppConfig

class AppLogUploader
    implements Closeable
{

    public static final String a = "errorSendTime";
    public static final String b = "0";
    private static AppLogUploader l = null;
    private long c;
    private long d;
    private AppRequestManager.AppRequest e;
    private AppRequestManager f;
    private b g;
    private AppNative h;
    private AppConfig i;
    private AppCache j;
    private h k;

    private AppLogUploader()
    {
        c = 0L;
        d = 0L;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        f = com.nielsen.app.sdk.a.t();
        g = com.nielsen.app.sdk.a.u();
        i = com.nielsen.app.sdk.a.n();
        h = com.nielsen.app.sdk.a.q();
        j = com.nielsen.app.sdk.a.o();
        k = com.nielsen.app.sdk.a.m();
        List list = j.e();
        if (list == null || list.isEmpty())
        {
            LinkedList linkedlist = new LinkedList();
            for (int i1 = 0; i1 < 23; i1++)
            {
                long l1 = i1;
                AppCache appcache = j;
                appcache.getClass();
                linkedlist.add(new AppCache.LogData(appcache, l1));
            }

            j.a(linkedlist);
        }
    }

    static AppCache a(AppLogUploader apploguploader)
    {
        return apploguploader.j;
    }

    public static AppLogUploader a()
    {
        if (l == null)
        {
            l = new AppLogUploader();
        }
        return l;
    }

    static AppRequestManager.AppRequest a(AppLogUploader apploguploader, AppRequestManager.AppRequest apprequest)
    {
        apploguploader.e = apprequest;
        return apprequest;
    }

    static AppConfig b(AppLogUploader apploguploader)
    {
        return apploguploader.i;
    }

    static h c(AppLogUploader apploguploader)
    {
        return apploguploader.k;
    }

    static long d(AppLogUploader apploguploader)
    {
        return apploguploader.d;
    }

    static long e(AppLogUploader apploguploader)
    {
        return apploguploader.c;
    }

    static b f(AppLogUploader apploguploader)
    {
        return apploguploader.g;
    }

    static AppNative g(AppLogUploader apploguploader)
    {
        return apploguploader.h;
    }

    static AppRequestManager h(AppLogUploader apploguploader)
    {
        return apploguploader.f;
    }

    static AppRequestManager.AppRequest i(AppLogUploader apploguploader)
    {
        return apploguploader.e;
    }

    public boolean a(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            AppCache.LogData logdata;
            int i1;
            if (jsonobject.has("Description"))
            {
                i1 = jsonobject.getInt("Code");
            } else
            {
                i1 = 0;
            }
            logdata = j.f(i1);
            if (logdata != null)
            {
                String s = "";
                if (jsonobject.has("Description"))
                {
                    s = jsonobject.getString("Description");
                }
                if (s != null && !s.isEmpty())
                {
                    logdata.addOccurrence(s);
                    j.a(logdata);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b()
    {
        long l2 = com.nielsen.app.sdk.h.g();
        String s = g.b("errorSendTime", "0");
        long l1;
        boolean flag;
        if (s != null && !s.isEmpty())
        {
            l1 = Long.valueOf(s).longValue();
        } else
        {
            l1 = 0L;
        }
        if (l2 < l1) goto _L2; else goto _L1
_L1:
        d = Long.valueOf(g.b("sdk_maxLogMsgLength", "140")).longValue();
        c = Long.valueOf(g.b("nol_maxLength", "1800")).longValue();
        if (l1 == 0L) goto _L4; else goto _L3
_L3:
        if (c() <= 0) goto _L6; else goto _L5
_L5:
        (new AppLogRequest(f)).startRequest();
        flag = true;
_L7:
        l1 = (long)Integer.parseInt(g.b("nol_errlogInterval", "86400")) + l2;
        g.a("errorSendTime", Long.toString(l1));
        com.nielsen.app.sdk.c.a('I', "UPLOADED LOG... Time to send logs now(%d), next time(%d)", new Object[] {
            Long.valueOf(l2), Long.valueOf(l1)
        });
        return flag;
_L6:
        com.nielsen.app.sdk.c.a('I', "No errors to send to Census", new Object[0]);
_L4:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }

    public int c()
    {
        Iterator iterator = j.e().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((AppCache.LogData)iterator.next()).getCount() > 0)
            {
                i1++;
            }
        } while (true);
        return i1;
    }

    public void close()
    {
    }


    private class AppLogRequest extends AppRequestManager.AppRequestHandler
    {

        public static final int BUFFER_SIZE = 0x3e800;
        public static final String REQUEST_NAME = "AppLogRequest";
        public static final int TIMEOUT_CONNECTION = 60000;
        public static final int TIMEOUT_DATA = 60000;
        List a;
        String b;
        final AppLogUploader c;

        public void onError(String s, long l1, Exception exception)
        {
            com.nielsen.app.sdk.c.a(exception, true, 9, 'E', "Log upload error, name(%s)", new Object[] {
                s
            });
        }

        public void onFinish(String s, long l1, String s1)
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
                    s1 = (AppCache.LogData)s.next();
                    if ((long)s1.getCount() > 0L)
                    {
                        s1.initialize(s1.getLog());
                        AppLogUploader.a(c).a(s1);
                    }
                } while (true);
            }
        }

        public void onIdle(String s, long l1)
        {
        }

        public void onStart(String s, long l1)
        {
        }

        public void onUpdate(String s, long l1, long l2, long l3, 
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

        public AppLogRequest(AppRequestManager apprequestmanager)
        {
            AppConfig.a a1;
            long l1;
            long l2;
            c = AppLogUploader.this;
            apprequestmanager.getClass();
            super(apprequestmanager, "AppLogRequest");
            a = null;
            b = null;
            a1 = AppLogUploader.b(AppLogUploader.this).c();
            l2 = 0L;
            l1 = l2;
            a = AppLogUploader.a(AppLogUploader.this).e();
            l1 = l2;
            if (a == null) goto _L2; else goto _L1
_L1:
            l1 = l2;
            if (!a.isEmpty()) goto _L3; else goto _L2
_L2:
            l1 = l2;
            throw new Exception("No error logs to send to Census");
            apprequestmanager;
_L10:
            l1 = l2;
            com.nielsen.app.sdk.c.a(apprequestmanager, true, 'I', "Failed sending logs to Census", new Object[0]);
            if (l2 == 0L)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            AppLogUploader.g(AppLogUploader.this).b(l2);
            a1.a();
_L9:
            return;
_L3:
            l1 = l2;
            if (AppLogUploader.c(AppLogUploader.this).r()) goto _L5; else goto _L4
_L4:
            l1 = l2;
            throw new Exception("No Network connection. Device is currently offline");
            apprequestmanager;
            l1 = l2;
_L12:
            throw new Exception("Could NOT post request to send logs to Census", apprequestmanager);
            apprequestmanager;
_L11:
            long l3;
            Object obj;
            boolean aflag[];
            Object obj1;
            Iterator iterator;
            boolean flag;
            int i1;
            long l4;
            if (l1 != 0L)
            {
                try
                {
                    AppLogUploader.g(AppLogUploader.this).b(l1);
                    a1.a();
                }
                // Misplaced declaration of an exception variable
                catch (AppLogUploader apploguploader)
                {
                    throw new Exception("URL parser on post Logs request failed releasing", AppLogUploader.this);
                }
            }
            throw apprequestmanager;
_L5:
            l1 = l2;
            com.nielsen.app.sdk.c.a('I', "Sending errors to Census", new Object[0]);
            l1 = l2;
            iterator = a.iterator();
            apprequestmanager = "";
            flag = true;
_L7:
            l1 = l2;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = l2;
            obj = (AppCache.LogData)iterator.next();
            l1 = l2;
            l3 = ((AppCache.LogData) (obj)).getCount();
            if (l3 <= 0L)
            {
                continue; /* Loop/switch isn't completed */
            }
            l1 = l2;
            l4 = ((AppCache.LogData) (obj)).getLog();
            l1 = l2;
            obj1 = (new StringBuilder("code=")).append(String.valueOf(l4)).append(",count=").append(String.valueOf(l3)).append(",t1=").append(String.valueOf(((AppCache.LogData) (obj)).getTimestamp())).append(",t2=").append(String.valueOf(((AppCache.LogData) (obj)).getTimestamp2())).append(",t3=").append(String.valueOf(((AppCache.LogData) (obj)).getTimestamp3())).append(",msg=").append(((AppCache.LogData) (obj)).getInfo()).toString();
            l1 = l2;
            obj = obj1;
            if ((long)((String) (obj1)).length() <= AppLogUploader.d(AppLogUploader.this))
            {
                break MISSING_BLOCK_LABEL_498;
            }
            l1 = l2;
            obj = (new StringBuilder()).append(((String) (obj1)).substring(0, (int)(AppLogUploader.d(AppLogUploader.this) - 1L - 20L))).append("...").toString();
            l1 = l2;
            obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1)).substring((int)(AppLogUploader.d(AppLogUploader.this) - 1L - 60L), (int)(AppLogUploader.d(AppLogUploader.this) - 1L))).toString();
            l1 = l2;
            if ((long)(apprequestmanager.length() + ((String) (obj)).length()) > AppLogUploader.e(AppLogUploader.this))
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = apprequestmanager;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_553;
            }
            l1 = l2;
            obj1 = (new StringBuilder()).append(apprequestmanager).append("|").toString();
            l1 = l2;
            apprequestmanager = (new StringBuilder()).append(((String) (obj1))).append(((String) (obj))).toString();
            flag = false;
            if (true) goto _L7; else goto _L6
_L6:
            l1 = l2;
            a1.a("nol_error_message", apprequestmanager);
            l1 = l2;
            obj = AppLogUploader.f(AppLogUploader.this).b("nol_errorURL", "http://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/error?message=|!(nol_error_message)!|,c13_|![nol_appid]!|,c16_|![nol_sdkv]!|,c8_|![nol_devGroup]!|,c7_|![nol_osGroup]!|,c10_|![nol_platform]!|,c17_|![nol_stationId]!|,c18_|![nol_assetid]!|,c6_|![nol_product]!|,ci_|![nol_clientid]!|");
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_628;
            }
            l1 = l2;
            apprequestmanager = ((AppRequestManager) (obj));
            if (!((String) (obj)).isEmpty())
            {
                break MISSING_BLOCK_LABEL_640;
            }
            l1 = l2;
            apprequestmanager = a1.a("nol_errorURL");
            l3 = l2;
            if (apprequestmanager == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            l1 = l2;
            l3 = l2;
            if (apprequestmanager.isEmpty())
            {
                continue; /* Loop/switch isn't completed */
            }
            l1 = l2;
            l3 = AppLogUploader.g(AppLogUploader.this).a();
            a1.a(l3);
            aflag = new boolean[1];
            aflag[0] = false;
            apprequestmanager = a1.a(apprequestmanager, aflag);
            if (!aflag[0] || apprequestmanager == null)
            {
                break MISSING_BLOCK_LABEL_820;
            }
            if (apprequestmanager.isEmpty())
            {
                break MISSING_BLOCK_LABEL_820;
            }
            i1 = com.nielsen.app.sdk.h.s();
            apprequestmanager = (new StringBuilder()).append(apprequestmanager).append("&rnd=").append(String.valueOf(i1)).toString();
            aflag = AppLogUploader.h(AppLogUploader.this);
            aflag.getClass();
            AppLogUploader.a(AppLogUploader.this, new AppRequestManager.AppRequest(aflag, "AppLogRequest", this, 60000, 60000, 0x3e800));
            b = apprequestmanager;
            if (l3 == 0L) goto _L9; else goto _L8
_L8:
            try
            {
                AppLogUploader.g(AppLogUploader.this).b(l3);
                a1.a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AppLogUploader apploguploader)
            {
                throw new Exception("URL parser on post Logs request failed releasing", AppLogUploader.this);
            }
            throw new Exception("Failed sending logs due to failed parsing");
            apprequestmanager;
            l2 = l3;
              goto _L10
            apploguploader;
            throw new Exception("URL parser on post Logs request failed releasing", AppLogUploader.this);
            apprequestmanager;
            l1 = l3;
              goto _L11
            apprequestmanager;
            l1 = l3;
              goto _L12
        }
    }

}
