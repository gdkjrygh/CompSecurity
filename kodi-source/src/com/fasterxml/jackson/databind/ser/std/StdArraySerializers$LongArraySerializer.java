// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdArraySerializers

public static class erializer extends erializer
{

    private static final JavaType VALUE_TYPE;

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new <init>(this, _property, typeserializer);
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((long[])obj);
    }

    public boolean hasSingleElement(long al[])
    {
        return al.length == 1;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (long[])obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, long al[])
    {
        return al == null || al.length == 0;
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serialize((long[])obj, jsongenerator, serializerprovider);
    }

    public final void serialize(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        int i = al.length;
        if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            serializeContents(al, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray(i);
            serializeContents(al, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serializeContents((long[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (_valueTypeSerializer != null)
        {
            int i = 0;
            for (int k = al.length; i < k; i++)
            {
                _valueTypeSerializer.writeTypePrefixForScalar(null, jsongenerator, Long.TYPE);
                jsongenerator.writeNumber(al[i]);
                _valueTypeSerializer.writeTypeSuffixForScalar(null, jsongenerator);
            }

        } else
        {
            int j = 0;
            for (int l = al.length; j < l; j++)
            {
                jsongenerator.writeNumber(al[j]);
            }

        }
    }

    static 
    {
        VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);
    }

    public erializer()
    {
        super([J);
    }

    public erializer(erializer erializer, BeanProperty beanproperty, TypeSerializer typeserializer)
    {
        super(erializer, beanproperty, typeserializer);
    }
}
