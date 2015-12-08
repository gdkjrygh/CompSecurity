// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonSyntaxException;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.google.gson.b.a;
import com.google.gson.d;
import com.google.gson.e;
import com.google.gson.internal.f;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.a:
//            d, l

public final class i
    implements s
{
    public static final class a extends r
    {

        private final com.google.gson.internal.e a;
        private final Map b;

        public final Object a(JsonReader jsonreader)
            throws IOException
        {
            Object obj;
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            obj = a.a();
            jsonreader.beginObject();
_L1:
            Object obj1;
            if (!jsonreader.hasNext())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj1 = jsonreader.nextName();
            obj1 = (b)b.get(obj1);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            if (((b) (obj1)).i)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            jsonreader.skipValue();
              goto _L1
            try
            {
                ((b) (obj1)).a(jsonreader, obj);
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new AssertionError(jsonreader);
            }
              goto _L1
            jsonreader.endObject();
            return obj;
        }

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            if (obj == null)
            {
                jsonwriter.nullValue();
                return;
            }
            jsonwriter.beginObject();
            try
            {
                Iterator iterator = b.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    b b1 = (b)iterator.next();
                    if (b1.h)
                    {
                        jsonwriter.name(b1.g);
                        b1.a(jsonwriter, obj);
                    }
                } while (true);
            }
            // Misplaced declaration of an exception variable
            catch (JsonWriter jsonwriter)
            {
                throw new AssertionError();
            }
            jsonwriter.endObject();
        }

        private a(com.google.gson.internal.e e1, Map map)
        {
            a = e1;
            b = map;
        }

        a(com.google.gson.internal.e e1, Map map, byte byte0)
        {
            this(e1, map);
        }
    }

    static abstract class b
    {

        final String g;
        final boolean h;
        final boolean i;

        abstract void a(JsonReader jsonreader, Object obj)
            throws IOException, IllegalAccessException;

        abstract void a(JsonWriter jsonwriter, Object obj)
            throws IOException, IllegalAccessException;

        protected b(String s1, boolean flag, boolean flag1)
        {
            g = s1;
            h = flag;
            i = flag1;
        }
    }


    private final com.google.gson.internal.b a;
    private final d b;
    private final com.google.gson.internal.c c;

    public i(com.google.gson.internal.b b1, d d1, com.google.gson.internal.c c1)
    {
        a = b1;
        b = d1;
        c = c1;
    }

    static r a(i j, e e1, Field field, com.google.gson.b.a a1)
    {
        field = (com.google.gson.a.b)field.getAnnotation(com/google/gson/a/b);
        if (field != null)
        {
            j = com.google.gson.internal.a.d.a(j.a, e1, a1, field);
            if (j != null)
            {
                return j;
            }
        }
        return e1.a(a1);
    }

    private Map a(e e1, com.google.gson.b.a a1, Class class1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        java.lang.reflect.Type type = a1.b;
        for (; class1 != java/lang/Object; class1 = a1.a)
        {
            Field afield[] = class1.getDeclaredFields();
            int k = afield.length;
            Object obj;
            for (int j = 0; j < k; j++)
            {
                Field field = afield[j];
                boolean flag = a(field, true);
                boolean flag1 = a(field, false);
                if (!flag && !flag1)
                {
                    continue;
                }
                field.setAccessible(true);
                Object obj1 = com.google.gson.internal..Gson.Types.a(a1.b, class1, field.getGenericType());
                obj = (c)field.getAnnotation(com/google/gson/a/c);
                if (obj == null)
                {
                    obj = b.a(field);
                } else
                {
                    obj = ((c) (obj)).a();
                }
                obj1 = com.google.gson.b.a.a(((java.lang.reflect.Type) (obj1)));
                obj = new b(((String) (obj)), flag, flag1, e1, field, ((com.google.gson.b.a) (obj1)), f.a(((com.google.gson.b.a) (obj1)).a)) {

                    final r a;
                    final e b;
                    final Field c;
                    final com.google.gson.b.a d;
                    final boolean e;
                    final i f;

                    final void a(JsonReader jsonreader, Object obj2)
                        throws IOException, IllegalAccessException
                    {
                        jsonreader = ((JsonReader) (a.a(jsonreader)));
                        if (jsonreader != null || !e)
                        {
                            c.set(obj2, jsonreader);
                        }
                    }

                    final void a(JsonWriter jsonwriter, Object obj2)
                        throws IOException, IllegalAccessException
                    {
                        obj2 = c.get(obj2);
                        (new l(b, a, d.b)).a(jsonwriter, obj2);
                    }

            
            {
                f = i.this;
                b = e1;
                c = field;
                d = a1;
                e = flag2;
                super(s1, flag, flag1);
                a = com.google.gson.internal.a.i.a(f, b, c, d);
            }
                };
                obj = (b)linkedhashmap.put(((b) (obj)).g, obj);
                if (obj != null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((b) (obj)).g).toString());
                }
            }

            a1 = com.google.gson.b.a.a(com.google.gson.internal..Gson.Types.a(a1.b, class1, class1.getGenericSuperclass()));
        }

        return linkedhashmap;
    }

    private boolean a(Field field, boolean flag)
    {
        if (c.a(field.getType(), flag)) goto _L2; else goto _L1
_L1:
        Object obj = c;
        if ((((com.google.gson.internal.c) (obj)).c & field.getModifiers()) == 0) goto _L4; else goto _L3
_L3:
        boolean flag1 = true;
_L5:
        if (!flag1)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
label0:
        {
            if (((com.google.gson.internal.c) (obj)).b != -1D && !((com.google.gson.internal.c) (obj)).a((com.google.gson.a.d)field.getAnnotation(com/google/gson/a/d), (com.google.gson.a.e)field.getAnnotation(com/google/gson/a/e)))
            {
                flag1 = true;
                continue; /* Loop/switch isn't completed */
            }
            if (field.isSynthetic())
            {
                flag1 = true;
                continue; /* Loop/switch isn't completed */
            }
            if (((com.google.gson.internal.c) (obj)).e)
            {
                com.google.gson.a.a a1 = (com.google.gson.a.a)field.getAnnotation(com/google/gson/a/a);
                if (a1 == null || (flag ? !a1.a() : !a1.b()))
                {
                    flag1 = true;
                    continue; /* Loop/switch isn't completed */
                }
            }
            if (!((com.google.gson.internal.c) (obj)).d && com.google.gson.internal.c.b(field.getType()))
            {
                flag1 = true;
                continue; /* Loop/switch isn't completed */
            }
            if (com.google.gson.internal.c.a(field.getType()))
            {
                flag1 = true;
                continue; /* Loop/switch isn't completed */
            }
            if (flag)
            {
                obj = ((com.google.gson.internal.c) (obj)).f;
            } else
            {
                obj = ((com.google.gson.internal.c) (obj)).g;
            }
            if (((List) (obj)).isEmpty())
            {
                break label0;
            }
            new com.google.gson.c(field);
            field = ((List) (obj)).iterator();
            do
            {
                if (!field.hasNext())
                {
                    break label0;
                }
            } while (!((com.google.gson.b)field.next()).a());
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
        flag1 = false;
        if (true) goto _L5; else goto _L2
_L2:
        return false;
    }

    public final r a(e e1, com.google.gson.b.a a1)
    {
        Class class1 = a1.a;
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new a(a.a(a1), a(e1, a1, class1), (byte)0);
        }
    }
}
