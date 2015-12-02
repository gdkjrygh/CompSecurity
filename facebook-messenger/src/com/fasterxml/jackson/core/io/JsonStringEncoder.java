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

    private int _appendSingleEscape(int i, char ac[])
    {
        if (i < 0)
        {
            i = -(i + 1);
            ac[1] = 'u';
            ac[4] = HEX_CHARS[i >> 4];
            ac[5] = HEX_CHARS[i & 0xf];
            return 6;
        } else
        {
            ac[1] = (char)i;
            return 2;
        }
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
        int k2;
        ByteArrayBuilder bytearraybuilder = _byteBuilder;
        bytearraybuilder1 = bytearraybuilder;
        if (bytearraybuilder == null)
        {
            bytearraybuilder1 = new ByteArrayBuilder(null);
            _byteBuilder = bytearraybuilder1;
        }
        k2 = s.length();
        abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
        k = abyte0.length;
        i = 0;
        j = 0;
_L7:
        if (j >= k2) goto _L2; else goto _L1
_L1:
        int l;
        int i1 = j + 1;
        char c = s.charAt(j);
        l = k;
        j = i1;
        k = c;
_L5:
        int j1;
        if (k > 127)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = l;
        int i2 = i;
        if (i >= l)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            j1 = abyte0.length;
            i2 = 0;
        }
        i = i2 + 1;
        abyte0[i2] = (byte)k;
        if (j < k2) goto _L3; else goto _L2
_L2:
        return _byteBuilder.completeAndCoalesce(i);
_L3:
        k = s.charAt(j);
        j++;
        l = j1;
        if (true) goto _L5; else goto _L4
_L4:
        int k1;
        int j2;
        if (i >= l)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            i = abyte0.length;
            l = 0;
        } else
        {
            int l1 = i;
            i = l;
            l = l1;
        }
        if (k >= 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = l + 1;
        abyte0[l] = (byte)(k >> 6 | 0xc0);
        l = k;
        k = k1;
        k1 = i;
        j2 = k;
        if (k >= i)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            k1 = abyte0.length;
            j2 = 0;
        }
        abyte0[j2] = (byte)(l & 0x3f | 0x80);
        k = k1;
        i = j2 + 1;
        if (true) goto _L7; else goto _L6
