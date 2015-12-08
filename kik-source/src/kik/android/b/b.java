// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.as;
import com.kik.n.a.c.e;

// Referenced classes of package kik.android.b:
//            a

final class b
    implements as
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final Object a(Object obj)
    {
        e e1 = (e)obj;
        if (e1 == null)
        {
            return null;
        }
        if (e1.h() == null)
        {
            obj = e1.b();
        } else
        {
            obj = e1.h();
        }
        return new kik.a.i.h.a(((String) (obj)), e1.c(), e1.d(), e1.e().longValue());
    }
}
