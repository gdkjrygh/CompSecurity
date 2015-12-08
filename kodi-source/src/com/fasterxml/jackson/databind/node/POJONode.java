// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode, JsonNodeType

public class POJONode extends ValueNode
{

    protected final Object _value;

    public POJONode(Object obj)
    {
        _value = obj;
    }

    protected boolean _pojoEquals(POJONode pojonode)
    {
        if (_value == null)
        {
            return pojonode._value == null;
        } else
        {
            return _value.equals(pojonode._value);
        }
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
                if (obj instanceof POJONode)
                {
                    return _pojoEquals((POJONode)obj);
                }
            }
        }
        return flag;
    }

    public JsonNodeType getNodeType()
    {
        return JsonNodeType.POJO;
    }

    public int hashCode()
    {
        return _value.hashCode();
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        if (_value == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
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
