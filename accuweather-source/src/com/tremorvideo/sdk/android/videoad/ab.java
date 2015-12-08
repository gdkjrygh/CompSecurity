// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Window;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, gd, bg, eb, 
//            ct, dp, ea, co, 
//            ac

public class ab extends a
    implements dp.d, eb.b
{

    bg c;
    eb d;
    dp e;
    gd f;

    public ab(a.a a1, Activity activity, bg bg1)
    {
        super(a1, activity);
        f = new gd();
        f.a();
        c = bg1;
        c.a(f);
        d = new eb(activity, a1, f);
        d.a(this);
        try
        {
            e = ct.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (a.a a1)
        {
            ct.a(a1);
        }
        e.a(this);
        e.a(c.z());
        a.requestWindowFeature(1);
        a.getWindow().setFlags(1024, 1024);
        ct.a(a.getWindow());
        a.setContentView(e, new android.view.ViewGroup.LayoutParams(-1, -1));
        ct.a(a.getWindow());
    }

    public void a(ea ea1)
    {
        e.e();
    }

    public boolean a(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (e.a())
            {
                e.b();
            } else
            {
                e.c();
                b.a(this);
            }
            return true;
        } else
        {
            return super.a(i, keyevent);
        }
    }

    public boolean a(String s)
    {
        s = c.c(s);
        if (s != null)
        {
            if (!s.n())
            {
                s = new co(a, f, co.a.a, new ac(this));
                e.e();
                s.setTitle("Unsupported Feature");
                s.a("Sorry, that feature is not supported on your device.");
                s.a("OK", "");
                s.show();
            } else
            if (s.a() != ea.b.v)
            {
                d.b(s);
            } else
            {
                d.b(s);
                e.c();
                b.a(this);
            }
        }
        return false;
    }

    public void a_()
    {
        e.d();
    }

    public boolean b()
    {
        return false;
    }

    public void d()
    {
        e.e();
        super.d();
    }

    public void e()
    {
        e.d();
        super.e();
    }

    public a.b l()
    {
        return a.b.b;
    }
}
