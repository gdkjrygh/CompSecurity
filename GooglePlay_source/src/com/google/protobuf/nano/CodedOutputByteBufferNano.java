// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.protobuf.nano:
//            MessageNano, WireFormatNano

public final class CodedOutputByteBufferNano
{
    public static final class OutOfSpaceException extends IOException
    {

        OutOfSpaceException(int i, int j)
        {
            super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    final ByteBuffer buffer;

    private CodedOutputByteBufferNano(ByteBuffer bytebuffer)
    {
        buffer = bytebuffer;
        buffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private CodedOutputByteBufferNano(byte abyte0[], int i, int j)
    {
        this(ByteBuffer.wrap(abyte0, i, j));
    }

    public static int computeBytesSize(int i, byte abyte0[])
    {
        return computeTagSize(i) + computeBytesSizeNoTag(abyte0);
    }

    public static int computeBytesSizeNoTag(byte abyte0[])
    {
        return computeRawVarint32Size(abyte0.length) + abyte0.length;
    }

    public static int computeGroupSize(int i, MessageNano messagenano)
    {
        return computeTagSize(i) * 2 + messagenano.getSerializedSize();
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
        return computeTagSize(i) + computeRawVarint64Size(l);
    }

    public static int computeMessageSize(int i, MessageNano messagenano)
    {
        i = computeTagSize(i);
        int j = messagenano.getSerializedSize();
        return i + (j + computeRawVarint32Size(j));
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

    public static int computeSInt64Size(int i, long l)
    {
        return computeTagSize(i) + computeRawVarint64Size(encodeZigZag64(l));
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

    public static int computeTagSize(int i)
    {
        return computeRawVarint32Size(WireFormatNano.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int j)
    {
        return computeTagSize(i) + computeRawVarint32Size(j);
    }

    public static int computeUInt64Size(int i, long l)
    {
        return computeTagSize(i) + computeRawVarint64Size(l);
    }

    private static int encode(CharSequence charsequence, byte abyte0[], int i, int j)
    {
        int l1;
        int i2;
        l1 = charsequence.length();
        boolean flag = false;
        i2 = i + j;
        j = ((flag) ? 1 : 0);
        do
        {
            if (j >= l1 || j + i >= i2)
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
        if (j == l1)
        {
            return i + l1;
        }
        i += j;
_L2:
        char c;
        if (j >= l1)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        c = charsequence.charAt(j);
        if (c >= '\200' || i >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = i + 1;
        abyte0[i] = (byte)c;
        i = k;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c < '\u0800' && i <= i2 - 2)
        {
            int l = i + 1;
            abyte0[i] = (byte)(c >>> 6 | 0x3c0);
            abyte0[l] = (byte)(c & 0x3f | 0x80);
            i = l + 1;
        } else
        if ((c < '\uD800' || '\uDFFF' < c) && i <= i2 - 3)
        {
            int i1 = i + 1;
            abyte0[i] = (byte)(c >>> 12 | 0x1e0);
            int j2 = i1 + 1;
            abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
            i = j2 + 1;
            abyte0[j2] = (byte)(c & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c1;
label1:
                {
                    if (i > i2 - 4)
                    {
                        break label0;
                    }
                    int j1 = j;
                    if (j + 1 != charsequence.length())
                    {
                        j++;
                        c1 = charsequence.charAt(j);
                        if (Character.isSurrogatePair(c, c1))
                        {
                            break label1;
                        }
                        j1 = j;
                    }
                    throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j1 - 1).toString());
                }
                int k1 = Character.toCodePoint(c, c1);
                int k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 18 | 0xf0);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 >>> 12 & 0x3f | 0x80);
                k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 6 & 0x3f | 0x80);
                abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
                i = k2 + 1;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        if ('\uD800' <= c && c <= '\uDFFF' && (j + 1 == charsequence.length() || !Character.isSurrogatePair(c, charsequence.charAt(j + 1))))
        {
            throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j).toString());
        } else
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder("Failed writing ")).append(c).append(" at index ").append(i).toString());
        }
        return i;
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
            break MISSING_BLOCK_LABEL_295;
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
                throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j - 1).toString());
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

    private static long encodeZigZag64(long l)
    {
        return l << 1 ^ l >> 63;
    }

    private static int encodedLength(CharSequence charsequence)
    {
        int k;
        int j1;
label0:
        {
            j1 = charsequence.length();
            int l = j1;
            k = 0;
            int i;
            int j;
            do
            {
                j = k;
                i = l;
                if (k >= j1)
                {
                    break;
                }
                j = k;
                i = l;
                if (charsequence.charAt(k) >= '\200')
                {
                    break;
                }
                k++;
            } while (true);
            do
            {
                k = i;
                if (j >= j1)
                {
                    break label0;
                }
                k = charsequence.charAt(j);
                if (k >= 2048)
                {
                    break;
                }
                i += 127 - k >>> 31;
                j++;
            } while (true);
            int l1 = charsequence.length();
            k = 0;
            while (j < l1) 
            {
                char c = charsequence.charAt(j);
                int i1;
                if (c < '\u0800')
                {
                    k += 127 - c >>> 31;
                    i1 = j;
                } else
                {
                    int k1 = k + 2;
                    i1 = j;
                    k = k1;
                    if ('\uD800' <= c)
                    {
                        i1 = j;
                        k = k1;
                        if (c <= '\uDFFF')
                        {
                            if (Character.codePointAt(charsequence, j) < 0x10000)
                            {
                                throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j).toString());
                            }
                            i1 = j + 1;
                            k = k1;
                        }
                    }
                }
                j = i1 + 1;
            }
            k = i + k;
        }
        if (k < j1)
        {
            throw new IllegalArgumentException((new StringBuilder("UTF-8 length does not fit in int: ")).append((long)k + 0x100000000L).toString());
        } else
        {
            return k;
        }
    }

    public static CodedOutputByteBufferNano newInstance(byte abyte0[], int i, int j)
    {
        return new CodedOutputByteBufferNano(abyte0, 0, j);
    }

    private void writeRawByte(int i)
        throws IOException
    {
        byte byte0 = (byte)i;
        if (!buffer.hasRemaining())
        {
            throw new OutOfSpaceException(buffer.position(), buffer.limit());
        } else
        {
            buffer.put(byte0);
            return;
        }
    }

    private void writeRawLittleEndian64(long l)
        throws IOException
    {
        if (buffer.remaining() < 8)
        {
            throw new OutOfSpaceException(buffer.position(), buffer.limit());
        } else
        {
            buffer.putLong(l);
            return;
        }
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

    public final void writeBytes(int i, byte abyte0[])
        throws IOException
    {
        writeTag(i, 2);
        writeRawVarint32(abyte0.length);
        writeRawBytes(abyte0);
    }

    public final void writeDouble(int i, double d)
        throws IOException
    {
        writeTag(i, 1);
        writeRawLittleEndian64(Double.doubleToLongBits(d));
    }

    public final void writeFixed64(int i, long l)
        throws IOException
    {
        writeTag(i, 1);
        writeRawLittleEndian64(l);
    }

    public final void writeFloat(int i, float f)
        throws IOException
    {
        writeTag(i, 5);
        i = Float.floatToIntBits(f);
        if (buffer.remaining() < 4)
        {
            throw new OutOfSpaceException(buffer.position(), buffer.limit());
        } else
        {
            buffer.putInt(i);
            return;
        }
    }

    public final void writeGroup(int i, MessageNano messagenano)
        throws IOException
    {
        writeTag(i, 3);
        messagenano.writeTo(this);
        writeTag(i, 4);
    }

    public final void writeInt32(int i, int j)
        throws IOException
    {
        writeTag(i, 0);
        if (j >= 0)
        {
            writeRawVarint32(j);
            return;
        } else
        {
            writeRawVarint64(j);
            return;
        }
    }

    public final void writeInt64(int i, long l)
        throws IOException
    {
        writeTag(i, 0);
        writeRawVarint64(l);
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
        if (messagenano.cachedSize < 0)
        {
            messagenano.getSerializedSize();
        }
        writeRawVarint32(messagenano.cachedSize);
        messagenano.writeTo(this);
    }

    public final void writeRawBytes(byte abyte0[])
        throws IOException
    {
        int i = abyte0.length;
        if (buffer.remaining() >= i)
        {
            buffer.put(abyte0, 0, i);
            return;
        } else
        {
            throw new OutOfSpaceException(buffer.position(), buffer.limit());
        }
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

    public final void writeSInt64(int i, long l)
        throws IOException
    {
        writeTag(i, 0);
        writeRawVarint64(encodeZigZag64(l));
    }

    public final void writeString(int i, String s)
        throws IOException
    {
        writeTag(i, 2);
        OutOfSpaceException outofspaceexception;
        int j;
        i = computeRawVarint32Size(s.length());
        if (i != computeRawVarint32Size(s.length() * 3))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        j = buffer.position();
        if (buffer.remaining() < i)
        {
            throw new OutOfSpaceException(i + j, buffer.limit());
        }
        try
        {
            buffer.position(j + i);
            encode(s, buffer);
            int k = buffer.position();
            buffer.position(j);
            writeRawVarint32(k - j - i);
            buffer.position(k);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            outofspaceexception = new OutOfSpaceException(buffer.position(), buffer.limit());
            outofspaceexception.initCause(s);
            throw outofspaceexception;
        }
        writeRawVarint32(encodedLength(s));
        encode(s, buffer);
        return;
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
        writeRawVarint32(j);
    }

    public final void writeUInt64(int i, long l)
        throws IOException
    {
        writeTag(i, 0);
        writeRawVarint64(l);
    }
}
