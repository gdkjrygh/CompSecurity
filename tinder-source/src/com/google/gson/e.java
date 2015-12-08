// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.a.a;
import com.google.gson.internal.a.d;
import com.google.gson.internal.a.g;
import com.google.gson.internal.a.h;
import com.google.gson.internal.a.i;
import com.google.gson.internal.a.j;
import com.google.gson.internal.a.k;
import com.google.gson.internal.a.m;
import com.google.gson.internal.b;
import com.google.gson.internal.c;
import com.google.gson.internal.f;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.gson:
//            FieldNamingPolicy, LongSerializationPolicy, JsonIOException, JsonSyntaxException, 
//            r, s, l, i, 
//            o, d

public final class e
{
    static final class a extends r
    {

        r a;

        public final Object a(JsonReader jsonreader)
            throws IOException
        {
            if (a == null)
            {
                throw new IllegalStateException();
            } else
            {
                return a.a(jsonreader);
            }
        }

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            if (a == null)
            {
                throw new IllegalStateException();
            } else
            {
                a.a(jsonwriter, obj);
                return;
            }
        }

        a()
        {
        }
    }


    final com.google.gson.i a;
    final o b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final b f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public e()
    {
        this(c.a, ((com.google.gson.d) (com.google.gson.FieldNamingPolicy.a)), Collections.emptyMap(), false, false, false, true, false, false, com.google.gson.LongSerializationPolicy.a, Collections.emptyList());
    }

    public e(c c1, com.google.gson.d d1, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, LongSerializationPolicy longserializationpolicy, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new com.google.gson.i() {

            final e a;

            
            {
                a = e.this;
                super();
            }
        };
        b = new o() {

            final e a;

            
            {
                a = e.this;
                super();
            }
        };
        f = new b(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        ArrayList arraylist = new ArrayList();
        arraylist.add(m.Q);
        arraylist.add(h.a);
        arraylist.add(c1);
        arraylist.addAll(list);
        arraylist.add(m.x);
        arraylist.add(m.m);
        arraylist.add(m.g);
        arraylist.add(m.i);
        arraylist.add(m.k);
        list = Long.TYPE;
        if (longserializationpolicy == com.google.gson.LongSerializationPolicy.a)
        {
            map = m.n;
        } else
        {
            map = new r() {

                final e a;

                public final Object a(JsonReader jsonreader)
                    throws IOException
                {
                    if (jsonreader.peek() == JsonToken.NULL)
                    {
                        jsonreader.nextNull();
                        return null;
                    } else
                    {
                        return Long.valueOf(jsonreader.nextLong());
                    }
                }

                public final void a(JsonWriter jsonwriter, Object obj)
                    throws IOException
                {
                    obj = (Number)obj;
                    if (obj == null)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        jsonwriter.value(obj.toString());
                        return;
                    }
                }

            
            {
                a = e.this;
                super();
            }
            };
        }
        arraylist.add(m.a(list, java/lang/Long, map));
        longserializationpolicy = Double.TYPE;
        if (flag5)
        {
            map = m.p;
        } else
        {
            map = new r() {

                final e a;

                public final Object a(JsonReader jsonreader)
                    throws IOException
                {
                    if (jsonreader.peek() == JsonToken.NULL)
                    {
                        jsonreader.nextNull();
                        return null;
                    } else
                    {
                        return Double.valueOf(jsonreader.nextDouble());
                    }
                }

                public final void a(JsonWriter jsonwriter, Object obj)
                    throws IOException
                {
                    obj = (Number)obj;
                    if (obj == null)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        com.google.gson.e.a(((Number) (obj)).doubleValue());
                        jsonwriter.value(((Number) (obj)));
                        return;
                    }
                }

            
            {
                a = e.this;
                super();
            }
            };
        }
        arraylist.add(m.a(longserializationpolicy, java/lang/Double, map));
        longserializationpolicy = Float.TYPE;
        if (flag5)
        {
            map = m.o;
        } else
        {
            map = new r() {

                final e a;

                public final Object a(JsonReader jsonreader)
                    throws IOException
                {
                    if (jsonreader.peek() == JsonToken.NULL)
                    {
                        jsonreader.nextNull();
                        return null;
                    } else
                    {
                        return Float.valueOf((float)jsonreader.nextDouble());
                    }
                }

                public final void a(JsonWriter jsonwriter, Object obj)
                    throws IOException
                {
                    obj = (Number)obj;
                    if (obj == null)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        com.google.gson.e.a(((Number) (obj)).floatValue());
                        jsonwriter.value(((Number) (obj)));
                        return;
                    }
                }

            
            {
                a = e.this;
                super();
            }
            };
        }
        arraylist.add(m.a(longserializationpolicy, java/lang/Float, map));
        arraylist.add(m.r);
        arraylist.add(m.t);
        arraylist.add(m.z);
        arraylist.add(m.B);
        arraylist.add(m.a(java/math/BigDecimal, m.v));
        arraylist.add(m.a(java/math/BigInteger, m.w));
        arraylist.add(m.D);
        arraylist.add(m.F);
        arraylist.add(m.J);
        arraylist.add(m.O);
        arraylist.add(m.H);
        arraylist.add(m.d);
        arraylist.add(com.google.gson.internal.a.c.a);
        arraylist.add(m.M);
        arraylist.add(k.a);
        arraylist.add(j.a);
        arraylist.add(m.K);
        arraylist.add(com.google.gson.internal.a.a.a);
        arraylist.add(m.R);
        arraylist.add(m.b);
        arraylist.add(new com.google.gson.internal.a.b(f));
        arraylist.add(new g(f, flag1));
        arraylist.add(new d(f));
        arraylist.add(new i(f, d1, c1));
        e = Collections.unmodifiableList(arraylist);
    }

    private JsonWriter a(Writer writer)
        throws IOException
    {
        if (i)
        {
            writer.write(")]}'\n");
        }
        writer = new JsonWriter(writer);
        if (j)
        {
            writer.setIndent("  ");
        }
        writer.setSerializeNulls(g);
        return writer;
    }

    private Object a(JsonReader jsonreader, Type type)
        throws JsonIOException, JsonSyntaxException
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = jsonreader.isLenient();
        jsonreader.setLenient(true);
        jsonreader.peek();
        flag = false;
        type = ((Type) (a(com.google.gson.b.a.a(type)).a(jsonreader)));
        jsonreader.setLenient(flag1);
        return type;
        type;
        if (flag)
        {
            jsonreader.setLenient(flag1);
            return null;
        }
        throw new JsonSyntaxException(type);
        type;
        jsonreader.setLenient(flag1);
        throw type;
        type;
        throw new JsonSyntaxException(type);
        type;
        throw new JsonSyntaxException(type);
    }

    static void a(double d1)
    {
        if (Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d1).append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        } else
        {
            return;
        }
    }

    public final r a(com.google.gson.b.a a1)
    {
        Object obj = (r)d.get(a1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((r) (obj));
_L2:
        Object obj1;
        Object obj2;
        boolean flag;
        obj1 = (Map)c.get();
        flag = false;
        if (obj1 == null)
        {
            obj1 = new HashMap();
            c.set(obj1);
            flag = true;
        }
        obj2 = (a)((Map) (obj1)).get(a1);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new a();
        ((Map) (obj1)).put(a1, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_222;
            }
            obj2 = ((s)iterator.next()).a(this, a1);
        } while (obj2 == null);
        if (((a) (obj)).a != null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_177;
        obj;
        ((Map) (obj1)).remove(a1);
        if (flag)
        {
            c.remove();
        }
        throw obj;
        obj.a = ((r) (obj2));
        d.put(a1, obj2);
        ((Map) (obj1)).remove(a1);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((r) (obj2));
        throw new IllegalArgumentException((new StringBuilder("GSON cannot handle ")).append(a1).toString());
    }

    public final r a(s s1, com.google.gson.b.a a1)
    {
        Iterator iterator = e.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            Object obj = (s)iterator.next();
            if (!flag)
            {
                if (obj == s1)
                {
                    flag = true;
                }
            } else
            {
                obj = ((s) (obj)).a(this, a1);
                if (obj != null)
                {
                    return ((r) (obj));
                }
            }
        }
        throw new IllegalArgumentException((new StringBuilder("GSON cannot serialize ")).append(a1).toString());
    }

    public final r a(Class class1)
    {
        return a(com.google.gson.b.a.a(class1));
    }

    public final Object a(String s1, Class class1)
        throws JsonSyntaxException
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L4:
        return com.google.gson.internal.f.a(class1).cast(s1);
