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
//            TypeAdapter, TypeAdapterFactory, JsonNull, JsonDeserializationContext, 
//            JsonSerializationContext, FieldNamingStrategy, JsonElement

public final class Gson
{
    static final class a extends TypeAdapter
    {

        TypeAdapter a;

        public final Object read(JsonReader jsonreader)
        {
            if (a == null)
            {
                throw new IllegalStateException();
            } else
            {
                return a.read(jsonreader);
            }
        }

        public final void write(JsonWriter jsonwriter, Object obj)
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

        a()
        {
        }
    }


    public final JsonDeserializationContext a;
    public final JsonSerializationContext b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final ConstructorConstructor f;
    private final boolean g;

    public Gson()
    {
        this(Excluder.DEFAULT, ((FieldNamingStrategy) (FieldNamingPolicy.IDENTITY)), Collections.emptyMap(), false, true, LongSerializationPolicy.DEFAULT, Collections.emptyList());
    }

    Gson(Excluder excluder, FieldNamingStrategy fieldnamingstrategy, Map map, boolean flag, boolean flag1, LongSerializationPolicy longserializationpolicy, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new JsonDeserializationContext() {

        };
        b = new JsonSerializationContext() {

        };
        f = new ConstructorConstructor(map);
        g = flag1;
        ArrayList arraylist = new ArrayList();
        arraylist.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arraylist.add(ObjectTypeAdapter.FACTORY);
        arraylist.add(excluder);
        arraylist.addAll(list);
        arraylist.add(TypeAdapters.STRING_FACTORY);
        arraylist.add(TypeAdapters.INTEGER_FACTORY);
        arraylist.add(TypeAdapters.BOOLEAN_FACTORY);
        arraylist.add(TypeAdapters.BYTE_FACTORY);
        arraylist.add(TypeAdapters.SHORT_FACTORY);
        list = Long.TYPE;
        if (longserializationpolicy == LongSerializationPolicy.DEFAULT)
        {
            map = TypeAdapters.LONG;
        } else
        {
            map = new TypeAdapter() {

                public final Object read(JsonReader jsonreader)
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

                public final void write(JsonWriter jsonwriter, Object obj)
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

            };
        }
        arraylist.add(TypeAdapters.newFactory(list, java/lang/Long, map));
        arraylist.add(TypeAdapters.newFactory(Double.TYPE, java/lang/Double, new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
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

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (Number)obj;
                if (obj == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    Gson.a(((Number) (obj)).doubleValue());
                    jsonwriter.value(((Number) (obj)));
                    return;
                }
            }

        }));
        arraylist.add(TypeAdapters.newFactory(Float.TYPE, java/lang/Float, new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
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

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (Number)obj;
                if (obj == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    Gson.a(((Number) (obj)).floatValue());
                    jsonwriter.value(((Number) (obj)));
                    return;
                }
            }

        }));
        arraylist.add(TypeAdapters.NUMBER_FACTORY);
        arraylist.add(TypeAdapters.CHARACTER_FACTORY);
        arraylist.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arraylist.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arraylist.add(TypeAdapters.newFactory(java/math/BigDecimal, TypeAdapters.BIG_DECIMAL));
        arraylist.add(TypeAdapters.newFactory(java/math/BigInteger, TypeAdapters.BIG_INTEGER));
        arraylist.add(TypeAdapters.URL_FACTORY);
        arraylist.add(TypeAdapters.URI_FACTORY);
        arraylist.add(TypeAdapters.UUID_FACTORY);
        arraylist.add(TypeAdapters.LOCALE_FACTORY);
        arraylist.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arraylist.add(TypeAdapters.BIT_SET_FACTORY);
        arraylist.add(DateTypeAdapter.FACTORY);
        arraylist.add(TypeAdapters.CALENDAR_FACTORY);
        arraylist.add(TimeTypeAdapter.FACTORY);
        arraylist.add(SqlDateTypeAdapter.FACTORY);
        arraylist.add(TypeAdapters.TIMESTAMP_FACTORY);
        arraylist.add(ArrayTypeAdapter.FACTORY);
        arraylist.add(TypeAdapters.CLASS_FACTORY);
        arraylist.add(new CollectionTypeAdapterFactory(f));
        arraylist.add(new MapTypeAdapterFactory(f, flag));
        arraylist.add(new JsonAdapterAnnotationTypeAdapterFactory(f));
        arraylist.add(TypeAdapters.ENUM_FACTORY);
        arraylist.add(new ReflectiveTypeAdapterFactory(f, fieldnamingstrategy, excluder));
        e = Collections.unmodifiableList(arraylist);
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

    private static void a(Object obj, JsonReader jsonreader)
    {
        if (obj != null)
        {
            try
            {
                if (jsonreader.peek() != JsonToken.END_DOCUMENT)
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

    public final Object fromJson(JsonReader jsonreader, Type type)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = jsonreader.isLenient();
        jsonreader.setLenient(true);
        jsonreader.peek();
        flag = false;
        type = ((Type) (getAdapter(TypeToken.get(type)).read(jsonreader)));
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

    public final Object fromJson(Reader reader, Class class1)
    {
        reader = new JsonReader(reader);
        Object obj = fromJson(((JsonReader) (reader)), ((Type) (class1)));
        a(obj, reader);
        return Primitives.wrap(class1).cast(obj);
    }

    public final Object fromJson(Reader reader, Type type)
    {
        reader = new JsonReader(reader);
        type = ((Type) (fromJson(((JsonReader) (reader)), type)));
        a(type, reader);
        return type;
    }

    public final Object fromJson(String s, Class class1)
    {
        s = ((String) (fromJson(s, ((Type) (class1)))));
        return Primitives.wrap(class1).cast(s);
    }

    public final Object fromJson(String s, Type type)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return fromJson(((Reader) (new StringReader(s))), type);
        }
    }

    public final TypeAdapter getAdapter(TypeToken typetoken)
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
        obj2 = (a)((Map) (obj1)).get(typetoken);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new a();
        ((Map) (obj1)).put(typetoken, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_222;
            }
            obj2 = ((TypeAdapterFactory)iterator.next()).create(this, typetoken);
        } while (obj2 == null);
        if (((a) (obj)).a != null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_177;
        obj;
        ((Map) (obj1)).remove(typetoken);
        if (flag)
        {
            c.remove();
        }
        throw obj;
        obj.a = ((TypeAdapter) (obj2));
        d.put(typetoken, obj2);
        ((Map) (obj1)).remove(typetoken);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((TypeAdapter) (obj2));
        throw new IllegalArgumentException((new StringBuilder("GSON cannot handle ")).append(typetoken).toString());
    }

    public final TypeAdapter getAdapter(Class class1)
    {
        return getAdapter(TypeToken.get(class1));
    }

    public final TypeAdapter getDelegateAdapter(TypeAdapterFactory typeadapterfactory, TypeToken typetoken)
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

        throw new IllegalArgumentException((new StringBuilder("GSON cannot serialize ")).append(typetoken).toString());
    }

    public final JsonWriter newJsonWriter(Writer writer)
    {
        writer = new JsonWriter(writer);
        writer.setSerializeNulls(false);
        return writer;
    }

    public final String toJson(JsonElement jsonelement)
    {
        StringWriter stringwriter = new StringWriter();
        toJson(jsonelement, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public final String toJson(Object obj)
    {
        if (obj == null)
        {
            return toJson(((JsonElement) (JsonNull.INSTANCE)));
        } else
        {
            return toJson(obj, ((Type) (obj.getClass())));
        }
    }

    public final String toJson(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        toJson(obj, type, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public final void toJson(JsonElement jsonelement, JsonWriter jsonwriter)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = jsonwriter.isLenient();
        jsonwriter.setLenient(true);
        flag1 = jsonwriter.isHtmlSafe();
        jsonwriter.setHtmlSafe(g);
        flag2 = jsonwriter.getSerializeNulls();
        jsonwriter.setSerializeNulls(false);
        Streams.write(jsonelement, jsonwriter);
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        return;
        jsonelement;
        throw new JsonIOException(jsonelement);
        jsonelement;
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        throw jsonelement;
    }

    public final void toJson(JsonElement jsonelement, Appendable appendable)
    {
        try
        {
            toJson(jsonelement, newJsonWriter(Streams.writerForAppendable(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonElement jsonelement)
        {
            throw new RuntimeException(jsonelement);
        }
    }

    public final void toJson(Object obj, Type type, JsonWriter jsonwriter)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        type = getAdapter(TypeToken.get(type));
        flag = jsonwriter.isLenient();
        jsonwriter.setLenient(true);
        flag1 = jsonwriter.isHtmlSafe();
        jsonwriter.setHtmlSafe(g);
        flag2 = jsonwriter.getSerializeNulls();
        jsonwriter.setSerializeNulls(false);
        type.write(jsonwriter, obj);
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        return;
        obj;
        throw new JsonIOException(((Throwable) (obj)));
        obj;
        jsonwriter.setLenient(flag);
        jsonwriter.setHtmlSafe(flag1);
        jsonwriter.setSerializeNulls(flag2);
        throw obj;
    }

    public final void toJson(Object obj, Type type, Appendable appendable)
    {
        try
        {
            toJson(obj, type, newJsonWriter(Streams.writerForAppendable(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new JsonIOException(((Throwable) (obj)));
        }
    }

    public final String toString()
    {
        return (new StringBuilder("{serializeNulls:falsefactories:")).append(e).append(",instanceCreators:").append(f).append("}").toString();
    }
}
