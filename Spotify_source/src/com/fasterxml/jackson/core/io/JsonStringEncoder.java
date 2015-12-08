// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            CharTypes, UTF8Writer

public final class JsonStringEncoder
{

    private static final byte HB[] = CharTypes.copyHexBytes();
    private static final char HC[] = CharTypes.copyHexChars();
    protected static final ThreadLocal _threadEncoder = new ThreadLocal();
    protected ByteArrayBuilder _bytes;
    protected final char _qbuf[] = new char[6];
    protected TextBuffer _text;

    public JsonStringEncoder()
    {
        _qbuf[0] = '\\';
        _qbuf[2] = '0';
        _qbuf[3] = '0';
    }

    private int _appendByte(int i, int j, ByteArrayBuilder bytearraybuilder, int k)
    {
        bytearraybuilder.setCurrentSegmentLength(k);
        bytearraybuilder.append(92);
        if (j < 0)
        {
            bytearraybuilder.append(117);
            if (i > 255)
            {
                j = i >> 8;
                bytearraybuilder.append(HB[j >> 4]);
                bytearraybuilder.append(HB[j & 0xf]);
                i &= 0xff;
            } else
            {
                bytearraybuilder.append(48);
                bytearraybuilder.append(48);
            }
            bytearraybuilder.append(HB[i >> 4]);
            bytearraybuilder.append(HB[i & 0xf]);
        } else
        {
            bytearraybuilder.append((byte)j);
        }
        return bytearraybuilder.getCurrentSegmentLength();
    }

    private int _appendNamed(int i, char ac[])
    {
        ac[1] = (char)i;
        return 2;
    }

    private int _appendNumeric(int i, char ac[])
    {
        ac[1] = 'u';
        ac[4] = HC[i >> 4];
        ac[5] = HC[i & 0xf];
        return 6;
    }

    private static int _convert(int i, int j)
    {
        if (j < 56320 || j > 57343)
        {
            throw new IllegalArgumentException((new StringBuilder("Broken surrogate pair: first char 0x")).append(Integer.toHexString(i)).append(", second 0x").append(Integer.toHexString(j)).append("; illegal combination").toString());
        } else
        {
            return 0x10000 + (i - 55296 << 10) + (j - 56320);
        }
    }

    private static void _illegal(int i)
    {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
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

    public final byte[] encodeAsUTF8(String s)
    {
        byte abyte0[];
        ByteArrayBuilder bytearraybuilder1;
        int i;
        int j;
        int k;
        int l3;
        ByteArrayBuilder bytearraybuilder = _bytes;
        bytearraybuilder1 = bytearraybuilder;
        if (bytearraybuilder == null)
        {
            bytearraybuilder1 = new ByteArrayBuilder(null);
            _bytes = bytearraybuilder1;
        }
        l3 = s.length();
        abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
        k = abyte0.length;
        i = 0;
        j = 0;
_L7:
        if (j >= l3) goto _L2; else goto _L1
_L1:
        int l;
        int i1 = j + 1;
        char c = s.charAt(j);
        l = k;
        j = i1;
        k = c;
_L6:
        if (k > 127) goto _L4; else goto _L3
_L3:
        int j1;
        j1 = l;
        int l2 = i;
        if (i >= l)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            j1 = abyte0.length;
            l2 = 0;
        }
        i = l2 + 1;
        abyte0[l2] = (byte)k;
        if (j >= l3) goto _L2; else goto _L5
_L5:
        k = s.charAt(j);
        j++;
        l = j1;
          goto _L6
_L4:
        int l1;
        int i3;
        if (i >= l)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            i = abyte0.length;
            l = 0;
        } else
        {
            int k2 = i;
            i = l;
            l = k2;
        }
        if (k < 2048)
        {
            int k1 = l + 1;
            abyte0[l] = (byte)(k >> 6 | 0xc0);
            l = k;
            k = k1;
        } else
        if (k < 55296 || k > 57343)
        {
            int j3 = l + 1;
            abyte0[l] = (byte)(k >> 12 | 0xe0);
            l = i;
            int i2 = j3;
            if (j3 >= i)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                l = abyte0.length;
                i2 = 0;
            }
            abyte0[i2] = (byte)(k >> 6 & 0x3f | 0x80);
            j3 = i2 + 1;
            i2 = k;
            i = l;
            k = j3;
            l = i2;
        } else
        {
            if (k > 56319)
            {
                _illegal(k);
            }
            if (j >= l3)
            {
                _illegal(k);
            }
            int j2 = _convert(k, s.charAt(j));
            if (j2 > 0x10ffff)
            {
                _illegal(j2);
            }
            int k3 = l + 1;
            abyte0[l] = (byte)(j2 >> 18 | 0xf0);
            k = i;
            l = k3;
            if (k3 >= i)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                k = abyte0.length;
                l = 0;
            }
            i = l + 1;
            abyte0[l] = (byte)(j2 >> 12 & 0x3f | 0x80);
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
            abyte0[k] = (byte)(j2 >> 6 & 0x3f | 0x80);
            k++;
            l = j2;
            j++;
        }
        l1 = i;
        i3 = k;
        if (k >= i)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            l1 = abyte0.length;
            i3 = 0;
        }
        abyte0[i3] = (byte)(l & 0x3f | 0x80);
        k = l1;
        i = i3 + 1;
        if (true) goto _L7; else goto _L2
