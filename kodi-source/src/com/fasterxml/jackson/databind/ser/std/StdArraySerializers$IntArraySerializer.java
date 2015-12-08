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
        return hasSingleElement((int[])obj);
    }

    public boolean hasSingleElement(int ai[])
    {
        return ai.length == 1;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (int[])obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, int ai[])
    {
        return ai == null || ai.length == 0;
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serialize((int[])obj, jsongenerator, serializerprovider);
    }

    public final void serialize(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        int i = ai.length;
        if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            serializeContents(ai, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray(i);
            serializeContents(ai, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serializeContents((int[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        int i = 0;
        for (int j = ai.length; i < j; i++)
        {
            jsongenerator.writeNumber(ai[i]);
        }

    }

    static 
    {
        VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);
    }

    public ()
    {
        super([I, null);
    }
}
