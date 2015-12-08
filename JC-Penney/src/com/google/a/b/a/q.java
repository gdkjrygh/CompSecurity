// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.ag;
import com.google.a.b.af;
import com.google.a.b.f;
import com.google.a.b.s;
import com.google.a.c.a;
import com.google.a.i;
import com.google.a.j;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            g, r, t, s

public final class q
    implements ag
{

    private final f a;
    private final i b;
    private final s c;

    public q(f f1, i k, s s1)
    {
        a = f1;
        b = k;
        c = s1;
    }

    static com.google.a.af a(q q1, j j1, Field field, a a1)
    {
        return q1.a(j1, field, a1);
    }

    private com.google.a.af a(j j1, Field field, a a1)
    {
        field = (b)field.getAnnotation(com/google/a/a/b);
        if (field != null)
        {
            field = com.google.a.b.a.g.a(a, j1, a1, field);
            if (field != null)
            {
                return field;
            }
        }
        return j1.a(a1);
    }

    private t a(j j1, Field field, String s1, a a1, boolean flag, boolean flag1)
    {
        return new r(this, s1, flag, flag1, j1, field, a1, af.a(a1.a()));
    }

    static String a(i k, Field field)
    {
        c c1 = (c)field.getAnnotation(com/google/a/a/c);
        if (c1 == null)
        {
            return k.a(field);
        } else
        {
            return c1.a();
        }
    }

    private String a(Field field)
    {
        return a(b, field);
    }

    private Map a(j j1, a a1, Class class1)
    {
        LinkedHashMap linkedhashmap;
        java.lang.reflect.Type type;
        linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        type = a1.b();
_L6:
        Field afield[];
        int k;
        int l;
        if (class1 == java/lang/Object)
        {
            break; /* Loop/switch isn't completed */
        }
        afield = class1.getDeclaredFields();
        l = afield.length;
        k = 0;
_L2:
        Object obj;
        boolean flag;
        boolean flag1;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj = afield[k];
        flag = a(((Field) (obj)), true);
        flag1 = a(((Field) (obj)), false);
        if (flag || flag1)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Field) (obj)).setAccessible(true);
        java.lang.reflect.Type type1 = com.google.a.b.b.a(a1.b(), class1, ((Field) (obj)).getGenericType());
        obj = a(j1, ((Field) (obj)), a(((Field) (obj))), com.google.a.c.a.a(type1), flag, flag1);
        obj = (t)linkedhashmap.put(((t) (obj)).g, obj);
        if (obj == null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((t) (obj)).g).toString());
        a1 = com.google.a.c.a.a(com.google.a.b.b.a(a1.b(), class1, class1.getGenericSuperclass()));
        class1 = a1.a();
        if (true) goto _L6; else goto _L5
_L5:
        return linkedhashmap;
    }

    static boolean a(Field field, boolean flag, s s1)
    {
        return !s1.a(field.getType(), flag) && !s1.a(field, flag);
    }

    public com.google.a.af a(j j1, a a1)
    {
        Class class1 = a1.a();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new com.google.a.b.a.s(a.a(a1), a(j1, a1, class1), null);
        }
    }

    public boolean a(Field field, boolean flag)
    {
        return a(field, flag, c);
    }
}
