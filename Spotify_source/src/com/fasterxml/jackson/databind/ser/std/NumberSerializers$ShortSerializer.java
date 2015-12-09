// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class  extends 
{

    static final serialize instance = new <init>();

    public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        return super.xtual(serializerprovider, beanproperty);
    }

    public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Short)obj, jsongenerator, serializerprovider);
    }

    public final void serialize(Short short1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeNumber(short1.shortValue());
    }


    public ()
    {
        super(java/lang/Short, com.fasterxml.jackson.core., "number");
    }
}
