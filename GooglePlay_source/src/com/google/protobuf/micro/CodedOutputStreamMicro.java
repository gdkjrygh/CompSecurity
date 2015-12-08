// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.protobuf.micro:
//            MessageMicro, WireFormatMicro

public final class CodedOutputStreamMicro
{
    public static final class OutOfSpaceException extends IOException
    {

        OutOfSpaceException()
        {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }


    private final byte buffer[];
    public final int limit;
    private final OutputStream output = null;
    public int position;

    public CodedOutputStreamMicro(byte abyte0[], int i, int j)
    {
        buffer = abyte0;
        position = 0;
        limit = j + 0;
    }

    public static int computeInt32Size(int i, int j)
    {
        return computeTagSize(i) + computeInt32SizeNoTag(j);
    }

    public static int computeInt32SizeNoTag(int i)
    {
        if (i >= 0)
        {
            return computeRawVarint32Size(i);
        } else
        {
            return 10;
        }
    }

    public static int computeMessageSize(int i, MessageMicro messagemicro)
    {
        i = computeTagSize(i);
        int j = messagemicro.getSerializedSize();
        return i + (j + computeRawVarint32Size(j));
    }

    private static int computeRawVarint32Size(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public static int computeStringSize(int i, String s)
    {
        return computeTagSize(i) + computeStringSizeNoTag(s);
    }

    private static int computeStringSizeNoTag(String s)
    {
        int i;
        int j;
        try
        {
            s = s.getBytes("UTF-8");
            i = computeRawVarint32Size(s.length);
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return i + j;
    }

    public static int computeTagSize(int i)
    {
        return computeRawVarint32Size(WireFormatMicro.makeTag(i, 0));
    }

    private void writeRawByte(int i)
        throws IOException
    {
        byte byte0 = (byte)i;
        if (position == limit)
        {
            throw new OutOfSpaceException();
        } else
        {
            byte abyte0[] = buffer;
            i = position;
            position = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    private void writeRawVarint32(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                writeRawByte(i);
                return;
            }
            writeRawByte(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    private void writeTag(int i, int j)
        throws IOException
    {
        writeRawVarint32(WireFormatMicro.makeTag(i, j));
    }

    public final void writeBool(int i, boolean flag)
        throws IOException
    {
        boolean flag1 = false;
        writeTag(i, 0);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        writeRawByte(i);
    }

    public final void writeInt32(int i, int j)
        throws IOException
    {
        writeTag(i, 0);
        if (j >= 0)
        {
            writeRawVarint32(j);
            return;
        }
        long l = j;
        do
        {
            if ((-128L & l) == 0L)
            {
                writeRawByte((int)l);
                return;
            }
            writeRawByte((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public final void writeMessage(int i, MessageMicro messagemicro)
        throws IOException
    {
        writeTag(i, 2);
        writeRawVarint32(messagemicro.getCachedSize());
        messagemicro.writeTo(this);
    }

    public final void writeString(int i, String s)
        throws IOException
    {
        writeTag(i, 2);
        s = s.getBytes("UTF-8");
        writeRawVarint32(s.length);
        i = s.length;
        if (limit - position >= i)
        {
            System.arraycopy(s, 0, buffer, position, i);
            position = position + i;
            return;
        } else
        {
            i = limit;
            int j = position;
            System.arraycopy(s, 0, buffer, position, i - j);
            position = limit;
            throw new OutOfSpaceException();
        }
    }
}
