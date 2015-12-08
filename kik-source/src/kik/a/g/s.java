// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import kik.a.d.n;
import kik.a.f.f.k;

// Referenced classes of package kik.a.g:
//            b

final class s extends r
{

    final b a;

    s(b b1)
    {
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (k)obj;
        obj = b.b(a).a(((k) (obj)).d(), false);
        if (obj != null && (obj instanceof n))
        {
            obj = (n)obj;
            ((n) (obj)).j(false);
            b.b(a).a(((kik.a.d.k) (obj)));
        }
    }

    public final void a(Throwable throwable)
    {
        b.d(a).a(throwable);
    }
}
