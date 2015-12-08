// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import fa;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

public final class MapTypeAdapterFactory
    implements TypeAdapterFactory
{
    final class a extends TypeAdapter
    {

        private final TypeAdapter a;
        private final TypeAdapter b;
        private final ObjectConstructor c;
        private MapTypeAdapterFactory d;

        public final Object read(JsonReader jsonreader)
        {
            JsonToken jsontoken = jsonreader.peek();
            if (jsontoken == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            Map map = (Map)c.construct();
            if (jsontoken == JsonToken.BEGIN_ARRAY)
            {
                jsonreader.beginArray();
                for (; jsonreader.hasNext(); jsonreader.endArray())
                {
                    jsonreader.beginArray();
                    Object obj = a.read(jsonreader);
                    if (map.put(obj, b.read(jsonreader)) != null)
                    {
                        throw new JsonSyntaxException((new StringBuilder("duplicate key: ")).append(obj).toString());
                    }
                }

                jsonreader.endArray();
                return map;
            }
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonreader);
                Object obj1 = a.read(jsonreader);
                if (map.put(obj1, b.read(jsonreader)) != null)
                {
                    throw new JsonSyntaxException((new StringBuilder("duplicate key: ")).append(obj1).toString());
                }
            }
            jsonreader.endObject();
            return map;
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            boolean flag3 = false;
            boolean flag2 = false;
            obj = (Map)obj;
            if (obj == null)
            {
                jsonwriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.a(d))
            {
                jsonwriter.beginObject();
                java.util.Map.Entry entry;
                for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); b.write(jsonwriter, entry.getValue()))
                {
                    entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    jsonwriter.name(String.valueOf(entry.getKey()));
                }

                jsonwriter.endObject();
                return;
            }
            ArrayList arraylist = new ArrayList(((Map) (obj)).size());
            ArrayList arraylist1 = new ArrayList(((Map) (obj)).size());
            obj = ((Map) (obj)).entrySet().iterator();
            boolean flag = false;
            while (((Iterator) (obj)).hasNext()) 
            {
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                JsonElement jsonelement = a.toJsonTree(entry1.getKey());
                arraylist.add(jsonelement);
                arraylist1.add(entry1.getValue());
                boolean flag1;
                if (jsonelement.isJsonArray() || jsonelement.isJsonObject())
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
                jsonwriter.beginArray();
                for (int i = ((flag2) ? 1 : 0); i < arraylist.size(); i++)
                {
                    jsonwriter.beginArray();
                    Streams.write((JsonElement)arraylist.get(i), jsonwriter);
                    b.write(jsonwriter, arraylist1.get(i));
                    jsonwriter.endArray();
                }

                jsonwriter.endArray();
                return;
            }
            jsonwriter.beginObject();
            int j = ((flag3) ? 1 : 0);
            while (j < arraylist.size()) 
            {
                obj = (JsonElement)arraylist.get(j);
                if (((JsonElement) (obj)).isJsonPrimitive())
                {
                    obj = ((JsonElement) (obj)).getAsJsonPrimitive();
                    if (((JsonPrimitive) (obj)).isNumber())
                    {
                        obj = String.valueOf(((JsonPrimitive) (obj)).getAsNumber());
                    } else
                    if (((JsonPrimitive) (obj)).isBoolean())
                    {
                        obj = Boolean.toString(((JsonPrimitive) (obj)).getAsBoolean());
                    } else
                    if (((JsonPrimitive) (obj)).isString())
                    {
                        obj = ((JsonPrimitive) (obj)).getAsString();
                    } else
                    {
                        throw new AssertionError();
                    }
                } else
                if (((JsonElement) (obj)).isJsonNull())
                {
                    obj = "null";
                } else
                {
                    throw new AssertionError();
                }
                jsonwriter.name(((String) (obj)));
                b.write(jsonwriter, arraylist1.get(j));
                j++;
            }
            jsonwriter.endObject();
        }

        public a(Gson gson, Type type, TypeAdapter typeadapter, Type type1, TypeAdapter typeadapter1, ObjectConstructor objectconstructor)
        {
            d = MapTypeAdapterFactory.this;
            super();
            a = new fa(gson, typeadapter, type);
            b = new fa(gson, typeadapter1, type1);
            c = objectconstructor;
        }
    }


    private final ConstructorConstructor a;
    private final boolean b;

    public MapTypeAdapterFactory(ConstructorConstructor constructorconstructor, boolean flag)
    {
        a = constructorconstructor;
        b = flag;
    }

    static boolean a(MapTypeAdapterFactory maptypeadapterfactory)
    {
        return maptypeadapterfactory.b;
    }

    public final TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Object obj = typetoken.getType();
        if (!java/util/Map.isAssignableFrom(typetoken.getRawType()))
        {
            return null;
        }
        Type atype[] = com.google.gson.internal..Gson.Types.getMapKeyAndValueTypes(((Type) (obj)), com.google.gson.internal..Gson.Types.getRawType(((Type) (obj))));
        obj = atype[0];
        TypeAdapter typeadapter;
        if (obj == Boolean.TYPE || obj == java/lang/Boolean)
        {
            obj = TypeAdapters.BOOLEAN_AS_STRING;
        } else
        {
            obj = gson.getAdapter(TypeToken.get(((Type) (obj))));
        }
        typeadapter = gson.getAdapter(TypeToken.get(atype[1]));
        typetoken = a.get(typetoken);
        return new a(gson, atype[0], ((TypeAdapter) (obj)), atype[1], typeadapter, typetoken);
    }
}
