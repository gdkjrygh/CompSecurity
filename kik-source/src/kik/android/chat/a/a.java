// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.a;

import com.kik.g.p;
import kik.a.e.v;
import kik.a.j.n;

// Referenced classes of package kik.android.chat.a:
//            b, c

public final class a
{

    private static final Long a = Long.valueOf(1000L);
    private n b;
    private v c;
    private p d;

    public a(n n1, p p1, v v1)
    {
        d = new p();
        b = n1;
        c = v1;
        p1.a(new b(this));
    }

    static void a(a a1)
    {
        a1.c.a("kik.android.chat.preferences.UserPreferenceManager.restored", Boolean.valueOf(true));
    }

    static p b(a a1)
    {
        return a1.d;
    }

    private com.kik.n.a.k.a e()
    {
        com.kik.n.a.k.a a1 = new com.kik.n.a.k.a();
        a1.a(Boolean.valueOf(a()));
        a1.a(b());
        return a1;
    }

    public final void a(com.kik.n.a.k.a a1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            c.a("kik.chat.bubble.id", Integer.valueOf(a1.w));
            b.b("user_preferences", null, e());
            return;
        }
    }

    public final void a(boolean flag)
    {
        c.a("kik.enterbutton.sends", Boolean.valueOf(flag));
        b.b("user_preferences", null, e(), a);
    }

    public final boolean a()
    {
        return c.p("kik.enterbutton.sends").booleanValue();
    }

    public final com.kik.n.a.k.a b()
    {
        return com.kik.n.a.k.a.a(c.a("kik.chat.bubble.id", -1).intValue());
    }

    public final void c()
    {
        if (c.p("kik.android.chat.preferences.UserPreferenceManager.restored").booleanValue())
        {
            d.e();
            return;
        } else
        {
            b.d("user_preferences", com/kik/n/a/k/a).a(new c(this));
            return;
        }
    }

    public final p d()
    {
        return d;
    }

}
