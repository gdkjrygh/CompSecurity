// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.b.b;
import com.google.a.b.f;
import com.google.a.c.a;
import com.google.a.j;
import java.lang.reflect.Type;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            z, m

public final class l
    implements ag
{

    private final f a;
    private final boolean b;

    public l(f f1, boolean flag)
    {
        a = f1;
        b = flag;
    }

    private af a(j j1, Type type)
    {
        if (type == Boolean.TYPE || type == java/lang/Boolean)
        {
            return com.google.a.b.a.z.f;
        } else
        {
            return j1.a(com.google.a.c.a.a(type));
        }
    }

    static boolean a(l l1)
    {
        return l1.b;
    }

    public af a(j j1, a a1)
    {
        Type type = a1.b();
        if (!java/util/Map.isAssignableFrom(a1.a()))
        {
            return null;
        } else
        {
            Type atype[] = com.google.a.b.b.b(type, com.google.a.b.b.e(type));
            af af = a(j1, atype[0]);
            af af1 = j1.a(com.google.a.c.a.a(atype[1]));
            a1 = a.a(a1);
            return new m(this, j1, atype[0], af, atype[1], af1, a1);
        }
    }
}
