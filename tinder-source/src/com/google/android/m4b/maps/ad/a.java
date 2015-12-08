// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ad;

import java.io.DataInput;
import java.io.EOFException;
import java.io.UTFDataFormatException;

public final class a
    implements DataInput
{

    public int a;
    private byte b[];
    private int c;
    private char d[];

    public a(byte abyte0[])
    {
        b = abyte0;
        c = b.length;
        a = 0;
        d = new char[128];
    }

    private static String a(byte abyte0[], char ac[], int i, int j)
    {
        int k = 0;
        for (int l = 0; l < j;)
        {
            int i1 = l + 1;
            char c1 = (char)abyte0[l + i];
            ac[k] = c1;
            if (c1 < '\200')
            {
                k++;
                l = i1;
            } else
            {
                char c2 = ac[k];
                if ((c2 & 0xe0) == 192)
                {
                    if (i1 >= j)
                    {
                        throw new UTFDataFormatException((new StringBuilder(60)).append("Second byte at ").append(i1).append(" does not match UTF8 Specification").toString());
                    }
                    l = i1 + 1;
                    i1 = abyte0[i + i1];
                    if ((i1 & 0xc0) != 128)
                    {
                        throw new UTFDataFormatException((new StringBuilder(60)).append("Second byte at ").append(l - 1).append(" does not match UTF8 Specification").toString());
                    }
                    ac[k] = (char)(i1 & 0x3f | (c2 & 0x1f) << 6);
                    k++;
                } else
                if ((c2 & 0xf0) == 224)
                {
                    if (i1 + 1 >= j)
                    {
                        throw new UTFDataFormatException((new StringBuilder(59)).append("Third byte at ").append(i1 + 1).append(" does not match UTF8 Specification").toString());
                    }
                    int j1 = i1 + 1;
                    i1 = abyte0[i1 + i];
                    l = j1 + 1;
                    j1 = abyte0[j1 + i];
                    if ((i1 & 0xc0) != 128 || (j1 & 0xc0) != 128)
                    {
                        throw new UTFDataFormatException((new StringBuilder(69)).append("Second or third byte at ").append(l - 2).append(" does not match UTF8 Specification").toString());
                    }
                    ac[k] = (char)((i1 & 0x3f) << 6 | (c2 & 0xf) << 12 | j1 & 0x3f);
                    k++;
                } else
                {
                    throw new UTFDataFormatException((new StringBuilder(54)).append("Input at ").append(i1 - 1).append(" does not match UTF8 Specification").toString());
                }
            }
        }

        return new String(ac, 0, k);
    }

    public final boolean readBoolean()
    {
        byte abyte0[];
        int i;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        i = abyte0[i];
        return i != 0;
    }

    public final byte readByte()
    {
        byte byte0;
        byte abyte0[];
        int i;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        byte0 = abyte0[i];
        return byte0;
    }

    public final char readChar()
    {
        byte abyte0[];
        int i;
        int j;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        i = abyte0[i];
        abyte0 = b;
        j = a;
        a = j + 1;
        j = abyte0[j];
        return (char)(i << 8 | j & 0xff);
    }

    public final double readDouble()
    {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat()
    {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte abyte0[])
    {
        readFully(abyte0, 0, abyte0.length);
    }

    public final void readFully(byte abyte0[], int i, int j)
    {
        if (j == 0)
        {
            return;
        }
        if (i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j > c - a)
        {
            a = c;
            throw new EOFException();
        } else
        {
            System.arraycopy(b, a, abyte0, i, j);
            a = a + j;
            return;
        }
    }

    public final int readInt()
    {
        byte abyte0[];
        int i;
        int j;
        int k;
        int l;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        i = abyte0[i];
        abyte0 = b;
        j = a;
        a = j + 1;
        j = abyte0[j];
        abyte0 = b;
        k = a;
        a = k + 1;
        k = abyte0[k];
        abyte0 = b;
        l = a;
        a = l + 1;
        l = abyte0[l];
        return (i & 0xff) << 24 | (j & 0xff) << 16 | (k & 0xff) << 8 | l & 0xff;
    }

    public final String readLine()
    {
        if (a >= c)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            byte abyte0[] = b;
            int i = a;
            a = i + 1;
            char c1 = (char)abyte0[i];
            if (c1 == '\n')
            {
                return stringbuilder.toString();
            }
            if (c1 == '\r')
            {
                if (a < c && b[a] == 10)
                {
                    a = a + 1;
                }
                return stringbuilder.toString();
            }
            stringbuilder.append(c1);
        } while (a != c);
        return stringbuilder.toString();
    }

    public final long readLong()
    {
        byte abyte0[];
        int i;
        long l;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        l = abyte0[i] & 0xff;
        abyte0 = b;
        i = a;
        a = i + 1;
        l1 = abyte0[i] & 0xff;
        abyte0 = b;
        i = a;
        a = i + 1;
        l2 = abyte0[i] & 0xff;
        abyte0 = b;
        i = a;
        a = i + 1;
        l3 = abyte0[i] & 0xff;
        abyte0 = b;
        i = a;
        a = i + 1;
        l4 = abyte0[i] & 0xff;
        abyte0 = b;
        i = a;
        a = i + 1;
        l5 = abyte0[i] & 0xff;
        abyte0 = b;
        i = a;
        a = i + 1;
        l6 = abyte0[i] & 0xff;
        abyte0 = b;
        i = a;
        a = i + 1;
        i = abyte0[i];
        return l << 56 | l1 << 48 | l2 << 40 | l3 << 32 | l4 << 24 | l5 << 16 | l6 << 8 | (long)(i & 0xff);
    }

    public final short readShort()
    {
        byte abyte0[];
        int i;
        int j;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        i = abyte0[i];
        abyte0 = b;
        j = a;
        a = j + 1;
        j = abyte0[j];
        return (short)(i << 8 | j & 0xff);
    }

    public final String readUTF()
    {
        int i = readUnsignedShort();
        if (i == 0)
        {
            return "";
        }
        if (i > c - a)
        {
            a = c;
            throw new EOFException();
        }
        if (i > d.length)
        {
            d = new char[i];
        }
        String s = a(b, d, a, i);
        a = i + a;
        return s;
    }

    public final int readUnsignedByte()
    {
        byte abyte0[];
        int i;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        i = abyte0[i];
        return i & 0xff;
    }

    public final int readUnsignedShort()
    {
        byte abyte0[];
        int i;
        int j;
        try
        {
            abyte0 = b;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new EOFException();
        }
        i = abyte0[i];
        abyte0 = b;
        j = a;
        a = j + 1;
        j = abyte0[j];
        return (i & 0xff) << 8 | j & 0xff;
    }

    public final int skipBytes(int i)
    {
        int j = i;
        if (i > c - a)
        {
            j = c - a;
        }
        a = a + j;
        return j;
    }
}
