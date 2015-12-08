// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode, JsonNodeType

public class TextNode extends ValueNode
{

    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    protected final String _value;

    public TextNode(String s)
    {
        _value = s;
    }

    protected static void appendQuoted(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append('"');
        CharTypes.appendQuoted(stringbuilder, s);
        stringbuilder.append('"');
    }

    public static TextNode valueOf(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (s.length() == 0)
        {
            return EMPTY_STRING_NODE;
        } else
        {
            return new TextNode(s);
        }
    }

    public boolean asBoolean(boolean flag)
    {
        boolean flag1 = flag;
        if (_value != null)
        {
            String s = _value.trim();
            if ("true".equals(s))
            {
                flag1 = true;
            } else
            {
                flag1 = flag;
                if ("false".equals(s))
                {
                    return false;
                }
            }
        }
        return flag1;
    }

    public double asDouble(double d)
    {
        return NumberInput.parseAsDouble(_value, d);
    }

    public int asInt(int i)
    {
        return NumberInput.parseAsInt(_value, i);
    }

    public String asText()
    {
        return _value;
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
                if (obj instanceof TextNode)
                {
                    return ((TextNode)obj)._value.equals(_value);
                }
            }
        }
        return flag;
    }

    public JsonNodeType getNodeType()
    {
        return JsonNodeType.STRING;
    }

    public int hashCode()
    {
        return _value.hashCode();
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (_value == null)
        {
            jsongenerator.writeNull();
            return;
        } else
        {
            jsongenerator.writeString(_value);
            return;
        }
    }

    public String textValue()
    {
        return _value;
    }

    public String toString()
    {
        int i = _value.length();
        StringBuilder stringbuilder = new StringBuilder(i + 2 + (i >> 4));
        appendQuoted(stringbuilder, _value);
        return stringbuilder.toString();
    }

}
