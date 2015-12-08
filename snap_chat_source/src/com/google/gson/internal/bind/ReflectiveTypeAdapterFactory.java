// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import fa;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//            JsonAdapterAnnotationTypeAdapterFactory

public final class ReflectiveTypeAdapterFactory
    implements TypeAdapterFactory
{
    public static final class Adapter extends TypeAdapter
    {

        private final ObjectConstructor a;
        private final Map b;

        public final Object read(JsonReader jsonreader)
        {
            Object obj;
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            obj = a.construct();
            jsonreader.beginObject();
_L1:
            Object obj1;
            if (!jsonreader.hasNext())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj1 = jsonreader.nextName();
            obj1 = (a)b.get(obj1);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            if (((a) (obj1)).c)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            jsonreader.skipValue();
              goto _L1
            try
            {
                ((a) (obj1)).a(jsonreader, obj);
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
                Iterator iterator = b.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    a a1 = (a)iterator.next();
                    if (a1.a(obj))
                    {
                        jsonwriter.name(a1.a);
                        a1.a(jsonwriter, obj);
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
            a = objectconstructor;
            b = map;
        }

        Adapter(ObjectConstructor objectconstructor, Map map, byte byte0)
        {
            this(objectconstructor, map);
        }
    }

    static abstract class a
    {

        final String a;
        final boolean b;
        final boolean c;

        abstract void a(JsonReader jsonreader, Object obj);

        abstract void a(JsonWriter jsonwriter, Object obj);

        abstract boolean a(Object obj);

        protected a(String s, boolean flag, boolean flag1)
        {
            a = s;
            b = flag;
            c = flag1;
        }
    }


    private final ConstructorConstructor a;
    private final FieldNamingStrategy b;
    private final Excluder c;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorconstructor, FieldNamingStrategy fieldnamingstrategy, Excluder excluder)
    {
        a = constructorconstructor;
        b = fieldnamingstrategy;
        c = excluder;
    }

    static TypeAdapter a(ReflectiveTypeAdapterFactory reflectivetypeadapterfactory, Gson gson, Field field, TypeToken typetoken)
    {
        field = (JsonAdapter)field.getAnnotation(com/google/gson/annotations/JsonAdapter);
        if (field != null)
        {
            reflectivetypeadapterfactory = JsonAdapterAnnotationTypeAdapterFactory.a(reflectivetypeadapterfactory.a, gson, typetoken, field);
            if (reflectivetypeadapterfactory != null)
            {
                return reflectivetypeadapterfactory;
            }
        }
        return gson.getAdapter(typetoken);
    }

    private List a(Field field)
    {
        FieldNamingStrategy fieldnamingstrategy = b;
        SerializedName serializedname = (SerializedName)field.getAnnotation(com/google/gson/annotations/SerializedName);
        LinkedList linkedlist = new LinkedList();
        if (serializedname == null)
        {
            linkedlist.add(fieldnamingstrategy.translateName(field));
        } else
        {
            linkedlist.add(serializedname.value());
            field = serializedname.alternate();
            int j = field.length;
            int i = 0;
            while (i < j) 
            {
                linkedlist.add(field[i]);
                i++;
            }
        }
        return linkedlist;
    }

    private Map a(Gson gson, TypeToken typetoken, Class class1)
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
                List list = a(field);
                typetoken = null;
                for (int j = 0; j < list.size(); j++)
                {
                    Object obj = (String)list.get(j);
                    if (j != 0)
                    {
                        flag = false;
                    }
                    TypeToken typetoken1 = TypeToken.get(type1);
                    obj = (a)linkedhashmap.put(obj, new a(((String) (obj)), flag, flag1, gson, field, typetoken1, Primitives.isPrimitive(typetoken1.getRawType())) {

                        private TypeAdapter d;
                        private Gson e;
                        private Field f;
                        private TypeToken g;
                        private boolean h;
                        private ReflectiveTypeAdapterFactory i;

                        final void a(JsonReader jsonreader, Object obj1)
                        {
                            jsonreader = ((JsonReader) (d.read(jsonreader)));
                            if (jsonreader != null || !h)
                            {
                                f.set(obj1, jsonreader);
                            }
                        }

                        final void a(JsonWriter jsonwriter, Object obj1)
                        {
                            obj1 = f.get(obj1);
                            (new fa(e, d, g.getType())).write(jsonwriter, obj1);
                        }

                        public final boolean a(Object obj1)
                        {
                            while (!b || f.get(obj1) == obj1) 
                            {
                                return false;
                            }
                            return true;
                        }

            
            {
                i = ReflectiveTypeAdapterFactory.this;
                e = gson;
                f = field;
                g = typetoken;
                h = flag2;
                super(s, flag, flag1);
                d = ReflectiveTypeAdapterFactory.a(i, e, f, g);
            }
                    });
                    if (typetoken == null)
                    {
                        typetoken = ((TypeToken) (obj));
                    }
                }

                if (typetoken != null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((a) (typetoken)).a).toString());
                }
            }

            class1 = TypeToken.get(com.google.gson.internal..Gson.Types.resolve(class1.getType(), class2, class2.getGenericSuperclass()));
        }

        return linkedhashmap;
    }

    public final TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Class class1 = typetoken.getRawType();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new Adapter(a.get(typetoken), a(gson, typetoken, class1), (byte)0);
        }
    }

    public final boolean excludeField(Field field, boolean flag)
    {
        Excluder excluder = c;
        return !excluder.excludeClass(field.getType(), flag) && !excluder.excludeField(field, flag);
    }
}
