// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
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

    protected void _reportBase64EOF()
        throws IllegalArgumentException
    {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    protected void _reportInvalidBase64(char c, int i, String s)
        throws IllegalArgumentException
    {
        String s1;
        String s2;
        if (c <= ' ')
        {
            s1 = (new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(c)).append(") as character #").append(i + 1).append(" of 4-char base64 unit: can only used between units").toString();
        } else
        if (usesPaddingChar(c))
        {
            s1 = (new StringBuilder()).append("Unexpected padding character ('").append(getPaddingChar()).append("') as character #").append(i + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
        } else
        if (!Character.isDefined(c) || Character.isISOControl(c))
        {
            s1 = (new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(c)).append(") in base64 content").toString();
        } else
        {
            s1 = (new StringBuilder()).append("Illegal character '").append(c).append("' (code 0x").append(Integer.toHexString(c)).append(") in base64 content").toString();
        }
        s2 = s1;
        if (s != null)
        {
            s2 = (new StringBuilder()).append(s1).append(": ").append(s).toString();
        }
        throw new IllegalArgumentException(s2);
    }

    public void decode(String s, ByteArrayBuilder bytearraybuilder)
        throws IllegalArgumentException
    {
        int i;
        int k;
        i = 0;
        k = s.length();
_L4:
        if (i >= k) goto _L2; else goto _L1
_L1:
        char c;
        int j;
        j = i + 1;
        c = s.charAt(i);
        if (j < k) goto _L3; else goto _L2
_L2:
        return;
_L3:
label0:
        {
            if (c <= ' ')
            {
                break label0;
            }
            int l = decodeBase64Char(c);
            if (l < 0)
            {
                _reportInvalidBase64(c, 0, null);
            }
            if (j >= k)
            {
                _reportBase64EOF();
            }
            i = j + 1;
            c = s.charAt(j);
            j = decodeBase64Char(c);
            if (j < 0)
            {
                _reportInvalidBase64(c, 1, null);
            }
            l = l << 6 | j;
            if (i >= k)
            {
                if (!usesPadding())
                {
                    bytearraybuilder.append(l >> 4);
                    return;
                }
                _reportBase64EOF();
            }
            j = i + 1;
            c = s.charAt(i);
            i = decodeBase64Char(c);
            if (i < 0)
            {
                if (i != -2)
                {
                    _reportInvalidBase64(c, 2, null);
                }
                if (j >= k)
                {
                    _reportBase64EOF();
                }
                i = j + 1;
                c = s.charAt(j);
                if (!usesPaddingChar(c))
                {
                    _reportInvalidBase64(c, 3, (new StringBuilder()).append("expected padding character '").append(getPaddingChar()).append("'").toString());
                }
                bytearraybuilder.append(l >> 4);
            } else
            {
                l = l << 6 | i;
                if (j >= k)
                {
                    if (!usesPadding())
                    {
                        bytearraybuilder.appendTwoBytes(l >> 2);
                        return;
                    }
                    _reportBase64EOF();
                }
                i = j + 1;
                char c1 = s.charAt(j);
                j = decodeBase64Char(c1);
                if (j < 0)
                {
                    if (j != -2)
                    {
                        _reportInvalidBase64(c1, 3, null);
                    }
                    bytearraybuilder.appendTwoBytes(l >> 2);
                } else
                {
                    bytearraybuilder.appendThreeBytes(l << 6 | j);
                }
            }
        }
          goto _L4
        i = j;
          goto _L1
    }

    public byte[] decode(String s)
        throws IllegalArgumentException
    {
        ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder();
        decode(s, bytearraybuilder);
        return bytearraybuilder.toByteArray();
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

    public void encodeBase64Chunk(StringBuilder stringbuilder, int i)
    {
        stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i >> 6 & 0x3f]);
        stringbuilder.append(_base64ToAsciiC[i & 0x3f]);
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

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public int getMaxLineLength()
    {
        return _maxLineLength;
    }

    public char getPaddingChar()
    {
        return _paddingChar;
    }

    public int hashCode()
    {
        return _name.hashCode();
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
