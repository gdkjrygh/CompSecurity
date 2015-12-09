// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            BaseJsonNode

public abstract class ValueNode extends BaseJsonNode
{

    protected ValueNode()
    {
    }

    public final JsonNode get(int i)
    {
        return null;
    }

    public final JsonNode get(String s)
    {
        return null;
    }

    public final boolean has(String s)
    {
        return false;
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForScalar(this, jsongenerator);
        serialize(jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(this, jsongenerator);
    }

    public String toString()
    {
        return asText();
    }
}
