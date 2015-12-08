// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.b.b;
import com.google.b.b.f;
import com.google.b.c.a;
import com.google.b.k;
import java.util.Map;

// Referenced classes of package com.google.b.b.a:
//            z, m

public final class l
    implements am
{

    private final f a;
    private final boolean b;

    public l(f f1, boolean flag)
    {
        a = f1;
        b = flag;
    }

    static boolean a(l l1)
    {
        return l1.b;
    }

    public final al a(k k1, a a1)
    {
        Object obj = a1.getType();
        if (!java/util/Map.isAssignableFrom(a1.getRawType()))
        {
            return null;
        }
        java.lang.reflect.Type atype[] = com.google.b.b.b.b(((java.lang.reflect.Type) (obj)), com.google.b.b.b.b(((java.lang.reflect.Type) (obj))));
        obj = atype[0];
        al al;
        if (obj == Boolean.TYPE || obj == java/lang/Boolean)
        {
            obj = com.google.b.b.a.z.f;
        } else
        {
            obj = k1.a(com.google.b.c.a.get(((java.lang.reflect.Type) (obj))));
        }
        al = k1.a(com.google.b.c.a.get(atype[1]));
        a1 = a.a(a1);
        return new m(this, k1, atype[0], ((al) (obj)), atype[1], al, a1);
    }
}
