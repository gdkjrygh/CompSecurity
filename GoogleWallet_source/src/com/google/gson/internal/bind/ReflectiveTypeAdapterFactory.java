// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapterRuntimeTypeWrapper

public final class ReflectiveTypeAdapterFactory
    implements TypeAdapterFactory
{
    public static final class Adapter extends TypeAdapter
    {

        private final Map boundFields;
        private final ObjectConstructor constructor;

        public final Object read(JsonReader jsonreader)
            throws IOException
        {
            Object obj;
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            obj = constructor.construct();
            jsonreader.beginObject();
_L1:
            Object obj1;
            if (!jsonreader.hasNext())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj1 = jsonreader.nextName();
            obj1 = (BoundField)boundFields.get(obj1);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            if (((BoundField) (obj1)).deserialized)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            jsonreader.skipValue();
              goto _L1
            try
            {
                ((BoundField) (obj1)).read(jsonreader, obj);
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

        public final void write(JsonWriter jsonwriter, Object obj)
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
                Iterator iterator = boundFields.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    BoundField boundfield = (BoundField)iterator.next();
                    if (boundfield.serialized)
                    {
                        jsonwriter.name(boundfield.name);
                        boundfield.write(jsonwriter, obj);
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

        private Adapter(ObjectConstructor objectconstructor, Map map)
        {
            constructor = objectconstructor;
            boundFields = map;
        }

    }

    static abstract class BoundField
    {

        final boolean deserialized;
        final String name;
        final boolean serialized;

        abstract void read(JsonReader jsonreader, Object obj)
            throws IOException, IllegalAccessException;

        abstract void write(JsonWriter jsonwriter, Object obj)
            throws IOException, IllegalAccessException;

        protected BoundField(String s, boolean flag, boolean flag1)
        {
            name = s;
            serialized = flag;
            deserialized = flag1;
        }
    }


    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorconstructor, FieldNamingStrategy fieldnamingstrategy, Excluder excluder1)
    {
        constructorConstructor = constructorconstructor;
        fieldNamingPolicy = fieldnamingstrategy;
        excluder = excluder1;
    }

    private BoundField createBoundField(final Gson context, Field field, final String final_s, TypeToken typetoken, final boolean final_flag, final boolean final_flag1)
    {
        return new BoundField(typetoken, field, Primitives.isPrimitive(typetoken.getRawType())) {

            final ReflectiveTypeAdapterFactory this$0;
            final TypeAdapter typeAdapter;
            final Gson val$context;
            final Field val$field;
            final TypeToken val$fieldType;
            final boolean val$isPrimitive;

            final void read(JsonReader jsonreader, Object obj)
                throws IOException, IllegalAccessException
            {
                jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
                if (jsonreader != null || !isPrimitive)
                {
                    field.set(obj, jsonreader);
                }
            }

            final void write(JsonWriter jsonwriter, Object obj)
                throws IOException, IllegalAccessException
            {
                obj = field.get(obj);
                (new TypeAdapterRuntimeTypeWrapper(context, typeAdapter, fieldType.getType())).write(jsonwriter, obj);
            }

            
            {
                this$0 = ReflectiveTypeAdapterFactory.this;
                context = gson;
                fieldType = typetoken;
                field = field1;
                isPrimitive = flag2;
                super(final_s, final_flag, final_flag1);
                typeAdapter = context.getAdapter(fieldType);
            }
        };
    }

    private boolean excludeField(Field field, boolean flag)
    {
        return !excluder.excludeClass(field.getType(), flag) && !excluder.excludeField(field, flag);
    }

    private Map getBoundFields(Gson gson, TypeToken typetoken, Class class1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (!class1.isInterface())
        {
            java.lang.reflect.Type type = typetoken.getType();
            while (class1 != java/lang/Object) 
            {
                Field afield[] = class1.getDeclaredFields();
                int j = afield.length;
                for (int i = 0; i < j; i++)
                {
                    Object obj = afield[i];
                    boolean flag = excludeField(((Field) (obj)), true);
                    boolean flag1 = excludeField(((Field) (obj)), false);
                    if (!flag && !flag1)
                    {
                        continue;
                    }
                    ((Field) (obj)).setAccessible(true);
                    java.lang.reflect.Type type1 = com.google.gson.internal..Gson.Types.resolve(typetoken.getType(), class1, ((Field) (obj)).getGenericType());
                    obj = createBoundField(gson, ((Field) (obj)), getFieldName(((Field) (obj))), TypeToken.get(type1), flag, flag1);
                    obj = (BoundField)linkedhashmap.put(((BoundField) (obj)).name, obj);
                    if (obj != null)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((BoundField) (obj)).name).toString());
                    }
                }

                typetoken = TypeToken.get(com.google.gson.internal..Gson.Types.resolve(typetoken.getType(), class1, class1.getGenericSuperclass()));
                class1 = typetoken.getRawType();
            }
        }
        return linkedhashmap;
    }

    private String getFieldName(Field field)
    {
        SerializedName serializedname = (SerializedName)field.getAnnotation(com/google/gson/annotations/SerializedName);
        if (serializedname == null)
        {
            return fieldNamingPolicy.translateName(field);
        } else
        {
            return serializedname.value();
        }
    }

    public final TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Class class1 = typetoken.getRawType();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new Adapter(constructorConstructor.get(typetoken), getBoundFields(gson, typetoken, class1));
        }
    }
}
