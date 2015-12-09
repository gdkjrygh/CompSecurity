// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ArraySerializerBase

public final class  extends ArraySerializerBase
{

    private static final JavaType VALUE_TYPE;

    public final ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return this;
    }

    public final volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((int[])obj);
    }

    public final boolean hasSingleElement(int ai[])
    {
        return ai.length == 1;
    }

    public final volatile boolean isEmpty(Object obj)
    {
        return isEmpty((int[])obj);
    }

    public final boolean isEmpty(int ai[])
    {
        return ai == null || ai.length == 0;
    }

    public final volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializeContents((int[])obj, jsongenerator, serializerprovider);
    }

    public final void serializeContents(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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
