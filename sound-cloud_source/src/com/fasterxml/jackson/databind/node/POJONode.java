// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode

public final class POJONode extends ValueNode
{

    protected final Object _value;

    public POJONode(Object obj)
    {
        _value = obj;
    }

    public final String asText()
    {
        if (_value == null)
        {
            return "null";
        } else
        {
            return _value.toString();
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (POJONode)obj;
            if (_value == null)
            {
                if (((POJONode) (obj))._value != null)
                {
                    return false;
                }
            } else
            {
                return _value.equals(((POJONode) (obj))._value);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return _value.hashCode();
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        if (_value == null)
        {
            jsongenerator.writeNull();
            return;
        } else
        {
            jsongenerator.writeObject(_value);
            return;
        }
    }

    public final String toString()
    {
        return String.valueOf(_value);
    }
}
