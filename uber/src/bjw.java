// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
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

public final class bjw
{

    final bkb a;
    final bkk b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final blc f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public bjw()
    {
        this(bld.a, ((bjv) (bju.a)), Collections.emptyMap(), false, false, false, true, false, false, bkn.a, Collections.emptyList());
    }

    bjw(bld bld1, bjv bjv, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, bkn bkn1, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new bkb() {

            final bjw a;

            public final Object a(bkd bkd, Type type)
            {
                return a.a(bkd, type);
            }

            
            {
                a = bjw.this;
                super();
            }
        };
        b = new bkk() {

            final bjw a;

            
            {
                a = bjw.this;
                super();
            }
        };
        f = new blc(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        map = new ArrayList();
        map.add(bmh.Q);
        map.add(bma.a);
        map.add(bld1);
        map.addAll(list);
        map.add(bmh.x);
        map.add(bmh.m);
        map.add(bmh.g);
        map.add(bmh.i);
        map.add(bmh.k);
        map.add(bmh.a(Long.TYPE, java/lang/Long, a(bkn1)));
        map.add(bmh.a(Double.TYPE, java/lang/Double, a(flag5)));
        map.add(bmh.a(Float.TYPE, java/lang/Float, b(flag5)));
        map.add(bmh.r);
        map.add(bmh.t);
        map.add(bmh.z);
        map.add(bmh.B);
        map.add(bmh.a(java/math/BigDecimal, bmh.v));
        map.add(bmh.a(java/math/BigInteger, bmh.w));
        map.add(bmh.D);
        map.add(bmh.F);
        map.add(bmh.J);
        map.add(bmh.O);
        map.add(bmh.H);
        map.add(bmh.d);
        map.add(blu.a);
        map.add(bmh.M);
        map.add(bmf.a);
        map.add(bme.a);
        map.add(bmh.K);
        map.add(blr.a);
        map.add(bmh.b);
        map.add(new bls(f));
        map.add(new bly(f, flag1));
        map.add(new blv(f));
        map.add(bmh.R);
        map.add(new bmb(f, bjv, bld1));
        e = Collections.unmodifiableList(map);
    }

    private bkq a(bkn bkn1)
    {
        if (bkn1 == bkn.a)
        {
            return bmh.n;
        } else
        {
            return new bkq() {

                final bjw a;

                private static void a(JsonWriter jsonwriter, Number number)
                {
                    if (number == null)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        jsonwriter.value(number.toString());
                        return;
                    }
                }

                private static Number b(JsonReader jsonreader)
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

                public final Object a(JsonReader jsonreader)
                {
                    return b(jsonreader);
                }

                public final volatile void a(JsonWriter jsonwriter, Object obj)
                {
                    a(jsonwriter, (Number)obj);
                }

            
            {
                a = bjw.this;
                super();
            }
            };
        }
    }

