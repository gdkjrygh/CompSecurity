// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.b.b;
import com.google.a.b.f;
import com.google.a.c.a;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            y, l

public final class k
    implements an
{

    private final f a;
    private final boolean b;

    public k(f f1, boolean flag)
    {
        a = f1;
        b = flag;
    }

    static boolean a(k k1)
    {
        return k1.b;
    }

    public final am a(com.google.a.k k1, a a1)
    {
        Object obj = a1.b();
        if (!java/util/Map.isAssignableFrom(a1.a()))
        {
            return null;
        }
        java.lang.reflect.Type atype[] = com.google.a.b.b.b(((java.lang.reflect.Type) (obj)), com.google.a.b.b.b(((java.lang.reflect.Type) (obj))));
        obj = atype[0];
        am am;
        if (obj == Boolean.TYPE || obj == java/lang/Boolean)
        {
            obj = com.google.a.b.a.y.f;
        } else
        {
            obj = k1.a(com.google.a.c.a.a(((java.lang.reflect.Type) (obj))));
        }
        am = k1.a(com.google.a.c.a.a(atype[1]));
        a1 = a.a(a1);
        return new l(this, k1, atype[0], ((am) (obj)), atype[1], am, a1);
    }
}
