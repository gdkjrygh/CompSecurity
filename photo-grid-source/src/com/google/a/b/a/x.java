// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.c.a;
import com.google.a.d.f;
import com.google.a.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.a.b.a:
//            r

final class x extends am
{

    private final k a;
    private final am b;
    private final Type c;

    x(k k1, am am1, Type type)
    {
        a = k1;
        b = am1;
        c = type;
    }

    public final Object a(com.google.a.d.a a1)
    {
        return b.a(a1);
    }

    public final void a(f f, Object obj)
    {
        Object obj1;
        am am1;
label0:
        {
            am1 = b;
            Type type = c;
            obj1 = type;
            if (obj == null)
            {
                break label0;
            }
            if (type != java/lang/Object && !(type instanceof TypeVariable))
            {
                obj1 = type;
                if (!(type instanceof Class))
                {
                    break label0;
                }
            }
            obj1 = obj.getClass();
        }
        if (obj1 != c)
        {
            am1 = a.a(com.google.a.c.a.a(((Type) (obj1))));
            obj1 = am1;
            if (am1 instanceof r)
            {
                obj1 = am1;
                if (!(b instanceof r))
                {
                    obj1 = b;
                }
            }
        } else
        {
            obj1 = am1;
        }
        ((am) (obj1)).a(f, obj);
    }
}
