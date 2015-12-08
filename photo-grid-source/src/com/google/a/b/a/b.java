// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.c.a;
import com.google.a.k;
import java.lang.reflect.GenericArrayType;

// Referenced classes of package com.google.a.b.a:
//            a

final class b
    implements an
{

    b()
    {
    }

    public final am a(k k1, a a1)
    {
        a1 = a1.b();
        if (!(a1 instanceof GenericArrayType) && (!(a1 instanceof Class) || !((Class)a1).isArray()))
        {
            return null;
        } else
        {
            a1 = com.google.a.b.b.d(a1);
            return new com.google.a.b.a.a(k1, k1.a(com.google.a.c.a.a(a1)), com.google.a.b.b.b(a1));
        }
    }
}
