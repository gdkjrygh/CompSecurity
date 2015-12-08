// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.y.g;
import com.google.android.m4b.maps.y.j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            b, e

static final class <init>
{

    private final AtomicInteger a;

    final Type a(Type type)
    {
        j.a(type);
        break MISSING_BLOCK_LABEL_5;
        if (!(type instanceof Class) && !(type instanceof TypeVariable))
        {
            if (type instanceof GenericArrayType)
            {
                return e.a(a(((GenericArrayType)type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType)
            {
                ParameterizedType parameterizedtype = (ParameterizedType)type;
                type = parameterizedtype.getOwnerType();
                Type atype[];
                Class class1;
                Type atype1[];
                if (type == null)
                {
                    type = null;
                } else
                {
                    type = a(type);
                }
                class1 = (Class)parameterizedtype.getRawType();
                atype = parameterizedtype.getActualTypeArguments();
                atype1 = new Type[atype.length];
                for (int i = 0; i < atype.length; i++)
                {
                    atype1[i] = a(atype[i]);
                }

                return e.a(type, class1, atype1);
            }
            if (type instanceof WildcardType)
            {
                WildcardType wildcardtype = (WildcardType)type;
                if (wildcardtype.getLowerBounds().length == 0)
                {
                    type = wildcardtype.getUpperBounds();
                    return e.a(com/google/android/m4b/maps/ah/b$d, (new StringBuilder("capture#")).append(a.incrementAndGet()).append("-of ? extends ").append(g.a('&').a(type)).toString(), wildcardtype.getUpperBounds());
                }
            } else
            {
                throw new AssertionError("must have been one of the known types");
            }
        }
        return type;
    }

    private nteger()
    {
        a = new AtomicInteger();
    }

    nteger(byte byte0)
    {
        this();
    }
}
