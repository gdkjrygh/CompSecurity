// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            a, AppCache, h, AppConfig, 
//            e, c, AppNative, d, 
//            AppRequestManager, AppScheduler

class AppTaskUploader extends AppScheduler.AppTask
{

    public static final String a = "AppUpload";
    public static final int b = 2000;
    String c;
    AppRequestManager d;
    private AppNative e;
    private AppConfig g;
    private h h;
    private Map i;
    private Lock j;

    public AppTaskUploader(AppScheduler appscheduler, long l, String s)
    {
        long l1 = 2000L;
        appscheduler.getClass();
        if (l > 2000L)
        {
            l1 = l;
        }
        super(appscheduler, "AppUpload", 0L, l1);
        e = null;
        g = null;
        h = null;
        c = "";
        i = null;
        d = null;
        j = new ReentrantLock();
        d = com.nielsen.app.sdk.a.t();
        e = com.nielsen.app.sdk.a.q();
        g = com.nielsen.app.sdk.a.n();
        h = com.nielsen.app.sdk.a.m();
        i = new HashMap();
        c = s;
    }

    static Map a(AppTaskUploader apptaskuploader)
    {
        return apptaskuploader.i;
    }

    public void a(String s)
    {
        c = s;
    }

    public boolean execute()
    {
        AppCache appcache;
        long l1;
        j.lock();
        appcache = com.nielsen.app.sdk.a.o();
        l1 = appcache.d();
        if (l1 <= 0L)
        {
            j.unlock();
            return true;
        }
        boolean flag = h.r();
        if (!flag)
        {
            j.unlock();
            return true;
        }
        flag = g.h();
        if (!flag)
        {
            j.unlock();
            return true;
        }
        boolean flag1;
        flag = h.a();
        flag1 = h.d();
        if (flag || flag1)
        {
            j.unlock();
            return true;
        }
        Iterator iterator;
        e e1;
        iterator = appcache.a(1, true).iterator();
        e1 = com.nielsen.app.sdk.e.b();
        Object obj;
        Object obj2;
        int k;
        long l2;
        obj2 = null;
        k = -1;
        l1 = 0L;
        l2 = -1L;
        obj = "";
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        AppCache.ProcessorData processordata = (AppCache.ProcessorData)iterator.next();
        String s = "";
        int l = processordata.getMessage();
        l;
        JVM INSTR tableswitch 7 7: default 216
    //                   7 333;
           goto _L3 _L4
_L3:
        boolean aflag[];
        Object obj5;
        long l3;
        obj5 = obj2;
        l = k;
        l3 = l1;
        aflag = ((boolean []) (obj));
_L18:
        if (s == null) goto _L6; else goto _L5
_L5:
        Object obj3;
        Object obj4;
        int i1;
        obj = s;
        obj4 = aflag;
        l1 = l3;
        i1 = l;
        obj3 = obj5;
        if (!s.isEmpty()) goto _L7; else goto _L6
_L6:
        obj4 = aflag;
        l1 = l3;
        i1 = l;
        obj3 = obj5;
        obj = processordata.getData();
_L7:
        obj4 = aflag;
        l1 = l3;
        i1 = l;
        obj3 = obj5;
        (new AppUploadRequest(((String) (obj)))).startRequest();
        obj2 = obj5;
        k = l;
        obj = aflag;
        l1 = l3;
_L25:
        l2 = processordata.getKey();
          goto _L8
_L4:
        com.nielsen.app.sdk.c.a('I', "parsing PING on Uploader", new Object[0]);
        l = processordata.getProcessor();
        if (k == l) goto _L10; else goto _L9
_L9:
        l3 = l1;
        obj3 = obj2;
        aflag = e1.a(l);
        if (aflag != null) goto _L12; else goto _L11
_L11:
        k = l;
          goto _L8
_L12:
        l2 = l1;
        obj4 = obj2;
        if (obj2 == null) goto _L14; else goto _L13
_L13:
        l3 = l1;
        obj3 = obj2;
        ((AppConfig.a) (obj2)).a();
        if (l1 == 0L) goto _L16; else goto _L15
_L15:
        l3 = l1;
        obj3 = obj2;
        e.b(l1);
          goto _L16
_L14:
        l3 = l2;
        obj3 = obj4;
        obj2 = aflag.e();
        l3 = l2;
        obj3 = obj4;
        obj5 = g;
        l3 = l2;
        obj3 = obj4;
        obj5.getClass();
        l3 = l2;
        obj3 = obj4;
        obj2 = new AppConfig.a(((AppConfig) (obj5)), null, ((Map) (obj2)));
        obj4 = obj;
        l1 = l2;
        i1 = l;
        obj3 = obj2;
        l2 = e.a();
        obj4 = obj;
        l1 = l2;
        i1 = l;
        obj3 = obj2;
        ((AppConfig.a) (obj2)).a(l2);
        obj4 = obj;
        l1 = l2;
        i1 = l;
        obj3 = obj2;
        obj = aflag.f();
        k = l;
_L29:
        aflag = ((boolean []) (obj));
        l3 = l2;
        l = k;
        obj5 = obj2;
        if (obj2 == null) goto _L18; else goto _L17
_L17:
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        ((AppConfig.a) (obj2)).b(new JSONObject(processordata.getData()));
        if (obj == null) goto _L20; else goto _L19
_L19:
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        if (((String) (obj)).isEmpty()) goto _L20; else goto _L21
_L21:
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        aflag = new boolean[1];
        aflag[0] = false;
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        obj5 = ((AppConfig.a) (obj2)).a(((String) (obj)), aflag);
        if (!aflag[0] || obj5 == null) goto _L23; else goto _L22
_L22:
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        if (((String) (obj5)).isEmpty()) goto _L23; else goto _L24
_L24:
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        s = (new StringBuilder()).append(((String) (obj5))).append("&rnd=").append(com.nielsen.app.sdk.h.s()).toString();
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        com.nielsen.app.sdk.c.a('I', "generate PING on Uploader", new Object[0]);
        aflag = ((boolean []) (obj));
        l3 = l2;
        l = k;
        obj5 = obj2;
          goto _L18
        Exception exception;
        exception;
        obj = obj4;
        k = i1;
        obj2 = obj3;
        obj3 = exception;
_L28:
        com.nielsen.app.sdk.c.a(((Throwable) (obj3)), true, 10, 'E', "Failed sending ping: %s", new Object[] {
            obj
        });
          goto _L25
_L23:
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        com.nielsen.app.sdk.c.a('I', "parsing failed. Can't send PING", new Object[0]);
        l1 = l2;
          goto _L25
_L20:
        obj4 = obj;
        l1 = l2;
        i1 = k;
        obj3 = obj2;
        com.nielsen.app.sdk.c.a('I', "no URL to parse. Can't send PING", new Object[0]);
        l1 = l2;
          goto _L25
_L2:
        appcache.a(1, l2);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_916;
        }
        ((AppConfig.a) (obj2)).a();
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_916;
        }
        e.b(l1);
        obj = j;
