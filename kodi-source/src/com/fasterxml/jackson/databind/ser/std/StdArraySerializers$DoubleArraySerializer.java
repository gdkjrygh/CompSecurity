// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ArraySerializerBase, StdArraySerializers

public static class  extends ArraySerializerBase
{

    private static final JavaType VALUE_TYPE;

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return this;
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((double[])obj);
    }

    public boolean hasSingleElement(double ad[])
    {
        return ad.length == 1;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (double[])obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, double ad[])
    {
        return ad == null || ad.length == 0;
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serialize((double[])obj, jsongenerator, serializerprovider);
    }

    public final void serialize(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        int i = ad.length;
        if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            serializeContents(ad, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray(i);
            serializeContents(ad, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serializeContents((double[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        int i = 0;
        for (int j = ad.length; i < j; i++)
        {
            jsongenerator.writeNumber(ad[i]);
        }

    }

    static 
    {
        VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);
    }

    public ()
    {
        super([D, null);
    }
}