_L2:
        Object obj;
        JsonReader jsonreader;
        jsonreader = new JsonReader(new StringReader(s1));
        obj = a(jsonreader, ((Type) (class1)));
        s1 = ((String) (obj));
        if (obj == null) goto _L4; else goto _L3
_L3:
        s1 = ((String) (obj));
        if (jsonreader.peek() == JsonToken.END_DOCUMENT) goto _L4; else goto _L5
_L5:
        throw new JsonIOException("JSON document was not fully consumed.");
        s1;
        throw new JsonSyntaxException(s1);
        s1;
        throw new JsonIOException(s1);
    }

    public final String a(Object obj)
    {
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        l l1 = com.google.gson.l.a;
        StringWriter stringwriter = new StringWriter();
        Object obj1;
        boolean flag;
        boolean flag2;
        boolean flag4;
        try
        {
            obj = a((Writer)stringwriter);
            flag = ((JsonWriter) (obj)).isLenient();
            ((JsonWriter) (obj)).setLenient(true);
            flag2 = ((JsonWriter) (obj)).isHtmlSafe();
            ((JsonWriter) (obj)).setHtmlSafe(h);
            flag4 = ((JsonWriter) (obj)).getSerializeNulls();
            ((JsonWriter) (obj)).setSerializeNulls(g);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        com.google.gson.internal.g.a(l1, ((JsonWriter) (obj)));
        ((JsonWriter) (obj)).setLenient(flag);
        ((JsonWriter) (obj)).setHtmlSafe(flag2);
        ((JsonWriter) (obj)).setSerializeNulls(flag4);
        return stringwriter.toString();
        obj1;
        throw new JsonIOException(((Throwable) (obj1)));
        obj1;
        ((JsonWriter) (obj)).setLenient(flag);
        ((JsonWriter) (obj)).setHtmlSafe(flag2);
        ((JsonWriter) (obj)).setSerializeNulls(flag4);
        throw obj1;
        Object obj2 = obj.getClass();
        StringWriter stringwriter1 = new StringWriter();
        JsonWriter jsonwriter;
        boolean flag1;
        boolean flag3;
        boolean flag5;
        try
        {
            jsonwriter = a((Writer)stringwriter1);
            obj2 = a(com.google.gson.b.a.a(((Type) (obj2))));
            flag1 = jsonwriter.isLenient();
            jsonwriter.setLenient(true);
            flag3 = jsonwriter.isHtmlSafe();
            jsonwriter.setHtmlSafe(h);
            flag5 = jsonwriter.getSerializeNulls();
            jsonwriter.setSerializeNulls(g);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new JsonIOException(((Throwable) (obj)));
        }
        ((r) (obj2)).a(jsonwriter, obj);
        jsonwriter.setLenient(flag1);
        jsonwriter.setHtmlSafe(flag3);
        jsonwriter.setSerializeNulls(flag5);
        return stringwriter1.toString();
        obj;
        throw new JsonIOException(((Throwable) (obj)));
        obj;
        jsonwriter.setLenient(flag1);
        jsonwriter.setHtmlSafe(flag3);
        jsonwriter.setSerializeNulls(flag5);
        throw obj;
    }

    public final String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }
}
