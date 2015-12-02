// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.lang.reflect.Type;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public abstract class StaticListSerializerBase extends StdSerializer
{

    protected StaticListSerializerBase(Class class1)
    {
        super(class1, false);
    }

    protected abstract JsonNode contentSchema();

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        serializerprovider = createSchemaNode("array", true);
        serializerprovider.put("items", contentSchema());
        return serializerprovider;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((Collection)obj);
    }

    public boolean isEmpty(Collection collection)
    {
        return collection == null || collection.size() == 0;
    }
}
