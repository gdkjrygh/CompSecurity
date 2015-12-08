// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//            JsonAdapterAnnotationTypeAdapterFactory

public final class ReflectiveTypeAdapterFactory
    implements TypeAdapterFactory
{

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
        return new _cls1(field, typetoken, Primitives.isPrimitive(typetoken.getRawType()));
    }

    static boolean excludeField(Field field, boolean flag, Excluder excluder1)
    {
        return !excluder1.excludeClass(field.getType(), flag) && !excluder1.excludeField(field, flag);
    }

    private Map getBoundFields(Gson gson, TypeToken typetoken, Class class1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        java.lang.reflect.Type type = typetoken.getType();
        Class class2 = class1;
        class1 = typetoken;
        for (; class2 != java/lang/Object; class2 = class1.getRawType())
        {
            Field afield[] = class2.getDeclaredFields();
            int k = afield.length;
            for (int i = 0; i < k; i++)
            {
                Field field = afield[i];
                boolean flag = excludeField(field, true);
                boolean flag1 = excludeField(field, false);
                if (!flag && !flag1)
                {
                    continue;
                }
                field.setAccessible(true);
                java.lang.reflect.Type type1 = com.google.gson.internal..Gson.Types.resolve(class1.getType(), class2, field.getGenericType());
                List list = getFieldNames(field);
                typetoken = null;
                for (int j = 0; j < list.size(); j++)
                {
                    Object obj = (String)list.get(j);
                    if (j != 0)
                    {
                        flag = false;
                    }
                    obj = (BoundField)linkedhashmap.put(obj, createBoundField(gson, field, ((String) (obj)), TypeToken.get(type1), flag, flag1));
                    if (typetoken == null)
                    {
                        typetoken = ((TypeToken) (obj));
                    }
                }

                if (typetoken != null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((BoundField) (typetoken)).name).toString());
                }
            }

            class1 = TypeToken.get(com.google.gson.internal..Gson.Types.resolve(class1.getType(), class2, class2.getGenericSuperclass()));
        }

        return linkedhashmap;
    }

    private TypeAdapter getFieldAdapter(Gson gson, Field field, TypeToken typetoken)
    {
        field = (JsonAdapter)field.getAnnotation(com/google/gson/annotations/JsonAdapter);
        if (field != null)
        {
            field = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(constructorConstructor, gson, typetoken, field);
            if (field != null)
            {
                return field;
            }
        }
        return gson.getAdapter(typetoken);
    }

    static List getFieldName(FieldNamingStrategy fieldnamingstrategy, Field field)
    {
        SerializedName serializedname = (SerializedName)field.getAnnotation(com/google/gson/annotations/SerializedName);
        LinkedList linkedlist = new LinkedList();
        if (serializedname == null)
        {
            linkedlist.add(fieldnamingstrategy.translateName(field));
        } else
        {
            linkedlist.add(serializedname.value());
            fieldnamingstrategy = serializedname.alternate();
            int j = fieldnamingstrategy.length;
            int i = 0;
            while (i < j) 
            {
                linkedlist.add(fieldnamingstrategy[i]);
                i++;
            }
        }
        return linkedlist;
    }

    private List getFieldNames(Field field)
    {
        return getFieldName(fieldNamingPolicy, field);
    }

    public final TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Class class1 = typetoken.getRawType();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new Adapter(constructorConstructor.get(typetoken), getBoundFields(gson, typetoken, class1), null);
        }
    }

    public final boolean excludeField(Field field, boolean flag)
    {
        return excludeField(field, flag, excluder);
    }


    private class _cls1 extends BoundField
    {
        private class BoundField
        {

            final boolean deserialized;
            final String name;
            final boolean serialized;

            abstract void read(JsonReader jsonreader, Object obj);

            abstract void write(JsonWriter jsonwriter, Object obj);

            abstract boolean writeField(Object obj);

            protected BoundField(String s, boolean flag, boolean flag1)
            {
                name = s;
                serialized = flag;
                deserialized = flag1;
            }
        }


        final ReflectiveTypeAdapterFactory this$0;
        final TypeAdapter typeAdapter;
        final Gson val$context;
        final Field val$field;
        final TypeToken val$fieldType;
        final boolean val$isPrimitive;

        void read(JsonReader jsonreader, Object obj)
        {
            jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
            if (jsonreader != null || !isPrimitive)
            {
                field.set(obj, jsonreader);
            }
        }

        void write(JsonWriter jsonwriter, Object obj)
        {
            obj = field.get(obj);
            (new TypeAdapterRuntimeTypeWrapper(context, typeAdapter, fieldType.getType())).write(jsonwriter, obj);
        }

        public boolean writeField(Object obj)
        {
            while (!serialized || field.get(obj) == obj) 
            {
                return false;
            }
            return true;
        }

        _cls1(Field field1, TypeToken typetoken, 
                boolean flag2)
        {
            this$0 = ReflectiveTypeAdapterFactory.this;
            context = gson;
            field = field1;
            fieldType = typetoken;
            isPrimitive = flag2;
            super(final_s, final_flag, final_flag1);
            typeAdapter = getFieldAdapter(context, field, fieldType);
        }
    }


    private class Adapter extends TypeAdapter
    {

        private final Map boundFields;
        private final ObjectConstructor constructor;

        public final Object read(JsonReader jsonreader)
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
                    if (boundfield.writeField(obj))
                    {
                        jsonwriter.name(boundfield.name);
                        boundfield.write(jsonwriter, obj);
                    }
                } while (true);
            }
            // Misplaced declaration of an exception variable
            catch (JsonWriter jsonwriter)
            {
                throw new AssertionError(jsonwriter);
            }
            jsonwriter.endObject();
        }

        private Adapter(ObjectConstructor objectconstructor, Map map)
        {
            constructor = objectconstructor;
            boundFields = map;
        }

        Adapter(ObjectConstructor objectconstructor, Map map, _cls1 _pcls1)
        {
            this(objectconstructor, map);
        }
    }

}
