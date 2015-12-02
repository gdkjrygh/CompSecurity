// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode

public final class POJONode extends ValueNode
{

    protected final Object _value;

    public POJONode(Object obj)
    {
        _value = obj;
    }

    public boolean asBoolean(boolean flag)
    {
        boolean flag1 = flag;
        if (_value != null)
        {
            flag1 = flag;
            if (_value instanceof Boolean)
            {
                flag1 = ((Boolean)_value).booleanValue();
            }
        }
        return flag1;
    }

    public double asDouble(double d)
    {
        if (_value instanceof Number)
        {
            d = ((Number)_value).doubleValue();
        }
        return d;
    }

    public int asInt(int i)
    {
        if (_value instanceof Number)
        {
            i = ((Number)_value).intValue();
        }
        return i;
    }

    public long asLong(long l)
    {
        if (_value instanceof Number)
        {
            l = ((Number)_value).longValue();
        }
        return l;
    }

    public String asText()
    {
        if (_value == null)
        {
            return "null";
        } else
        {
            return _value.toString();
        }
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public byte[] binaryValue()
    {
        if (_value instanceof byte[])
        {
            return (byte[])(byte[])_value;
        } else
        {
            return super.binaryValue();
        }
    }

    public boolean equals(Object obj)
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

    public Object getPojo()
    {
        return _value;
    }

    public int hashCode()
    {
        return _value.hashCode();
    }

    public boolean isPojo()
    {
        return true;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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

    public String toString()
    {
        return String.valueOf(_value);
    }
}
