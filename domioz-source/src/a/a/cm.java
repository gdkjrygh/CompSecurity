// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            cl, ck, ac, aa

public class cm
    implements cl
{

    private static final String a;
    private final aa b;

    public cm(aa aa1)
    {
        b = aa1;
    }

    public final void a(ck ck1)
    {
        c(ck1);
    }

    public final void b(ck ck1)
    {
        c(ck1);
    }

    public final void c(ck ck1)
    {
        com.appboy.f.a.b(a, "Short circuiting execution of network request and immediately marking it as succeeded.");
        ck1.a(b);
        ck1.b(b);
        b.a(new ac(ck1), a/a/ac);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/cm.getName()
        });
    }
}
