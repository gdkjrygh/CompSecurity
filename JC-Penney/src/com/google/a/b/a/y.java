// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.c.a;
import com.google.a.d.d;
import com.google.a.j;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.a.b.a:
//            s

final class y extends af
{

    private final j a;
    private final af b;
    private final Type c;

    y(j j1, af af1, Type type)
    {
        a = j1;
        b = af1;
        c = type;
    }

    private Type a(Type type, Object obj)
    {
        Object obj1;
label0:
        {
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
        return ((Type) (obj1));
    }

    public void a(d d, Object obj)
    {
        af af1;
        af1 = b;
        Type type = a(c, obj);
        if (type != c)
        {
            af1 = a.a(com.google.a.c.a.a(type));
            break MISSING_BLOCK_LABEL_38;
        }
_L1:
        af1.a(d, obj);
        return;
        if ((af1 instanceof s) && !(b instanceof s))
        {
            af1 = b;
        }
          goto _L1
    }

    public Object b(com.google.a.d.a a1)
    {
        return b.b(a1);
    }
}
