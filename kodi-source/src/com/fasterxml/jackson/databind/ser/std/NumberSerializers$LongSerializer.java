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
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            NumberSerializers

public static final class  extends 
{

    static final serialize instance = new <init>();

    public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return super.extual(serializerprovider, beanproperty);
    }

    public void serialize(Long long1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        jsongenerator.writeNumber(long1.longValue());
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Long)obj, jsongenerator, serializerprovider);
    }


    public ()
    {
        super(java/lang/Long, com.fasterxml.jackson.core.e, "number");
    }
}
