// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.k;
import com.kik.g.r;
import kik.a.d.j;
import kik.a.f.f.a;

// Referenced classes of package kik.a.g:
//            y, v

final class x extends r
{

    final j a;
    final v b;

    x(v v1, j j1)
    {
        b = v1;
        a = j1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        b.a(((a) (obj)).b().a(), false, new y(this, ((a) (obj))));
    }

    public final void b(Throwable throwable)
    {
        v.f(b).a(null);
        v.i(b).a(a.a());
    }
}
