// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.b.a.n;
import com.kik.g.as;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.n.a.e.a;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kik.a.d.ab;
import kik.a.e.x;
import kik.a.h.g;
import kik.a.z;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.j:
//            u, m, p, s, 
//            t, q

public final class o extends u
    implements m
{
    private final class a
        implements as
    {

        final o a;
        private Class b;

        public final volatile Object a(Object obj)
        {
            return g.a(kik.a.h.o.a((com.kik.n.a.e.a)obj, a.a()), b);
        }

        public a(Class class1)
        {
            a = o.this;
            super();
            b = class1;
        }
    }


    private static final b a = org.c.c.a("SecureXDataManager");
    private z b;
    private String c;
    private SecureRandom d;
    private p e;
    private ExecutorService f;

    public o()
    {
        d = new SecureRandom();
        f = Executors.newSingleThreadExecutor();
    }

    static ab a(o o1, ab ab1, byte abyte0[], byte abyte1[])
    {
        abyte0 = kik.a.h.o.a((com.kik.n.a.e.a)g.a(ab1.c(), com/kik/n/a/e/a), abyte0);
        byte abyte2[] = new byte[16];
        o1.d.nextBytes(abyte2);
        o1 = g.a(kik.a.h.o.a(abyte0, abyte1, abyte2));
        return new ab(ab1.a(), ab1.b(), o1);
    }

    private p e()
    {
        p p1 = new p();
        if (e == null)
        {
            e = p1;
            (new Thread(new kik.a.j.p(this, b.d(), c, p1))).start();
        }
        return e;
    }

    public final p a(String s1, Class class1)
    {
        class1 = s.b(c(s1, com/kik/n/a/e/a), s.a(new a(class1)));
        if (a.a())
        {
            class1.a(new kik.a.j.s(this, s1));
        }
        return s.a(class1, f);
    }

    public final p a(String s1, String s2, n n)
    {
        return a(s1, s2, n, ((Long) (null)));
    }

    public final p a(String s1, String s2, n n, Long long1)
    {
        p p1 = e();
        p p2 = new p();
        n = g.a(n);
        byte abyte0[] = new byte[16];
        d.nextBytes(abyte0);
        p1.a(new t(this, n, abyte0, s1, s2, long1, p2));
        return p2;
    }

    public final void a(z z1, String s1)
    {
        if (b != null)
        {
            s1 = d();
            byte abyte0[] = a();
            e = null;
            b = z1;
            z1 = a();
            s1.a().a(new q(this, s1, abyte0, z1));
            return;
        } else
        {
            b = z1;
            c = s1;
            e();
            return;
        }
    }

    public final byte[] a()
    {
        byte abyte0[];
        try
        {
            abyte0 = (byte[])s.b(e(), 50000L);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return abyte0;
    }

    public final p b(String s1, Class class1)
    {
        return s.a(s.b(d(s1, com/kik/n/a/e/a), new a(class1)), f);
    }

    public final void c()
    {
        super.c();
        b = null;
        c = null;
    }

}
