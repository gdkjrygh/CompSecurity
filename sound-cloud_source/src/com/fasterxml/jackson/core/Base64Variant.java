// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;

public final class Base64Variant
    implements Serializable
{

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
        boolean flag1 = false;
        super();
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
            throw new IllegalArgumentException((new StringBuilder("Base64Alphabet length must be exactly 64 (was ")).append(j).append(")").toString());
        }
        s1.getChars(0, j, _base64ToAsciiC, 0);
        Arrays.fill(_asciiToBase64, -1);
        for (i = ((flag1) ? 1 : 0); i < j; i++)
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

    public final int decodeBase64Char(char c)
    {
        if (c <= '\177')
        {
            return _asciiToBase64[c];
        } else
        {
            return -1;
        }
    }

    public final int decodeBase64Char(int i)
    {
        if (i <= 127)
        {
            return _asciiToBase64[i];
        } else
        {
            return -1;
        }
    }

    public final String encode(byte abyte0[], boolean flag)
    {
        int l = abyte0.length;
        StringBuilder stringbuilder = new StringBuilder((l >> 2) + l + (l >> 3));
        if (flag)
        {
            stringbuilder.append('"');
        }
        int j = getMaxLineLength();
        int i = 0;
        j >>= 2;
        int j1;
        for (; i <= l - 3; i = j1 + 1)
        {
            int l1 = i + 1;
            i = abyte0[i];
            j1 = l1 + 1;
            encodeBase64Chunk(stringbuilder, (i << 8 | abyte0[l1] & 0xff) << 8 | abyte0[j1] & 0xff);
            j--;
            i = j;
            if (j <= 0)
            {
                stringbuilder.append('\\');
                stringbuilder.append('n');
                i = getMaxLineLength() >> 2;
            }
            j = i;
        }

        int k1 = l - i;
        if (k1 > 0)
        {
            int i1 = abyte0[i] << 16;
            int k = i1;
            if (k1 == 2)
            {
                k = i1 | (abyte0[i + 1] & 0xff) << 8;
            }
            encodeBase64Partial(stringbuilder, k, k1);
        }
        if (flag)
        {
            stringbuilder.append('"');
        }
        return stringbuilder.toString();
    }

    public final int encodeBase64Chunk(int i, char ac[], int j)
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

    public final void encodeBase64Chunk(StringBuilder stringbuilder, int i)
    {
        stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i >> 6 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i & 0x3f]);
    }

    public final int encodeBase64Partial(int i, int j, char ac[], int k)
    {
        int l = k + 1;
        ac[k] = _base64ToAsciiC[i >> 18 & 0x3f];
        k = l + 1;
        ac[l] = _base64ToAsciiC[i >> 12 & 0x3f];
        if (_usesPadding)
        {
            int i1 = k + 1;
            char c;
            if (j == 2)
            {
                c = _base64ToAsciiC[i >> 6 & 0x3f];
            } else
            {
                c = _paddingChar;
            }
            ac[k] = c;
            ac[i1] = _paddingChar;
            return i1 + 1;
        }
        if (j == 2)
        {
            ac[k] = _base64ToAsciiC[i >> 6 & 0x3f];
            return k + 1;
        } else
        {
            return k;
        }
    }

    public final void encodeBase64Partial(StringBuilder stringbuilder, int i, int j)
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

    public final int getMaxLineLength()
    {
        return _maxLineLength;
    }

    public final char getPaddingChar()
    {
        return _paddingChar;
    }

    public final String toString()
    {
        return _name;
    }

    public final boolean usesPadding()
    {
        return _usesPadding;
    }

    public final boolean usesPaddingChar(char c)
    {
        return c == _paddingChar;
    }

    public final boolean usesPaddingChar(int i)
    {
        return i == _paddingChar;
    }
}
