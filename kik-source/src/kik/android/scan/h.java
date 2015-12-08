// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import com.b.a.b;
import com.kik.g.as;
import com.kik.n.a.i.a;

// Referenced classes of package kik.android.scan:
//            d

final class h
    implements as
{

    final d a;

    h(d d1)
    {
        a = d1;
        super();
    }

    public final Object a(Object obj)
    {
        obj = (a)obj;
        if (obj == null || ((a) (obj)).b() == null)
        {
            throw new IllegalArgumentException("null seed");
        } else
        {
            return Integer.valueOf(kik.android.scan.d.a(a, ((a) (obj)).b().c()));
        }
    }
}
