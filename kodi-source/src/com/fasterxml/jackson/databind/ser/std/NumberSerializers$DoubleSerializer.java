// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            NumberSerializers

public static final class  extends 
{

    static final serializeWithType instance = new <init>();

    public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return super.tual(serializerprovider, beanproperty);
    }

    public void serialize(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        jsongenerator.writeNumber(double1.doubleValue());
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Double)obj, jsongenerator, serializerprovider);
    }

    public void serializeWithType(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        serialize(double1, jsongenerator, serializerprovider);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        serializeWithType((Double)obj, jsongenerator, serializerprovider, typeserializer);
    }


    public ()
    {
        super(java/lang/Double, com.fasterxml.jackson.core.<init>, "number");
    }
}
