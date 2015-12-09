// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public class SerializableSerializer extends StdSerializer
{

    private static final AtomicReference _mapperReference = new AtomicReference();
    public static final SerializableSerializer instance = new SerializableSerializer();

    protected SerializableSerializer()
    {
        super(com/fasterxml/jackson/databind/JsonSerializable);
    }

    public void serialize(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsonserializable.serialize(jsongenerator, serializerprovider);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((JsonSerializable)obj, jsongenerator, serializerprovider);
    }

    public final void serializeWithType(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        jsonserializable.serializeWithType(jsongenerator, serializerprovider, typeserializer);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((JsonSerializable)obj, jsongenerator, serializerprovider, typeserializer);
    }

}
