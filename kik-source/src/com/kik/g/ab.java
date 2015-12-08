// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;


// Referenced classes of package com.kik.g:
//            r, as, p, s

final class ab extends r
{

    final p a;
    final as b;

    ab(p p1, as as1)
    {
        a = p1;
        b = as1;
        super();
    }

    public final void a(Object obj)
    {
        try
        {
            s.b((p)b.a(obj), a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(((Throwable) (obj)));
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
