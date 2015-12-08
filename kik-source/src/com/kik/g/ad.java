// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;


// Referenced classes of package com.kik.g:
//            r, as, p

final class ad extends r
{

    final p a;
    final as b;

    ad(p p1, as as1)
    {
        a = p1;
        b = as1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = null;
        try
        {
            obj = b.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(((Throwable) (obj)));
            obj = obj1;
        }
        a.a(obj);
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
