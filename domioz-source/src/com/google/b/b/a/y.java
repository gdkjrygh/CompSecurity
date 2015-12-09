// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.c.a;
import com.google.b.d.d;
import com.google.b.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.b.b.a:
//            s

final class y extends al
{

    private final k a;
    private final al b;
    private final Type c;

    y(k k1, al al1, Type type)
    {
        a = k1;
        b = al1;
        c = type;
    }

    public final Object a(com.google.b.d.a a1)
    {
        return b.a(a1);
    }

    public final void a(d d, Object obj)
    {
        Object obj1;
        al al1;
label0:
        {
            al1 = b;
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
            al1 = a.a(com.google.b.c.a.get(((Type) (obj1))));
            obj1 = al1;
            if (al1 instanceof s)
            {
                obj1 = al1;
                if (!(b instanceof s))
                {
                    obj1 = b;
                }
            }
        } else
        {
            obj1 = al1;
        }
        ((al) (obj1)).a(d, obj);
    }
}
