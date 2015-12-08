// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer

public class UUIDDeserializer extends FromStringDeserializer
{

    static final int HEX_DIGITS[];

    public UUIDDeserializer()
    {
        super(java/util/UUID);
    }

    static int _badChar(String s, int i, char c)
    {
        throw new NumberFormatException((new StringBuilder()).append("Non-hex character '").append(c).append("', not valid character for a UUID String").append("' (value 0x").append(Integer.toHexString(c)).append(") for UUID String \"").append(s).append("\"").toString());
    }

    private void _badFormat(String s)
    {
        throw new NumberFormatException("UUID has to be represented by the standard 36-char representation");
    }

    private UUID _fromBytes(byte abyte0[], DeserializationContext deserializationcontext)
        throws IOException
    {
        if (abyte0.length != 16)
        {
            deserializationcontext.mappingException((new StringBuilder()).append("Can only construct UUIDs from byte[16]; got ").append(abyte0.length).append(" bytes").toString());
        }
        return new UUID(_long(abyte0, 0), _long(abyte0, 8));
    }

    private static int _int(byte abyte0[], int i)
    {
        return abyte0[i] << 24 | (abyte0[i + 1] & 0xff) << 16 | (abyte0[i + 2] & 0xff) << 8 | abyte0[i + 3] & 0xff;
    }

    private static long _long(byte abyte0[], int i)
    {
        return (long)_int(abyte0, i) << 32 | ((long)_int(abyte0, i + 4) << 32) >>> 32;
    }

    static int byteFromChars(String s, int i)
    {
        char c = s.charAt(i);
        char c1 = s.charAt(i + 1);
        if (c <= '\177' && c1 <= '\177')
        {
            int j = HEX_DIGITS[c] << 4 | HEX_DIGITS[c1];
            if (j >= 0)
            {
                return j;
            }
        }
        if (c > '\177' || HEX_DIGITS[c] < 0)
        {
            return _badChar(s, i, c);
        } else
        {
            return _badChar(s, i + 1, c1);
        }
    }

    static int intFromChars(String s, int i)
    {
        return (byteFromChars(s, i) << 24) + (byteFromChars(s, i + 2) << 16) + (byteFromChars(s, i + 4) << 8) + byteFromChars(s, i + 6);
    }

    static int shortFromChars(String s, int i)
    {
        return (byteFromChars(s, i) << 8) + byteFromChars(s, i + 2);
    }

    protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException
    {
        return _deserialize(s, deserializationcontext);
    }

    protected UUID _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (s.length() != 36)
        {
            if (s.length() == 24)
            {
                return _fromBytes(Base64Variants.getDefaultVariant().decode(s), deserializationcontext);
            }
            _badFormat(s);
        }
        if (s.charAt(8) != '-' || s.charAt(13) != '-' || s.charAt(18) != '-' || s.charAt(23) != '-')
        {
            _badFormat(s);
        }
        return new UUID(((long)intFromChars(s, 0) << 32) + ((long)shortFromChars(s, 9) << 16 | (long)shortFromChars(s, 14)), (long)(shortFromChars(s, 19) << 16 | shortFromChars(s, 24)) << 32 | ((long)intFromChars(s, 28) << 32) >>> 32);
    }

    protected volatile Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
        throws IOException
    {
        return _deserializeEmbedded(obj, deserializationcontext);
    }

    protected UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (obj instanceof byte[])
        {
            return _fromBytes((byte[])(byte[])obj, deserializationcontext);
        } else
        {
            super._deserializeEmbedded(obj, deserializationcontext);
            return null;
        }
    }

    static 
    {
        HEX_DIGITS = new int[127];
        Arrays.fill(HEX_DIGITS, -1);
        for (int i = 0; i < 10; i++)
        {
            HEX_DIGITS[i + 48] = i;
        }

        for (int j = 0; j < 6; j++)
        {
            HEX_DIGITS[j + 97] = j + 10;
            HEX_DIGITS[j + 65] = j + 10;
        }

    }
}
