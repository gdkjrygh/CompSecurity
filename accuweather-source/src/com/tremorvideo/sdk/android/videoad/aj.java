// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.res.Configuration;
import android.os.Process;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.tremorvideo.sdk.android.richmedia.a;
import com.tremorvideo.sdk.android.richmedia.d;
import com.tremorvideo.sdk.android.richmedia.m;
import com.tremorvideo.sdk.android.richmedia.n;
import com.tremorvideo.sdk.android.richmedia.o;
import java.io.File;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, bi, ch, eb, 
//            ea, ct, gc, fz, 
//            co, ak

public class aj extends com.tremorvideo.sdk.android.videoad.a
    implements com.tremorvideo.sdk.android.richmedia.o.a, eb.a, eb.b, gc.a
{

    bi c;
    o d;
    d e;
    eb f;
    int g;
    int h;
    boolean i;
    boolean j;
    m k[];

    public aj(a.a a1, Activity activity, bi bi1)
    {
        int i1 = 0;
        super(a1, activity);
        g = 0;
        h = -1;
        i = false;
        j = false;
        c = bi1;
        k = c.D();
        bi1 = k;
        for (int j1 = bi1.length; i1 < j1; i1++)
        {
            m m1 = bi1[i1];
            m1.a(com.tremorvideo.sdk.android.videoad.ch.a(activity.getFilesDir(), m1.d()).getAbsolutePath());
        }

        e = new d(a, c.A());
        d = new o(a, e, c.A(), c.z(), k);
        d.a(this);
        e.a(d.e());
        f = new eb(activity, a1, c.r());
        f.a(this);
        f.a(this);
        c.A().a(f);
        a1 = c.a(ea.b.I);
        if (a1 != null)
        {
            activity = a1.a("zip", "");
            bi1 = a1.a("movie", "");
            c.A().q();
            c.A().a(activity);
            c.A().a(new GregorianCalendar());
            f.a(Integer.parseInt(activity));
            f.a(ct.j());
            f.a(ct.j());
            ct.j().a(activity, bi1, a1.l(), new GregorianCalendar());
            ct.j().a(this);
            ct.j().a();
        }
        activity = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        a1 = new RelativeLayout(a);
        a1.setBackgroundColor(0xff000000);
        a1.addView(e, activity);
        a1.addView(d.k(), activity);
        a1.addView(d, activity);
        if (d.q())
        {
            p();
        } else
        {
            d.a(this);
            j = true;
        }
        activity = c.B();
        if (activity != null)
        {
            f.a(activity);
        }
        a.requestWindowFeature(1);
        a.getWindow().setFlags(1024, 1024);
        com.tremorvideo.sdk.android.videoad.ct.a(a.getWindow());
        a.setContentView(a1);
    }

    private void p()
    {
        int i1 = b.c();
        if (c.A().g())
        {
            if (i1 == 0)
            {
                if (c.f().a("lock-orientation"))
                {
                    a.setRequestedOrientation(0);
                    h = 0;
                }
                if (c.A().h() != null)
                {
                    d.a(c.A().h());
                    return;
                } else
                {
                    d.a(c.A().i());
                    return;
                }
            }
            if (c.f().a("lock-orientation"))
            {
                a.setRequestedOrientation(1);
                h = 1;
            }
            if (c.A().i() != null)
            {
                d.a(c.A().i());
                return;
            } else
            {
                d.a(c.A().h());
                return;
            }
        }
        if (i1 == 0)
        {
            if (c.A().h() == null)
            {
                i1 = 1;
            }
        } else
        if (c.A().i() == null)
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            h = 0;
            a.setRequestedOrientation(0);
            d.a(c.A().h());
            b.b(h);
            return;
        } else
        {
            h = 1;
            a.setRequestedOrientation(1);
            d.a(c.A().i());
            b.b(h);
            return;
        }
    }

    public bb.a a()
    {
        ea ea1 = c.a(ea.b.H);
        if (ea1 == null)
        {
            return bb.a.f;
        }
        int i1 = ea1.a("location", -1);
        if (i1 == -1)
        {
            return bb.a.f;
        } else
        {
            return bb.a.values()[i1];
        }
    }

    public void a(int i1, int j1, int k1)
    {
        d.e().a(i1, j1, k1);
    }

    public void a(Configuration configuration)
    {
        if (h == -1)
        {
            d.a(false);
            return;
        } else
        {
            d.a(true);
            return;
        }
    }

    public void a(n n1, boolean flag)
    {
        ct.j().a(null);
        ct.j().b();
        f.a();
        c.A().a(null);
        i = flag;
        if (!i)
        {
            n1 = c.C();
            if (n1 != null)
            {
                f.a(n1);
            }
            d.g();
        }
        b.a(this);
    }

    public void a(ea.b b1, int i1, int j1, int k1)
    {
label0:
        {
            if (b1 == ea.b.J)
            {
                b1 = c.a(b1);
                if (b1 != null)
                {
                    int l1 = b1.a("age", 0);
                    b1 = new GregorianCalendar();
                    GregorianCalendar gregoriancalendar = new GregorianCalendar(i1, j1, k1);
                    gregoriancalendar.roll(1, l1);
                    if (!gregoriancalendar.before(b1))
                    {
                        break label0;
                    }
                    d.e().a(com.tremorvideo.sdk.android.richmedia.i.c.n);
                }
            }
            return;
        }
        d.e().a(com.tremorvideo.sdk.android.richmedia.i.c.o);
    }

    public void a(ea ea1)
    {
        if (ea1 == null) goto _L2; else goto _L1
_L1:
        if (ea1.a() != ea.b.w) goto _L4; else goto _L3
_L3:
        g = g + 1;
_L2:
        d.h();
        return;
_L4:
        if (ea1.a() == ea.b.v)
        {
            d.g();
            b.a(this);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void a(ea ea1, int i1)
    {
label0:
        {
            if (ea1 != null)
            {
                if (!ea1.n())
                {
                    break label0;
                }
                f.b(ea1, i1);
            }
            return;
        }
        ea1 = new co(a, c.r(), com.tremorvideo.sdk.android.videoad.co.a.a, new ak(this));
        ea1.setTitle("Unsupported Feature");
        ea1.a("Sorry, that feature is not supported on your device.");
        ea1.a("OK", "");
        ea1.show();
        d.h();
    }

    public void a(String s)
    {
        if (s == "adchoices")
        {
            s = c.a(ea.b.H);
        } else
        {
            s = c.c(s);
        }
        if (s != null)
        {
            a(((ea) (s)), -1);
        }
    }

    public void a(JSONObject jsonobject)
    {
        d.e().a(jsonobject);
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            return true;
        } else
        {
            return super.a(i1, keyevent);
        }
    }

    public void a_()
    {
        d.i();
    }

    public void b(String s)
    {
        d.e().a(s);
    }

    public void c()
    {
        if (f.b())
        {
            f.e();
            f.g();
        }
    }

    public void d()
    {
        d.f();
    }

    public void e()
    {
        if (!((KeyguardManager)a.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
        {
            d.b(f.f());
        }
    }

    public void h()
    {
        super.h();
        Iterator iterator = ((ActivityManager)a.getSystemService("activity")).getRunningAppProcesses().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
        if (runningappprocessinfo.pid != Process.myPid()) goto _L4; else goto _L3
_L3:
        int i1 = runningappprocessinfo.importance;
        if (i1 != 100) goto _L2; else goto _L5
_L5:
        boolean flag = true;
_L7:
        if (flag)
        {
            e();
        }
        return;
        Exception exception;
        exception;
        com.tremorvideo.sdk.android.videoad.ct.a(exception);
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean i()
    {
        return !f.d();
    }

    public long j()
    {
        return d.o();
    }

    public int k()
    {
        return g;
    }

    public a.b l()
    {
        if (i)
        {
            return com.tremorvideo.sdk.android.videoad.a.b.d;
        } else
        {
            return a.b.b;
        }
    }

    public void n()
    {
        d.e().a(null);
    }

    public void o()
    {
        if (j)
        {
            j = false;
            p();
        }
    }
}
