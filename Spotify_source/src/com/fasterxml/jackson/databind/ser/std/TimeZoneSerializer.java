// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class TimeZoneSerializer extends StdScalarSerializer
{

    public TimeZoneSerializer()
    {
        super(java/util/TimeZone);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((TimeZone)obj, jsongenerator, serializerprovider);
    }

    public void serialize(TimeZone timezone, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeString(timezone.getID());
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((TimeZone)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(TimeZone timezone, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForScalar(timezone, jsongenerator, java/util/TimeZone);
        serialize(timezone, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(timezone, jsongenerator);
    }
}
