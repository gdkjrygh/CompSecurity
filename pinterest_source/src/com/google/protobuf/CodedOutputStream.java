// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//            ByteString, MessageLite, LazyFieldLite, WireFormat

public final class CodedOutputStream
{

    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
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

    private CodedOutputStream(byte abyte0[], int i, int j)
    {
        totalBytesWritten = 0;
        output = null;
        buffer = abyte0;
        position = i;
        limit = i + j;
    }

    public static int computeBoolSize(int i, boolean flag)
    {
        return computeTagSize(i) + computeBoolSizeNoTag(flag);
    }

    public static int computeBoolSizeNoTag(boolean flag)
    {
        return 1;
    }

    public static int computeByteArraySize(int i, byte abyte0[])
    {
        return computeTagSize(i) + computeByteArraySizeNoTag(abyte0);
    }

    public static int computeByteArraySizeNoTag(byte abyte0[])
    {
        return computeRawVarint32Size(abyte0.length) + abyte0.length;
    }

    public static int computeByteBufferSize(int i, ByteBuffer bytebuffer)
    {
        return computeTagSize(i) + computeByteBufferSizeNoTag(bytebuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer bytebuffer)
    {
        return computeRawVarint32Size(bytebuffer.capacity()) + bytebuffer.capacity();
    }

    public static int computeBytesSize(int i, ByteString bytestring)
    {
        return computeTagSize(i) + computeBytesSizeNoTag(bytestring);
    }

    public static int computeBytesSizeNoTag(ByteString bytestring)
    {
        return computeRawVarint32Size(bytestring.size()) + bytestring.size();
    }

    public static int computeDoubleSize(int i, double d)
    {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeDoubleSizeNoTag(double d)
    {
        return 8;
    }

    public static int computeEnumSize(int i, int j)
    {
        return computeTagSize(i) + computeEnumSizeNoTag(j);
    }

    public static int computeEnumSizeNoTag(int i)
    {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32Size(int i, int j)
    {
        return computeTagSize(i) + computeFixed32SizeNoTag(j);
    }

    public static int computeFixed32SizeNoTag(int i)
    {
        return 4;
    }

    public static int computeFixed64Size(int i, long l)
    {
        return computeTagSize(i) + computeFixed64SizeNoTag(l);
    }

    public static int computeFixed64SizeNoTag(long l)
    {
        return 8;
    }

    public static int computeFloatSize(int i, float f)
    {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeFloatSizeNoTag(float f)
    {
        return 4;
    }

    public static int computeGroupSize(int i, MessageLite messagelite)
    {
        return computeTagSize(i) * 2 + computeGroupSizeNoTag(messagelite);
    }

    public static int computeGroupSizeNoTag(MessageLite messagelite)
    {
        return messagelite.getSerializedSize();
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

    public static int computeInt64Size(int i, long l)
    {
        return computeTagSize(i) + computeInt64SizeNoTag(l);
    }

    public static int computeInt64SizeNoTag(long l)
    {
        return computeRawVarint64Size(l);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyfieldlite)
    {
        return computeTagSize(1) * 2 + computeUInt32Size(2, i) + computeLazyFieldSize(3, lazyfieldlite);
    }

    public static int computeLazyFieldSize(int i, LazyFieldLite lazyfieldlite)
    {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyfieldlite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyfieldlite)
    {
        int i = lazyfieldlite.getSerializedSize();
        return i + computeRawVarint32Size(i);
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messagelite)
    {
        return computeTagSize(1) * 2 + computeUInt32Size(2, i) + computeMessageSize(3, messagelite);
    }

    public static int computeMessageSize(int i, MessageLite messagelite)
    {
        return computeTagSize(i) + computeMessageSizeNoTag(messagelite);
    }

    public static int computeMessageSizeNoTag(MessageLite messagelite)
    {
        int i = messagelite.getSerializedSize();
        return i + computeRawVarint32Size(i);
    }

    static int computePreferredBufferSize(int i)
    {
        int j = i;
        if (i > 4096)
        {
            j = 4096;
        }
        return j;
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString bytestring)
    {
        return computeTagSize(1) * 2 + computeUInt32Size(2, i) + computeBytesSize(3, bytestring);
    }

    public static int computeRawVarint32Size(int i)
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

    public static int computeRawVarint64Size(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    public static int computeSFixed32Size(int i, int j)
    {
        return computeTagSize(i) + computeSFixed32SizeNoTag(j);
    }

    public static int computeSFixed32SizeNoTag(int i)
    {
        return 4;
    }

    public static int computeSFixed64Size(int i, long l)
    {
        return computeTagSize(i) + computeSFixed64SizeNoTag(l);
    }

    public static int computeSFixed64SizeNoTag(long l)
    {
        return 8;
    }

    public static int computeSInt32Size(int i, int j)
    {
        return computeTagSize(i) + computeSInt32SizeNoTag(j);
    }

    public static int computeSInt32SizeNoTag(int i)
    {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long l)
    {
        return computeTagSize(i) + computeSInt64SizeNoTag(l);
    }

    public static int computeSInt64SizeNoTag(long l)
    {
        return computeRawVarint64Size(encodeZigZag64(l));
    }

    public static int computeStringSize(int i, String s)
    {
        return computeTagSize(i) + computeStringSizeNoTag(s);
    }

    public static int computeStringSizeNoTag(String s)
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
            throw new RuntimeException("UTF-8 not supported.", s);
        }
        return j + i;
    }

    public static int computeTagSize(int i)
    {
        return computeRawVarint32Size(WireFormat.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int j)
    {
        return computeTagSize(i) + computeUInt32SizeNoTag(j);
    }

    public static int computeUInt32SizeNoTag(int i)
    {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64Size(int i, long l)
    {
        return computeTagSize(i) + computeUInt64SizeNoTag(l);
    }

    public static int computeUInt64SizeNoTag(long l)
    {
        return computeRawVarint64Size(l);
    }

    public static int computeUnknownGroupSize(int i, MessageLite messagelite)
    {
        return computeGroupSize(i, messagelite);
    }

    public static int computeUnknownGroupSizeNoTag(MessageLite messagelite)
    {
        return computeGroupSizeNoTag(messagelite);
    }

    public static int encodeZigZag32(int i)
    {
        return i << 1 ^ i >> 31;
    }

    public static long encodeZigZag64(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static CodedOutputStream newInstance(OutputStream outputstream)
    {
        return newInstance(outputstream, 4096);
    }

    public static CodedOutputStream newInstance(OutputStream outputstream, int i)
    {
        return new CodedOutputStream(outputstream, new byte[i]);
    }

    public static CodedOutputStream newInstance(ByteBuffer bytebuffer)
    {
        return newInstance(bytebuffer, 4096);
    }

    public static CodedOutputStream newInstance(ByteBuffer bytebuffer, int i)
    {
        return newInstance(((OutputStream) (new ByteBufferOutputStream(bytebuffer))), i);
    }

    public static CodedOutputStream newInstance(byte abyte0[])
    {
        return newInstance(abyte0, 0, abyte0.length);
    }

    public static CodedOutputStream newInstance(byte abyte0[], int i, int j)
    {
        return new CodedOutputStream(abyte0, i, j);
    }

    private void refreshBuffer()
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

    private void writeRawBytesInternal(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.remaining();
        if (limit - position >= i)
        {
            bytebuffer.get(buffer, position, i);
            position = position + i;
            totalBytesWritten = i + totalBytesWritten;
            return;
        }
        int j = limit - position;
        bytebuffer.get(buffer, position, j);
        i -= j;
        position = limit;
        totalBytesWritten = j + totalBytesWritten;
        refreshBuffer();
        while (i > limit) 
        {
            bytebuffer.get(buffer, 0, limit);
            output.write(buffer, 0, limit);
            i -= limit;
            totalBytesWritten = totalBytesWritten + limit;
        }
        bytebuffer.get(buffer, 0, i);
        position = i;
        totalBytesWritten = i + totalBytesWritten;
    }

    public final void checkNoSpaceLeft()
    {
        if (spaceLeft() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public final void flush()
    {
        if (output != null)
        {
            refreshBuffer();
        }
    }

    public final int getTotalBytesWritten()
    {
        return totalBytesWritten;
    }

    public final int spaceLeft()
    {
        if (output == null)
        {
            return limit - position;
        } else
        {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        }
    }

    public final void writeBool(int i, boolean flag)
    {
        writeTag(i, 0);
        writeBoolNoTag(flag);
    }

    public final void writeBoolNoTag(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        writeRawByte(i);
    }

    public final void writeByteArray(int i, byte abyte0[])
    {
        writeTag(i, 2);
        writeByteArrayNoTag(abyte0);
    }

    public final void writeByteArray(int i, byte abyte0[], int j, int k)
    {
        writeTag(i, 2);
        writeByteArrayNoTag(abyte0, j, k);
    }

    public final void writeByteArrayNoTag(byte abyte0[])
    {
        writeRawVarint32(abyte0.length);
        writeRawBytes(abyte0);
    }

    public final void writeByteArrayNoTag(byte abyte0[], int i, int j)
    {
        writeRawVarint32(j);
        writeRawBytes(abyte0, i, j);
    }

    public final void writeByteBuffer(int i, ByteBuffer bytebuffer)
    {
        writeTag(i, 2);
        writeByteBufferNoTag(bytebuffer);
    }

    public final void writeByteBufferNoTag(ByteBuffer bytebuffer)
    {
        writeRawVarint32(bytebuffer.capacity());
        writeRawBytes(bytebuffer);
    }

    public final void writeBytes(int i, ByteString bytestring)
    {
        writeTag(i, 2);
        writeBytesNoTag(bytestring);
    }

    public final void writeBytesNoTag(ByteString bytestring)
    {
        writeRawVarint32(bytestring.size());
        writeRawBytes(bytestring);
    }

    public final void writeDouble(int i, double d)
    {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public final void writeDoubleNoTag(double d)
    {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int j)
    {
        writeTag(i, 0);
        writeEnumNoTag(j);
    }

    public final void writeEnumNoTag(int i)
    {
        writeInt32NoTag(i);
    }

    public final void writeFixed32(int i, int j)
    {
        writeTag(i, 5);
        writeFixed32NoTag(j);
    }

    public final void writeFixed32NoTag(int i)
    {
        writeRawLittleEndian32(i);
    }

    public final void writeFixed64(int i, long l)
    {
        writeTag(i, 1);
        writeFixed64NoTag(l);
    }

    public final void writeFixed64NoTag(long l)
    {
        writeRawLittleEndian64(l);
    }

    public final void writeFloat(int i, float f)
    {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public final void writeFloatNoTag(float f)
    {
        writeRawLittleEndian32(Float.floatToRawIntBits(f));
    }

    public final void writeGroup(int i, MessageLite messagelite)
    {
        writeTag(i, 3);
        writeGroupNoTag(messagelite);
        writeTag(i, 4);
    }

    public final void writeGroupNoTag(MessageLite messagelite)
    {
        messagelite.writeTo(this);
    }

    public final void writeInt32(int i, int j)
    {
        writeTag(i, 0);
        writeInt32NoTag(j);
    }

    public final void writeInt32NoTag(int i)
    {
        if (i >= 0)
        {
            writeRawVarint32(i);
            return;
        } else
        {
            writeRawVarint64(i);
            return;
        }
    }

    public final void writeInt64(int i, long l)
    {
        writeTag(i, 0);
        writeInt64NoTag(l);
    }

    public final void writeInt64NoTag(long l)
    {
        writeRawVarint64(l);
    }

    public final void writeMessage(int i, MessageLite messagelite)
    {
        writeTag(i, 2);
        writeMessageNoTag(messagelite);
    }

    public final void writeMessageNoTag(MessageLite messagelite)
    {
        writeRawVarint32(messagelite.getSerializedSize());
        messagelite.writeTo(this);
    }

    public final void writeMessageSetExtension(int i, MessageLite messagelite)
    {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messagelite);
        writeTag(1, 4);
    }

    public final void writeRawByte(byte byte0)
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

    public final void writeRawByte(int i)
    {
        writeRawByte((byte)i);
    }

    public final void writeRawBytes(ByteString bytestring)
    {
        writeRawBytes(bytestring, 0, bytestring.size());
    }

    public final void writeRawBytes(ByteString bytestring, int i, int j)
    {
        if (limit - position >= j)
        {
            bytestring.copyTo(buffer, i, position, j);
            position = position + j;
        } else
        {
            int k = limit - position;
            bytestring.copyTo(buffer, i, position, k);
            i += k;
            j -= k;
            position = limit;
            totalBytesWritten = k + totalBytesWritten;
            refreshBuffer();
            if (j <= limit)
            {
                bytestring.copyTo(buffer, i, 0, j);
                position = j;
            } else
            {
                bytestring.writeTo(output, i, j);
            }
        }
        totalBytesWritten = totalBytesWritten + j;
    }

    public final void writeRawBytes(ByteBuffer bytebuffer)
    {
        if (bytebuffer.hasArray())
        {
            writeRawBytes(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
            return;
        } else
        {
            bytebuffer = bytebuffer.duplicate();
            bytebuffer.clear();
            writeRawBytesInternal(bytebuffer);
            return;
        }
    }

    public final void writeRawBytes(byte abyte0[])
    {
        writeRawBytes(abyte0, 0, abyte0.length);
    }

    public final void writeRawBytes(byte abyte0[], int i, int j)
    {
        if (limit - position >= j)
        {
            System.arraycopy(abyte0, i, buffer, position, j);
            position = position + j;
        } else
        {
            int k = limit - position;
            System.arraycopy(abyte0, i, buffer, position, k);
            i += k;
            j -= k;
            position = limit;
            totalBytesWritten = k + totalBytesWritten;
            refreshBuffer();
            if (j <= limit)
            {
                System.arraycopy(abyte0, i, buffer, 0, j);
                position = j;
            } else
            {
                output.write(abyte0, i, j);
            }
        }
        totalBytesWritten = totalBytesWritten + j;
    }

    public final void writeRawLittleEndian32(int i)
    {
        writeRawByte(i & 0xff);
        writeRawByte(i >> 8 & 0xff);
        writeRawByte(i >> 16 & 0xff);
        writeRawByte(i >> 24 & 0xff);
    }

    public final void writeRawLittleEndian64(long l)
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

    public final void writeRawMessageSetExtension(int i, ByteString bytestring)
    {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, bytestring);
        writeTag(1, 4);
    }

    public final void writeRawVarint32(int i)
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

    public final void writeRawVarint64(long l)
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

    public final void writeSFixed32(int i, int j)
    {
        writeTag(i, 5);
        writeSFixed32NoTag(j);
    }

    public final void writeSFixed32NoTag(int i)
    {
        writeRawLittleEndian32(i);
    }

    public final void writeSFixed64(int i, long l)
    {
        writeTag(i, 1);
        writeSFixed64NoTag(l);
    }

    public final void writeSFixed64NoTag(long l)
    {
        writeRawLittleEndian64(l);
    }

    public final void writeSInt32(int i, int j)
    {
        writeTag(i, 0);
        writeSInt32NoTag(j);
    }

    public final void writeSInt32NoTag(int i)
    {
        writeRawVarint32(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long l)
    {
        writeTag(i, 0);
        writeSInt64NoTag(l);
    }

    public final void writeSInt64NoTag(long l)
    {
        writeRawVarint64(encodeZigZag64(l));
    }

    public final void writeString(int i, String s)
    {
        writeTag(i, 2);
        writeStringNoTag(s);
    }

    public final void writeStringNoTag(String s)
    {
        s = s.getBytes("UTF-8");
        writeRawVarint32(s.length);
        writeRawBytes(s);
    }

    public final void writeTag(int i, int j)
    {
        writeRawVarint32(WireFormat.makeTag(i, j));
    }

    public final void writeUInt32(int i, int j)
    {
        writeTag(i, 0);
        writeUInt32NoTag(j);
    }

    public final void writeUInt32NoTag(int i)
    {
        writeRawVarint32(i);
    }

    public final void writeUInt64(int i, long l)
    {
        writeTag(i, 0);
        writeUInt64NoTag(l);
    }

    public final void writeUInt64NoTag(long l)
    {
        writeRawVarint64(l);
    }

    public final void writeUnknownGroup(int i, MessageLite messagelite)
    {
        writeGroup(i, messagelite);
    }

    public final void writeUnknownGroupNoTag(MessageLite messagelite)
    {
        writeGroupNoTag(messagelite);
    }

    /* member class not found */
    class ByteBufferOutputStream {}


    /* member class not found */
    class OutOfSpaceException {}

}
