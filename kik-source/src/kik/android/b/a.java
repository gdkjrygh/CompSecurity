// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.as;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.n.a.c.e;
import com.kik.n.a.c.i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kik.a.e.v;
import kik.a.i.h;
import kik.a.j.m;

// Referenced classes of package kik.android.b:
//            b, c, s, e, 
//            d

public final class kik.android.b.a
{
    private static final class a
    {

        boolean a;
        boolean b;
        String c;
        byte d[];
        byte e[];

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final m a;
    private final v b;
    private final h c;
    private final kik.android.b.s d;
    private final as e = new b(this);
    private final as f = new c(this);

    public kik.android.b.a(m m1, v v1, h h)
    {
        a = m1;
        b = v1;
        c = h;
        d = new kik.android.b.s(a);
    }

    static kik.android.b.s a(kik.android.b.a a1)
    {
        return a1.d;
    }

    protected static byte[] a(kik.a.i.h.a a1)
    {
        if (a1 == null || a1.b() == null)
        {
            return null;
        }
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA-1");
        }
        // Misplaced declaration of an exception variable
        catch (kik.a.i.h.a a1)
        {
            return null;
        }
        return messagedigest.digest(a1.b().getBytes());
    }

    static v b(kik.android.b.a a1)
    {
        return a1.b;
    }

    private boolean b()
    {
        return b.p("XDATA_CARD_HISTORY_MIGRATED").booleanValue();
    }

    static h c(kik.android.b.a a1)
    {
        return a1.c;
    }

    private boolean c()
    {
        return b.p("XDATA_CARD_PERMISSIONS_MIGRATED").booleanValue();
    }

    public final void a()
    {
        p p1;
        p p2;
label0:
        {
            if (!b() || !c())
            {
                p1 = a.a("enc_card_list", com/kik/n/a/c/e);
                p2 = new p();
                if (b())
                {
                    p2.a(Boolean.valueOf(true));
                } else
                {
                    s.b(p1, s.a(e)).a(new kik.android.b.e(this, a.b("enc_card_pinned", com/kik/n/a/c/i), p2));
                }
                p2 = new p();
                if (!c())
                {
                    break label0;
                }
                p2.a(Boolean.valueOf(true));
            }
            return;
        }
        s.b(p1, s.a(f)).a(new d(this, p2));
    }

    // Unreferenced inner class kik/android/b/a$1

/* anonymous class */
    static final class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.kik.n.a.c.g.a.values().length];
            try
            {
                a[com.kik.n.a.c.g.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.kik.n.a.c.g.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
