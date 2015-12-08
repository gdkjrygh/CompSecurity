// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.y.j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            d, b

static final class  extends d
{

    private static final pperBounds a = new <init>((byte)0);
    private final Map b = ax.b();

    static af a(Type type)
    {
          = new <init>();
        .a(new Type[] {
            a.a(type)
        });
        return af.a(.b);
    }

    final void a(Class class1)
    {
        a(new Type[] {
            class1.getGenericSuperclass()
        });
        a(class1.getGenericInterfaces());
    }

    final void a(ParameterizedType parameterizedtype)
    {
        Class class1 = (Class)parameterizedtype.getRawType();
        TypeVariable atypevariable[] = class1.getTypeParameters();
        Type atype[] = parameterizedtype.getActualTypeArguments();
        boolean flag;
        if (atypevariable.length == atype.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
label0:
        for (int i = 0; i < atypevariable.length; i++)
        {
              = new <init>(atypevariable[i]);
            Type type = atype[i];
            if (b.containsKey())
            {
                continue;
            }
            for (Type type1 = type; type1 != null; type1 = (Type)b.get(a(type1)))
            {
                if (.b(type1))
                {
                    for (; type != null; type = (Type)b.remove(a(type))) { }
                    continue label0;
                }
            }

            b.put(, type);
        }

        a(new Type[] {
            class1
        });
        a(new Type[] {
            parameterizedtype.getOwnerType()
        });
    }

    final void a(TypeVariable typevariable)
    {
        a(typevariable.getBounds());
    }

    final void a(WildcardType wildcardtype)
    {
        a(wildcardtype.getUpperBounds());
    }


    private ()
    {
    }
}
