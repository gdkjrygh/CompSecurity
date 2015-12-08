// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
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

// Referenced classes of package com.google.gson:
//            FieldNamingPolicy, LongSerializationPolicy, JsonIOException, JsonSyntaxException, 
//            TypeAdapterFactory, TypeAdapter, JsonNull, JsonDeserializationContext, 
//            JsonSerializationContext, FieldNamingStrategy, JsonElement

public final class Gson
{

    final JsonDeserializationContext a;
    final JsonSerializationContext b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final ConstructorConstructor f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public Gson()
    {
        this(Excluder.a, ((FieldNamingStrategy) (FieldNamingPolicy.a)), Collections.emptyMap(), false, false, false, true, false, false, LongSerializationPolicy.a, Collections.emptyList());
    }

    Gson(Excluder excluder, FieldNamingStrategy fieldnamingstrategy, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, LongSerializationPolicy longserializationpolicy, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new JsonDeserializationContext() {

            final Gson a;

            
            {
                a = Gson.this;
                super();
            }
        };
        b = new JsonSerializationContext() {

            final Gson a;

            
            {
                a = Gson.this;
                super();
            }
        };
        f = new ConstructorConstructor(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        map = new ArrayList();
        map.add(TypeAdapters.Q);
        map.add(ObjectTypeAdapter.a);
        map.add(excluder);
        map.addAll(list);
        map.add(TypeAdapters.x);
        map.add(TypeAdapters.m);
        map.add(TypeAdapters.g);
        map.add(TypeAdapters.i);
        map.add(TypeAdapters.k);
        map.add(TypeAdapters.a(Long.TYPE, java/lang/Long, a(longserializationpolicy)));
        map.add(TypeAdapters.a(Double.TYPE, java/lang/Double, a(flag5)));
        map.add(TypeAdapters.a(Float.TYPE, java/lang/Float, b(flag5)));
        map.add(TypeAdapters.r);
        map.add(TypeAdapters.t);
        map.add(TypeAdapters.z);
        map.add(TypeAdapters.B);
        map.add(TypeAdapters.a(java/math/BigDecimal, TypeAdapters.v));
        map.add(TypeAdapters.a(java/math/BigInteger, TypeAdapters.w));
        map.add(TypeAdapters.D);
        map.add(TypeAdapters.F);
        map.add(TypeAdapters.J);
        map.add(TypeAdapters.O);
        map.add(TypeAdapters.H);
        map.add(TypeAdapters.d);
        map.add(DateTypeAdapter.a);
        map.add(TypeAdapters.M);
        map.add(TimeTypeAdapter.a);
        map.add(SqlDateTypeAdapter.a);
        map.add(TypeAdapters.K);
        map.add(ArrayTypeAdapter.a);
        map.add(TypeAdapters.b);
        map.add(new CollectionTypeAdapterFactory(f));
        map.add(new MapTypeAdapterFactory(f, flag1));
        map.add(new JsonAdapterAnnotationTypeAdapterFactory(f));
        map.add(TypeAdapters.R);
        map.add(new ReflectiveTypeAdapterFactory(f, fieldnamingstrategy, excluder));
        e = Collections.unmodifiableList(map);
    }

    private TypeAdapter a(LongSerializationPolicy longserializationpolicy)
    {
        if (longserializationpolicy == LongSerializationPolicy.a)
        {
            return TypeAdapters.n;
        } else
        {
            return new TypeAdapter() {

                final Gson a;

                public Number a(JsonReader jsonreader)
                {
                    if (jsonreader.f() == JsonToken.i)
                    {
                        jsonreader.j();
                        return null;
                    } else
                    {
                        return Long.valueOf(jsonreader.l());
                    }
                }

                public void a(JsonWriter jsonwriter, Number number)
                {
                    if (number == null)
                    {
                        jsonwriter.f();
                        return;
                    } else
                    {
                        jsonwriter.b(number.toString());
                        return;
                    }
                }

                public Object read(JsonReader jsonreader)
                {
                    return a(jsonreader);
                }

                public void write(JsonWriter jsonwriter, Object obj)
                {
                    a(jsonwriter, (Number)obj);
                }

            
            {
                a = Gson.this;
                super();
            }
            };
        }
    }

    private TypeAdapter a(boolean flag)
    {
        if (flag)
        {
            return TypeAdapters.p;
        } else
        {
            return new TypeAdapter() {

                final Gson a;

                public Double a(JsonReader jsonreader)
                {
                    if (jsonreader.f() == JsonToken.i)
                    {
                        jsonreader.j();
                        return null;
                    } else
                    {
                        return Double.valueOf(jsonreader.k());
                    }
                }

                public void a(JsonWriter jsonwriter, Number number)
                {
                    if (number == null)
                    {
                        jsonwriter.f();
                        return;
                    } else
                    {
                        double d1 = number.doubleValue();
                        Gson.a(a, d1);
                        jsonwriter.a(number);
                        return;
                    }
                }

                public Object read(JsonReader jsonreader)
                {
                    return a(jsonreader);
                }

                public void write(JsonWriter jsonwriter, Object obj)
                {
                    a(jsonwriter, (Number)obj);
                }

            
            {
                a = Gson.this;
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
            writer.c("  ");
        }
        writer.d(g);
        return writer;
    }

    private void a(double d1)
    {
        if (Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d1).append(" is not a valid double value as per JSON specification. To override this").append(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        } else
        {
            return;
        }
    }

    static void a(Gson gson, double d1)
    {
        gson.a(d1);
    }

    private static void a(Object obj, JsonReader jsonreader)
    {
        if (obj != null)
        {
            try
            {
                if (jsonreader.f() != JsonToken.j)
                {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new JsonSyntaxException(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new JsonIOException(((Throwable) (obj)));
            }
        }
    }

    private TypeAdapter b(boolean flag)
    {
        if (flag)
        {
            return TypeAdapters.o;
        } else
        {
            return new TypeAdapter() {

                final Gson a;

                public Float a(JsonReader jsonreader)
                {
                    if (jsonreader.f() == JsonToken.i)
                    {
                        jsonreader.j();
                        return null;
                    } else
                    {
                        return Float.valueOf((float)jsonreader.k());
                    }
                }

                public void a(JsonWriter jsonwriter, Number number)
                {
                    if (number == null)
                    {
                        jsonwriter.f();
                        return;
                    } else
                    {
                        float f1 = number.floatValue();
                        Gson.a(a, f1);
                        jsonwriter.a(number);
                        return;
                    }
                }

                public Object read(JsonReader jsonreader)
                {
                    return a(jsonreader);
                }

                public void write(JsonWriter jsonwriter, Object obj)
                {
                    a(jsonwriter, (Number)obj);
                }

            
            {
                a = Gson.this;
                super();
            }
            };
        }
    }

    public TypeAdapter a(TypeAdapterFactory typeadapterfactory, TypeToken typetoken)
    {
        boolean flag = false;
        if (!e.contains(typeadapterfactory))
        {
            flag = true;
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            Object obj = (TypeAdapterFactory)iterator.next();
            if (!flag)
            {
                if (obj == typeadapterfactory)
                {
                    flag = true;
                }
            } else
            {
                obj = ((TypeAdapterFactory) (obj)).create(this, typetoken);
                if (obj != null)
                {
                    return ((TypeAdapter) (obj));
                }
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot serialize ").append(typetoken).toString());
    }

    public TypeAdapter a(TypeToken typetoken)
    {
        Object obj = (TypeAdapter)d.get(typetoken);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((TypeAdapter) (obj));
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
        obj2 = (FutureTypeAdapter)((Map) (obj1)).get(typetoken);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new FutureTypeAdapter();
        ((Map) (obj1)).put(typetoken, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_184;
            }
            obj2 = ((TypeAdapterFactory)iterator.next()).create(this, typetoken);
        } while (obj2 == null);
        ((FutureTypeAdapter) (obj)).a(((TypeAdapter) (obj2)));
        d.put(typetoken, obj2);
        ((Map) (obj1)).remove(typetoken);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((TypeAdapter) (obj2));
        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot handle ").append(typetoken).toString());
        Exception exception;
        exception;
        ((Map) (obj1)).remove(typetoken);
        if (flag)
        {
            c.remove();
        }
        throw exception;
    }

    public TypeAdapter a(Class class1)
    {
        return a(TypeToken.get(class1));
    }

    public Object a(JsonElement jsonelement, Class class1)
    {
        jsonelement = ((JsonElement) (a(jsonelement, ((Type) (class1)))));
        return Primitives.a(class1).cast(jsonelement);
    }

    public Object a(JsonElement jsonelement, Type type)
    {
        if (jsonelement == null)
        {
            return null;
        } else
        {
            return a(((JsonReader) (new JsonTreeReader(jsonelement))), type);
        }
    }

    public Object a(JsonReader jsonreader, Type type)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = jsonreader.p();
        jsonreader.a(true);
        jsonreader.f();
        flag = false;
        type = ((Type) (a(TypeToken.get(type)).read(jsonreader)));
        jsonreader.a(flag1);
        return type;
        type;
        if (flag)
        {
            jsonreader.a(flag1);
            return null;
        }
        throw new JsonSyntaxException(type);
        type;
        jsonreader.a(flag1);
        throw type;
        type;
        throw new JsonSyntaxException(type);
        type;
        throw new JsonSyntaxException(type);
    }

    public Object a(Reader reader, Type type)
    {
        reader = new JsonReader(reader);
        type = ((Type) (a(((JsonReader) (reader)), type)));
        a(type, ((JsonReader) (reader)));
        return type;
    }

    public Object a(String s, Class class1)
    {
        s = ((String) (a(s, ((Type) (class1)))));
        return Primitives.a(class1).cast(s);
    }

    public Object a(String s, Type type)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a(((Reader) (new StringReader(s))), type);
        }
    }

    public String a(JsonElement jsonelement)
    {
        StringWriter stringwriter = new StringWriter();
        a(jsonelement, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public String a(Object obj)
    {
        if (obj == null)
        {
            return a(((JsonElement) (JsonNull.a)));
        } else
        {
            return a(obj, ((Type) (obj.getClass())));
        }
    }

    public String a(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        a(obj, type, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public void a(JsonElement jsonelement, JsonWriter jsonwriter)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = jsonwriter.g();
        jsonwriter.b(true);
        flag1 = jsonwriter.h();
        jsonwriter.c(h);
        flag2 = jsonwriter.i();
        jsonwriter.d(g);
        Streams.a(jsonelement, jsonwriter);
        jsonwriter.b(flag);
        jsonwriter.c(flag1);
        jsonwriter.d(flag2);
        return;
        jsonelement;
        throw new JsonIOException(jsonelement);
        jsonelement;
        jsonwriter.b(flag);
        jsonwriter.c(flag1);
        jsonwriter.d(flag2);
        throw jsonelement;
    }

    public void a(JsonElement jsonelement, Appendable appendable)
    {
        try
        {
            a(jsonelement, a(Streams.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonElement jsonelement)
        {
            throw new RuntimeException(jsonelement);
        }
    }

    public void a(Object obj, Type type, JsonWriter jsonwriter)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        type = a(TypeToken.get(type));
        flag = jsonwriter.g();
        jsonwriter.b(true);
        flag1 = jsonwriter.h();
        jsonwriter.c(h);
        flag2 = jsonwriter.i();
        jsonwriter.d(g);
        type.write(jsonwriter, obj);
        jsonwriter.b(flag);
        jsonwriter.c(flag1);
        jsonwriter.d(flag2);
        return;
        obj;
        throw new JsonIOException(((Throwable) (obj)));
        obj;
        jsonwriter.b(flag);
        jsonwriter.c(flag1);
        jsonwriter.d(flag2);
        throw obj;
    }

    public void a(Object obj, Type type, Appendable appendable)
    {
        try
        {
            a(obj, type, a(Streams.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new JsonIOException(((Throwable) (obj)));
        }
    }

    public String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }

    private class FutureTypeAdapter extends TypeAdapter
    {

        private TypeAdapter a;

        public void a(TypeAdapter typeadapter)
        {
            if (a != null)
            {
                throw new AssertionError();
            } else
            {
                a = typeadapter;
                return;
            }
        }

        public Object read(JsonReader jsonreader)
        {
            if (a == null)
            {
                throw new IllegalStateException();
            } else
            {
                return a.read(jsonreader);
            }
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            if (a == null)
            {
                throw new IllegalStateException();
            } else
            {
                a.write(jsonwriter, obj);
                return;
            }
        }

        FutureTypeAdapter()
        {
        }
    }

}
