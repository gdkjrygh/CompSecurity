// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            CharTypes

public final class JsonStringEncoder
{

    private static final byte HEX_BYTES[] = CharTypes.copyHexBytes();
    private static final char HEX_CHARS[] = CharTypes.copyHexChars();
    private static final int INT_0 = 48;
    private static final int INT_BACKSLASH = 92;
    private static final int INT_U = 117;
    private static final int SURR1_FIRST = 55296;
    private static final int SURR1_LAST = 56319;
    private static final int SURR2_FIRST = 56320;
    private static final int SURR2_LAST = 57343;
    protected static final ThreadLocal _threadEncoder = new ThreadLocal();
    protected ByteArrayBuilder _byteBuilder;
    protected final char _quoteBuffer[] = new char[6];
    protected TextBuffer _textBuffer;

    public JsonStringEncoder()
    {
        _quoteBuffer[0] = '\\';
        _quoteBuffer[2] = '0';
        _quoteBuffer[3] = '0';
    }

    private int _appendByteEscape(int i, int j, ByteArrayBuilder bytearraybuilder, int k)
    {
        bytearraybuilder.setCurrentSegmentLength(k);
        bytearraybuilder.append(92);
        if (j < 0)
        {
            bytearraybuilder.append(117);
            if (i > 255)
            {
                j = i >> 8;
                bytearraybuilder.append(HEX_BYTES[j >> 4]);
                bytearraybuilder.append(HEX_BYTES[j & 0xf]);
                i &= 0xff;
            } else
            {
                bytearraybuilder.append(48);
                bytearraybuilder.append(48);
            }
            bytearraybuilder.append(HEX_BYTES[i >> 4]);
            bytearraybuilder.append(HEX_BYTES[i & 0xf]);
        } else
        {
            bytearraybuilder.append((byte)j);
        }
        return bytearraybuilder.getCurrentSegmentLength();
    }

    private int _appendNamedEscape(int i, char ac[])
    {
        ac[1] = (char)i;
        return 2;
    }

    private int _appendNumericEscape(int i, char ac[])
    {
        ac[1] = 'u';
        ac[4] = HEX_CHARS[i >> 4];
        ac[5] = HEX_CHARS[i & 0xf];
        return 6;
    }

    private int _convertSurrogate(int i, int j)
    {
        if (j < 56320 || j > 57343)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(i)).append(", second 0x").append(Integer.toHexString(j)).append("; illegal combination").toString());
        } else
        {
            return 0x10000 + (i - 55296 << 10) + (j - 56320);
        }
    }

    private void _throwIllegalSurrogate(int i)
    {
        if (i > 0x10ffff)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output; max is 0x10FFFF as per RFC 4627").toString());
        }
        if (i >= 55296)
        {
            if (i <= 56319)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unmatched first part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString());
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unmatched second part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString());
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output").toString());
        }
    }

    public static JsonStringEncoder getInstance()
    {
        Object obj = (SoftReference)_threadEncoder.get();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (JsonStringEncoder)((SoftReference) (obj)).get();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new JsonStringEncoder();
            _threadEncoder.set(new SoftReference(obj1));
        }
        return ((JsonStringEncoder) (obj1));
    }

    public byte[] encodeAsUTF8(String s)
    {
        byte abyte0[];
        ByteArrayBuilder bytearraybuilder1;
        int i;
        int j;
        int k;
        int j2;
        ByteArrayBuilder bytearraybuilder = _byteBuilder;
        bytearraybuilder1 = bytearraybuilder;
        if (bytearraybuilder == null)
        {
            bytearraybuilder1 = new ByteArrayBuilder(null);
            _byteBuilder = bytearraybuilder1;
        }
        j2 = s.length();
        i = 0;
        abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
        k = abyte0.length;
        j = 0;
_L7:
        if (j >= j2) goto _L2; else goto _L1
_L1:
        int l;
        l = s.charAt(j);
        j++;
_L5:
        int i1;
        if (l > 127)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = k;
        int l1 = i;
        if (i >= k)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            i1 = abyte0.length;
            l1 = 0;
        }
        i = l1 + 1;
        abyte0[l1] = (byte)l;
        if (j < j2) goto _L3; else goto _L2
