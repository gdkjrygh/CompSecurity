// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bmb
    implements bkr
{

    private final blc a;
    private final bjv b;
    private final bld c;

    public bmb(blc blc1, bjv bjv1, bld bld1)
    {
        a = blc1;
        b = bjv1;
        c = bld1;
    }

    private bkq a(bjw bjw1, Field field, bmj bmj1)
    {
        field = (bkt)field.getAnnotation(bkt);
        if (field != null)
        {
            field = blv.a(a, bjw1, bmj1, field);
            if (field != null)
            {
                return field;
            }
        }
        return bjw1.a(bmj1);
    }

    static bkq a(bmb bmb1, bjw bjw1, Field field, bmj bmj1)
    {
        return bmb1.a(bjw1, field, bmj1);
    }

    private bmd a(bjw bjw1, Field field, String s, bmj bmj1, boolean flag, boolean flag1)
    {
        return new bmd(s, flag, flag1, bjw1, field, bmj1, blm.a(bmj1.getRawType())) {

            final bkq a;
            final bjw b;
            final Field c;
            final bmj d;
            final boolean e;
            final bmb f;

            final void a(JsonReader jsonreader, Object obj)
            {
                jsonreader = ((JsonReader) (a.a(jsonreader)));
                if (jsonreader != null || !e)
                {
                    c.set(obj, jsonreader);
                }
            }

            final void a(JsonWriter jsonwriter, Object obj)
            {
                obj = c.get(obj);
                (new bmg(b, a, d.getType())).a(jsonwriter, obj);
            }

            public final boolean a(Object obj)
            {
                while (!h || c.get(obj) == obj) 
                {
                    return false;
                }
                return true;
            }

            
            {
                f = bmb.this;
                b = bjw1;
                c = field;
                d = bmj1;
                e = flag2;
                super(s, flag, flag1);
                a = bmb.a(f, b, c, d);
            }
        };
    }

    private static String a(bjv bjv1, Field field)
    {
        bku bku1 = (bku)field.getAnnotation(bku);
        if (bku1 == null)
        {
            return bjv1.a(field);
        } else
        {
            return bku1.a();
        }
    }

    private String a(Field field)
    {
        return a(b, field);
    }

    private Map a(bjw bjw1, bmj bmj1, Class class1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        java.lang.reflect.Type type = bmj1.getType();
        for (; class1 != java/lang/Object; class1 = bmj1.getRawType())
        {
            Field afield[] = class1.getDeclaredFields();
            int j = afield.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = afield[i];
                boolean flag = a(((Field) (obj)), true);
                boolean flag1 = a(((Field) (obj)), false);
                if (!flag && !flag1)
                {
                    continue;
                }
                ((Field) (obj)).setAccessible(true);
                java.lang.reflect.Type type1 = bky.a(bmj1.getType(), class1, ((Field) (obj)).getGenericType());
                obj = a(bjw1, ((Field) (obj)), a(((Field) (obj))), bmj.get(type1), flag, flag1);
                obj = (bmd)linkedhashmap.put(((bmd) (obj)).g, obj);
                if (obj != null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((bmd) (obj)).g).toString());
                }
            }

            bmj1 = bmj.get(bky.a(bmj1.getType(), class1, class1.getGenericSuperclass()));
        }

        return linkedhashmap;
    }

    private boolean a(Field field, boolean flag)
    {
        return a(field, flag, c);
    }

    private static boolean a(Field field, boolean flag, bld bld1)
    {
        return !bld1.a(field.getType(), flag) && !bld1.a(field, flag);
    }

    public final bkq create(bjw bjw1, bmj bmj1)
    {
        Class class1 = bmj1.getRawType();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new bmc(a.a(bmj1), a(bjw1, bmj1, class1), (byte)0);
        }
    }
}
