// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson:
//            TypeAdapterFactory, TreeTypeAdapter, JsonSerializer, JsonDeserializer, 
//            Gson, TypeAdapter

private static class <init>
    implements TypeAdapterFactory
{

    private final JsonDeserializer deserializer;
    private final TypeToken exactType;
    private final Class hierarchyType;
    private final boolean matchRawType;
    private final JsonSerializer serializer;

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        boolean flag;
        if (exactType != null)
        {
            if (exactType.equals(typetoken) || matchRawType && exactType.getType() == typetoken.getRawType())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = hierarchyType.isAssignableFrom(typetoken.getRawType());
        }
        if (flag)
        {
            return new TreeTypeAdapter(serializer, deserializer, gson, typetoken, this, null);
        } else
        {
            return null;
        }
    }

    private (Object obj, TypeToken typetoken, boolean flag, Class class1)
    {
        JsonSerializer jsonserializer;
        boolean flag1;
        if (obj instanceof JsonSerializer)
        {
            jsonserializer = (JsonSerializer)obj;
        } else
        {
            jsonserializer = null;
        }
        serializer = jsonserializer;
        if (obj instanceof JsonDeserializer)
        {
            obj = (JsonDeserializer)obj;
        } else
        {
            obj = null;
        }
        deserializer = ((JsonDeserializer) (obj));
        if (serializer != null || deserializer != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.google.gson.internal.zer(flag1);
        exactType = typetoken;
        matchRawType = flag;
        hierarchyType = class1;
    }

    hierarchyType(Object obj, TypeToken typetoken, boolean flag, Class class1, hierarchyType hierarchytype)
    {
        this(obj, typetoken, flag, class1);
    }
}
