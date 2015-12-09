// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.c.a;
import com.google.b.k;
import java.lang.reflect.GenericArrayType;

// Referenced classes of package com.google.b.b.a:
//            a

final class b
    implements am
{

    b()
    {
    }

    public final al a(k k1, a a1)
    {
        a1 = a1.getType();
        if (!(a1 instanceof GenericArrayType) && (!(a1 instanceof Class) || !((Class)a1).isArray()))
        {
            return null;
        } else
        {
            a1 = com.google.b.b.b.d(a1);
            return new com.google.b.b.a.a(k1, k1.a(com.google.b.c.a.get(a1)), com.google.b.b.b.b(a1));
        }
    }
}
