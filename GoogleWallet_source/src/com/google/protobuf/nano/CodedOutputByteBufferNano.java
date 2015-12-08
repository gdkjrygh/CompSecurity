// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.protobuf.nano:
//            MessageNano, WireFormatNano

public final class CodedOutputByteBufferNano
{
    public static final class OutOfSpaceException extends IOException
    {

        OutOfSpaceException(int i, int j)
        {
            String s = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
            super((new StringBuilder(String.valueOf(s).length() + 31)).append(s).append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    private final ByteBuffer buffer;

    private CodedOutputByteBufferNano(ByteBuffer bytebuffer)
    {
        buffer = bytebuffer;
    }

    private CodedOutputByteBufferNano(byte abyte0[], int i, int j)
    {
        this(ByteBuffer.wrap(abyte0, i, j));
    }

    public static int computeBoolSize(int i, boolean flag)
    {
        return computeTagSize(i) + computeBoolSizeNoTag(flag);
    }

    private static int computeBoolSizeNoTag(boolean flag)
    {
        return 1;
    }

    public static int computeBytesSize(int i, byte abyte0[])
    {
        return computeTagSize(i) + computeBytesSizeNoTag(abyte0);
    }

    private static int computeBytesSizeNoTag(byte abyte0[])
    {
        return computeRawVarint32Size(abyte0.length) + abyte0.length;
    }

    public static int computeDoubleSize(int i, double d)
    {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    private static int computeDoubleSizeNoTag(double d)
    {
        return 8;
    }

    public static int computeFixed64Size(int i, long l)
    {
        return computeTagSize(i) + computeFixed64SizeNoTag(l);
    }

    private static int computeFixed64SizeNoTag(long l)
    {
        return 8;
    }

    public static int computeFloatSize(int i, float f)
    {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    private static int computeFloatSizeNoTag(float f)
    {
        return 4;
    }

    public static int computeGroupSize(int i, MessageNano messagenano)
    {
        return (computeTagSize(i) << 1) + computeGroupSizeNoTag(messagenano);
    }

    private static int computeGroupSizeNoTag(MessageNano messagenano)
    {
        return messagenano.getSerializedSize();
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

    public static int computeMessageSize(int i, MessageNano messagenano)
    {
        return computeTagSize(i) + computeMessageSizeNoTag(messagenano);
    }

    private static int computeMessageSizeNoTag(MessageNano messagenano)
    {
        int i = messagenano.getSerializedSize();
        return computeRawVarint32Size(i) + i;
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

    private static int computeRawVarint64Size(long l)
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

    public static int computeSInt32Size(int i, int j)
    {
        return computeTagSize(i) + computeSInt32SizeNoTag(j);
    }

    private static int computeSInt32SizeNoTag(int i)
    {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeStringSize(int i, String s)
    {
        return computeTagSize(i) + computeStringSizeNoTag(s);
    }

    public static int computeStringSizeNoTag(String s)
    {
        int i = encodedLength(s);
        return computeRawVarint32Size(i) + i;
    }

    private static int computeTagSize(int i)
    {
        return computeRawVarint32Size(WireFormatNano.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int j)
    {
        return computeTagSize(i) + computeUInt32SizeNoTag(j);
    }

    private static int computeUInt32SizeNoTag(int i)
    {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64Size(int i, long l)
    {
        return computeTagSize(i) + computeUInt64SizeNoTag(l);
    }

    private static int computeUInt64SizeNoTag(long l)
    {
        return computeRawVarint64Size(l);
    }

    private static int encode(CharSequence charsequence, byte abyte0[], int i, int j)
    {
        int i2;
        int j2;
        i2 = charsequence.length();
        boolean flag = false;
        j2 = i + j;
        j = ((flag) ? 1 : 0);
        do
        {
            if (j >= i2 || j + i >= j2)
            {
                break;
            }
            char c2 = charsequence.charAt(j);
            if (c2 >= '\200')
            {
                break;
            }
            abyte0[i + j] = (byte)c2;
            j++;
        } while (true);
        if (j != i2) goto _L2; else goto _L1
_L1:
        int k = i + i2;
_L4:
        return k;
_L2:
        char c;
        i += j;
        do
        {
            k = i;
            if (j >= i2)
            {
                break;
            }
            c = charsequence.charAt(j);
            if (c < '\200' && i < j2)
            {
                int l = i + 1;
                abyte0[i] = (byte)c;
                i = l;
            } else
            if (c < '\u0800' && i <= j2 - 2)
            {
                int i1 = i + 1;
                abyte0[i] = (byte)(c >>> 6 | 0x3c0);
                abyte0[i1] = (byte)(c & 0x3f | 0x80);
                i = i1 + 1;
            } else
            if ((c < '\uD800' || '\uDFFF' < c) && i <= j2 - 3)
            {
                int j1 = i + 1;
                abyte0[i] = (byte)(c >>> 12 | 0x1e0);
                int k2 = j1 + 1;
                abyte0[j1] = (byte)(c >>> 6 & 0x3f | 0x80);
                i = k2 + 1;
                abyte0[k2] = (byte)(c & 0x3f | 0x80);
            } else
            {
label0:
                {
                    char c1;
label1:
                    {
                        if (i > j2 - 4)
                        {
                            break label0;
                        }
                        int k1 = j;
                        if (j + 1 != charsequence.length())
                        {
                            j++;
                            c1 = charsequence.charAt(j);
                            if (Character.isSurrogatePair(c, c1))
                            {
                                break label1;
                            }
                            k1 = j;
                        }
                        throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(k1 - 1).toString());
                    }
                    int l1 = Character.toCodePoint(c, c1);
                    int l2 = i + 1;
                    abyte0[i] = (byte)(l1 >>> 18 | 0xf0);
                    i = l2 + 1;
                    abyte0[l2] = (byte)(l1 >>> 12 & 0x3f | 0x80);
                    l2 = i + 1;
                    abyte0[i] = (byte)(l1 >>> 6 & 0x3f | 0x80);
                    abyte0[l2] = (byte)(l1 & 0x3f | 0x80);
                    i = l2 + 1;
                }
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        throw new ArrayIndexOutOfBoundsException((new StringBuilder(37)).append("Failed writing ").append(c).append(" at index ").append(i).toString());
    }

    private static void encode(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        if (bytebuffer.isReadOnly())
        {
            throw new ReadOnlyBufferException();
        }
        if (bytebuffer.hasArray())
        {
            try
            {
                bytebuffer.position(encode(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                bytebuffer = new BufferOverflowException();
            }
            bytebuffer.initCause(charsequence);
            throw bytebuffer;
        } else
        {
            encodeDirect(charsequence, bytebuffer);
            return;
        }
    }

    private static void encodeDirect(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int i;
        int l;
        l = charsequence.length();
        i = 0;
_L2:
        char c;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        c = charsequence.charAt(i);
        if (c >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c < '\u0800')
        {
            bytebuffer.put((byte)(c >>> 6 | 0x3c0));
            bytebuffer.put((byte)(c & 0x3f | 0x80));
        } else
        if (c < '\uD800' || '\uDFFF' < c)
        {
            bytebuffer.put((byte)(c >>> 12 | 0x1e0));
            bytebuffer.put((byte)(c >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(c & 0x3f | 0x80));
        } else
        {
            char c1;
label0:
            {
                int j = i;
                if (i + 1 != charsequence.length())
                {
                    i++;
                    c1 = charsequence.charAt(i);
                    if (Character.isSurrogatePair(c, c1))
                    {
                        break label0;
                    }
                    j = i;
                }
                throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(j - 1).toString());
            }
            int k = Character.toCodePoint(c, c1);
            bytebuffer.put((byte)(k >>> 18 | 0xf0));
            bytebuffer.put((byte)(k >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(k >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(k & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private static int encodeZigZag32(int i)
    {
        return i << 1 ^ i >> 31;
    }

    private static int encodedLength(CharSequence charsequence)
    {
        int j;
        int i1;
label0:
        {
            i1 = charsequence.length();
            int l = i1;
            j = 0;
            int i;
            int k;
            do
            {
                k = j;
                i = l;
                if (j >= i1)
                {
                    break;
                }
                k = j;
                i = l;
                if (charsequence.charAt(j) >= '\200')
                {
                    break;
                }
                j++;
            } while (true);
            do
            {
                j = i;
                if (k >= i1)
                {
                    break label0;
                }
                j = charsequence.charAt(k);
                if (j >= 2048)
                {
                    break;
                }
                i += 127 - j >>> 31;
                k++;
            } while (true);
            j = i + encodedLengthGeneral(charsequence, k);
        }
        if (j < i1)
        {
            long l1 = j;
            throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l1 + 0x100000000L).toString());
        } else
        {
            return j;
        }
    }

    private static int encodedLengthGeneral(CharSequence charsequence, int i)
    {
        int i1 = charsequence.length();
        int j = 0;
        while (i < i1) 
        {
            char c = charsequence.charAt(i);
            int k;
            if (c < '\u0800')
            {
                j += 127 - c >>> 31;
                k = i;
            } else
            {
                int l = j + 2;
                k = i;
                j = l;
                if ('\uD800' <= c)
                {
                    k = i;
                    j = l;
                    if (c <= '\uDFFF')
                    {
                        if (Character.codePointAt(charsequence, i) < 0x10000)
                        {
                            throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i).toString());
                        }
                        k = i + 1;
                        j = l;
                    }
                }
            }
            i = k + 1;
        }
        return j;
    }

    public static CodedOutputByteBufferNano newInstance(byte abyte0[])
    {
        return newInstance(abyte0, 0, abyte0.length);
    }

    public static CodedOutputByteBufferNano newInstance(byte abyte0[], int i, int j)
    {
        return new CodedOutputByteBufferNano(abyte0, i, j);
    }

    private int spaceLeft()
    {
        return buffer.remaining();
    }

    private void writeBoolNoTag(boolean flag)
        throws IOException
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

    private void writeBytesNoTag(byte abyte0[])
        throws IOException
    {
        writeRawVarint32(abyte0.length);
        writeRawBytes(abyte0);
    }

    private void writeDoubleNoTag(double d)
        throws IOException
    {
        writeRawLittleEndian64(Double.doubleToLongBits(d));
    }

    private void writeFixed64NoTag(long l)
        throws IOException
    {
        writeRawLittleEndian64(l);
    }

    private void writeFloatNoTag(float f)
        throws IOException
    {
        writeRawLittleEndian32(Float.floatToIntBits(f));
    }

    private void writeInt32NoTag(int i)
        throws IOException
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

    private void writeInt64NoTag(long l)
        throws IOException
    {
        writeRawVarint64(l);
    }

    private void writeRawByte(byte byte0)
        throws IOException
    {
        if (!buffer.hasRemaining())
        {
            throw new OutOfSpaceException(buffer.position(), buffer.limit());
        } else
        {
            buffer.put(byte0);
            return;
        }
    }

    private void writeRawByte(int i)
        throws IOException
    {
        writeRawByte((byte)i);
    }

    private void writeRawBytes(byte abyte0[], int i, int j)
        throws IOException
    {
        if (buffer.remaining() >= j)
        {
            buffer.put(abyte0, i, j);
            return;
        } else
        {
            throw new OutOfSpaceException(buffer.position(), buffer.limit());
        }
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

    private void writeSInt32NoTag(int i)
        throws IOException
    {
        writeRawVarint32(encodeZigZag32(i));
    }

    private void writeStringNoTag(String s)
        throws IOException
    {
        try
        {
            int i = computeRawVarint32Size(s.length());
            if (i == computeRawVarint32Size(s.length() * 3))
            {
                int j = buffer.position();
                buffer.position(j + i);
                encode(s, buffer);
                int k = buffer.position();
                buffer.position(j);
                writeRawVarint32(k - j - i);
                buffer.position(k);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OutOfSpaceException(buffer.position(), buffer.limit());
        }
        writeRawVarint32(encodedLength(s));
        encode(s, buffer);
        return;
    }

    private void writeUInt32NoTag(int i)
        throws IOException
    {
        writeRawVarint32(i);
    }

    private void writeUInt64NoTag(long l)
        throws IOException
    {
        writeRawVarint64(l);
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

    public final void writeBool(int i, boolean flag)
        throws IOException
    {
        writeTag(i, 0);
        writeBoolNoTag(flag);
    }

    public final void writeBytes(int i, byte abyte0[])
        throws IOException
    {
        writeTag(i, 2);
        writeBytesNoTag(abyte0);
    }

    public final void writeDouble(int i, double d)
        throws IOException
    {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public final void writeFixed64(int i, long l)
        throws IOException
    {
        writeTag(i, 1);
        writeFixed64NoTag(l);
    }

    public final void writeFloat(int i, float f)
        throws IOException
    {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public final void writeGroupNoTag(MessageNano messagenano)
        throws IOException
    {
        messagenano.writeTo(this);
    }

    public final void writeInt32(int i, int j)
        throws IOException
    {
        writeTag(i, 0);
        writeInt32NoTag(j);
    }

    public final void writeInt64(int i, long l)
        throws IOException
    {
        writeTag(i, 0);
        writeInt64NoTag(l);
    }

    public final void writeMessage(int i, MessageNano messagenano)
        throws IOException
    {
        writeTag(i, 2);
        writeMessageNoTag(messagenano);
    }

    public final void writeMessageNoTag(MessageNano messagenano)
        throws IOException
    {
        writeRawVarint32(messagenano.getCachedSize());
        messagenano.writeTo(this);
    }

    public final void writeRawBytes(byte abyte0[])
        throws IOException
    {
        writeRawBytes(abyte0, 0, abyte0.length);
    }

    public final void writeRawVarint32(int i)
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

    public final void writeSInt32(int i, int j)
        throws IOException
    {
        writeTag(i, 0);
        writeSInt32NoTag(j);
    }

    public final void writeString(int i, String s)
        throws IOException
    {
        writeTag(i, 2);
        writeStringNoTag(s);
    }

    public final void writeTag(int i, int j)
        throws IOException
    {
        writeRawVarint32(WireFormatNano.makeTag(i, j));
    }

    public final void writeUInt32(int i, int j)
        throws IOException
    {
        writeTag(i, 0);
        writeUInt32NoTag(j);
    }

    public final void writeUInt64(int i, long l)
        throws IOException
    {
        writeTag(i, 0);
        writeUInt64NoTag(l);
    }
}
