// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.c.a;
import com.google.a.j;
import java.lang.reflect.GenericArrayType;

// Referenced classes of package com.google.a.b.a:
//            a

final class b
    implements ag
{

    b()
    {
    }

    public af a(j j1, a a1)
    {
        a1 = a1.b();
        if (!(a1 instanceof GenericArrayType) && (!(a1 instanceof Class) || !((Class)a1).isArray()))
        {
            return null;
        } else
        {
            a1 = com.google.a.b.b.g(a1);
            return new com.google.a.b.a.a(j1, j1.a(com.google.a.c.a.a(a1)), com.google.a.b.b.e(a1));
        }
    }
}
