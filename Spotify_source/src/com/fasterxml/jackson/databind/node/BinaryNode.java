// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode, JsonNodeType

public class BinaryNode extends ValueNode
{

    static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
    protected final byte _data[];

    public BinaryNode(byte abyte0[])
    {
        _data = abyte0;
    }

    public static BinaryNode valueOf(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        if (abyte0.length == 0)
        {
            return EMPTY_BINARY_NODE;
        } else
        {
            return new BinaryNode(abyte0);
        }
    }

    public String asText()
    {
        return Base64Variants.getDefaultVariant().encode(_data, false);
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public byte[] binaryValue()
    {
        return _data;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof BinaryNode)
                {
                    return Arrays.equals(((BinaryNode)obj)._data, _data);
                }
            }
        }
        return flag;
    }

    public JsonNodeType getNodeType()
    {
        return JsonNodeType.BINARY;
    }

    public int hashCode()
    {
        if (_data == null)
        {
            return -1;
        } else
        {
            return _data.length;
        }
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), _data, 0, _data.length);
    }

    public String toString()
    {
        return Base64Variants.getDefaultVariant().encode(_data, true);
    }

}
