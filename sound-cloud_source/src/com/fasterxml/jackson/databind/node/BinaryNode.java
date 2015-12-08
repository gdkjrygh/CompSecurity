// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode

public final class BinaryNode extends ValueNode
{

    static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
    final byte _data[];

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

    public final String asText()
    {
        return Base64Variants.getDefaultVariant().encode(_data, false);
    }

    public final boolean equals(Object obj)
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
                if (obj.getClass() == getClass())
                {
                    return Arrays.equals(((BinaryNode)obj)._data, _data);
                }
            }
        }
        return flag;
    }

    public final int hashCode()
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
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), _data, 0, _data.length);
    }

    public final String toString()
    {
        return Base64Variants.getDefaultVariant().encode(_data, true);
    }

}
