// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.k;
import com.kik.g.r;
import kik.a.f.f.ak;
import kik.a.f.q;

// Referenced classes of package kik.a.g:
//            v

final class ao extends r
{

    final v a;

    ao(v v1)
    {
        a = v1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ak)obj;
        v.a(a, ((ak) (obj)).d(), ((ak) (obj)).f(), ((ak) (obj)).e(), ((ak) (obj)).g(), ((ak) (obj)).o(), ((ak) (obj)).n());
    }

    public final void a(Throwable throwable)
    {
        if ((throwable instanceof q) && ((q)throwable).a() != 109)
        {
            v.f(a).a(null);
        }
    }
}
