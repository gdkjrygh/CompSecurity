// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind:
//            SerializerProvider

public abstract class JsonSerializer
{
    public static abstract class None extends JsonSerializer
    {

        public None()
        {
        }
    }


    public JsonSerializer()
    {
    }

    public Class handledType()
    {
        return null;
    }

    public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(obj);
    }

    public boolean isEmpty(Object obj)
    {
        return obj == null;
    }

    public boolean isUnwrappingSerializer()
    {
        return false;
    }

    public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException;

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        typeserializer = handledType();
        jsongenerator = typeserializer;
        if (typeserializer == null)
        {
            jsongenerator = obj.getClass();
        }
        throw serializerprovider.mappingException("Type id handling not implemented for type %s (by serializer of type %s)", new Object[] {
            jsongenerator.getName(), getClass().getName()
        });
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
