// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ArraySerializerBase, StdArraySerializers

public static final class  extends ArraySerializerBase
{

    private static final JavaType VALUE_TYPE;

    public final ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return this;
    }

    public final volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((double[])obj);
    }

    public final boolean hasSingleElement(double ad[])
    {
        return ad.length == 1;
    }

    public final volatile boolean isEmpty(Object obj)
    {
        return isEmpty((double[])obj);
    }

    public final boolean isEmpty(double ad[])
    {
        return ad == null || ad.length == 0;
    }

    public final volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((double[])obj, jsongenerator, serializerprovider);
    }

    public final void serializeContents(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
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
