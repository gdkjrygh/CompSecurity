// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;

public final class ByteMatrix
{

    private final byte bytes[][];
    private final int height;
    private final int width;

    public ByteMatrix(int i, int j)
    {
        bytes = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j, i
        });
        width = i;
        height = j;
    }

    public final void clear(byte byte0)
    {
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                bytes[i][j] = byte0;
            }

        }

    }

    public final byte get(int i, int j)
    {
        return bytes[j][i];
    }

    public final byte[][] getArray()
    {
        return bytes;
    }

    public final int getHeight()
    {
        return height;
    }

    public final int getWidth()
    {
        return width;
    }

    public final void set(int i, int j, int k)
    {
        bytes[j][i] = (byte)k;
    }

    public final void set(int i, int j, boolean flag)
    {
        byte abyte0[] = bytes[j];
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        abyte0[i] = (byte)j;
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder(width * 2 * height + 2);
        i = 0;
_L5:
        int j;
        if (i >= height)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
_L2:
        if (j >= width)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        switch (bytes[i][j])
        {
        default:
            stringbuilder.append("  ");
            break;

        case 0: // '\0'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_96;
        }
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        stringbuilder.append(" 0");
          goto _L3
        stringbuilder.append(" 1");
          goto _L3
        stringbuilder.append('\n');
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return stringbuilder.toString();
    }
}