    private bkq a(boolean flag)
    {
        if (flag)
        {
            return bmh.p;
        } else
        {
            return new bkq() {

                final bjw a;

                private static void a(JsonWriter jsonwriter, Number number)
                {
                    if (number == null)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        bjw.a(number.doubleValue());
                        jsonwriter.value(number);
                        return;
                    }
                }

                private static Double b(JsonReader jsonreader)
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

                public final Object a(JsonReader jsonreader)
                {
                    return b(jsonreader);
                }

                public final volatile void a(JsonWriter jsonwriter, Object obj)
                {
                    a(jsonwriter, (Number)obj);
                }

            
            {
                a = bjw.this;
                super();
            }
            };
        }
    }

    private JsonWriter a(Writer writer)
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

    private String a(bkd bkd)
    {
        StringWriter stringwriter = new StringWriter();
        a(bkd, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    static void a(double d1)
    {
        b(d1);
    }

    private void a(bkd bkd, JsonWriter jsonwriter)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = jsonwriter.isLenient();
        jsonwriter.setLenient(true);
        flag1 = jsonwriter.isHtmlSafe();
        jsonwriter.setHtmlSafe(h);
        flag2 = jsonwriter.getSerializeNulls();
        jsonwriter.setSerializeNulls(g);
        bln.a(bkd, jsonwriter);
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        return;
        bkd;
        throw new bke(bkd);
        bkd;
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        throw bkd;
    }

    private void a(bkd bkd, Appendable appendable)
    {
        try
        {
            a(bkd, a(bln.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bkd bkd)
        {
            throw new RuntimeException(bkd);
        }
    }

    private static void a(Object obj, JsonReader jsonreader)
    {
        if (obj != null)
        {
            try
            {
                if (jsonreader.peek() != JsonToken.END_DOCUMENT)
                {
                    throw new bke("JSON document was not fully consumed.");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new bkm(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new bke(((Throwable) (obj)));
            }
        }
    }

    private void a(Object obj, Type type, JsonWriter jsonwriter)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        type = a(bmj.get(type));
        flag = jsonwriter.isLenient();
        jsonwriter.setLenient(true);
        flag1 = jsonwriter.isHtmlSafe();
        jsonwriter.setHtmlSafe(h);
        flag2 = jsonwriter.getSerializeNulls();
        jsonwriter.setSerializeNulls(g);
        type.a(jsonwriter, obj);
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        return;
        obj;
        throw new bke(((Throwable) (obj)));
        obj;
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        throw obj;
    }

    private void a(Object obj, Type type, Appendable appendable)
    {
        try
        {
            a(obj, type, a(bln.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new bke(((Throwable) (obj)));
        }
    }

    private bkq b(boolean flag)
    {
        if (flag)
        {
            return bmh.o;
        } else
        {
            return new bkq() {

                final bjw a;

                private static void a(JsonWriter jsonwriter, Number number)
                {
                    if (number == null)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        bjw.a(number.floatValue());
                        jsonwriter.value(number);
                        return;
                    }
                }

                private static Float b(JsonReader jsonreader)
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

                public final Object a(JsonReader jsonreader)
                {
                    return b(jsonreader);
                }

                public final volatile void a(JsonWriter jsonwriter, Object obj)
                {
                    a(jsonwriter, (Number)obj);
                }

            
            {
                a = bjw.this;
                super();
            }
            };
        }
    }

    private static void b(double d1)
    {
        if (Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d1).append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        } else
        {
            return;
        }
    }

    public final bkq a(bkr bkr1, bmj bmj1)
    {
        boolean flag = false;
        if (!e.contains(bkr1))
        {
            flag = true;
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            Object obj = (bkr)iterator.next();
            if (!flag)
            {
                if (obj == bkr1)
                {
                    flag = true;
                }
            } else
            {
                obj = ((bkr) (obj)).create(this, bmj1);
                if (obj != null)
                {
                    return ((bkq) (obj));
                }
            }
        }

        throw new IllegalArgumentException((new StringBuilder("GSON cannot serialize ")).append(bmj1).toString());
    }

    public final bkq a(bmj bmj1)
    {
        Object obj = (bkq)d.get(bmj1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((bkq) (obj));
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
        obj2 = (bjx)((Map) (obj1)).get(bmj1);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new bjx();
        ((Map) (obj1)).put(bmj1, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_184;
            }
            obj2 = ((bkr)iterator.next()).create(this, bmj1);
        } while (obj2 == null);
        ((bjx) (obj)).a(((bkq) (obj2)));
        d.put(bmj1, obj2);
        ((Map) (obj1)).remove(bmj1);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((bkq) (obj2));
        throw new IllegalArgumentException((new StringBuilder("GSON cannot handle ")).append(bmj1).toString());
        Exception exception;
        exception;
        ((Map) (obj1)).remove(bmj1);
        if (flag)
        {
            c.remove();
        }
        throw exception;
    }

    public final bkq a(Class class1)
    {
        return a(bmj.get(class1));
    }

    public final Object a(bkd bkd, Class class1)
    {
        bkd = ((bkd) (a(bkd, ((Type) (class1)))));
        return blm.a(class1).cast(bkd);
    }

    public final Object a(bkd bkd, Type type)
    {
        if (bkd == null)
        {
            return null;
        } else
        {
            return a(((JsonReader) (new blw(bkd))), type);
        }
    }

    public final Object a(JsonReader jsonreader, Type type)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = jsonreader.isLenient();
        jsonreader.setLenient(true);
        jsonreader.peek();
        flag = false;
        type = ((Type) (a(bmj.get(type)).a(jsonreader)));
        jsonreader.setLenient(flag1);
        return type;
        type;
        if (flag)
        {
            jsonreader.setLenient(flag1);
            return null;
        }
        throw new bkm(type);
        type;
        jsonreader.setLenient(flag1);
        throw type;
        type;
        throw new bkm(type);
        type;
        throw new bkm(type);
    }

    public final Object a(Reader reader, Type type)
    {
        reader = new JsonReader(reader);
        type = ((Type) (a(((JsonReader) (reader)), type)));
        a(type, ((JsonReader) (reader)));
        return type;
    }

    public final Object a(String s, Class class1)
    {
        s = ((String) (a(s, ((Type) (class1)))));
        return blm.a(class1).cast(s);
    }

    public final Object a(String s, Type type)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a(((Reader) (new StringReader(s))), type);
        }
    }

    public final String a(Object obj)
    {
        if (obj == null)
        {
            return a(((bkd) (bkf.a)));
        } else
        {
            return a(obj, ((Type) (obj.getClass())));
        }
    }

    public final String a(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        a(obj, type, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public final String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }
}
