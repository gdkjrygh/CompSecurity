// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdArraySerializers

public static final class rializer extends rializer
{

    private static final JavaType VALUE_TYPE;

    public final ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new <init>(this, _property, typeserializer);
    }

    public final volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((float[])obj);
    }

    public final boolean hasSingleElement(float af[])
    {
        return af.length == 1;
    }

    public final volatile boolean isEmpty(Object obj)
    {
        return isEmpty((float[])obj);
    }

    public final boolean isEmpty(float af[])
    {
        return af == null || af.length == 0;
    }

    public final volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((float[])obj, jsongenerator, serializerprovider);
    }

    public final void serializeContents(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int k = 0;
        int i = 0;
        if (_valueTypeSerializer != null)
        {
            for (k = af.length; i < k; i++)
            {
                _valueTypeSerializer.writeTypePrefixForScalar(null, jsongenerator, Float.TYPE);
                jsongenerator.writeNumber(af[i]);
                _valueTypeSerializer.writeTypeSuffixForScalar(null, jsongenerator);
            }

        } else
        {
            int l = af.length;
            for (int j = k; j < l; j++)
            {
                jsongenerator.writeNumber(af[j]);
            }

        }
    }

    static 
    {
        VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);
    }

    public rializer()
    {
        super([F);
    }

    public rializer(rializer rializer, BeanProperty beanproperty, TypeSerializer typeserializer)
    {
        super(rializer, beanproperty, typeserializer);
    }
}
