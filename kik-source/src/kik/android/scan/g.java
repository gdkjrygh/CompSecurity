// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import com.kik.g.r;
import com.kik.n.a.i.a;

// Referenced classes of package kik.android.scan:
//            d

final class g extends r
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        super.a(obj);
        if (obj == null)
        {
            d.b(a);
        }
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        d.b(a);
    }
}
