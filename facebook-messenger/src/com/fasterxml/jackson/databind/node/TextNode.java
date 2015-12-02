// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode

public final class TextNode extends ValueNode
{

    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    static final int INT_SPACE = 32;
    final String _value;

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

    protected void _reportBase64EOF()
    {
        throw new JsonParseException("Unexpected end-of-String when base64 content", JsonLocation.NA);
    }

    protected void _reportInvalidBase64(Base64Variant base64variant, char c, int i)
    {
        _reportInvalidBase64(base64variant, c, i, null);
    }

    protected void _reportInvalidBase64(Base64Variant base64variant, char c, int i, String s)
    {
        Object obj;
        if (c <= ' ')
        {
            base64variant = (new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(c)).append(") as character #").append(i + 1).append(" of 4-char base64 unit: can only used between units").toString();
        } else
        if (base64variant.usesPaddingChar(c))
        {
            base64variant = (new StringBuilder()).append("Unexpected padding character ('").append(base64variant.getPaddingChar()).append("') as character #").append(i + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
        } else
        if (!Character.isDefined(c) || Character.isISOControl(c))
        {
            base64variant = (new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(c)).append(") in base64 content").toString();
        } else
        {
            base64variant = (new StringBuilder()).append("Illegal character '").append(c).append("' (code 0x").append(Integer.toHexString(c)).append(") in base64 content").toString();
        }
        obj = base64variant;
        if (s != null)
        {
            obj = (new StringBuilder()).append(base64variant).append(": ").append(s).toString();
        }
        throw new JsonParseException(((String) (obj)), JsonLocation.NA);
    }

    public boolean asBoolean(boolean flag)
    {
        boolean flag1 = flag;
        if (_value != null)
        {
            flag1 = flag;
            if ("true".equals(_value.trim()))
            {
                flag1 = true;
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

    public long asLong(long l)
    {
        return NumberInput.parseAsLong(_value, l);
    }

    public String asText()
    {
        return _value;
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_STRING;
    }

    public byte[] binaryValue()
    {
        return getBinaryValue(Base64Variants.getDefaultVariant());
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
                if (obj.getClass() == getClass())
                {
                    return ((TextNode)obj)._value.equals(_value);
                }
            }
        }
        return flag;
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
    {
        ByteArrayBuilder bytearraybuilder;
        String s;
        int i;
        int k;
        bytearraybuilder = new ByteArrayBuilder(100);
        s = _value;
        k = s.length();
        i = 0;
_L3:
        if (i >= k) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        j = i + 1;
        char c = s.charAt(i);
        if (j < k)
        {
label0:
            {
                if (c <= ' ')
                {
                    break MISSING_BLOCK_LABEL_390;
                }
                l = base64variant.decodeBase64Char(c);
                if (l < 0)
                {
                    _reportInvalidBase64(base64variant, c, 0);
                }
                if (j >= k)
                {
                    _reportBase64EOF();
                }
                i = j + 1;
                c = s.charAt(j);
                j = base64variant.decodeBase64Char(c);
                if (j < 0)
                {
                    _reportInvalidBase64(base64variant, c, 1);
                }
                l = l << 6 | j;
                if (i < k)
                {
                    break MISSING_BLOCK_LABEL_167;
                }
                if (base64variant.usesPadding())
                {
                    break label0;
                }
                bytearraybuilder.append(l >> 4);
            }
        }
_L2:
        return bytearraybuilder.toByteArray();
        _reportBase64EOF();
label1:
        {
            j = i + 1;
            char c1 = s.charAt(i);
            i = base64variant.decodeBase64Char(c1);
            if (i >= 0)
            {
                break label1;
            }
            if (i != -2)
            {
                _reportInvalidBase64(base64variant, c1, 2);
            }
            if (j >= k)
            {
                _reportBase64EOF();
            }
            i = j + 1;
            c1 = s.charAt(j);
            if (!base64variant.usesPaddingChar(c1))
            {
                _reportInvalidBase64(base64variant, c1, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
            }
            bytearraybuilder.append(l >> 4);
        }
          goto _L3
label2:
        {
            l = l << 6 | i;
            if (j < k)
            {
                break MISSING_BLOCK_LABEL_324;
            }
            if (base64variant.usesPadding())
            {
                break label2;
            }
            bytearraybuilder.appendTwoBytes(l >> 2);
        }
          goto _L2
        _reportBase64EOF();
        i = j + 1;
        char c2 = s.charAt(j);
        j = base64variant.decodeBase64Char(c2);
        if (j < 0)
        {
            if (j != -2)
            {
                _reportInvalidBase64(base64variant, c2, 3);
            }
            bytearraybuilder.appendTwoBytes(l >> 2);
        } else
        {
            bytearraybuilder.appendThreeBytes(l << 6 | j);
        }
          goto _L3
        i = j;
          goto _L1
    }

    public int hashCode()
    {
        return _value.hashCode();
    }

    public boolean isTextual()
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
        StringBuilder stringbuilder = new StringBuilder((i >> 4) + (i + 2));
        appendQuoted(stringbuilder, _value);
        return stringbuilder.toString();
    }

}