_L6:
        if (k < 55296 || k > 57343)
        {
            j2 = l + 1;
            abyte0[l] = (byte)(k >> 12 | 0xe0);
            l = i;
            k1 = j2;
            if (j2 >= i)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                l = abyte0.length;
                k1 = 0;
            }
            abyte0[k1] = (byte)(k >> 6 & 0x3f | 0x80);
            j2 = k1 + 1;
            k1 = k;
            i = l;
            k = j2;
            l = k1;
        } else
        {
            if (k > 56319)
            {
                _throwIllegalSurrogate(k);
            }
            if (j >= k2)
            {
                _throwIllegalSurrogate(k);
            }
            k1 = _convertSurrogate(k, s.charAt(j));
            if (k1 > 0x10ffff)
            {
                _throwIllegalSurrogate(k1);
            }
            j2 = l + 1;
            abyte0[l] = (byte)(k1 >> 18 | 0xf0);
            k = i;
            l = j2;
            if (j2 >= i)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                k = abyte0.length;
                l = 0;
            }
            i = l + 1;
            abyte0[l] = (byte)(k1 >> 12 & 0x3f | 0x80);
            if (i >= k)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = abyte0.length;
                k = 0;
            } else
            {
                l = i;
                i = k;
                k = l;
            }
            abyte0[k] = (byte)(k1 >> 6 & 0x3f | 0x80);
            k++;
            l = k1;
            j++;
        }
        break MISSING_BLOCK_LABEL_219;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public char[] quoteAsString(String s)
    {
        TextBuffer textbuffer = _textBuffer;
        TextBuffer textbuffer1 = textbuffer;
        if (textbuffer == null)
        {
            textbuffer1 = new TextBuffer(null);
            _textBuffer = textbuffer1;
        }
        char ac[] = textbuffer1.emptyAndGetCurrentSegment();
        int ai[] = CharTypes.get7BitOutputEscapes();
        int i1 = ai.length;
        int j1 = s.length();
        int i = 0;
        int j = 0;
label0:
        do
        {
            int k = i;
            if (j < j1)
            {
                do
                {
                    char c = s.charAt(j);
                    if (c < i1 && ai[c] != 0)
                    {
                        int l = _appendSingleEscape(ai[s.charAt(j)], _quoteBuffer);
                        if (i + l > ac.length)
                        {
                            k = ac.length - i;
                            if (k > 0)
                            {
                                System.arraycopy(_quoteBuffer, 0, ac, i, k);
                            }
                            ac = textbuffer1.finishCurrentSegment();
                            i = l - k;
                            System.arraycopy(_quoteBuffer, k, ac, 0, i);
                        } else
                        {
                            System.arraycopy(_quoteBuffer, 0, ac, i, l);
                            i += l;
                        }
                        j++;
                        continue label0;
                    }
                    if (i >= ac.length)
                    {
                        ac = textbuffer1.finishCurrentSegment();
                        i = 0;
                    }
                    k = i + 1;
                    ac[i] = c;
                    l = j + 1;
                    i = k;
                    j = l;
                } while (l < j1);
            }
            textbuffer1.setCurrentLength(k);
            return textbuffer1.contentsAsArray();
        } while (true);
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
        i1 = s.length();
        abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
        i = 0;
        j = 0;
_L2:
        int k;
        int l;
label0:
        {
            k = i;
            if (j < i1)
            {
                int ai[] = CharTypes.get7BitOutputEscapes();
                byte abyte1[] = abyte0;
                do
                {
                    l = s.charAt(j);
                    if (l > 127 || ai[l] != 0)
                    {
                        abyte0 = abyte1;
                        l = i;
                        if (i >= abyte1.length)
                        {
                            abyte0 = bytearraybuilder1.finishCurrentSegment();
                            l = 0;
                        }
                        k = j + 1;
                        j = s.charAt(j);
                        if (j <= 127)
                        {
                            i = _appendByteEscape(j, ai[j], bytearraybuilder1, l);
                            abyte0 = bytearraybuilder1.getCurrentSegment();
                            j = k;
                            continue; /* Loop/switch isn't completed */
                        }
                        break label0;
                    }
                    if (i >= abyte1.length)
                    {
                        abyte1 = bytearraybuilder1.finishCurrentSegment();
                        i = 0;
                    }
                    k = i + 1;
                    abyte1[i] = (byte)l;
                    l = j + 1;
                    i = k;
                    j = l;
                } while (l < i1);
            }
            return _byteBuilder.completeAndCoalesce(k);
        }
        if (j > 2047)
        {
            break; /* Loop/switch isn't completed */
        }
        i = l + 1;
        abyte0[l] = (byte)(j >> 6 | 0xc0);
        j = j & 0x3f | 0x80;
_L3:
        byte abyte2[] = abyte0;
        l = i;
        if (i >= abyte0.length)
        {
            abyte2 = bytearraybuilder1.finishCurrentSegment();
            l = 0;
        }
        abyte2[l] = (byte)j;
        abyte0 = abyte2;
        j = k;
        i = l + 1;
        if (true) goto _L2; else goto _L1
_L1:
        if (j < 55296 || j > 57343)
        {
            i = l + 1;
            abyte0[l] = (byte)(j >> 12 | 0xe0);
            if (i >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            }
            l = i + 1;
            abyte0[i] = (byte)(j >> 6 & 0x3f | 0x80);
            j = j & 0x3f | 0x80;
            i = l;
        } else
        {
            if (j > 56319)
            {
                _throwIllegalSurrogate(j);
            }
            if (k >= i1)
            {
                _throwIllegalSurrogate(j);
            }
            int j1 = _convertSurrogate(j, s.charAt(k));
            if (j1 > 0x10ffff)
            {
                _throwIllegalSurrogate(j1);
            }
            i = l + 1;
            abyte0[l] = (byte)(j1 >> 18 | 0xf0);
            if (i >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            }
            j = i + 1;
            abyte0[i] = (byte)(j1 >> 12 & 0x3f | 0x80);
            if (j >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            } else
            {
                i = j;
            }
            l = i + 1;
            abyte0[i] = (byte)(j1 >> 6 & 0x3f | 0x80);
            k++;
            j = j1 & 0x3f | 0x80;
            i = l;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

}
