// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public final class  extends StdSerializer
{

    private final void _writeArrayContents(JsonGenerator jsongenerator, char ac[])
    {
        int i = 0;
        for (int j = ac.length; i < j; i++)
        {
            jsongenerator.writeString(ac, i, 1);
        }

    }

    public final volatile boolean isEmpty(Object obj)
    {
        return isEmpty((char[])obj);
    }

    public final boolean isEmpty(char ac[])
    {
        return ac == null || ac.length == 0;
    }

    public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((char[])obj, jsongenerator, serializerprovider);
    }

    public final void serialize(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
        {
            jsongenerator.writeStartArray();
            _writeArrayContents(jsongenerator, ac);
            jsongenerator.writeEndArray();
            return;
        } else
        {
            jsongenerator.writeString(ac, 0, ac.length);
            return;
        }
    }

    public final volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((char[])obj, jsongenerator, serializerprovider, typeserializer);
    }

    public final void serializeWithType(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
        {
            typeserializer.writeTypePrefixForArray(ac, jsongenerator);
            _writeArrayContents(jsongenerator, ac);
            typeserializer.writeTypeSuffixForArray(ac, jsongenerator);
            return;
        } else
        {
            typeserializer.writeTypePrefixForScalar(ac, jsongenerator);
            jsongenerator.writeString(ac, 0, ac.length);
            typeserializer.writeTypeSuffixForScalar(ac, jsongenerator);
            return;
        }
    }

    public ()
    {
        super([C);
    }
}
