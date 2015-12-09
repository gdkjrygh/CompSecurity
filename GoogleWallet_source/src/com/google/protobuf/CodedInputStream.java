// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.protobuf:
//            InvalidProtocolBufferException, Internal, BoundedByteString, ByteString, 
//            LiteralByteString, Parser, MessageLite, WireFormat, 
//            ExtensionRegistryLite

public final class CodedInputStream
{
    static interface RefillCallback
    {
    }


    private final byte buffer[];
    private final boolean bufferIsImmutable = false;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input = null;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private CodedInputStream(byte abyte0[], int i, int j)
    {
        enableAliasing = false;
        currentLimit = 0x7fffffff;
        recursionLimit = 100;
        sizeLimit = 0x4000000;
        refillCallback = null;
        buffer = abyte0;
        bufferSize = i + j;
        bufferPos = i;
        totalBytesRetired = -i;
    }

    private void ensureAvailable(int i)
        throws IOException
    {
        if (bufferSize - bufferPos < i)
        {
            refillBuffer(i);
        }
    }

    private boolean isAtEnd()
        throws IOException
    {
        return bufferPos == bufferSize && !tryRefillBuffer(1);
    }

    public static CodedInputStream newInstance(byte abyte0[])
    {
        return newInstance(abyte0, 0, abyte0.length);
    }

