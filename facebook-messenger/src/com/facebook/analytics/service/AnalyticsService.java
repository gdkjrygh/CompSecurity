// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.base.a.g;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.facebook.analytics.service:
//            i, a, o, p, 
//            f

public class AnalyticsService extends Service
{

    private static final Class a = com/facebook/analytics/service/AnalyticsService;
    private static final String b = com/facebook/analytics/service/AnalyticsService.getSimpleName();
    private static String c = "selfStart";
    private h d;
    private o e;
    private a f;
    private i g;
    private final Object h = new Object();
    private f i;
    private boolean j;

    public AnalyticsService()
    {
    }

    private Intent a()
    {
        Intent intent = new Intent(this, getClass());
        intent.putExtra(c, true);
        return intent;
    }

    static Object a(AnalyticsService analyticsservice)
    {
        return analyticsservice.h;
    }

    static void a(AnalyticsService analyticsservice, List list)
    {
        analyticsservice.a(list);
    }

    private void a(List list)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!j)
        {
            if (startService(a()) == null)
            {
                break MISSING_BLOCK_LABEL_41;
            }
            j = true;
        }
_L2:
        g.a(list);
        return;
        d.a(b, "Failed to start AnalyticsService.");
        if (true) goto _L2; else goto _L1
_L1:
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    static boolean a(AnalyticsService analyticsservice, boolean flag)
    {
        analyticsservice.j = flag;
        return flag;
    }

    static boolean b(AnalyticsService analyticsservice)
    {
        return analyticsservice.j;
    }

    protected void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        synchronized (h)
        {
            printwriter.println((new StringBuilder()).append("mSelfStartRequested: ").append(j).toString());
            f.a(printwriter);
            g.a(printwriter);
        }
        return;
        printwriter;
        filedescriptor;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

    public IBinder onBind(Intent intent)
    {
        return e;
    }

    public void onCreate()
    {
        super.onCreate();
        com.facebook.debug.log.b.c(a, "Creating service");
        com.facebook.base.a.g.a(this);
        t t1 = t.a(this);
        d = (h)t1.a(com/facebook/common/e/h);
        e = new o(this);
        i = new p(this, null);
        f = (a)t1.a(com/facebook/analytics/service/a);
        f.a(i);
        g = (i)t1.a(com/facebook/analytics/service/i);
    }

    public void onDestroy()
    {
        super.onDestroy();
        f.b(i);
    }

    public int onStartCommand(Intent intent, int k, int l)
    {
        boolean flag = false;
        if (intent != null)
        {
            flag = intent.getBooleanExtra(c, false);
        }
        if (flag)
        {
            synchronized (h)
            {
                if (!j)
                {
                    stopSelf(l);
                }
            }
        } else
        {
            stopSelf(l);
            d.a(b, "AnalyticsService was externally started.");
        }
        break MISSING_BLOCK_LABEL_72;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
        return 2;
    }

    public boolean onUnbind(Intent intent)
    {
        return super.onUnbind(intent);
    }

}