_L2:
        return _bytes.completeAndCoalesce(i);
    }

    public final char[] quoteAsString(String s)
    {
        TextBuffer textbuffer = _text;
        TextBuffer textbuffer1 = textbuffer;
        if (textbuffer == null)
        {
            textbuffer1 = new TextBuffer(null);
            _text = textbuffer1;
        }
        char ac[] = textbuffer1.emptyAndGetCurrentSegment();
        int ai[] = CharTypes.get7BitOutputEscapes();
        int j1 = ai.length;
        int k1 = s.length();
        int i = 0;
        int j = 0;
        do
        {
            int k;
label0:
            {
                k = i;
                if (j < k1)
                {
                    k = j;
                    int l;
                    do
                    {
                        char c = s.charAt(k);
                        if (c < j1 && ai[c] != 0)
                        {
                            break label0;
                        }
                        if (i >= ac.length)
                        {
                            ac = textbuffer1.finishCurrentSegment();
                            i = 0;
                        }
                        j = i + 1;
                        ac[i] = c;
                        l = k + 1;
                        i = j;
                        k = l;
                    } while (l < k1);
                    k = j;
                }
                textbuffer1.setCurrentLength(k);
                return textbuffer1.contentsAsArray();
            }
            j = k + 1;
            k = s.charAt(k);
            int i1 = ai[k];
            if (i1 < 0)
            {
                k = _appendNumeric(k, _qbuf);
            } else
            {
                k = _appendNamed(i1, _qbuf);
            }
            if (i + k > ac.length)
            {
                i1 = ac.length - i;
                if (i1 > 0)
                {
                    System.arraycopy(_qbuf, 0, ac, i, i1);
                }
                ac = textbuffer1.finishCurrentSegment();
                i = k - i1;
                System.arraycopy(_qbuf, i1, ac, 0, i);
            } else
            {
                System.arraycopy(_qbuf, 0, ac, i, k);
                i += k;
            }
        } while (true);
    }

    public final byte[] quoteAsUTF8(String s)
    {
        byte abyte0[];
        ByteArrayBuilder bytearraybuilder1;
        int i;
        int j;
        int k1;
        ByteArrayBuilder bytearraybuilder = _bytes;
        bytearraybuilder1 = bytearraybuilder;
        if (bytearraybuilder == null)
        {
            bytearraybuilder1 = new ByteArrayBuilder(null);
            _bytes = bytearraybuilder1;
        }
        k1 = s.length();
        abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
        i = 0;
        j = 0;
_L2:
        int l;
        int j1;
        byte abyte1[];
        int ai[];
label0:
        {
            int k = i;
            if (j < k1)
            {
                ai = CharTypes.get7BitOutputEscapes();
                abyte1 = abyte0;
                int i1;
                do
                {
                    i1 = s.charAt(j);
                    if (i1 > '\177' || ai[i1] != 0)
                    {
                        break label0;
                    }
                    if (i >= abyte1.length)
                    {
                        abyte1 = bytearraybuilder1.finishCurrentSegment();
                        i = 0;
                    }
                    k = i + 1;
                    abyte1[i] = (byte)i1;
                    i1 = j + 1;
                    i = k;
                    j = i1;
                } while (i1 < k1);
            }
            return _bytes.completeAndCoalesce(k);
        }
        abyte0 = abyte1;
        j1 = i;
        if (i >= abyte1.length)
        {
            abyte0 = bytearraybuilder1.finishCurrentSegment();
            j1 = 0;
        }
        l = j + 1;
        j = s.charAt(j);
        if (j <= '\177')
        {
            i = _appendByte(j, ai[j], bytearraybuilder1, j1);
            abyte0 = bytearraybuilder1.getCurrentSegment();
            j = l;
            continue; /* Loop/switch isn't completed */
        }
        if (j > 2047)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j1 + 1;
        abyte0[j1] = (byte)(j >> 6 | 0xc0);
        j = j & 0x3f | 0x80;
_L3:
        byte abyte2[] = abyte0;
        j1 = i;
        if (i >= abyte0.length)
        {
            abyte2 = bytearraybuilder1.finishCurrentSegment();
            j1 = 0;
        }
        abyte2[j1] = (byte)j;
        abyte0 = abyte2;
        j = l;
        i = j1 + 1;
        if (true) goto _L2; else goto _L1
_L1:
        if (j < 55296 || j > 57343)
        {
            i = j1 + 1;
            abyte0[j1] = (byte)(j >> 12 | 0xe0);
            if (i >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            }
            j1 = i + 1;
            abyte0[i] = (byte)(j >> 6 & 0x3f | 0x80);
            j = j & 0x3f | 0x80;
            i = j1;
        } else
        {
            if (j > 56319)
            {
                _illegal(j);
            }
            if (l >= k1)
            {
                _illegal(j);
            }
            int l1 = _convert(j, s.charAt(l));
            if (l1 > 0x10ffff)
            {
                _illegal(l1);
            }
            i = j1 + 1;
            abyte0[j1] = (byte)(l1 >> 18 | 0xf0);
            if (i >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            }
            j = i + 1;
            abyte0[i] = (byte)(l1 >> 12 & 0x3f | 0x80);
            if (j >= abyte0.length)
            {
                abyte0 = bytearraybuilder1.finishCurrentSegment();
                i = 0;
            } else
            {
                i = j;
            }
            j1 = i + 1;
            abyte0[i] = (byte)(l1 >> 6 & 0x3f | 0x80);
            l++;
            j = l1 & 0x3f | 0x80;
            i = j1;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

}
