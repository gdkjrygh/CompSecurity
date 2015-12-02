// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.facebook.o;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads.b:
//            f, a, l, e, 
//            m

public class k
{

    private static final Class a = com/facebook/orca/chatheads/b/k;
    private final a b;
    private final a c;
    private final d d;
    private final h e;
    private Context f;
    private f g;
    private f h;
    private boolean i;
    private boolean j;
    private Handler k;

    public k(Context context, a a1, a a2, d d1, Handler handler, h h1)
    {
        f = context;
        b = a1;
        c = a2;
        d = d1;
        e = h1;
        k = handler;
    }

    private void a(Point point, com.facebook.orca.chatheads.b.e e1)
    {
        if (!a())
        {
            return;
        }
        f f1;
        try
        {
            f1 = p();
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            a("T2190668:wm_ex_add_first_chat_head_nux", "Failed to add first chat head nux window", ((RemoteException) (point)));
            return;
        }
        f1.a(e1);
        f1.b(point.x);
        f1.g(point.y);
        i = true;
        f1.d();
    }

    static void a(k k1, Point point, com.facebook.orca.chatheads.b.e e1)
    {
        k1.a(point, e1);
    }

    private void a(String s, String s1, RemoteException remoteexception)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s1);
        stringbuilder.append(": ");
        stringbuilder.append(remoteexception);
        stringbuilder.append(":\n\n");
        s1 = Thread.currentThread().getStackTrace();
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            stringbuilder.append(s1[i1].toString());
            stringbuilder.append("\n");
        }

        s1 = stringbuilder.toString();
        com.facebook.debug.log.b.e(a, s1);
        e.a(s, s1);
    }

    private void o()
    {
        if (g != null)
        {
            g.b();
            g = null;
        }
        if (h != null)
        {
            h.b();
            h = null;
        }
    }

    private f p()
    {
        if (g == null)
        {
            g = (f)b.b();
            if (((Boolean)c.b()).booleanValue())
            {
                g.a(o.chat_heads_first_message_sms_enabled_nux);
            } else
            {
                g.a(o.chat_heads_first_message_nux);
            }
            g.a();
        }
        return g;
    }

    private f q()
    {
        if (h == null)
        {
            h = (f)b.b();
            h.a(o.chat_heads_close_nux);
            ((com.facebook.orca.chatheads.b.a)h.h()).setContentGravitiy(17);
            ((com.facebook.orca.chatheads.b.a)h.h()).a(false);
            h.a();
        }
        return h;
    }

    public void a(Point point, com.facebook.orca.chatheads.b.e e1, int i1)
    {
        k.removeCallbacksAndMessages(null);
        if (i1 > 0)
        {
            b(point, e1, i1);
            return;
        } else
        {
            a(point, e1);
            return;
        }
    }

    public boolean a()
    {
        boolean flag = false;
        if (!d.a(com.facebook.orca.prefs.o.m, false))
        {
            flag = true;
        }
        return flag;
    }

    public void b(Point point, com.facebook.orca.chatheads.b.e e1, int i1)
    {
        k.removeCallbacksAndMessages(null);
        k.postDelayed(new l(this, point, e1), i1);
    }

    public boolean b()
    {
        boolean flag = false;
        if (!d.a(com.facebook.orca.prefs.o.n, false))
        {
            flag = true;
        }
        return flag;
    }

    public boolean c()
    {
        return b() && j;
    }

    public boolean d()
    {
        return h != null;
    }

    public void e()
    {
        if (!b() || h != null)
        {
            return;
        }
        f f1;
        DisplayMetrics displaymetrics;
        try
        {
            f1 = q();
        }
        catch (RemoteException remoteexception)
        {
            a("T2190668:wm_ex_add_close_nux", "Failed to add chat head close nux window", remoteexception);
            return;
        }
        displaymetrics = f.getResources().getDisplayMetrics();
        f1.a(e.BOTTOM);
        f1.b(displaymetrics.widthPixels / 2);
        f1.g(0);
        f1.a(5000L, new m(this));
    }

    public void f()
    {
        k.removeCallbacksAndMessages(null);
        if (g != null)
        {
            g.c();
            g = null;
        }
    }

    public void g()
    {
        if (h != null)
        {
            h.c();
            h = null;
        }
    }

    public void h()
    {
        f();
        g();
    }

    public void i()
    {
        d.b().a(com.facebook.orca.prefs.o.m).a(com.facebook.orca.prefs.o.n).a();
        j = false;
    }

    public void j()
    {
        j = true;
    }

    public void k()
    {
        o();
    }

    public boolean l()
    {
        return i && a();
    }

    public void m()
    {
        e e1 = d.b();
        e1.a(com.facebook.orca.prefs.o.m, true);
        e1.a();
        i = false;
    }

    public void n()
    {
        e e1 = d.b();
        e1.a(com.facebook.orca.prefs.o.n, true);
        e1.a();
    }

}
