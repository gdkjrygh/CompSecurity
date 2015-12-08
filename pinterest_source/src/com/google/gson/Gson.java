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
import com.google.gson.internal.bind.JsonTreeWriter;
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
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

// Referenced classes of package com.google.gson:
//            FieldNamingPolicy, LongSerializationPolicy, JsonIOException, JsonSyntaxException, 
//            TypeAdapter, TypeAdapterFactory, JsonNull, JsonDeserializationContext, 
//            JsonSerializationContext, FieldNamingStrategy, JsonElement

public final class Gson
{

    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private final ThreadLocal calls;
    private final ConstructorConstructor constructorConstructor;
    final JsonDeserializationContext deserializationContext;
    private final List factories;
    private final boolean generateNonExecutableJson;
    private final boolean htmlSafe;
    private final boolean prettyPrinting;
    final JsonSerializationContext serializationContext;
    private final boolean serializeNulls;
    private final Map typeTokenCache;

    public Gson()
    {
        this(Excluder.DEFAULT, ((FieldNamingStrategy) (FieldNamingPolicy.IDENTITY)), Collections.emptyMap(), false, false, false, true, false, false, LongSerializationPolicy.DEFAULT, Collections.emptyList());
    }

    Gson(Excluder excluder, FieldNamingStrategy fieldnamingstrategy, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, LongSerializationPolicy longserializationpolicy, List list)
    {
        calls = new ThreadLocal();
        typeTokenCache = Collections.synchronizedMap(new HashMap());
        deserializationContext = new _cls1();
        serializationContext = new _cls2();
        constructorConstructor = new ConstructorConstructor(map);
        serializeNulls = flag;
        generateNonExecutableJson = flag2;
        htmlSafe = flag3;
        prettyPrinting = flag4;
        map = new ArrayList();
        map.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        map.add(ObjectTypeAdapter.FACTORY);
        map.add(excluder);
        map.addAll(list);
        map.add(TypeAdapters.STRING_FACTORY);
        map.add(TypeAdapters.INTEGER_FACTORY);
        map.add(TypeAdapters.BOOLEAN_FACTORY);
        map.add(TypeAdapters.BYTE_FACTORY);
        map.add(TypeAdapters.SHORT_FACTORY);
        longserializationpolicy = longAdapter(longserializationpolicy);
        map.add(TypeAdapters.newFactory(Long.TYPE, java/lang/Long, longserializationpolicy));
        map.add(TypeAdapters.newFactory(Double.TYPE, java/lang/Double, doubleAdapter(flag5)));
        map.add(TypeAdapters.newFactory(Float.TYPE, java/lang/Float, floatAdapter(flag5)));
        map.add(TypeAdapters.NUMBER_FACTORY);
        map.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        map.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        map.add(TypeAdapters.newFactory(java/util/concurrent/atomic/AtomicLong, atomicLongAdapter(longserializationpolicy)));
        map.add(TypeAdapters.newFactory(java/util/concurrent/atomic/AtomicLongArray, atomicLongArrayAdapter(longserializationpolicy)));
        map.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        map.add(TypeAdapters.CHARACTER_FACTORY);
        map.add(TypeAdapters.STRING_BUILDER_FACTORY);
        map.add(TypeAdapters.STRING_BUFFER_FACTORY);
        map.add(TypeAdapters.newFactory(java/math/BigDecimal, TypeAdapters.BIG_DECIMAL));
        map.add(TypeAdapters.newFactory(java/math/BigInteger, TypeAdapters.BIG_INTEGER));
        map.add(TypeAdapters.URL_FACTORY);
        map.add(TypeAdapters.URI_FACTORY);
        map.add(TypeAdapters.UUID_FACTORY);
        map.add(TypeAdapters.CURRENCY_FACTORY);
        map.add(TypeAdapters.LOCALE_FACTORY);
        map.add(TypeAdapters.INET_ADDRESS_FACTORY);
        map.add(TypeAdapters.BIT_SET_FACTORY);
        map.add(DateTypeAdapter.FACTORY);
        map.add(TypeAdapters.CALENDAR_FACTORY);
        map.add(TimeTypeAdapter.FACTORY);
        map.add(SqlDateTypeAdapter.FACTORY);
        map.add(TypeAdapters.TIMESTAMP_FACTORY);
        map.add(ArrayTypeAdapter.FACTORY);
        map.add(TypeAdapters.CLASS_FACTORY);
        map.add(new CollectionTypeAdapterFactory(constructorConstructor));
        map.add(new MapTypeAdapterFactory(constructorConstructor, flag1));
        map.add(new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor));
        map.add(TypeAdapters.ENUM_FACTORY);
        map.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldnamingstrategy, excluder));
        factories = Collections.unmodifiableList(map);
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonreader)
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

    private static TypeAdapter atomicLongAdapter(final TypeAdapter longAdapter)
    {
        return (new _cls6()).nullSafe();
    }

    private static TypeAdapter atomicLongArrayAdapter(final TypeAdapter longAdapter)
    {
        return (new _cls7()).nullSafe();
    }

    private void checkValidFloatingPoint(double d)
    {
        if (Double.isNaN(d) || Double.isInfinite(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d).append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        } else
        {
            return;
        }
    }

    private TypeAdapter doubleAdapter(boolean flag)
    {
        if (flag)
        {
            return TypeAdapters.DOUBLE;
        } else
        {
            return new _cls3();
        }
    }

    private TypeAdapter floatAdapter(boolean flag)
    {
        if (flag)
        {
            return TypeAdapters.FLOAT;
        } else
        {
            return new _cls4();
        }
    }

    private static TypeAdapter longAdapter(LongSerializationPolicy longserializationpolicy)
    {
        if (longserializationpolicy == LongSerializationPolicy.DEFAULT)
        {
            return TypeAdapters.LONG;
        } else
        {
            return new _cls5();
        }
    }

    public final Object fromJson(JsonElement jsonelement, Class class1)
    {
        jsonelement = ((JsonElement) (fromJson(jsonelement, ((Type) (class1)))));
        return Primitives.wrap(class1).cast(jsonelement);
    }

    public final Object fromJson(JsonElement jsonelement, Type type)
    {
        if (jsonelement == null)
        {
            return null;
        } else
        {
            return fromJson(((JsonReader) (new JsonTreeReader(jsonelement))), type);
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
        assertFullConsumption(obj, reader);
        return Primitives.wrap(class1).cast(obj);
    }

    public final Object fromJson(Reader reader, Type type)
    {
        reader = new JsonReader(reader);
        type = ((Type) (fromJson(((JsonReader) (reader)), type)));
        assertFullConsumption(type, reader);
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
        Object obj = (TypeAdapter)typeTokenCache.get(typetoken);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((TypeAdapter) (obj));
_L2:
        Object obj1;
        Object obj2;
        boolean flag;
        obj1 = (Map)calls.get();
        flag = false;
        if (obj1 == null)
        {
            obj1 = new HashMap();
            calls.set(obj1);
            flag = true;
        }
        obj2 = (FutureTypeAdapter)((Map) (obj1)).get(typetoken);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new FutureTypeAdapter();
        ((Map) (obj1)).put(typetoken, obj);
        iterator = factories.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_184;
            }
            obj2 = ((TypeAdapterFactory)iterator.next()).create(this, typetoken);
        } while (obj2 == null);
        ((FutureTypeAdapter) (obj)).setDelegate(((TypeAdapter) (obj2)));
        typeTokenCache.put(typetoken, obj2);
        ((Map) (obj1)).remove(typetoken);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        calls.remove();
        return ((TypeAdapter) (obj2));
        throw new IllegalArgumentException((new StringBuilder("GSON cannot handle ")).append(typetoken).toString());
        Exception exception;
        exception;
        ((Map) (obj1)).remove(typetoken);
        if (flag)
        {
            calls.remove();
        }
        throw exception;
    }

    public final TypeAdapter getAdapter(Class class1)
    {
        return getAdapter(TypeToken.get(class1));
    }

    public final TypeAdapter getDelegateAdapter(TypeAdapterFactory typeadapterfactory, TypeToken typetoken)
    {
        boolean flag = false;
        if (!factories.contains(typeadapterfactory))
        {
            flag = true;
        }
        for (Iterator iterator = factories.iterator(); iterator.hasNext();)
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
        if (generateNonExecutableJson)
        {
            writer.write(")]}'\n");
        }
        writer = new JsonWriter(writer);
        if (prettyPrinting)
        {
            writer.setIndent("  ");
        }
        writer.setSerializeNulls(serializeNulls);
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
        jsonwriter.setHtmlSafe(htmlSafe);
        flag2 = jsonwriter.getSerializeNulls();
        jsonwriter.setSerializeNulls(serializeNulls);
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

    public final void toJson(Object obj, Appendable appendable)
    {
        if (obj != null)
        {
            toJson(obj, ((Type) (obj.getClass())), appendable);
            return;
        } else
        {
            toJson(((JsonElement) (JsonNull.INSTANCE)), appendable);
            return;
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
        jsonwriter.setHtmlSafe(htmlSafe);
        flag2 = jsonwriter.getSerializeNulls();
        jsonwriter.setSerializeNulls(serializeNulls);
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

    public final JsonElement toJsonTree(Object obj)
    {
        if (obj == null)
        {
            return JsonNull.INSTANCE;
        } else
        {
            return toJsonTree(obj, ((Type) (obj.getClass())));
        }
    }

    public final JsonElement toJsonTree(Object obj, Type type)
    {
        JsonTreeWriter jsontreewriter = new JsonTreeWriter();
        toJson(obj, type, jsontreewriter);
        return jsontreewriter.get();
    }

    public final String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(serializeNulls).append("factories:").append(factories).append(",instanceCreators:").append(constructorConstructor).append("}").toString();
    }


    private class _cls1
        implements JsonDeserializationContext
    {

        final Gson this$0;

        public Object deserialize(JsonElement jsonelement, Type type)
        {
            return fromJson(jsonelement, type);
        }

        _cls1()
        {
            this$0 = Gson.this;
            super();
        }
    }


    private class _cls2
        implements JsonSerializationContext
    {

        final Gson this$0;

        public JsonElement serialize(Object obj)
        {
            return toJsonTree(obj);
        }

        public JsonElement serialize(Object obj, Type type)
        {
            return toJsonTree(obj, type);
        }

        _cls2()
        {
            this$0 = Gson.this;
            super();
        }
    }


    private class _cls6 extends TypeAdapter
    {

        final TypeAdapter val$longAdapter;

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final AtomicLong read(JsonReader jsonreader)
        {
            return new AtomicLong(((Number)longAdapter.read(jsonreader)).longValue());
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (AtomicLong)obj);
        }

        public final void write(JsonWriter jsonwriter, AtomicLong atomiclong)
        {
            longAdapter.write(jsonwriter, Long.valueOf(atomiclong.get()));
        }

        _cls6()
        {
            longAdapter = typeadapter;
            super();
        }
    }


    private class _cls7 extends TypeAdapter
    {

        final TypeAdapter val$longAdapter;

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final AtomicLongArray read(JsonReader jsonreader)
        {
            ArrayList arraylist = new ArrayList();
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); arraylist.add(Long.valueOf(((Number)longAdapter.read(jsonreader)).longValue()))) { }
            jsonreader.endArray();
            int j = arraylist.size();
            jsonreader = new AtomicLongArray(j);
            for (int i = 0; i < j; i++)
            {
                jsonreader.set(i, ((Long)arraylist.get(i)).longValue());
            }

            return jsonreader;
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (AtomicLongArray)obj);
        }

        public final void write(JsonWriter jsonwriter, AtomicLongArray atomiclongarray)
        {
            jsonwriter.beginArray();
            int i = 0;
            for (int j = atomiclongarray.length(); i < j; i++)
            {
                longAdapter.write(jsonwriter, Long.valueOf(atomiclongarray.get(i)));
            }

            jsonwriter.endArray();
        }

        _cls7()
        {
            longAdapter = typeadapter;
            super();
        }
    }


    private class _cls3 extends TypeAdapter
    {

        final Gson this$0;

        public Double read(JsonReader jsonreader)
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

        public volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Number number)
        {
            if (number == null)
            {
                jsonwriter.nullValue();
                return;
            } else
            {
                double d = number.doubleValue();
                checkValidFloatingPoint(d);
                jsonwriter.value(number);
                return;
            }
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls3()
        {
            this$0 = Gson.this;
            super();
        }
    }


    private class _cls4 extends TypeAdapter
    {

        final Gson this$0;

        public Float read(JsonReader jsonreader)
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

        public volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Number number)
        {
            if (number == null)
            {
                jsonwriter.nullValue();
                return;
            } else
            {
                float f = number.floatValue();
                checkValidFloatingPoint(f);
                jsonwriter.value(number);
                return;
            }
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls4()
        {
            this$0 = Gson.this;
            super();
        }
    }


    private class _cls5 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls5()
        {
        }
    }


    private class FutureTypeAdapter extends TypeAdapter
    {

        private TypeAdapter _flddelegate;

        public Object read(JsonReader jsonreader)
        {
            if (_flddelegate == null)
            {
                throw new IllegalStateException();
            } else
            {
                return _flddelegate.read(jsonreader);
            }
        }

        public void setDelegate(TypeAdapter typeadapter)
        {
            if (_flddelegate != null)
            {
                throw new AssertionError();
            } else
            {
                _flddelegate = typeadapter;
                return;
            }
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            if (_flddelegate == null)
            {
                throw new IllegalStateException();
            } else
            {
                _flddelegate.write(jsonwriter, obj);
                return;
            }
        }

        FutureTypeAdapter()
        {
        }
    }

}
