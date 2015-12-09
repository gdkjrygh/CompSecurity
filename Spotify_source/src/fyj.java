// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class fyj extends Fragment
{

    private static boolean Z;
    private static boolean aa;
    private static final String b[] = {
        "connected", "can_connect"
    };
    private TextView Y;
    public gbl a;
    private int ab;
    private Runnable ac;
    private Handler ad;
    private an ae;

    public fyj()
    {
        ac = new Runnable() {

            private fyj a;

            public final void run()
            {
                fyj.a(a);
            }

            
            {
                a = fyj.this;
                super();
            }
        };
        ad = new Handler();
        ae = new an() {

            private fyj a;

            public final da a(Bundle bundle)
            {
                return new cu(a.k(), dtw.a, fyj.G(), null, null);
            }

            public final void a()
            {
                fyj.b(a);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                ((Cursor) (obj)).moveToFirst();
                if (((Cursor) (obj)).isAfterLast())
                {
                    fyj.b(a);
                    return;
                }
                fyj.d(gcw.a(((Cursor) (obj)), 0));
                fyj.e(gcw.a(((Cursor) (obj)), 1));
                obj = fyj.c(a);
                int i;
                if (fyj.H())
                {
                    i = 0x7f080339;
                } else
                {
                    i = 0x7f08033a;
                }
                ((TextView) (obj)).setText(i);
                if (fyj.I())
                {
                    fyj.b(a);
                    return;
                } else
                {
                    fyj.f(a).postDelayed(fyj.d(a), fyj.e(a));
                    return;
                }
            }

            
            {
                a = fyj.this;
                super();
            }
        };
    }

    public static boolean F()
    {
        return aa;
    }

    static String[] G()
    {
        return b;
    }

    static boolean H()
    {
        return aa;
    }

    static boolean I()
    {
        return Z;
    }

    private am J()
    {
        return ((gnb)dmz.a(gnb)).a(this);
    }

    static void a(fyj fyj1)
    {
        if (fyj1.a != null)
        {
            fyj1.a.a(true);
        }
    }

    public static boolean a()
    {
        return Z;
    }

    static void b(fyj fyj1)
    {
        fyj1.ad.removeCallbacks(fyj1.ac);
        if (fyj1.a != null)
        {
            fyj1.a.a(false);
        }
    }

    static TextView c(fyj fyj1)
    {
        return fyj1.Y;
    }

    static Runnable d(fyj fyj1)
    {
        return fyj1.ac;
    }

    static boolean d(boolean flag)
    {
        Z = flag;
        return flag;
    }

    static int e(fyj fyj1)
    {
        return fyj1.ab;
    }

    static boolean e(boolean flag)
    {
        aa = flag;
        return flag;
    }

    static Handler f(fyj fyj1)
    {
        return fyj1.ad;
    }

    public final void B()
    {
        ad.removeCallbacks(ac);
        super.B();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030089, viewgroup, false);
        ab = l().getInteger(0x7f0e0017);
        Y = (TextView)layoutinflater.findViewById(0x7f1102aa);
        if (a != null)
        {
            a.a(false);
        }
        return layoutinflater;
    }

    public final void c()
    {
        super.c();
        if (J().b(0x7f110089) == null)
        {
            J().a(0x7f110089, null, ae);
        }
    }

    public final void d()
    {
        J().a(0x7f110089);
        super.d();
    }

}
