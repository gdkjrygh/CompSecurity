// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

public final class MapTypeAdapterFactory
    implements TypeAdapterFactory
{

    private final ConstructorConstructor a;
    private final boolean b;

    public MapTypeAdapterFactory(ConstructorConstructor constructorconstructor, boolean flag)
    {
        a = constructorconstructor;
        b = flag;
    }

    private TypeAdapter a(Gson gson, Type type)
    {
        if (type == Boolean.TYPE || type == java/lang/Boolean)
        {
            return TypeAdapters.f;
        } else
        {
            return gson.a(TypeToken.get(type));
        }
    }

    static boolean a(MapTypeAdapterFactory maptypeadapterfactory)
    {
        return maptypeadapterfactory.b;
    }

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Type type = typetoken.getType();
        if (!java/util/Map.isAssignableFrom(typetoken.getRawType()))
        {
            return null;
        } else
        {
            Type atype[] = com.google.gson.internal..Gson.Types.b(type, com.google.gson.internal..Gson.Types.e(type));
            TypeAdapter typeadapter = a(gson, atype[0]);
            TypeAdapter typeadapter1 = gson.a(TypeToken.get(atype[1]));
            typetoken = a.a(typetoken);
            return new Adapter(gson, atype[0], typeadapter, atype[1], typeadapter1, typetoken);
        }
    }

    private class Adapter extends TypeAdapter
    {

        final MapTypeAdapterFactory a;
        private final TypeAdapter b;
        private final TypeAdapter c;
        private final ObjectConstructor d;

        private String a(JsonElement jsonelement)
        {
            if (jsonelement.j())
            {
                jsonelement = jsonelement.n();
                if (jsonelement.p())
                {
                    return String.valueOf(jsonelement.b());
                }
                if (jsonelement.a())
                {
                    return Boolean.toString(jsonelement.g());
                }
                if (jsonelement.q())
                {
                    return jsonelement.c();
                } else
                {
                    throw new AssertionError();
                }
            }
            if (jsonelement.k())
            {
                return "null";
            } else
            {
                throw new AssertionError();
            }
        }

        public Map a(JsonReader jsonreader)
        {
            JsonToken jsontoken = jsonreader.f();
            if (jsontoken == JsonToken.i)
            {
                jsonreader.j();
                return null;
            }
            Map map = (Map)d.a();
            if (jsontoken == JsonToken.a)
            {
                jsonreader.a();
                for (; jsonreader.e(); jsonreader.b())
                {
                    jsonreader.a();
                    Object obj = b.read(jsonreader);
                    if (map.put(obj, c.read(jsonreader)) != null)
                    {
                        throw new JsonSyntaxException((new StringBuilder()).append("duplicate key: ").append(obj).toString());
                    }
                }

                jsonreader.b();
                return map;
            }
            jsonreader.c();
            while (jsonreader.e()) 
            {
                JsonReaderInternalAccess.a.a(jsonreader);
                Object obj1 = b.read(jsonreader);
                if (map.put(obj1, c.read(jsonreader)) != null)
                {
                    throw new JsonSyntaxException((new StringBuilder()).append("duplicate key: ").append(obj1).toString());
                }
            }
            jsonreader.d();
            return map;
        }

        public void a(JsonWriter jsonwriter, Map map)
        {
            boolean flag3 = false;
            boolean flag2 = false;
            if (map == null)
            {
                jsonwriter.f();
                return;
            }
            if (!MapTypeAdapterFactory.a(a))
            {
                jsonwriter.d();
                java.util.Map.Entry entry;
                for (map = map.entrySet().iterator(); map.hasNext(); c.write(jsonwriter, entry.getValue()))
                {
                    entry = (java.util.Map.Entry)map.next();
                    jsonwriter.a(String.valueOf(entry.getKey()));
                }

                jsonwriter.e();
                return;
            }
            ArrayList arraylist = new ArrayList(map.size());
            ArrayList arraylist1 = new ArrayList(map.size());
            map = map.entrySet().iterator();
            boolean flag = false;
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry1 = (java.util.Map.Entry)map.next();
                JsonElement jsonelement = b.toJsonTree(entry1.getKey());
                arraylist.add(jsonelement);
                arraylist1.add(entry1.getValue());
                boolean flag1;
                if (jsonelement.h() || jsonelement.i())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag = flag1 | flag;
            }
            if (flag)
            {
                jsonwriter.b();
                for (int i = ((flag2) ? 1 : 0); i < arraylist.size(); i++)
                {
                    jsonwriter.b();
                    Streams.a((JsonElement)arraylist.get(i), jsonwriter);
                    c.write(jsonwriter, arraylist1.get(i));
                    jsonwriter.c();
                }

                jsonwriter.c();
                return;
            }
            jsonwriter.d();
            for (int j = ((flag3) ? 1 : 0); j < arraylist.size(); j++)
            {
                jsonwriter.a(a((JsonElement)arraylist.get(j)));
                c.write(jsonwriter, arraylist1.get(j));
            }

            jsonwriter.e();
        }

        public Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Map)obj);
        }

        public Adapter(Gson gson, Type type, TypeAdapter typeadapter, Type type1, TypeAdapter typeadapter1, ObjectConstructor objectconstructor)
        {
            a = MapTypeAdapterFactory.this;
            super();
            b = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, type);
            c = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter1, type1);
            d = objectconstructor;
        }
    }

}
