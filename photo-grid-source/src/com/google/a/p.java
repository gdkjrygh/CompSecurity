// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;

// Referenced classes of package com.google.a:
//            am, k

final class p extends am
{

    final k a;

    p(k k1)
    {
        a = k1;
        super();
    }

    public final Object a(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        } else
        {
            return Float.valueOf((float)a1.k());
        }
    }

    public final void a(f f1, Object obj)
    {
        obj = (Number)obj;
        if (obj == null)
        {
            f1.f();
            return;
        } else
        {
            com.google.a.k.a(((Number) (obj)).floatValue());
            f1.a(((Number) (obj)));
            return;
        }
    }
}
