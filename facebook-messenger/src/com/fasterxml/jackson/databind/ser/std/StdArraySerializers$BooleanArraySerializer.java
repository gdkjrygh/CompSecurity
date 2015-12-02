// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ArraySerializerBase

public final class  extends ArraySerializerBase
{

    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/Boolean);

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return this;
    }

    public JsonSerializer getContentSerializer()
    {
        return null;
    }

    public JavaType getContentType()
    {
        return VALUE_TYPE;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        serializerprovider = createSchemaNode("array", true);
        serializerprovider.put("items", createSchemaNode("boolean"));
        return serializerprovider;
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((boolean[])obj);
    }

    public boolean hasSingleElement(boolean aflag[])
    {
        return aflag.length == 1;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((boolean[])obj);
    }

    public boolean isEmpty(boolean aflag[])
    {
        return aflag == null || aflag.length == 0;
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializeContents((boolean[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int i = 0;
        for (int j = aflag.length; i < j; i++)
        {
            jsongenerator.writeBoolean(aflag[i]);
        }

    }


    public ()
    {
        super([Z, null);
    }
}
