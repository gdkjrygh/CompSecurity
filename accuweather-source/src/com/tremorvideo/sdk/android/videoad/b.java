// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.webkit.URLUtil;
import com.tremorvideo.sdk.android.googleAdapter.GoogleAdapterCalls;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, az, cg, ea, 
//            ct, gd

public class b extends com.tremorvideo.sdk.android.videoad.a
{
    class a extends TimerTask
    {

        final b a;

        public void run()
        {
            a.d.cancel();
            a.d.purge();
            a.d = null;
            b.a(a);
        }

        a()
        {
            a = b.this;
            super();
        }
    }


    gd c;
    Timer d;
    private cg e;
    private boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private long j;

    public b(a.a a1, Activity activity, az az1)
    {
        super(a1, activity);
        g = false;
        h = false;
        i = -1L;
        j = -1L;
        e = az1.y();
        f = false;
        c = az1.r();
    }

    static void a(b b1)
    {
        b1.q();
    }

    private void a(String s, String s1)
    {
        s = e.a(ea.b.S);
        if (s != null)
        {
            s.b("dealer_id", s1);
            s.b("click_uri", s1);
            b.a(s);
        }
        if (URLUtil.isValidUrl(s1))
        {
            s = a;
            s1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
            GoogleAdapterCalls.onLeaveApp();
            s.startActivity(s1);
        }
        p();
    }

    private void o()
    {
        this;
        JVM INSTR monitorenter ;
        ea ea1;
        if (f)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        f = true;
        ea1 = e.a(ea.b.T);
        if (ea1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        b.a(ea1);
        b.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void p()
    {
        this;
        JVM INSTR monitorenter ;
        ea ea1;
        if (f)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        f = true;
        ea1 = e.a(ea.b.U);
        if (ea1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        b.a(ea1);
        b.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void q()
    {
        this;
        JVM INSTR monitorenter ;
        ea ea1;
        if (f)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        f = true;
        ea1 = e.a(ea.b.T);
        if (ea1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        b.a(ea1);
        b.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        if (d != null)
        {
            d.cancel();
            d.purge();
            d = null;
        }
    }

    public void a(Map map)
    {
        Object obj = (String)map.get("event_type");
        obj = e.a(((String) (obj)));
        if (obj != null)
        {
            if (((ea) (obj)).a() == ea.b.S)
            {
                a((String)map.get("dealer_id"), (String)map.get("click_url"));
            } else
            {
                if (((ea) (obj)).a() == ea.b.T)
                {
                    o();
                    return;
                }
                if (((ea) (obj)).a() == ea.b.U)
                {
                    p();
                    return;
                }
            }
        }
    }

    public void c()
    {
        if (g)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        g = true;
        b.a(e.a(ea.b.R));
        if (e.a() > 0)
        {
            i = GregorianCalendar.getInstance().getTimeInMillis();
            j = 0L;
            d = new Timer();
            d.schedule(new a(), e.a());
        }
        return;
        Exception exception;
        exception;
        ct.a(exception);
        b.a(this);
        return;
    }

    public void d()
    {
        if (d != null)
        {
            j = (GregorianCalendar.getInstance().getTimeInMillis() - i) + j;
            h = true;
            d.cancel();
            d.purge();
            d = null;
        }
        super.d();
    }

    public void e()
    {
        if (h && !((KeyguardManager)a.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
        {
            long l = (long)e.a() - j;
            if (l > 0L)
            {
                d = new Timer();
                d.schedule(new a(), l);
                i = GregorianCalendar.getInstance().getTimeInMillis();
            }
            h = false;
        }
        super.e();
    }

    public void h()
    {
        if (!h) goto _L2; else goto _L1
_L1:
        super.h();
        Iterator iterator = ((ActivityManager)a.getSystemService("activity")).getRunningAppProcesses().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
        if (runningappprocessinfo.pid != Process.myPid()) goto _L6; else goto _L5
_L5:
        int k = runningappprocessinfo.importance;
        if (k != 100) goto _L4; else goto _L7
_L7:
        boolean flag = true;
_L9:
        if (flag)
        {
            e();
        }
_L2:
        return;
        Exception exception;
        exception;
        ct.a(exception);
_L4:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void n()
    {
        if (d != null)
        {
            d.cancel();
            d.purge();
            d = null;
        }
    }
}
