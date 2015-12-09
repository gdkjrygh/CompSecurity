// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public final class  extends 
{

    static final serializeWithType instance = new <init>();

    public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        return super.tual(serializerprovider, beanproperty);
    }

    public final void serialize(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeNumber(double1.doubleValue());
    }

    public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Double)obj, jsongenerator, serializerprovider);
    }

    public final void serializeWithType(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serialize(double1, jsongenerator, serializerprovider);
    }

    public final volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((Double)obj, jsongenerator, serializerprovider, typeserializer);
    }


    public ()
    {
        super(java/lang/Double, com.fasterxml.jackson.core.<init>, "number");
    }
}
