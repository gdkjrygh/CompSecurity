// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            NonTypedScalarSerializerBase

public final class BooleanSerializer extends NonTypedScalarSerializerBase
{

    final boolean _forPrimitive;

    public BooleanSerializer(boolean flag)
    {
        super(java/lang/Boolean);
        _forPrimitive = flag;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        boolean flag;
        if (!_forPrimitive)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return createSchemaNode("boolean", flag);
    }

    public void serialize(Boolean boolean1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeBoolean(boolean1.booleanValue());
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Boolean)obj, jsongenerator, serializerprovider);
    }
}
