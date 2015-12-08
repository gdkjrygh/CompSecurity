// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.nano:
//            InvalidProtocolBufferNanoException, WireFormatNano, MessageNano

public final class CodedInputByteBufferNano
{

    final byte buffer[];
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    int bufferStart;
    private int currentLimit;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private int sizeLimit;

    CodedInputByteBufferNano(byte abyte0[], int i, int j)
    {
        currentLimit = 0x7fffffff;
        recursionLimit = 64;
        sizeLimit = 0x4000000;
        buffer = abyte0;
        bufferStart = 0;
        bufferSize = j + 0;
        bufferPos = 0;
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
        }
        if (i == 0)
        {
            return WireFormatNano.EMPTY_BYTES;
        } else
        {
            return readRawBytes(i);
        }
    }

    public final void readGroup(MessageNano messagenano, int i)
        throws IOException
    {
        if (recursionDepth >= recursionLimit)
        {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        } else
        {
            recursionDepth = recursionDepth + 1;
            messagenano.mergeFrom(this);
            checkLastTagWas(WireFormatNano.makeTag(i, 4));
            recursionDepth = recursionDepth - 1;
            return;
        }
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

    public final int readRawLittleEndian32()
        throws IOException
    {
        return readRawByte() & 0xff | (readRawByte() & 0xff) << 8 | (readRawByte() & 0xff) << 16 | (readRawByte() & 0xff) << 24;
    }

    public final long readRawLittleEndian64()
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
        k = (k & 0x7f) << 21 | i | byte0 << 28;
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

    public final long readRawVarint64()
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

    public final long readSInt64()
        throws IOException
    {
        long l = readRawVarint64();
        return -(l & 1L) ^ l >>> 1;
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
        boolean flag;
        if (bufferPos == bufferSize)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
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

    public final void rewindToPosition(int i)
    {
        if (i > bufferPos - bufferStart)
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is beyond current ").append(bufferPos - bufferStart).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad position ")).append(i).toString());
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
            readRawVarint32();
            return true;

        case 1: // '\001'
            readRawLittleEndian64();
            return true;

        case 2: // '\002'
            skipRawBytes(readRawVarint32());
            return true;

        case 3: // '\003'
            int j;
            do
            {
                j = readTag();
            } while (j != 0 && skipField(j));
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            readRawLittleEndian32();
            return true;
        }
    }
}
