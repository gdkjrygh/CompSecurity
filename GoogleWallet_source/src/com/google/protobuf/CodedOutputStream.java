// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.protobuf:
//            ByteString, WireFormat

public final class CodedOutputStream
{
    public static final class OutOfSpaceException extends IOException
    {

        OutOfSpaceException()
        {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }


    private final byte buffer[];
    private final int limit;
    private final OutputStream output;
    private int position;
    private int totalBytesWritten;

    private CodedOutputStream(OutputStream outputstream, byte abyte0[])
    {
        totalBytesWritten = 0;
        output = outputstream;
        buffer = abyte0;
        position = 0;
        limit = abyte0.length;
    }

    public static CodedOutputStream newInstance(OutputStream outputstream)
    {
        return newInstance(outputstream, 4096);
    }

    private static CodedOutputStream newInstance(OutputStream outputstream, int i)
    {
        return new CodedOutputStream(outputstream, new byte[i]);
    }

    private void refreshBuffer()
        throws IOException
    {
        if (output == null)
        {
            throw new OutOfSpaceException();
        } else
        {
            output.write(buffer, 0, position);
            position = 0;
            return;
        }
    }

    private void writeBytesNoTag(ByteString bytestring)
        throws IOException
    {
        writeRawVarint32(bytestring.size());
        writeRawBytes(bytestring);
    }

    private void writeFixed32NoTag(int i)
        throws IOException
    {
        writeRawLittleEndian32(i);
    }

    private void writeFixed64NoTag(long l)
        throws IOException
    {
        writeRawLittleEndian64(l);
    }

    private void writeRawByte(byte byte0)
        throws IOException
    {
        if (position == limit)
        {
            refreshBuffer();
        }
        byte abyte0[] = buffer;
        int i = position;
        position = i + 1;
        abyte0[i] = byte0;
        totalBytesWritten = totalBytesWritten + 1;
    }

    private void writeRawByte(int i)
        throws IOException
    {
        writeRawByte((byte)i);
    }

    private void writeRawBytes(ByteString bytestring, int i, int j)
        throws IOException
    {
        if (limit - position >= j)
        {
            bytestring.copyTo(buffer, i, position, j);
            position = position + j;
            totalBytesWritten = totalBytesWritten + j;
            return;
        }
        int k = limit - position;
        bytestring.copyTo(buffer, i, position, k);
        i += k;
        j -= k;
        position = limit;
        totalBytesWritten = totalBytesWritten + k;
        refreshBuffer();
        if (j <= limit)
        {
            bytestring.copyTo(buffer, i, 0, j);
            position = j;
        } else
        {
            bytestring.writeTo(output, i, j);
        }
        totalBytesWritten = totalBytesWritten + j;
    }

    private void writeRawLittleEndian32(int i)
        throws IOException
    {
        writeRawByte(i & 0xff);
        writeRawByte(i >> 8 & 0xff);
        writeRawByte(i >> 16 & 0xff);
        writeRawByte(i >>> 24);
    }

    private void writeRawLittleEndian64(long l)
        throws IOException
    {
        writeRawByte((int)l & 0xff);
        writeRawByte((int)(l >> 8) & 0xff);
        writeRawByte((int)(l >> 16) & 0xff);
        writeRawByte((int)(l >> 24) & 0xff);
        writeRawByte((int)(l >> 32) & 0xff);
        writeRawByte((int)(l >> 40) & 0xff);
        writeRawByte((int)(l >> 48) & 0xff);
        writeRawByte((int)(l >> 56) & 0xff);
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

    private void writeRawVarint64(long l)
        throws IOException
    {
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

    private void writeUInt64NoTag(long l)
        throws IOException
    {
        writeRawVarint64(l);
    }

    public final void flush()
        throws IOException
    {
        if (output != null)
        {
            refreshBuffer();
        }
    }

    public final void writeBytes(int i, ByteString bytestring)
        throws IOException
    {
        writeTag(i, 2);
        writeBytesNoTag(bytestring);
    }

    public final void writeFixed32(int i, int j)
        throws IOException
    {
        writeTag(i, 5);
        writeFixed32NoTag(j);
    }

    public final void writeFixed64(int i, long l)
        throws IOException
    {
        writeTag(i, 1);
        writeFixed64NoTag(l);
    }

    public final void writeRawBytes(ByteString bytestring)
        throws IOException
    {
        writeRawBytes(bytestring, 0, bytestring.size());
    }

    public final void writeTag(int i, int j)
        throws IOException
    {
        writeRawVarint32(WireFormat.makeTag(i, j));
    }

    public final void writeUInt64(int i, long l)
        throws IOException
    {
        writeTag(i, 0);
        writeUInt64NoTag(l);
    }
}
