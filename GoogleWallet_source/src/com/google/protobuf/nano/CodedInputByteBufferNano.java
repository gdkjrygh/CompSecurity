// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.nano:
//            InvalidProtocolBufferNanoException, WireFormatNano, MessageNano

public final class CodedInputByteBufferNano
{

    private final byte buffer[];
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int currentLimit;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private int sizeLimit;

    private CodedInputByteBufferNano(byte abyte0[], int i, int j)
    {
        currentLimit = 0x7fffffff;
        recursionLimit = 64;
        sizeLimit = 0x4000000;
        buffer = abyte0;
        bufferStart = i;
        bufferSize = i + j;
        bufferPos = i;
    }

    private static int decodeZigZag32(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    private boolean isAtEnd()
    {
        return bufferPos == bufferSize;
    }

    public static CodedInputByteBufferNano newInstance(byte abyte0[], int i, int j)
    {
        return new CodedInputByteBufferNano(abyte0, i, j);
    }

    private byte readRawByte()
        throws IOException
    {
        if (bufferPos == bufferSize)
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        } else
        {
            byte abyte0[] = buffer;
            int i = bufferPos;
            bufferPos = i + 1;
            return abyte0[i];
        }
    }

    private byte[] readRawBytes(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (bufferPos + i > currentLimit)
        {
            skipRawBytes(currentLimit - bufferPos);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i <= bufferSize - bufferPos)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, bufferPos, abyte0, 0, i);
            bufferPos = bufferPos + i;
            return abyte0;
        } else
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
    }

    private int readRawLittleEndian32()
        throws IOException
    {
        return readRawByte() & 0xff | (readRawByte() & 0xff) << 8 | (readRawByte() & 0xff) << 16 | (readRawByte() & 0xff) << 24;
    }

    private long readRawLittleEndian64()
        throws IOException
    {
        int i = readRawByte();
        int j = readRawByte();
        int k = readRawByte();
        int l = readRawByte();
        int i1 = readRawByte();
        int j1 = readRawByte();
        int k1 = readRawByte();
        int l1 = readRawByte();
        return (long)i & 255L | ((long)j & 255L) << 8 | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    private long readRawVarint64()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = readRawByte();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    private void recomputeBufferSizeAfterLimit()
    {
        bufferSize = bufferSize + bufferSizeAfterLimit;
        int i = bufferSize;
        if (i > currentLimit)
        {
            bufferSizeAfterLimit = i - currentLimit;
            bufferSize = bufferSize - bufferSizeAfterLimit;
            return;
        } else
        {
            bufferSizeAfterLimit = 0;
            return;
        }
    }

    private void skipMessage()
        throws IOException
    {
        int i;
        do
        {
            i = readTag();
        } while (i != 0 && skipField(i));
    }

    private void skipRawBytes(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (bufferPos + i > currentLimit)
        {
            skipRawBytes(currentLimit - bufferPos);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i <= bufferSize - bufferPos)
        {
            bufferPos = bufferPos + i;
            return;
        } else
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
    }

    public final void checkLastTagWas(int i)
        throws InvalidProtocolBufferNanoException
    {
        if (lastTag != i)
        {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        } else
        {
            return;
        }
    }

    public final int getBytesUntilLimit()
    {
        if (currentLimit == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = bufferPos;
            return currentLimit - i;
        }
    }

    public final byte[] getData(int i, int j)
    {
        if (j == 0)
        {
            return WireFormatNano.EMPTY_BYTES;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = bufferStart;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }

    public final int getPosition()
    {
        return bufferPos - bufferStart;
    }

    public final void popLimit(int i)
    {
        currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public final int pushLimit(int i)
        throws InvalidProtocolBufferNanoException
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        i += bufferPos;
        int j = currentLimit;
        if (i > j)
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        } else
        {
            currentLimit = i;
            recomputeBufferSizeAfterLimit();
            return j;
        }
    }

    public final boolean readBool()
        throws IOException
    {
        return readRawVarint32() != 0;
    }

    public final byte[] readBytes()
        throws IOException
    {
        int i = readRawVarint32();
        if (i <= bufferSize - bufferPos && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, bufferPos, abyte0, 0, i);
            bufferPos = bufferPos + i;
            return abyte0;
        } else
        {
            return readRawBytes(i);
        }
    }

    public final double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public final long readFixed64()
        throws IOException
    {
        return readRawLittleEndian64();
    }

    public final float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public final int readInt32()
        throws IOException
    {
        return readRawVarint32();
    }

    public final long readInt64()
        throws IOException
    {
        return readRawVarint64();
    }

    public final void readMessage(MessageNano messagenano)
        throws IOException
    {
        int i = readRawVarint32();
        if (recursionDepth >= recursionLimit)
        {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        } else
        {
            i = pushLimit(i);
            recursionDepth = recursionDepth + 1;
            messagenano.mergeFrom(this);
            checkLastTagWas(0);
            recursionDepth = recursionDepth - 1;
            popLimit(i);
            return;
        }
    }

    public final int readRawVarint32()
        throws IOException
    {
        int i = readRawByte();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = readRawByte();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = readRawByte();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = readRawByte();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = readRawByte();
        k = i | (k & 0x7f) << 21 | byte0 << 28;
        i = k;
        if (byte0 < 0)
        {
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= 5)
                    {
                        break label1;
                    }
                    i = k;
                    if (readRawByte() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public final int readSInt32()
        throws IOException
    {
        return decodeZigZag32(readRawVarint32());
    }

    public final String readString()
        throws IOException
    {
        int i = readRawVarint32();
        if (i <= bufferSize - bufferPos && i > 0)
        {
            String s = new String(buffer, bufferPos, i, "UTF-8");
            bufferPos = bufferPos + i;
            return s;
        } else
        {
            return new String(readRawBytes(i), "UTF-8");
        }
    }

    public final int readTag()
        throws IOException
    {
        if (isAtEnd())
        {
            lastTag = 0;
            return 0;
        }
        lastTag = readRawVarint32();
        if (lastTag == 0)
        {
            throw InvalidProtocolBufferNanoException.invalidTag();
        } else
        {
            return lastTag;
        }
    }

    public final int readUInt32()
        throws IOException
    {
        return readRawVarint32();
    }

    public final long readUInt64()
        throws IOException
    {
        return readRawVarint64();
    }

    public final void rewindToPosition(int i)
    {
        if (i > bufferPos - bufferStart)
        {
            int j = bufferPos;
            int k = bufferStart;
            throw new IllegalArgumentException((new StringBuilder(50)).append("Position ").append(i).append(" is beyond current ").append(j - k).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(24)).append("Bad position ").append(i).toString());
        } else
        {
            bufferPos = bufferStart + i;
            return;
        }
    }

    public final boolean skipField(int i)
        throws IOException
    {
        switch (WireFormatNano.getTagWireType(i))
        {
        default:
            throw InvalidProtocolBufferNanoException.invalidWireType();

        case 0: // '\0'
            readInt32();
            return true;

        case 1: // '\001'
            readRawLittleEndian64();
            return true;

        case 2: // '\002'
            skipRawBytes(readRawVarint32());
            return true;

        case 3: // '\003'
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            readRawLittleEndian32();
            break;
        }
        return true;
    }
}
