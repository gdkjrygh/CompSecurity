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
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//            JsonAdapterAnnotationTypeAdapterFactory, TypeAdapterRuntimeTypeWrapper

public final class ReflectiveTypeAdapterFactory
    implements TypeAdapterFactory
{

    private final ConstructorConstructor a;
    private final FieldNamingStrategy b;
    private final Excluder c;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorconstructor, FieldNamingStrategy fieldnamingstrategy, Excluder excluder)
    {
        a = constructorconstructor;
        b = fieldnamingstrategy;
        c = excluder;
    }

    private TypeAdapter a(Gson gson, Field field, TypeToken typetoken)
    {
        field = (JsonAdapter)field.getAnnotation(com/google/gson/annotations/JsonAdapter);
        if (field != null)
        {
            field = JsonAdapterAnnotationTypeAdapterFactory.a(a, gson, typetoken, field);
            if (field != null)
            {
                return field;
            }
        }
        return gson.a(typetoken);
    }

    static TypeAdapter a(ReflectiveTypeAdapterFactory reflectivetypeadapterfactory, Gson gson, Field field, TypeToken typetoken)
    {
        return reflectivetypeadapterfactory.a(gson, field, typetoken);
    }

    private BoundField a(Gson gson, Field field, String s, TypeToken typetoken, boolean flag, boolean flag1)
    {
        return new BoundField(s, flag, flag1, gson, field, typetoken, Primitives.a(typetoken.getRawType())) {
            private class BoundField
            {

                final String g;
                final boolean h;
                final boolean i;

                abstract void a(JsonReader jsonreader, Object obj);

                abstract void a(JsonWriter jsonwriter, Object obj);

                abstract boolean a(Object obj);

                protected BoundField(String s, boolean flag, boolean flag1)
                {
                    g = s;
                    h = flag;
                    i = flag1;
                }
            }


            final TypeAdapter a;
            final Gson b;
            final Field c;
            final TypeToken d;
            final boolean e;
            final ReflectiveTypeAdapterFactory f;

            void a(JsonReader jsonreader, Object obj)
            {
                jsonreader = ((JsonReader) (a.read(jsonreader)));
                if (jsonreader != null || !e)
                {
                    c.set(obj, jsonreader);
                }
            }

            void a(JsonWriter jsonwriter, Object obj)
            {
                obj = c.get(obj);
                (new TypeAdapterRuntimeTypeWrapper(b, a, d.getType())).write(jsonwriter, obj);
            }

            public boolean a(Object obj)
            {
                while (!h || c.get(obj) == obj) 
                {
                    return false;
                }
                return true;
            }

            
            {
                f = ReflectiveTypeAdapterFactory.this;
                b = gson;
                c = field;
                d = typetoken;
                e = flag2;
                super(s, flag, flag1);
                a = ReflectiveTypeAdapterFactory.a(f, b, c, d);
            }
        };
    }

    static String a(FieldNamingStrategy fieldnamingstrategy, Field field)
    {
        SerializedName serializedname = (SerializedName)field.getAnnotation(com/google/gson/annotations/SerializedName);
        if (serializedname == null)
        {
            return fieldnamingstrategy.a(field);
        } else
        {
            return serializedname.a();
        }
    }

    private String a(Field field)
    {
        return a(b, field);
    }

    private Map a(Gson gson, TypeToken typetoken, Class class1)
    {
        LinkedHashMap linkedhashmap;
        java.lang.reflect.Type type;
        linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        type = typetoken.getType();
_L6:
        Field afield[];
        int i;
        int j;
        if (class1 == java/lang/Object)
        {
            break; /* Loop/switch isn't completed */
        }
        afield = class1.getDeclaredFields();
        j = afield.length;
        i = 0;
_L2:
        Object obj;
        boolean flag;
        boolean flag1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj = afield[i];
        flag = a(((Field) (obj)), true);
        flag1 = a(((Field) (obj)), false);
        if (flag || flag1)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Field) (obj)).setAccessible(true);
        java.lang.reflect.Type type1 = com.google.gson.internal..Gson.Types.a(typetoken.getType(), class1, ((Field) (obj)).getGenericType());
        obj = a(gson, ((Field) (obj)), a(((Field) (obj))), TypeToken.get(type1), flag, flag1);
        obj = (BoundField)linkedhashmap.put(((BoundField) (obj)).g, obj);
        if (obj == null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((BoundField) (obj)).g).toString());
        typetoken = TypeToken.get(com.google.gson.internal..Gson.Types.a(typetoken.getType(), class1, class1.getGenericSuperclass()));
        class1 = typetoken.getRawType();
        if (true) goto _L6; else goto _L5
_L5:
        return linkedhashmap;
    }

    static boolean a(Field field, boolean flag, Excluder excluder)
    {
        return !excluder.a(field.getType(), flag) && !excluder.a(field, flag);
    }

    public boolean a(Field field, boolean flag)
    {
        return a(field, flag, c);
    }

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Class class1 = typetoken.getRawType();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new Adapter(a.a(typetoken), a(gson, typetoken, class1));
        }
    }

    private class Adapter extends TypeAdapter
    {

        private final ObjectConstructor a;
        private final Map b;

        public Object read(JsonReader jsonreader)
        {
            Object obj;
            if (jsonreader.f() == JsonToken.i)
            {
                jsonreader.j();
                return null;
            }
            obj = a.a();
            jsonreader.c();
_L1:
            Object obj1;
            if (!jsonreader.e())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj1 = jsonreader.g();
            obj1 = (BoundField)b.get(obj1);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            if (((BoundField) (obj1)).i)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            jsonreader.n();
              goto _L1
            try
            {
                ((BoundField) (obj1)).a(jsonreader, obj);
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
            jsonreader.d();
            return obj;
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            if (obj == null)
            {
                jsonwriter.f();
                return;
            }
            jsonwriter.d();
            try
            {
                Iterator iterator = b.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    BoundField boundfield = (BoundField)iterator.next();
                    if (boundfield.a(obj))
                    {
                        jsonwriter.a(boundfield.g);
                        boundfield.a(jsonwriter, obj);
                    }
                } while (true);
            }
            // Misplaced declaration of an exception variable
            catch (JsonWriter jsonwriter)
            {
                throw new AssertionError();
            }
            jsonwriter.e();
        }

        private Adapter(ObjectConstructor objectconstructor, Map map)
        {
            a = objectconstructor;
            b = map;
        }

    }

}
