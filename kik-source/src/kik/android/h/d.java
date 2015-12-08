// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.h;

import com.kik.g.p;
import com.kik.g.r;
import kik.a.d.c;

// Referenced classes of package kik.android.h:
//            a

final class d extends r
{

    final p a;
    final a b;

    d(a a1, p p1)
    {
        b = a1;
        a = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (c)obj;
        if (((c) (obj)).a())
        {
            a.a(Boolean.valueOf(((c) (obj)).a()));
            return;
        } else
        {
            a.a(new Throwable());
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        kik.android.h.a.a(b, new c(Boolean.valueOf(false)));
        a.a(throwable);
        super.a(throwable);
    }
}
