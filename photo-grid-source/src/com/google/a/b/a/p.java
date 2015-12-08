// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.b.b;
import com.google.a.b.f;
import com.google.a.b.o;
import com.google.a.b.t;
import com.google.a.c.a;
import com.google.a.j;
import com.google.a.k;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            q, s, r

public final class p
    implements an
{

    private final f a;
    private final j b;
    private final o c;

    public p(f f1, j j1, o o1)
    {
        a = f1;
        b = j1;
        c = o1;
    }

    private Map a(k k, a a1, Class class1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        java.lang.reflect.Type type = a1.b();
        for (; class1 != java/lang/Object; class1 = a1.a())
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
                Object obj1 = com.google.a.b.b.a(a1.b(), class1, field.getGenericType());
                obj = (com.google.a.a.b)field.getAnnotation(com/google/a/a/b);
                if (obj == null)
                {
                    obj = b.a(field);
                } else
                {
                    obj = ((com.google.a.a.b) (obj)).a();
                }
                obj1 = com.google.a.c.a.a(((java.lang.reflect.Type) (obj1)));
                obj = new q(this, ((String) (obj)), flag, flag1, k, ((a) (obj1)), field, t.a(((a) (obj1)).a()));
                obj = (s)linkedhashmap.put(((s) (obj)).g, obj);
                if (obj != null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((s) (obj)).g).toString());
                }
            }

            a1 = com.google.a.c.a.a(com.google.a.b.b.a(a1.b(), class1, class1.getGenericSuperclass()));
        }

        return linkedhashmap;
    }

    private boolean a(Field field, boolean flag)
    {
        return !c.a(field.getType(), flag) && !c.a(field, flag);
    }

    public final am a(k k, a a1)
    {
        Class class1 = a1.a();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new r(this, a.a(a1), a(k, a1, class1), (byte)0);
        }
    }
}
