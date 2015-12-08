// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

// Referenced classes of package com.google.protobuf.micro:
//            InvalidProtocolBufferMicroException, MessageMicro, WireFormatMicro

public final class CodedInputStreamMicro
{

    private final byte buffer[];
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private final InputStream input = null;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private int sizeLimit;
    private int totalBytesRetired;

    CodedInputStreamMicro(byte abyte0[], int i, int j)
    {
        currentLimit = 0x7fffffff;
        recursionLimit = 64;
        sizeLimit = 0x4000000;
        buffer = abyte0;
        bufferSize = j + 0;
        bufferPos = 0;
    }

    private byte readRawByte()
        throws IOException
    {
        if (bufferPos == bufferSize)
        {
            refillBuffer(true);
        }
        byte abyte0[] = buffer;
        int i = bufferPos;
        bufferPos = i + 1;
        return abyte0[i];
    }

    private byte[] readRawBytes(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        if (totalBytesRetired + bufferPos + i > currentLimit)
        {
            skipRawBytes(currentLimit - totalBytesRetired - bufferPos);
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        }
        if (i > bufferSize - bufferPos) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        abyte0 = new byte[i];
        System.arraycopy(buffer, bufferPos, abyte0, 0, i);
        bufferPos = bufferPos + i;
_L4:
        return abyte0;
_L2:
        if (i < 4096)
        {
            abyte0 = new byte[i];
            int j = bufferSize - bufferPos;
            System.arraycopy(buffer, bufferPos, abyte0, 0, j);
            bufferPos = bufferSize;
            refillBuffer(true);
            while (i - j > bufferSize) 
            {
                System.arraycopy(buffer, 0, abyte0, j, bufferSize);
                j += bufferSize;
                bufferPos = bufferSize;
                refillBuffer(true);
            }
            System.arraycopy(buffer, 0, abyte0, j, i - j);
            bufferPos = i - j;
            return abyte0;
        }
        int l = bufferPos;
        int i1 = bufferSize;
        totalBytesRetired = totalBytesRetired + bufferSize;
        bufferPos = 0;
        bufferSize = 0;
        int k = i - (i1 - l);
        Vector vector = new Vector();
        while (k > 0) 
        {
            abyte0 = new byte[Math.min(k, 4096)];
            if (abyte0.length > 0)
            {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
            k -= abyte0.length;
            vector.addElement(abyte0);
        }
        byte abyte1[] = new byte[i];
        k = i1 - l;
        System.arraycopy(buffer, l, abyte1, 0, k);
        i = 0;
        do
        {
            abyte0 = abyte1;
            if (i >= vector.size())
            {
                continue;
            }
            abyte0 = (byte[])vector.elementAt(i);
            System.arraycopy(abyte0, 0, abyte1, k, abyte0.length);
            k += abyte0.length;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void recomputeBufferSizeAfterLimit()
    {
        bufferSize = bufferSize + bufferSizeAfterLimit;
        int i = totalBytesRetired + bufferSize;
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

    private boolean refillBuffer(boolean flag)
        throws IOException
    {
        boolean flag1 = false;
        if (bufferPos < bufferSize)
        {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (totalBytesRetired + bufferSize == currentLimit)
        {
            if (flag)
            {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
        } else
        {
            totalBytesRetired = totalBytesRetired + bufferSize;
            bufferPos = 0;
            bufferSize = -1;
            if (bufferSize == 0 || bufferSize < -1)
            {
                throw new IllegalStateException((new StringBuilder("InputStream#read(byte[]) returned invalid result: ")).append(bufferSize).append("\nThe InputStream implementation is buggy.").toString());
            }
            if (bufferSize == -1)
            {
                bufferSize = 0;
                if (flag)
                {
                    throw InvalidProtocolBufferMicroException.truncatedMessage();
                }
            } else
            {
                recomputeBufferSizeAfterLimit();
                int i = totalBytesRetired + bufferSize + bufferSizeAfterLimit;
                if (i > sizeLimit || i < 0)
                {
                    throw InvalidProtocolBufferMicroException.sizeLimitExceeded();
                }
                flag1 = true;
            }
        }
        return flag1;
    }

    private void skipRawBytes(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        if (totalBytesRetired + bufferPos + i > currentLimit)
        {
            skipRawBytes(currentLimit - totalBytesRetired - bufferPos);
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        }
        if (i <= bufferSize - bufferPos)
        {
            bufferPos = bufferPos + i;
        } else
        {
            int j = bufferSize;
            int k = bufferPos;
            totalBytesRetired = totalBytesRetired + bufferSize;
            bufferPos = 0;
            bufferSize = 0;
            if (j - k < i)
            {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
        }
    }

    public final void checkLastTagWas(int i)
        throws InvalidProtocolBufferMicroException
    {
        if (lastTag != i)
        {
            throw InvalidProtocolBufferMicroException.invalidEndTag();
        } else
        {
            return;
        }
    }

    public final boolean readBool()
        throws IOException
    {
        return readRawVarint32() != 0;
    }

    public final void readMessage(MessageMicro messagemicro)
        throws IOException
    {
        int i = readRawVarint32();
        if (recursionDepth >= recursionLimit)
        {
            throw InvalidProtocolBufferMicroException.recursionLimitExceeded();
        }
        if (i < 0)
        {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        i = totalBytesRetired + bufferPos + i;
        int j = currentLimit;
        if (i > j)
        {
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        } else
        {
            currentLimit = i;
            recomputeBufferSizeAfterLimit();
            recursionDepth = recursionDepth + 1;
            messagemicro.mergeFrom(this);
            checkLastTagWas(0);
            recursionDepth = recursionDepth - 1;
            currentLimit = j;
            recomputeBufferSizeAfterLimit();
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
        throw InvalidProtocolBufferMicroException.malformedVarint();
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
        if (bufferPos == bufferSize && !refillBuffer(false))
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
            throw InvalidProtocolBufferMicroException.invalidTag();
        } else
        {
            return lastTag;
        }
    }

    public final boolean skipField(int i)
        throws IOException
    {
        switch (WireFormatMicro.getTagWireType(i))
        {
        default:
            throw InvalidProtocolBufferMicroException.invalidWireType();

        case 0: // '\0'
            readRawVarint32();
            return true;

        case 1: // '\001'
            readRawByte();
            readRawByte();
            readRawByte();
            readRawByte();
            readRawByte();
            readRawByte();
            readRawByte();
            readRawByte();
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
            checkLastTagWas(WireFormatMicro.makeTag(WireFormatMicro.getTagFieldNumber(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            readRawByte();
            readRawByte();
            readRawByte();
            readRawByte();
            return true;
        }
    }
}
