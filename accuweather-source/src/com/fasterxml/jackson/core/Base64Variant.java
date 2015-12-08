// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core:
//            Base64Variants

public final class Base64Variant
    implements Serializable
{

    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;
    static final char PADDING_CHAR_NONE = 0;
    private static final long serialVersionUID = 1L;
    private final transient int _asciiToBase64[];
    private final transient byte _base64ToAsciiB[];
    private final transient char _base64ToAsciiC[];
    protected final transient int _maxLineLength;
    protected final String _name;
    protected final transient char _paddingChar;
    protected final transient boolean _usesPadding;

    public Base64Variant(Base64Variant base64variant, String s, int i)
    {
        this(base64variant, s, base64variant._usesPadding, base64variant._paddingChar, i);
    }

    public Base64Variant(Base64Variant base64variant, String s, boolean flag, char c, int i)
    {
        _asciiToBase64 = new int[128];
        _base64ToAsciiC = new char[64];
        _base64ToAsciiB = new byte[64];
        _name = s;
        s = base64variant._base64ToAsciiB;
        System.arraycopy(s, 0, _base64ToAsciiB, 0, s.length);
        s = base64variant._base64ToAsciiC;
        System.arraycopy(s, 0, _base64ToAsciiC, 0, s.length);
        base64variant = base64variant._asciiToBase64;
        System.arraycopy(base64variant, 0, _asciiToBase64, 0, base64variant.length);
        _usesPadding = flag;
        _paddingChar = c;
        _maxLineLength = i;
    }

    public Base64Variant(String s, String s1, boolean flag, char c, int i)
    {
        _asciiToBase64 = new int[128];
        _base64ToAsciiC = new char[64];
        _base64ToAsciiB = new byte[64];
        _name = s;
        _usesPadding = flag;
        _paddingChar = c;
        _maxLineLength = i;
        int j = s1.length();
        if (j != 64)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Base64Alphabet length must be exactly 64 (was ").append(j).append(")").toString());
        }
        s1.getChars(0, j, _base64ToAsciiC, 0);
        Arrays.fill(_asciiToBase64, -1);
        for (i = 0; i < j; i++)
        {
            char c1 = _base64ToAsciiC[i];
            _base64ToAsciiB[i] = (byte)c1;
            _asciiToBase64[c1] = i;
        }

        if (flag)
        {
            _asciiToBase64[c] = -2;
        }
    }

    public int decodeBase64Byte(byte byte0)
    {
        if (byte0 <= 127)
        {
            return _asciiToBase64[byte0];
        } else
        {
            return -1;
        }
    }

    public int decodeBase64Char(char c)
    {
        if (c <= '\177')
        {
            return _asciiToBase64[c];
        } else
        {
            return -1;
        }
    }

    public int decodeBase64Char(int i)
    {
        if (i <= 127)
        {
            return _asciiToBase64[i];
        } else
        {
            return -1;
        }
    }

    public String encode(byte abyte0[])
    {
        return encode(abyte0, false);
    }

    public String encode(byte abyte0[], boolean flag)
    {
        int l = abyte0.length;
        StringBuilder stringbuilder = new StringBuilder((l >> 2) + l + (l >> 3));
        if (flag)
        {
            stringbuilder.append('"');
        }
        int i = getMaxLineLength() >> 2;
        int k;
        int i1;
        for (k = 0; k <= l - 3; k = i1 + 1)
        {
            int k1 = k + 1;
            k = abyte0[k];
            i1 = k1 + 1;
            encodeBase64Chunk(stringbuilder, (k << 8 | abyte0[k1] & 0xff) << 8 | abyte0[i1] & 0xff);
            k = i - 1;
            i = k;
            if (k <= 0)
            {
                stringbuilder.append('\\');
                stringbuilder.append('n');
                i = getMaxLineLength() >> 2;
            }
        }

        l -= k;
        if (l > 0)
        {
            int j1 = k + 1;
            k = abyte0[k] << 16;
            int j = k;
            if (l == 2)
            {
                j = k | (abyte0[j1] & 0xff) << 8;
            }
            encodeBase64Partial(stringbuilder, j, l);
        }
        if (flag)
        {
            stringbuilder.append('"');
        }
        return stringbuilder.toString();
    }

    public byte encodeBase64BitsAsByte(int i)
    {
        return _base64ToAsciiB[i];
    }

    public char encodeBase64BitsAsChar(int i)
    {
        return _base64ToAsciiC[i];
    }

    public int encodeBase64Chunk(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = _base64ToAsciiB[i >> 18 & 0x3f];
        j = k + 1;
        abyte0[k] = _base64ToAsciiB[i >> 12 & 0x3f];
        k = j + 1;
        abyte0[j] = _base64ToAsciiB[i >> 6 & 0x3f];
        abyte0[k] = _base64ToAsciiB[i & 0x3f];
        return k + 1;
    }

    public int encodeBase64Chunk(int i, char ac[], int j)
    {
        int k = j + 1;
        ac[j] = _base64ToAsciiC[i >> 18 & 0x3f];
        j = k + 1;
        ac[k] = _base64ToAsciiC[i >> 12 & 0x3f];
        k = j + 1;
        ac[j] = _base64ToAsciiC[i >> 6 & 0x3f];
        ac[k] = _base64ToAsciiC[i & 0x3f];
        return k + 1;
    }

    public void encodeBase64Chunk(StringBuilder stringbuilder, int i)
    {
        stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i >> 6 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i & 0x3f]);
    }

    public int encodeBase64Partial(int i, int j, byte abyte0[], int k)
    {
        int i1 = k + 1;
        abyte0[k] = _base64ToAsciiB[i >> 18 & 0x3f];
        int l = i1 + 1;
        abyte0[i1] = _base64ToAsciiB[i >> 12 & 0x3f];
        if (_usesPadding)
        {
            byte byte1 = (byte)_paddingChar;
            int j1 = l + 1;
            byte byte0;
            if (j == 2)
            {
                byte0 = _base64ToAsciiB[i >> 6 & 0x3f];
            } else
            {
                byte0 = byte1;
            }
            abyte0[l] = byte0;
            k = j1 + 1;
            abyte0[j1] = byte1;
        } else
        {
            k = l;
            if (j == 2)
            {
                abyte0[l] = _base64ToAsciiB[i >> 6 & 0x3f];
                return l + 1;
            }
        }
        return k;
    }

    public int encodeBase64Partial(int i, int j, char ac[], int k)
    {
        int i1 = k + 1;
        ac[k] = _base64ToAsciiC[i >> 18 & 0x3f];
        int l = i1 + 1;
        ac[i1] = _base64ToAsciiC[i >> 12 & 0x3f];
        if (_usesPadding)
        {
            int j1 = l + 1;
            char c;
            if (j == 2)
            {
                c = _base64ToAsciiC[i >> 6 & 0x3f];
            } else
            {
                c = _paddingChar;
            }
            ac[l] = c;
            k = j1 + 1;
            ac[j1] = _paddingChar;
        } else
        {
            k = l;
            if (j == 2)
            {
                ac[l] = _base64ToAsciiC[i >> 6 & 0x3f];
                return l + 1;
            }
        }
        return k;
    }

    public void encodeBase64Partial(StringBuilder stringbuilder, int i, int j)
    {
        stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
        if (_usesPadding)
        {
            char c;
            if (j == 2)
            {
                c = _base64ToAsciiC[i >> 6 & 0x3f];
            } else
            {
                c = _paddingChar;
            }
            stringbuilder.append(c);
            stringbuilder.append(_paddingChar);
        } else
        if (j == 2)
        {
            stringbuilder.append(_base64ToAsciiC[i >> 6 & 0x3f]);
            return;
        }
    }

    public int getMaxLineLength()
    {
        return _maxLineLength;
    }

    public String getName()
    {
        return _name;
    }

    public byte getPaddingByte()
    {
        return (byte)_paddingChar;
    }

    public char getPaddingChar()
    {
        return _paddingChar;
    }

    protected Object readResolve()
    {
        return Base64Variants.valueOf(_name);
    }

    public String toString()
    {
        return _name;
    }

    public boolean usesPadding()
    {
        return _usesPadding;
    }

    public boolean usesPaddingChar(char c)
    {
        return c == _paddingChar;
    }

    public boolean usesPaddingChar(int i)
    {
        return i == _paddingChar;
    }
}
