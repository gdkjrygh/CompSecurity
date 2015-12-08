// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
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

    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/Boolean);

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return this;
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((boolean[])obj);
    }

    public boolean hasSingleElement(boolean aflag[])
    {
        return aflag.length == 1;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (boolean[])obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, boolean aflag[])
    {
        return aflag == null || aflag.length == 0;
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serialize((boolean[])obj, jsongenerator, serializerprovider);
    }

    public final void serialize(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        int i = aflag.length;
        if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            serializeContents(aflag, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray(i);
            serializeContents(aflag, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serializeContents((boolean[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int i = 0;
        for (int j = aflag.length; i < j; i++)
        {
            jsongenerator.writeBoolean(aflag[i]);
        }

    }


    public ()
    {
        super([Z, null);
    }
}
