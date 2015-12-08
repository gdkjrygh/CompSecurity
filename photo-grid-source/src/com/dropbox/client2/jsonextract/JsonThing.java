// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonBase, JsonList, JsonMap, JsonExtractionException, 
//            JsonExtractor

public final class JsonThing extends JsonBase
{

    static final boolean $assertionsDisabled;
    private static final HashMap TypeNames;

    public JsonThing(Object obj)
    {
        super(obj, null);
    }

    public JsonThing(Object obj, String s)
    {
        super(obj, s);
    }

    private Object expect(Class class1)
    {
        if (!$assertionsDisabled && class1 == null)
        {
            throw new AssertionError();
        }
        if (class1.isInstance(internal))
        {
            return internal;
        } else
        {
            throw error((new StringBuilder("expecting ")).append(typeNameForClass(class1)).append(", found ").append(typeNameForObject(internal)).toString());
        }
    }

    private boolean is(Class class1)
    {
        if (!$assertionsDisabled && class1 == null)
        {
            throw new AssertionError();
        } else
        {
            return class1.isInstance(internal);
        }
    }

    static String pathConcat(String s, String s1)
    {
        if (s == null)
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append("/").append(s1).toString();
        }
    }

    private static String typeNameForClass(Class class1)
    {
        if (class1 == null)
        {
            class1 = "null";
        } else
        {
            String s = (String)TypeNames.get(class1);
            class1 = s;
            if (!$assertionsDisabled)
            {
                class1 = s;
                if (s == null)
                {
                    throw new AssertionError();
                }
            }
        }
        return class1;
    }

    private static String typeNameForObject(Object obj)
    {
        if (obj == null)
        {
            return "null";
        }
        if (obj instanceof Number)
        {
            return "a number";
        }
        if (obj instanceof String)
        {
            return "a string";
        }
        if (obj instanceof Boolean)
        {
            return "a boolean";
        }
        if (obj instanceof Map)
        {
            return "an object";
        }
        if (obj instanceof List)
        {
            return "an array";
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("not a valid org.json.simple type: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final volatile JsonExtractionException error(String s)
    {
        return super.error(s);
    }

    public final boolean expectBoolean()
    {
        return ((Boolean)expect(java/lang/Boolean)).booleanValue();
    }

    public final double expectFloat64()
    {
        if (internal instanceof Number)
        {
            return ((Number)internal).doubleValue();
        } else
        {
            throw error((new StringBuilder("expecting a floating point number, found ")).append(typeNameForObject(internal)).toString());
        }
    }

    public final int expectInt32()
    {
        if (internal instanceof Number)
        {
            return ((Number)internal).intValue();
        } else
        {
            throw error((new StringBuilder("expecting an integer, found ")).append(typeNameForObject(internal)).toString());
        }
    }

    public final long expectInt64()
    {
        if (internal instanceof Number)
        {
            return ((Number)internal).longValue();
        } else
        {
            throw error((new StringBuilder("expecting an integer, found ")).append(typeNameForObject(internal)).toString());
        }
    }

    public final JsonList expectList()
    {
        return new JsonList((List)expect(java/util/List), path);
    }

    public final JsonMap expectMap()
    {
        return new JsonMap((Map)expect(java/util/Map), path);
    }

    public final void expectNull()
    {
        if (internal != null)
        {
            throw error("expecting null");
        } else
        {
            return;
        }
    }

    public final Number expectNumber()
    {
        return (Number)expect(java/lang/Number);
    }

    public final String expectString()
    {
        return (String)expect(java/lang/String);
    }

    public final String expectStringOrNull()
    {
        if (internal == null)
        {
            return null;
        } else
        {
            return (String)expect(java/lang/String);
        }
    }

    public final boolean isBoolean()
    {
        return is(java/lang/Boolean);
    }

    public final boolean isFloat64()
    {
        try
        {
            expectFloat64();
        }
        catch (JsonExtractionException jsonextractionexception)
        {
            return false;
        }
        return true;
    }

    public final boolean isInt32()
    {
        try
        {
            expectInt32();
        }
        catch (JsonExtractionException jsonextractionexception)
        {
            return false;
        }
        return true;
    }

    public final boolean isInt64()
    {
        try
        {
            expectInt64();
        }
        catch (JsonExtractionException jsonextractionexception)
        {
            return false;
        }
        return true;
    }

    public final boolean isList()
    {
        return is(java/util/List);
    }

    public final boolean isMap()
    {
        return is(java/util/Map);
    }

    public final boolean isNull()
    {
        return internal == null;
    }

    public final boolean isNumber()
    {
        return is(java/lang/Number);
    }

    public final boolean isString()
    {
        return is(java/lang/String);
    }

    public final Object optionalExtract(JsonExtractor jsonextractor)
    {
        if (isNull())
        {
            return null;
        } else
        {
            return jsonextractor.extract(this);
        }
    }

    public final JsonExtractionException unexpected()
    {
        return error((new StringBuilder("unexpected type: ")).append(typeNameForObject(internal)).toString());
    }

    static 
    {
        HashMap hashmap;
        boolean flag;
        if (!com/dropbox/client2/jsonextract/JsonThing.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        hashmap = new HashMap();
        TypeNames = hashmap;
        hashmap.put(java/lang/String, "a string");
        TypeNames.put(java/lang/Number, "a number");
        TypeNames.put(java/lang/Boolean, "a boolean");
        TypeNames.put(java/util/Map, "an object");
        TypeNames.put(java/util/List, "an array");
    }
}