_L2:
        return _byteBuilder.completeAndCoalesce(i);
_L3:
        l = s.charAt(j);
        j++;
        k = i1;
        if (true) goto _L5; else goto _L4
_L4:
        int j1;
        int i2;
        if (i >= k)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            i = abyte0.length;
            k = 0;
        } else
        {
            int k1 = i;
            i = k;
            k = k1;
        }
        if (l >= 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        i2 = k + 1;
        abyte0[k] = (byte)(l >> 6 | 0xc0);
        j1 = j;
        k = i2;
        j = i;
        i = j1;
        j1 = l;
        l = j;
        i2 = k;
        if (k >= j)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            l = abyte0.length;
            i2 = 0;
        }
        abyte0[i2] = (byte)(j1 & 0x3f | 0x80);
        j1 = i2 + 1;
        j = i;
        k = l;
        i = j1;
        if (true) goto _L7; else goto _L6
_L6:
        if (l < 55296 || l > 57343)
        {
            i2 = k + 1;
            abyte0[k] = (byte)(l >> 12 | 0xe0);
            k = i;
            j1 = i2;
            if (i2 >= i)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                k = abyte0.length;
                j1 = 0;
            }
            abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
            i2 = j1 + 1;
            i = j;
            j1 = l;
            j = k;
            k = i2;
        } else
        {
            if (l > 56319)
            {
                _throwIllegalSurrogate(l);
            }
            if (j >= j2)
            {
                _throwIllegalSurrogate(l);
            }
            i2 = j + 1;
            j1 = _convertSurrogate(l, s.charAt(j));
            if (j1 > 0x10ffff)
            {
                _throwIllegalSurrogate(j1);
            }
            l = k + 1;
            abyte0[k] = (byte)(j1 >> 18 | 0xf0);
            j = i;
            k = l;
            if (l >= i)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                j = abyte0.length;
                k = 0;
            }
            i = k + 1;
            abyte0[k] = (byte)(j1 >> 12 & 0x3f | 0x80);
            if (i >= j)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                j = abyte0.length;
                i = 0;
            }
            abyte0[i] = (byte)(j1 >> 6 & 0x3f | 0x80);
            k = i + 1;
            i = i2;
        }
        break MISSING_BLOCK_LABEL_219;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public char[] quoteAsString(String s)
    {
        char ac[];
        TextBuffer textbuffer1;
        int ai[];
        int i;
        int j;
        int l;
        int i1;
        TextBuffer textbuffer = _textBuffer;
        textbuffer1 = textbuffer;
        if (textbuffer == null)
        {
            textbuffer1 = new TextBuffer(null);
            _textBuffer = textbuffer1;
        }
        ac = textbuffer1.emptyAndGetCurrentSegment();
        ai = CharTypes.get7BitOutputEscapes();
        l = ai.length;
        j = 0;
        i1 = s.length();
        i = 0;
_L3:
        int k = i;
        if (j >= i1) goto _L2; else goto _L1
_L1:
label0:
        {
            char c = s.charAt(j);
            if (c >= l || ai[c] == 0)
            {
                break label0;
            }
            k = s.charAt(j);
            int j1 = ai[k];
            char ac1[];
            if (j1 < 0)
            {
                k = _appendNumericEscape(k, _quoteBuffer);
            } else
            {
                k = _appendNamedEscape(j1, _quoteBuffer);
            }
            if (i + k > ac.length)
            {
                j1 = ac.length - i;
                if (j1 > 0)
                {
                    System.arraycopy(_quoteBuffer, 0, ac, i, j1);
                }
                ac = textbuffer1.finishCurrentSegment();
                i = k - j1;
                System.arraycopy(_quoteBuffer, j1, ac, 0, i);
            } else
            {
                System.arraycopy(_quoteBuffer, 0, ac, i, k);
                i += k;
            }
            j++;
        }
        if (true) goto _L3; else goto _L2
        k = i;
        ac1 = ac;
        if (i >= ac.length)
        {
            ac1 = textbuffer1.finishCurrentSegment();
            k = 0;
        }
        i = k + 1;
        ac1[k] = c;
        j++;
        if (j < i1)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        k = i;
_L2:
        textbuffer1.setCurrentLength(k);
        return textbuffer1.contentsAsArray();
        ac = ac1;
          goto _L1
    }

    public byte[] quoteAsUTF8(String s)
    {
        byte abyte0[];
        ByteArrayBuilder bytearraybuilder1;
        int i;
        int j;
        int i1;
        ByteArrayBuilder bytearraybuilder = _byteBuilder;
        bytearraybuilder1 = bytearraybuilder;
        if (bytearraybuilder == null)
        {
            bytearraybuilder1 = new ByteArrayBuilder(null);
            _byteBuilder = bytearraybuilder1;
        }
        j = 0;
        i1 = s.length();
        i = 0;
        abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
_L8:
        int k = i;
        if (j >= i1) goto _L2; else goto _L1
_L1:
        byte abyte1[];
        int ai[];
        ai = CharTypes.get7BitOutputEscapes();
        abyte1 = abyte0;
_L6:
        int l;
        l = s.charAt(j);
        if (l > 127 || ai[l] != 0)
        {
            abyte0 = abyte1;
            k = i;
            if (i >= abyte1.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                k = 0;
            }
            i = j + 1;
            l = s.charAt(j);
            if (l > 127)
            {
                break; /* Loop/switch isn't completed */
            }
            k = _appendByteEscape(l, ai[l], bytearraybuilder1, k);
            abyte0 = bytearraybuilder1.getCurrentSegment();
            j = i;
            i = k;
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = abyte1;
        k = i;
        if (i >= abyte1.length)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            k = 0;
        }
        i = k + 1;
        abyte0[k] = (byte)l;
        j++;
        if (j < i1) goto _L4; else goto _L3
_L3:
        k = i;
_L2:
        return _byteBuilder.completeAndCoalesce(k);
_L4:
        abyte1 = abyte0;
        if (true) goto _L6; else goto _L5
_L5:
        if (l > 2047)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[k] = (byte)(l >> 6 | 0xc0);
        l = l & 0x3f | 0x80;
        j = k + 1;
        k = l;
_L9:
        byte abyte2[] = abyte0;
        l = j;
        if (j >= abyte0.length)
        {
            abyte2 = bytearraybuilder1.finishCurrentSegment();
            l = 0;
        }
        abyte2[l] = (byte)k;
        k = l + 1;
        j = i;
        abyte0 = abyte2;
        i = k;
        if (true) goto _L8; else goto _L7
_L7:
        if (l < 55296 || l > 57343)
        {
            j = k + 1;
            abyte0[k] = (byte)(l >> 12 | 0xe0);
            if (j >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                j = 0;
            }
            abyte0[j] = (byte)(l >> 6 & 0x3f | 0x80);
            k = l & 0x3f | 0x80;
            j++;
        } else
        {
            if (l > 56319)
            {
                _throwIllegalSurrogate(l);
            }
            if (i >= i1)
            {
                _throwIllegalSurrogate(l);
            }
            j = i + 1;
            l = _convertSurrogate(l, s.charAt(i));
            if (l > 0x10ffff)
            {
                _throwIllegalSurrogate(l);
            }
            i = k + 1;
            abyte0[k] = (byte)(l >> 18 | 0xf0);
            if (i >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            }
            k = i + 1;
            abyte0[i] = (byte)(l >> 12 & 0x3f | 0x80);
            if (k >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            } else
            {
                i = k;
            }
            abyte0[i] = (byte)(l >> 6 & 0x3f | 0x80);
            k = l & 0x3f | 0x80;
            l = i + 1;
            i = j;
            j = l;
        }
          goto _L9
        if (true) goto _L8; else goto _L10
_L10:
    }

}
