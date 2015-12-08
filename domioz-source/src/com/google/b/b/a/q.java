// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.a.b;
import com.google.b.a.c;
import com.google.b.al;
import com.google.b.am;
import com.google.b.b.af;
import com.google.b.b.f;
import com.google.b.b.s;
import com.google.b.c.a;
import com.google.b.j;
import com.google.b.k;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.b.b.a:
//            g, r, t, s

public final class q
    implements am
{

    private final f a;
    private final j b;
    private final s c;

    public q(f f1, j j1, s s1)
    {
        a = f1;
        b = j1;
        c = s1;
    }

    static al a(q q1, k k1, Field field, a a1)
    {
        field = (b)field.getAnnotation(com/google/b/a/b);
        if (field != null)
        {
            q1 = com.google.b.b.a.g.a(q1.a, k1, a1, field);
            if (q1 != null)
            {
                return q1;
            }
        }
        return k1.a(a1);
    }

    private Map a(k k1, a a1, Class class1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        java.lang.reflect.Type type = a1.getType();
        for (; class1 != java/lang/Object; class1 = a1.getRawType())
        {
            Field afield[] = class1.getDeclaredFields();
            int l = afield.length;
            Object obj;
            for (int i = 0; i < l; i++)
            {
                Field field = afield[i];
                boolean flag = a(field, true);
                boolean flag1 = a(field, false);
                if (!flag && !flag1)
                {
                    continue;
                }
                field.setAccessible(true);
                Object obj1 = com.google.b.b.b.a(a1.getType(), class1, field.getGenericType());
                obj = (c)field.getAnnotation(com/google/b/a/c);
                if (obj == null)
                {
                    obj = b.a(field);
                } else
                {
                    obj = ((c) (obj)).a();
                }
                obj1 = com.google.b.c.a.get(((java.lang.reflect.Type) (obj1)));
                obj = new r(this, ((String) (obj)), flag, flag1, k1, field, ((a) (obj1)), af.a(((a) (obj1)).getRawType()));
                obj = (t)linkedhashmap.put(((t) (obj)).g, obj);
                if (obj != null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((t) (obj)).g).toString());
                }
            }

            a1 = com.google.b.c.a.get(com.google.b.b.b.a(a1.getType(), class1, class1.getGenericSuperclass()));
        }

        return linkedhashmap;
    }

    private boolean a(Field field, boolean flag)
    {
        return !c.a(field.getType(), flag) && !c.a(field, flag);
    }

    public final al a(k k1, a a1)
    {
        Class class1 = a1.getRawType();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new com.google.b.b.a.s(a.a(a1), a(k1, a1, class1), (byte)0);
        }
    }
}
