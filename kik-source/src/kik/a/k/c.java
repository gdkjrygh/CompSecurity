// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.k;

import com.kik.g.p;
import com.kik.g.r;
import kik.a.f.f.z;

// Referenced classes of package kik.a.k:
//            d, b

final class c extends r
{

    final p a;
    final b b;

    c(b b1, p p1)
    {
        b = b1;
        a = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (z)obj;
        try
        {
            a.a((d)obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(new IllegalArgumentException("incorrect type resolved"));
        }
    }

    public final void b()
    {
        a.e();
    }

    public final void b(Throwable throwable)
    {
        a.a(throwable);
    }
}
