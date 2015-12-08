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

    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/Boolean);

    public final ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return this;
    }

    public final volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((boolean[])obj);
    }

    public final boolean hasSingleElement(boolean aflag[])
    {
        return aflag.length == 1;
    }

    public final volatile boolean isEmpty(Object obj)
    {
        return isEmpty((boolean[])obj);
    }

    public final boolean isEmpty(boolean aflag[])
    {
        return aflag == null || aflag.length == 0;
    }

    public final volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializeContents((boolean[])obj, jsongenerator, serializerprovider);
    }

    public final void serializeContents(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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
