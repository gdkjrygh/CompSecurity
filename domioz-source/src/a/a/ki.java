// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.a.b;
import com.appboy.f;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package a.a:
//            e, kj, kk, cm, 
//            ch, h, c, cl, 
//            aa, bn, ck

public class ki
    implements e
{

    public static final String a;
    public final cl b;
    public final c c;
    public final Object d = new Object();
    public final com.appboy.c.b e;
    public volatile boolean f;
    public volatile Thread g;
    public volatile boolean h;
    private final b i;
    private cm j;
    private boolean k;

    public ki(b b1, aa aa, cl cl, c c1, ThreadFactory threadfactory, boolean flag)
    {
        f = false;
        h = true;
        k = false;
        i = b1;
        b = cl;
        c = c1;
        e = new kj(this, aa);
        g = threadfactory.newThread(new kk(this, (byte)0));
        j = new cm(aa);
        k = flag;
    }

    static c a(ki ki1)
    {
        return ki1.c;
    }

    static ch b(ki ki1)
    {
        return ki1.a();
    }

    static String b()
    {
        return a;
    }

    static boolean c(ki ki1)
    {
        return ki1.h;
    }

    static boolean d(ki ki1)
    {
        return ki1.k;
    }

    static cm e(ki ki1)
    {
        return ki1.j;
    }

    static cl f(ki ki1)
    {
        return ki1.b;
    }

    public final ch a()
    {
        return new ch(i.a(), h.d);
    }

    public final void a(bn bn)
    {
        c.a(bn);
    }

    public final void a(ck ck)
    {
        c.a(ck);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/ki.getName()
        });
    }
}
