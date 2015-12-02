// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;

// Referenced classes of package com.fasterxml.jackson.databind:
//            SerializerProvider

public abstract class JsonSerializer
{

    public JsonSerializer()
    {
    }

    public Class handledType()
    {
        return null;
    }

    public boolean isEmpty(Object obj)
    {
        return obj == null;
    }

    public boolean isUnwrappingSerializer()
    {
        return false;
    }

    public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider);

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializerprovider = handledType();
        jsongenerator = serializerprovider;
        if (serializerprovider == null)
        {
            jsongenerator = obj.getClass();
        }
        throw new UnsupportedOperationException((new StringBuilder()).append("Type id handling not implemented for type ").append(jsongenerator.getName()).toString());
    }

    public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
    {
        return this;
    }

    public boolean usesObjectId()
    {
        return false;
    }
}
