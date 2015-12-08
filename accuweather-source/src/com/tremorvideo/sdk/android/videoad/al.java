// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.tremorvideo.sdk.android.googleAdapter.GoogleAdapterCalls;
import java.util.HashMap;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            aw, am, an, ao, 
//            az, c, a, l, 
//            i, ct, dw, ey, 
//            cj, ex, ea, ap, 
//            gb, ch, o, bk, 
//            aj, bi, ab, bg, 
//            ad, bh, fi

public class al
    implements a.a, aw
{

    boolean a;
    boolean b;
    boolean c;
    int d;
    BroadcastReceiver e;
    BroadcastReceiver f;
    BroadcastReceiver g;
    HashMap h;
    private Activity i;
    private a j;
    private az k;
    private ex l;

    public al()
    {
        a = false;
        b = true;
        c = false;
        d = -1;
        e = new am(this);
        f = new an(this);
        g = new ao(this);
        h = new HashMap();
    }

    static a a(al al1)
    {
        return al1.j;
    }

    private void a(a.b b1)
    {
        if (b1 != a.b.a) goto _L2; else goto _L1
_L1:
        if (!k.u()) goto _L4; else goto _L3
_L3:
        b(new c(this, i, k, true));
        j.c();
_L6:
        return;
_L4:
        a(a.b.d);
        return;
_L2:
        if (b1 == a.b.b)
        {
            if (c || !j.b())
            {
                a(a.b.c);
                return;
            }
            if (a(k.t()))
            {
                b(new l(this, i, k));
                return;
            } else
            {
                a(a.b.c);
                return;
            }
        }
        if (b1 == a.b.c)
        {
            if (a(k.s()))
            {
                b(new i(this, i, k));
                return;
            } else
            {
                a(a.b.a);
                return;
            }
        }
        if (b1 == a.b.d)
        {
            l();
            ct.d("<<< Ad End");
            ct.y().f();
            b1 = i;
            byte byte0;
            if (c)
            {
                byte0 = 101;
            } else
            {
                byte0 = 100;
            }
            b1.setResult(byte0, new Intent());
            i.finish();
            GoogleAdapterCalls.onAdFinished();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(ey ey1)
    {
        return ey1 != null && ey1.d() != null;
    }

    private boolean a(fi fi)
    {
        return fi != null;
    }

    static Activity b(al al1)
    {
        return al1.i;
    }

    private void b(a a1)
    {
        j = a1;
    }

    private void k()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i);
        builder.setTitle("Tremor Video Integration Error");
        builder.setMessage("You must disable hardware acceleration for the \"com.tremorvideo.sdk.android.videoad.Playvideo\" Activity in AndroidManifest.xml:\n\nPlease consult the supplied documentation for more information.");
        builder.create().show();
    }

    private void l()
    {
        if (!k.x())
        {
            return;
        }
        try
        {
            ct.d("Sending Event History");
            cj.a(i, k, l, j.k());
            return;
        }
        catch (Exception exception)
        {
            ct.a("Error Sending Event History", exception);
        }
    }

    private void m()
    {
        if (!k.x())
        {
            return;
        }
        try
        {
            ex.a a1 = l.e();
            ct.d((new StringBuilder()).append("Sending Billable Event: ").append(a1.c.a().toString()).append(" ").append(a1.c.c()).toString());
            cj.a(i, k, a1);
            return;
        }
        catch (Exception exception)
        {
            ct.a("Error Sending Billable Event", exception);
        }
    }

    public int a(ea ea1)
    {
        return a(ea1, -1);
    }

    public int a(ea ea1, int i1)
    {
        int j1 = -1;
        if (ea1 != null)
        {
            if (ea1.a() == ea.b.v)
            {
                c = true;
            }
            ct.d((new StringBuilder()).append("Starting Event: ").append(ct.B()).append("ms ").append(ea1.a().toString()).append(" ").append(ea1.i()).append(" ").append(ea1.c()).toString());
            i1 = l.a(ea1, i1);
            j1 = i1;
            if (ea1.e())
            {
                j1 = i1;
                if (ea1.h())
                {
                    m();
                    j1 = i1;
                }
            }
        }
        return j1;
    }

    public az a()
    {
        return k;
    }

    public void a(float f1, float f2)
    {
        if (j.i())
        {
            long l1 = ct.B();
            long l2 = j.j();
            View view = i.getWindow().getDecorView();
            if (view != null)
            {
                float f3 = view.getWidth();
                float f4 = view.getHeight();
                f1 = Math.max(0.0F, Math.min(1.0F, f1 / f3));
                f2 = Math.max(0.0F, Math.min(1.0F, f2 / f4));
                int i1;
                if (f3 > f4)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                l.a(f1, f2, i1, l1, l2);
                ct.d((new StringBuilder()).append("Recording Touch: (").append(f1).append(", ").append(f2).append(") time: ").append(l1).append(" creative time: ").append(l2).toString());
            }
        }
    }

    public void a(int i1)
    {
        if (i1 != -1)
        {
            l.a(i1);
            ex.a a1 = l.e();
            ea ea1 = a1.c;
            ct.d((new StringBuilder()).append("Ending Event: ").append(a1.e).append("ms ").append(ea1.a().toString()).append(" ").append(ea1.i()).append(" ").append(ea1.c()).toString());
            if (ea1.e() && !ea1.h())
            {
                m();
            }
        }
    }

    public void a(int i1, int j1, Intent intent)
    {
        ct.d("activity returned");
        if (j != null)
        {
            j.a(i1, j1, intent);
        }
    }

    public void a(Configuration configuration)
    {
        j.a(configuration);
    }

    public void a(Bundle bundle, Activity activity)
    {
        boolean flag;
        ct.d("ActivityAd - onCreate");
        i = activity;
        Thread.setDefaultUncaughtExceptionHandler(new ap(this));
        try
        {
            if (ct.u() == null)
            {
                ct.d("Calling application has been force killed, exiting...");
                i.finish();
                GoogleAdapterCalls.onAdFinished();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ct.a(bundle);
            i.finish();
            GoogleAdapterCalls.onAdFinished();
            return;
        }
        l = new ex();
        l.a();
        k = ct.y().d();
        ct.g().a(k);
        if (!k.c())
        {
            k.a(i);
        }
        flag = ct.a(i);
        ct.d(">>> Ad Start");
        (new ch(i.getFilesDir())).c(k);
        if (k.h() != az.b.b && k.h() != az.b.e) goto _L2; else goto _L1
_L1:
        b(new o(i, this, (bk)k));
_L4:
        if (flag)
        {
            k();
        }
        i.registerReceiver(e, new IntentFilter("android.intent.action.SCREEN_OFF"));
        i.registerReceiver(f, new IntentFilter("android.intent.action.SCREEN_ON"));
        i.registerReceiver(g, new IntentFilter("android.intent.action.USER_PRESENT"));
        return;
_L2:
        if (k.h() == az.b.c)
        {
            b(new aj(this, i, (bi)k));
        } else
        if (k.h() == az.b.d)
        {
            b(new ab(this, i, (bg)k));
        } else
        if (k.h() == az.b.f)
        {
            b(new ad(this, i, (bh)k));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!h.containsKey(a1))
        {
            h.put(a1, Boolean.valueOf(true));
            a.b b1 = a1.l();
            a1.m();
            a(b1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        while (i1 == 84 || i1 == 82 || j.a(i1, keyevent)) 
        {
            return true;
        }
        return false;
    }

    public Context b()
    {
        return i;
    }

    public void b(int i1)
    {
        d = i1;
    }

    public int c()
    {
        return Resources.getSystem().getConfiguration().orientation != 2 ? 1 : 0;
    }

    public int d()
    {
        return d;
    }

    public boolean e()
    {
        return false;
    }

    public void f()
    {
        j.c();
    }

    public void g()
    {
        j.d();
    }

    public void h()
    {
        j.e();
    }

    public void i()
    {
    }

    public void j()
    {
        ct.g().a(null);
        if (k != null)
        {
            k.d();
        }
        System.gc();
        i.unregisterReceiver(e);
        i.unregisterReceiver(f);
        i.unregisterReceiver(g);
    }
}