    private static CodedInputStream newInstance(byte abyte0[], int i, int j)
    {
        abyte0 = new CodedInputStream(abyte0, i, j);
        try
        {
            abyte0.pushLimit(j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException(abyte0);
        }
        return abyte0;
    }

    private byte readRawByte()
        throws IOException
    {
        if (bufferPos == bufferSize)
        {
            refillBuffer(1);
        }
        byte abyte0[] = buffer;
        int i = bufferPos;
        bufferPos = i + 1;
        return abyte0[i];
    }

    private byte[] readRawBytesSlowPath(int i)
        throws IOException
    {
        if (i > 0) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        Object obj = Internal.EMPTY_BYTE_ARRAY;
_L6:
        return ((byte []) (obj));
_L4:
        throw InvalidProtocolBufferException.negativeSize();
_L2:
        if (totalBytesRetired + bufferPos + i > currentLimit)
        {
            skipRawBytes(currentLimit - totalBytesRetired - bufferPos);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096)
        {
            obj = new byte[i];
            int j = bufferSize - bufferPos;
            System.arraycopy(buffer, bufferPos, obj, 0, j);
            bufferPos = bufferSize;
            ensureAvailable(i - j);
            System.arraycopy(buffer, 0, obj, j, i - j);
            bufferPos = i - j;
            return ((byte []) (obj));
        }
        int j1 = bufferPos;
        int k1 = bufferSize;
        totalBytesRetired = totalBytesRetired + bufferSize;
        bufferPos = 0;
        bufferSize = 0;
        int k = i - (k1 - j1);
        obj = new ArrayList();
        while (k > 0) 
        {
            byte abyte1[] = new byte[Math.min(k, 4096)];
            int i1;
            for (int l = 0; l < abyte1.length; l += i1)
            {
                if (input == null)
                {
                    i1 = -1;
                } else
                {
                    i1 = input.read(abyte1, l, abyte1.length - l);
                }
                if (i1 == -1)
                {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                totalBytesRetired = totalBytesRetired + i1;
            }

            k -= abyte1.length;
            ((List) (obj)).add(abyte1);
        }
        byte abyte2[] = new byte[i];
        i = k1 - j1;
        System.arraycopy(buffer, j1, abyte2, 0, i);
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            obj = abyte2;
            if (!iterator.hasNext())
            {
                continue;
            }
            byte abyte0[] = (byte[])iterator.next();
            System.arraycopy(abyte0, 0, abyte2, i, abyte0.length);
            i += abyte0.length;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int readRawLittleEndian32()
        throws IOException
    {
        int j = bufferPos;
        int i = j;
        if (bufferSize - j < 4)
        {
            refillBuffer(4);
            i = bufferPos;
        }
        byte abyte0[] = buffer;
        bufferPos = i + 4;
        return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
    }

    private long readRawLittleEndian64()
        throws IOException
    {
        int j = bufferPos;
        int i = j;
        if (bufferSize - j < 8)
        {
            refillBuffer(8);
            i = bufferPos;
        }
        byte abyte0[] = buffer;
        bufferPos = i + 8;
        return (long)abyte0[i] & 255L | ((long)abyte0[i + 1] & 255L) << 8 | ((long)abyte0[i + 2] & 255L) << 16 | ((long)abyte0[i + 3] & 255L) << 24 | ((long)abyte0[i + 4] & 255L) << 32 | ((long)abyte0[i + 5] & 255L) << 40 | ((long)abyte0[i + 6] & 255L) << 48 | ((long)abyte0[i + 7] & 255L) << 56;
    }

    private long readRawVarint64()
        throws IOException
    {
        int i = bufferPos;
        if (bufferSize == i) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j;
        int k;
        abyte0 = buffer;
        j = i + 1;
        k = abyte0[i];
        if (k >= 0)
        {
            bufferPos = j;
            return (long)k;
        }
        if (bufferSize - j < 9) goto _L2; else goto _L3
_L3:
        i = j + 1;
        k ^= abyte0[j] << 7;
        if (k >= 0) goto _L5; else goto _L4
_L4:
        long l = k ^ 0xffffff80;
_L9:
        bufferPos = i;
        return l;
_L5:
        j = i + 1;
        k ^= abyte0[i] << 14;
        if (k >= 0)
        {
            l = k ^ 0x3f80;
            i = j;
            continue; /* Loop/switch isn't completed */
        }
        i = j + 1;
        j = k ^ abyte0[j] << 21;
        if (j < 0)
        {
            l = 0xffe03f80 ^ j;
            continue; /* Loop/switch isn't completed */
        }
        l = j;
        j = i + 1;
        l ^= (long)abyte0[i] << 28;
        if (l >= 0L)
        {
            l ^= 0xfe03f80L;
            i = j;
            continue; /* Loop/switch isn't completed */
        }
        i = j + 1;
        l ^= (long)abyte0[j] << 35;
        if (l < 0L)
        {
            l ^= 0xfffffff80fe03f80L;
            continue; /* Loop/switch isn't completed */
        }
        j = i + 1;
        l ^= (long)abyte0[i] << 42;
        if (l >= 0L)
        {
            l ^= 0x3f80fe03f80L;
            i = j;
            continue; /* Loop/switch isn't completed */
        }
        i = j + 1;
        l ^= (long)abyte0[j] << 49;
        if (l < 0L)
        {
            l ^= 0xfffe03f80fe03f80L;
            continue; /* Loop/switch isn't completed */
        }
        j = i + 1;
        l = l ^ (long)abyte0[i] << 56 ^ 0xfe03f80fe03f80L;
        if (l >= 0L) goto _L7; else goto _L6
_L6:
        i = j + 1;
        if ((long)abyte0[j] >= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return readRawVarint64SlowPath();
_L7:
        i = j;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private long readRawVarint64SlowPath()
        throws IOException
    {
        long l = 0L;
        for (int i = 0; i < 64; i += 7)
        {
            byte byte0 = readRawByte();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw InvalidProtocolBufferException.malformedVarint();
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

    private void refillBuffer(int i)
        throws IOException
    {
        if (!tryRefillBuffer(i))
        {
            throw InvalidProtocolBufferException.truncatedMessage();
        } else
        {
            return;
        }
    }

    private void skipRawBytes(int i)
        throws IOException
    {
        if (i <= bufferSize - bufferPos && i >= 0)
        {
            bufferPos = bufferPos + i;
            return;
        } else
        {
            skipRawBytesSlowPath(i);
            return;
        }
    }

    private void skipRawBytesSlowPath(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (totalBytesRetired + bufferPos + i > currentLimit)
        {
            skipRawBytes(currentLimit - totalBytesRetired - bufferPos);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int j = bufferSize - bufferPos;
        bufferPos = bufferSize;
        refillBuffer(1);
        while (i - j > bufferSize) 
        {
            j += bufferSize;
            bufferPos = bufferSize;
            refillBuffer(1);
        }
        bufferPos = i - j;
    }

    private boolean tryRefillBuffer(int i)
        throws IOException
    {
        if (bufferPos + i <= bufferSize)
        {
            throw new IllegalStateException((new StringBuilder(77)).append("refillBuffer() called when ").append(i).append(" bytes were already available in buffer").toString());
        }
        if (totalBytesRetired + bufferPos + i <= currentLimit)
        {
            RefillCallback refillcallback;
            if (refillCallback != null)
            {
                refillcallback = refillCallback;
            }
            if (input != null)
            {
                int j = bufferPos;
                if (j > 0)
                {
                    if (bufferSize > j)
                    {
                        System.arraycopy(buffer, j, buffer, 0, bufferSize - j);
                    }
                    totalBytesRetired = totalBytesRetired + j;
                    bufferSize = bufferSize - j;
                    bufferPos = 0;
                }
                j = input.read(buffer, bufferSize, buffer.length - bufferSize);
                if (j == 0 || j < -1 || j > buffer.length)
                {
                    throw new IllegalStateException((new StringBuilder(102)).append("InputStream#read(byte[]) returned invalid result: ").append(j).append("\nThe InputStream implementation is buggy.").toString());
                }
                if (j > 0)
                {
                    bufferSize = bufferSize + j;
                    if ((totalBytesRetired + i) - sizeLimit > 0)
                    {
                        throw InvalidProtocolBufferException.sizeLimitExceeded();
                    }
                    recomputeBufferSizeAfterLimit();
                    if (bufferSize >= i)
                    {
                        return true;
                    } else
                    {
                        return tryRefillBuffer(i);
                    }
                }
            }
        }
        return false;
    }

    public final void checkLastTagWas(int i)
        throws InvalidProtocolBufferException
    {
        if (lastTag != i)
        {
            throw InvalidProtocolBufferException.invalidEndTag();
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
            int i = totalBytesRetired;
            int j = bufferPos;
            return currentLimit - (i + j);
        }
    }

    public final void popLimit(int i)
    {
        currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public final int pushLimit(int i)
        throws InvalidProtocolBufferException
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferException.negativeSize();
        }
        i += totalBytesRetired + bufferPos;
        int j = currentLimit;
        if (i > j)
        {
            throw InvalidProtocolBufferException.truncatedMessage();
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
        return readRawVarint64() != 0L;
    }

    public final ByteString readBytes()
        throws IOException
    {
        int i = readRawVarint32();
        if (i <= bufferSize - bufferPos && i > 0)
        {
            Object obj;
            if (bufferIsImmutable && enableAliasing)
            {
                obj = new BoundedByteString(buffer, bufferPos, i);
            } else
            {
                obj = ByteString.copyFrom(buffer, bufferPos, i);
            }
            bufferPos = bufferPos + i;
            return ((ByteString) (obj));
        }
        if (i == 0)
        {
            return ByteString.EMPTY;
        } else
        {
            return new LiteralByteString(readRawBytesSlowPath(i));
        }
    }

    public final int readEnum()
        throws IOException
    {
        return readRawVarint32();
    }

    public final int readFixed32()
        throws IOException
    {
        return readRawLittleEndian32();
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

    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionregistrylite)
        throws IOException
    {
        int i = readRawVarint32();
        if (recursionDepth >= recursionLimit)
        {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        } else
        {
            i = pushLimit(i);
            recursionDepth = recursionDepth + 1;
            parser = (MessageLite)parser.parsePartialFrom(this, extensionregistrylite);
            checkLastTagWas(0);
            recursionDepth = recursionDepth - 1;
            popLimit(i);
            return parser;
        }
    }

    public final int readRawVarint32()
        throws IOException
    {
        int i = bufferPos;
        if (bufferSize == i) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j;
        int k;
        abyte0 = buffer;
        j = i + 1;
        k = abyte0[i];
        if (k >= 0)
        {
            bufferPos = j;
            return k;
        }
        if (bufferSize - j < 9) goto _L2; else goto _L3
_L3:
        i = j + 1;
        k ^= abyte0[j] << 7;
        if (k >= 0) goto _L5; else goto _L4
_L4:
        j = k ^ 0xffffff80;
_L11:
        bufferPos = i;
        return j;
_L5:
        int l;
        j = i + 1;
        k ^= abyte0[i] << 14;
        if (k >= 0)
        {
            k ^= 0x3f80;
            i = j;
            j = k;
            continue; /* Loop/switch isn't completed */
        }
        i = j + 1;
        k ^= abyte0[j] << 21;
        if (k < 0)
        {
            j = k ^ 0xffe03f80;
            continue; /* Loop/switch isn't completed */
        }
        l = i + 1;
        j = abyte0[i];
        k = k ^ j << 28 ^ 0xfe03f80;
        i = l;
        if (j >= 0) goto _L7; else goto _L6
_L6:
        int i1;
        i1 = l + 1;
        i = i1;
        j = k;
        if (abyte0[l] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = i1 + 1;
        i = l;
        if (abyte0[i1] >= 0) goto _L7; else goto _L8
_L8:
        i1 = l + 1;
        i = i1;
        j = k;
        if (abyte0[l] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = i1 + 1;
        i = l;
        if (abyte0[i1] >= 0) goto _L7; else goto _L9
_L9:
        i = l + 1;
        j = k;
        if (abyte0[l] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return (int)readRawVarint64SlowPath();
_L7:
        j = k;
        if (true) goto _L11; else goto _L10
_L10:
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
        }
        if (i == 0)
        {
            return "";
        } else
        {
            return new String(readRawBytesSlowPath(i), "UTF-8");
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
        if (WireFormat.getTagFieldNumber(lastTag) == 0)
        {
            throw InvalidProtocolBufferException.invalidTag();
        } else
        {
            return lastTag;
        }
    }
}
