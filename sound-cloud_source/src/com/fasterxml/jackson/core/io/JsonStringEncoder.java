// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            CharTypes

public final class JsonStringEncoder
{

    private static final byte HEX_BYTES[] = CharTypes.copyHexBytes();
    private static final char HEX_CHARS[] = CharTypes.copyHexChars();
    protected static final ThreadLocal _threadEncoder = new ThreadLocal();
    protected final char _quoteBuffer[] = new char[6];
    protected TextBuffer _textBuffer;

    public JsonStringEncoder()
    {
        _quoteBuffer[0] = '\\';
        _quoteBuffer[2] = '0';
        _quoteBuffer[3] = '0';
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

    public final char[] quoteAsString(String s)
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
        int k1 = ai.length;
        int l1 = s.length();
        int i = 0;
        int j = 0;
        do
        {
label0:
            {
                int k = i;
                int i1;
                if (j < l1)
                {
                    do
                    {
                        char c = s.charAt(j);
                        if (c < k1 && ai[c] != 0)
                        {
                            break label0;
                        }
                        if (i >= ac.length)
                        {
                            ac = textbuffer1.finishCurrentSegment();
                            i = 0;
                        }
                        k = i + 1;
                        ac[i] = c;
                        i1 = j + 1;
                        i = k;
                        j = i1;
                    } while (i1 < l1);
                }
                textbuffer1.setCurrentLength(k);
                return textbuffer1.contentsAsArray();
            }
            int l = j + 1;
            int j1 = _appendSingleEscape(ai[s.charAt(j)], _quoteBuffer);
            if (i + j1 > ac.length)
            {
                j = ac.length - i;
                if (j > 0)
                {
                    System.arraycopy(_quoteBuffer, 0, ac, i, j);
                }
                ac = textbuffer1.finishCurrentSegment();
                i = j1 - j;
                System.arraycopy(_quoteBuffer, j, ac, 0, i);
                j = l;
            } else
            {
                System.arraycopy(_quoteBuffer, 0, ac, i, j1);
                i += j1;
                j = l;
            }
        } while (true);
    }

}
