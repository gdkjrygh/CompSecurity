// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public final class  extends StdSerializer
{

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        serializerprovider = createSchemaNode("array", true);
        serializerprovider.put("items", createSchemaNode("string"));
        return serializerprovider;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((byte[])obj);
    }

    public boolean isEmpty(byte abyte0[])
    {
        return abyte0 == null || abyte0.length == 0;
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((byte[])obj, jsongenerator, serializerprovider);
    }

    public void serialize(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeBinary(abyte0);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((byte[])obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForScalar(abyte0, jsongenerator);
        jsongenerator.writeBinary(abyte0);
        typeserializer.writeTypeSuffixForScalar(abyte0, jsongenerator);
    }

    public ()
    {
        super([B);
    }
}