_L27:
        ((Lock) (obj)).unlock();
        return true;
        Object obj1;
        obj1;
        com.nielsen.app.sdk.c.a(((Throwable) (obj1)), true, 'W', "Error while UPLOADING pings to Census", new Object[0]);
        obj1 = j;
        if (true) goto _L27; else goto _L26
_L26:
        obj1;
        j.unlock();
        throw obj1;
        obj3;
          goto _L28
        obj4;
        l1 = l3;
        k = l;
        obj2 = obj3;
        obj3 = obj4;
          goto _L28
_L10:
        l2 = l1;
          goto _L29
_L16:
        obj4 = null;
        l2 = 0L;
          goto _L14
    }

    private class AppUploadRequest extends AppRequestManager.AppRequestHandler
    {

        public static final int BUFFER_SIZE = 0x3e800;
        public static final String REQUEST_NAME = "AppTaskUploader";
        public static final int TIMEOUT_CONNECTION = 60000;
        public static final int TIMEOUT_DATA = 60000;
        String a;
        AppRequestManager.AppRequest b;
        String c;
        final AppTaskUploader e;

        public void onError(String s, long l, Exception exception)
        {
            if (AppSdk.a())
            {
                exception = new StringBuilder("Nielsen AppSDK: Failed sending data ping - ");
                if (c != null && !c.isEmpty())
                {
                    s = c;
                } else
                {
                    s = "EMPTY";
                }
                Log.d("AppSdk", exception.append(s).toString());
            }
            if (AppTaskUploader.a(e).containsKey(a))
            {
                AppTaskUploader.a(e).remove(a);
            }
        }

        public void onFinish(String s, long l, String s1)
        {
            com.nielsen.app.sdk.c.a('I', "UPLOAD ended successfully", new Object[0]);
            if (AppSdk.a())
            {
                s1 = new StringBuilder("Nielsen AppSDK: Sent data ping successfully - ");
                if (c != null && !c.isEmpty())
                {
                    s = c;
                } else
                {
                    s = "EMPTY";
                }
                Log.d("AppSdk", s1.append(s).toString());
            }
            if (AppTaskUploader.a(e).containsKey(a))
            {
                AppTaskUploader.a(e).remove(a);
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
            com.nielsen.app.sdk.c.a('I', "Sending Message: %s", new Object[] {
                c
            });
            b.get(e.c, c);
        }

        public AppUploadRequest(String s)
        {
            e = AppTaskUploader.this;
            AppRequestManager apprequestmanager = d;
            apprequestmanager.getClass();
            super(apprequestmanager, "AppTaskUploader");
            a = "";
            b = null;
            c = null;
            apprequestmanager = d;
            apprequestmanager.getClass();
            b = new AppRequestManager.AppRequest(apprequestmanager, "AppTaskUploader", this, 60000, 60000, 0x3e800);
            c = s;
            a = (new StringBuilder("AppTaskUploader_")).append(String.valueOf(com.nielsen.app.sdk.h.s())).toString();
            AppTaskUploader.a(AppTaskUploader.this).put(a, this);
        }
    }

}
