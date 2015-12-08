// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            d

public class SortedStringArray
    implements Serializable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x57a435591438bbdeL;
    private final CharBuffer chars;
    private final int offSet;
    private final int size;
    private final IntBuffer startPoss;

    public SortedStringArray(int i, IntBuffer intbuffer, CharBuffer charbuffer, int j)
    {
        size = i;
        startPoss = intbuffer;
        chars = charbuffer;
        offSet = j;
    }

    public SortedStringArray(int i, int ai[], char ac[], int j)
    {
        this(i, IntBuffer.wrap(ai), CharBuffer.wrap(ac), j);
    }

    public SortedStringArray(String as[], boolean flag)
    {
        this(as, flag, 0);
    }

    public SortedStringArray(String as[], boolean flag, int i)
    {
        if (!flag)
        {
            Arrays.sort(as);
        }
        offSet = i;
        i = 0;
        int j = 0;
        for (; i < as.length; i++)
        {
            j += as[i].length();
        }

        size = as.length;
        startPoss = IntBuffer.wrap(new int[size]);
        chars = CharBuffer.wrap(new char[j]);
        j = 0;
        for (i = 0; i < size; i++)
        {
            startPoss.put(i, j);
            String s = as[i];
            for (int k = 0; k < s.length();)
            {
                chars.put(j, s.charAt(k));
                k++;
                j++;
            }

        }

    }

    public static SortedStringArray readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        int j = bytebuffer.getInt();
        int k = bytebuffer.getInt();
        IntBuffer intbuffer = d.a(bytebuffer, k).asIntBuffer();
        bytebuffer.position(k + bytebuffer.position());
        k = bytebuffer.getInt();
        CharBuffer charbuffer = d.a(bytebuffer, k).asCharBuffer();
        bytebuffer.position(k + bytebuffer.position());
        return new SortedStringArray(i, intbuffer, charbuffer, j);
    }

    public boolean contains(String s)
    {
        return getPos(s) != -1;
    }

    public String[] getAllWords()
    {
        String as[] = new String[size];
        for (int i = 0; i < size; i++)
        {
            as[i] = getWord(offSet + i);
        }

        return as;
    }

    public int getPos(String s)
    {
        int j = size;
        int i;
        for (i = 0; i < j;)
        {
            int k = (j - i) / 2 + i;
            if (s.compareTo(getWord(offSet + k)) > 0)
            {
                i = k + 1;
            } else
            {
                j = k;
            }
        }

        if (i >= size || getWord(offSet + i).compareTo(s) != 0)
        {
            i = -1;
        }
        if (i < 0)
        {
            return i;
        } else
        {
            return i + offSet;
        }
    }

    public String getWord(int i)
    {
        int k = i - offSet;
        if (k < 0 || k >= size)
        {
            return null;
        }
        int j = startPoss.get(k);
        i = chars.limit();
        if (k < size - 1)
        {
            i = startPoss.get(k + 1);
        }
        k = i - j;
        char ac[] = new char[k];
        for (i = 0; i < k; i++)
        {
            ac[i] = chars.get(j + i);
        }

        return new String(ac);
    }

    public int maxPos()
    {
        return (size + offSet) - 1;
    }

    public int size()
    {
        return size;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        boolean flag = false;
        bytebuffer.putInt(size);
        bytebuffer.putInt(offSet);
        bytebuffer.putInt((startPoss.limit() << 5) / 8);
        for (int i = 0; i < startPoss.limit(); i++)
        {
            bytebuffer.putInt(startPoss.get(i));
        }

        bytebuffer.putInt((chars.limit() << 4) / 8);
        for (int j = ((flag) ? 1 : 0); j < chars.limit(); j++)
        {
            bytebuffer.putChar(chars.get(j));
        }

    }

}
