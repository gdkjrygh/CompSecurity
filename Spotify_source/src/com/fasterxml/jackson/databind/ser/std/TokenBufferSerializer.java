// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public class TokenBufferSerializer extends StdSerializer
{

    public TokenBufferSerializer()
    {
        super(com/fasterxml/jackson/databind/util/TokenBuffer);
    }

    public void serialize(TokenBuffer tokenbuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        tokenbuffer.serialize(jsongenerator);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((TokenBuffer)obj, jsongenerator, serializerprovider);
    }

    public final void serializeWithType(TokenBuffer tokenbuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForScalar(tokenbuffer, jsongenerator);
        serialize(tokenbuffer, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(tokenbuffer, jsongenerator);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((TokenBuffer)obj, jsongenerator, serializerprovider, typeserializer);
    }
}
