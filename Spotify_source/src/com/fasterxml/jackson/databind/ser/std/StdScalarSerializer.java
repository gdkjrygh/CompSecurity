// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public abstract class StdScalarSerializer extends StdSerializer
{

    protected StdScalarSerializer(Class class1)
    {
        super(class1);
    }

    protected StdScalarSerializer(Class class1, boolean flag)
    {
        super(class1);
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
        serialize(obj, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
    }
}
