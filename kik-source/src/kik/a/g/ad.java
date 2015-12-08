// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.k;
import com.kik.g.r;
import kik.a.d.j;
import kik.a.f.f.am;

// Referenced classes of package kik.a.g:
//            ae, v

final class ad extends r
{

    final v a;

    ad(v v1)
    {
        a = v1;
        super();
    }

    public final void a(Object obj)
    {
        obj = ((am)obj).d().a();
        a.a(((String) (obj)), false, new ae(this));
    }

    public final void b(Throwable throwable)
    {
        v.f(a).a(null);
    }
}
