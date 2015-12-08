// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.protobuf:
//            LiteralByteString, InvalidProtocolBufferException, Internal, BoundedByteString, 
//            ByteString, Parser, MessageLite, WireFormat, 
//            Utf8, CodedOutputStream, ExtensionRegistryLite

public final class CodedInputStream
{

    private static final int BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 0x4000000;
    private final byte buffer[];
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private CodedInputStream(LiteralByteString literalbytestring)
    {
        enableAliasing = false;
        currentLimit = 0x7fffffff;
        recursionLimit = 64;
        sizeLimit = 0x4000000;
        refillCallback = null;
        buffer = literalbytestring.bytes;
        bufferPos = literalbytestring.getOffsetIntoBytes();
        bufferSize = bufferPos + literalbytestring.size();
        totalBytesRetired = -bufferPos;
        input = null;
        bufferIsImmutable = true;
    }

    private CodedInputStream(InputStream inputstream)
    {
        enableAliasing = false;
        currentLimit = 0x7fffffff;
        recursionLimit = 64;
        sizeLimit = 0x4000000;
        refillCallback = null;
        buffer = new byte[4096];
        bufferSize = 0;
        bufferPos = 0;
        totalBytesRetired = 0;
        input = inputstream;
        bufferIsImmutable = false;
    }

    private CodedInputStream(byte abyte0[], int i, int j)
    {
        enableAliasing = false;
        currentLimit = 0x7fffffff;
        recursionLimit = 64;
        sizeLimit = 0x4000000;
        refillCallback = null;
        buffer = abyte0;
        bufferSize = i + j;
        bufferPos = i;
        totalBytesRetired = -i;
        input = null;
        bufferIsImmutable = false;
    }

    public static int decodeZigZag32(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    public static long decodeZigZag64(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    private void ensureAvailable(int i)
    {
        if (bufferSize - bufferPos < i)
        {
            refillBuffer(i);
        }
    }

    static CodedInputStream newInstance(LiteralByteString literalbytestring)
    {
        CodedInputStream codedinputstream = new CodedInputStream(literalbytestring);
        try
        {
            codedinputstream.pushLimit(literalbytestring.size());
        }
        // Misplaced declaration of an exception variable
        catch (LiteralByteString literalbytestring)
        {
            throw new IllegalArgumentException(literalbytestring);
        }
        return codedinputstream;
    }

    public static CodedInputStream newInstance(InputStream inputstream)
    {
        return new CodedInputStream(inputstream);
    }

    public static CodedInputStream newInstance(ByteBuffer bytebuffer)
    {
        if (bytebuffer.hasArray())
        {
            return newInstance(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
        } else
        {
            bytebuffer = bytebuffer.duplicate();
            byte abyte0[] = new byte[bytebuffer.remaining()];
            bytebuffer.get(abyte0);
            return newInstance(abyte0);
        }
    }

    public static CodedInputStream newInstance(byte abyte0[])
    {
        return newInstance(abyte0, 0, abyte0.length);
    }

    public static CodedInputStream newInstance(byte abyte0[], int i, int j)
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

    private byte[] readRawBytesSlowPath(int i)
    {
        if (i <= 0)
        {
            if (i == 0)
            {
                return Internal.EMPTY_BYTE_ARRAY;
            } else
            {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }
        if (totalBytesRetired + bufferPos + i > currentLimit)
        {
            skipRawBytes(currentLimit - totalBytesRetired - bufferPos);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096)
        {
            byte abyte0[] = new byte[i];
            int j = bufferSize - bufferPos;
            System.arraycopy(buffer, bufferPos, abyte0, 0, j);
            bufferPos = bufferSize;
            ensureAvailable(i - j);
            System.arraycopy(buffer, 0, abyte0, j, i - j);
            bufferPos = i - j;
            return abyte0;
        }
        int k1 = bufferPos;
        int l1 = bufferSize;
        totalBytesRetired = totalBytesRetired + bufferSize;
        bufferPos = 0;
        bufferSize = 0;
        Object obj = new ArrayList();
        int i1;
        for (int k = i - (l1 - k1); k > 0; k -= i1)
        {
            byte abyte1[] = new byte[Math.min(k, 4096)];
            int j1;
            for (int l = 0; l < abyte1.length; l += j1)
            {
                if (input == null)
                {
                    j1 = -1;
                } else
                {
                    j1 = input.read(abyte1, l, abyte1.length - l);
                }
                if (j1 == -1)
                {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                totalBytesRetired = totalBytesRetired + j1;
            }

            i1 = abyte1.length;
            ((List) (obj)).add(abyte1);
        }

        byte abyte2[] = new byte[i];
        i = l1 - k1;
        System.arraycopy(buffer, k1, abyte2, 0, i);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            byte abyte3[] = (byte[])((Iterator) (obj)).next();
            System.arraycopy(abyte3, 0, abyte2, i, abyte3.length);
            i = abyte3.length + i;
        }

        return abyte2;
    }

    public static int readRawVarint32(int i, InputStream inputstream)
    {
        if ((i & 0x80) != 0) goto _L2; else goto _L1
_L1:
        int k = i;
_L4:
        return k;
_L2:
        int j;
        j = i & 0x7f;
        i = 7;
        do
        {
            k = i;
            if (i >= 32)
            {
                break; /* Loop/switch isn't completed */
            }
            int l = inputstream.read();
            if (l == -1)
            {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            j |= (l & 0x7f) << i;
            k = j;
            if ((l & 0x80) == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i += 7;
        } while (true);
        if (true) goto _L4; else goto _L3
_L6:
        k += 7;
_L3:
        if (k < 64)
        {
            i = inputstream.read();
            if (i == -1)
            {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i & 0x80) == 0)
            {
                return j;
            }
        } else
        {
            throw InvalidProtocolBufferException.malformedVarint();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int readRawVarint32(InputStream inputstream)
    {
        int i = inputstream.read();
        if (i == -1)
        {
            throw InvalidProtocolBufferException.truncatedMessage();
        } else
        {
            return readRawVarint32(i, inputstream);
        }
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
    {
        if (!tryRefillBuffer(i))
        {
            throw InvalidProtocolBufferException.truncatedMessage();
        } else
        {
            return;
        }
    }

    private void skipRawBytesSlowPath(int i)
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

    private void skipRawVarint()
    {
        if (bufferSize - bufferPos >= 10)
        {
            byte abyte0[] = buffer;
            int j = bufferPos;
            for (int i = 0; i < 10;)
            {
                int k = j + 1;
                if (abyte0[j] >= 0)
                {
                    bufferPos = k;
                    return;
                }
                i++;
                j = k;
            }

        }
        skipRawVarintSlowPath();
    }

    private void skipRawVarintSlowPath()
    {
        for (int i = 0; i < 10; i++)
        {
            if (readRawByte() >= 0)
            {
                return;
            }
        }

        throw InvalidProtocolBufferException.malformedVarint();
    }

    private boolean tryRefillBuffer(int i)
    {
_L6:
        if (bufferPos + i <= bufferSize)
        {
            throw new IllegalStateException((new StringBuilder(77)).append("refillBuffer() called when ").append(i).append(" bytes were already available in buffer").toString());
        }
        if (totalBytesRetired + bufferPos + i <= currentLimit) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (refillCallback != null)
        {
            refillCallback.onRefill();
        }
        if (input == null) goto _L1; else goto _L3
_L3:
        int j;
        j = bufferPos;
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
        if (j <= 0) goto _L1; else goto _L4
_L4:
        bufferSize = j + bufferSize;
        if ((totalBytesRetired + i) - sizeLimit > 0)
        {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        recomputeBufferSizeAfterLimit();
        if (bufferSize >= i)
        {
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void checkLastTagWas(int i)
    {
        if (lastTag != i)
        {
            throw InvalidProtocolBufferException.invalidEndTag();
        } else
        {
            return;
        }
    }

    public final void enableAliasing(boolean flag)
    {
        enableAliasing = flag;
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

    public final int getLastTag()
    {
        return lastTag;
    }

    public final int getTotalBytesRead()
    {
        return totalBytesRetired + bufferPos;
    }

    public final boolean isAtEnd()
    {
        return bufferPos == bufferSize && !tryRefillBuffer(1);
    }

    public final void popLimit(int i)
    {
        currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public final int pushLimit(int i)
    {
        if (i < 0)
        {
            throw InvalidProtocolBufferException.negativeSize();
        }
        i = totalBytesRetired + bufferPos + i;
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
    {
        return readRawVarint64() != 0L;
    }

    public final byte[] readByteArray()
    {
        int i = readRawVarint32();
        if (i <= bufferSize - bufferPos && i > 0)
        {
            byte abyte0[] = Arrays.copyOfRange(buffer, bufferPos, bufferPos + i);
            bufferPos = i + bufferPos;
            return abyte0;
        } else
        {
            return readRawBytesSlowPath(i);
        }
    }

    public final ByteBuffer readByteBuffer()
    {
        int i = readRawVarint32();
        if (i <= bufferSize - bufferPos && i > 0)
        {
            ByteBuffer bytebuffer;
            if (input == null && !bufferIsImmutable && enableAliasing)
            {
                bytebuffer = ByteBuffer.wrap(buffer, bufferPos, i).slice();
            } else
            {
                bytebuffer = ByteBuffer.wrap(Arrays.copyOfRange(buffer, bufferPos, bufferPos + i));
            }
            bufferPos = i + bufferPos;
            return bytebuffer;
        }
        if (i == 0)
        {
            return Internal.EMPTY_BYTE_BUFFER;
        } else
        {
            return ByteBuffer.wrap(readRawBytesSlowPath(i));
        }
    }

    public final ByteString readBytes()
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
            bufferPos = i + bufferPos;
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

    public final double readDouble()
    {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public final int readEnum()
    {
        return readRawVarint32();
    }

    public final int readFixed32()
    {
        return readRawLittleEndian32();
    }

    public final long readFixed64()
    {
        return readRawLittleEndian64();
    }

    public final float readFloat()
    {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public final MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionregistrylite)
    {
        if (recursionDepth >= recursionLimit)
        {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        } else
        {
            recursionDepth = recursionDepth + 1;
            parser = (MessageLite)parser.parsePartialFrom(this, extensionregistrylite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            recursionDepth = recursionDepth - 1;
            return parser;
        }
    }

    public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionregistrylite)
    {
        if (recursionDepth >= recursionLimit)
        {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        } else
        {
            recursionDepth = recursionDepth + 1;
            builder.mergeFrom(this, extensionregistrylite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            recursionDepth = recursionDepth - 1;
            return;
        }
    }

    public final int readInt32()
    {
        return readRawVarint32();
    }

    public final long readInt64()
    {
        return readRawVarint64();
    }

    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionregistrylite)
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

    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionregistrylite)
    {
        int i = readRawVarint32();
        if (recursionDepth >= recursionLimit)
        {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        } else
        {
            i = pushLimit(i);
            recursionDepth = recursionDepth + 1;
            builder.mergeFrom(this, extensionregistrylite);
            checkLastTagWas(0);
            recursionDepth = recursionDepth - 1;
            popLimit(i);
            return;
        }
    }

    public final byte readRawByte()
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

    public final byte[] readRawBytes(int i)
    {
        int j = bufferPos;
        if (i <= bufferSize - j && i > 0)
        {
            bufferPos = j + i;
            return Arrays.copyOfRange(buffer, j, j + i);
        } else
        {
            return readRawBytesSlowPath(i);
        }
    }

    public final int readRawLittleEndian32()
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
        j = abyte0[i];
        byte byte0 = abyte0[i + 1];
        byte byte1 = abyte0[i + 2];
        return (abyte0[i + 3] & 0xff) << 24 | (j & 0xff | (byte0 & 0xff) << 8 | (byte1 & 0xff) << 16);
    }

    public final long readRawLittleEndian64()
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
        long l = abyte0[i];
        long l1 = abyte0[i + 1];
        long l2 = abyte0[i + 2];
        long l3 = abyte0[i + 3];
        long l4 = abyte0[i + 4];
        long l5 = abyte0[i + 5];
        long l6 = abyte0[i + 6];
        return ((long)abyte0[i + 7] & 255L) << 56 | (l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48);
    }

    public final int readRawVarint32()
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
        if ((long)k >= 0L) goto _L5; else goto _L4
_L4:
        j = (int)((long)k ^ -128L);
_L11:
        bufferPos = i;
        return j;
_L5:
        int l;
        j = i + 1;
        k ^= abyte0[i] << 14;
        if ((long)k >= 0L)
        {
            k = (int)((long)k ^ 16256L);
            i = j;
            j = k;
            continue; /* Loop/switch isn't completed */
        }
        i = j + 1;
        k ^= abyte0[j] << 21;
        if ((long)k < 0L)
        {
            j = (int)((long)k ^ 0xffffffffffe03f80L);
            continue; /* Loop/switch isn't completed */
        }
        l = i + 1;
        j = abyte0[i];
        k = (int)((long)(k ^ j << 28) ^ 0xfe03f80L);
        i = l;
        if (j >= 0) goto _L7; else goto _L6
_L6:
        int i1;
        i1 = l + 1;
        j = k;
        i = i1;
        if (abyte0[l] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = i1 + 1;
        i = l;
        if (abyte0[i1] >= 0) goto _L7; else goto _L8
_L8:
        i1 = l + 1;
        j = k;
        i = i1;
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

    public final long readRawVarint64()
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
        long l;
        i = j + 1;
        l = k ^ abyte0[j] << 7;
        if (l >= 0L) goto _L5; else goto _L4
_L4:
        l ^= -128L;
_L9:
        bufferPos = i;
        return l;
_L5:
        j = i + 1;
        l ^= abyte0[i] << 14;
        if (l >= 0L)
        {
            l ^= 16256L;
            i = j;
            continue; /* Loop/switch isn't completed */
        }
        i = j + 1;
        l ^= abyte0[j] << 21;
        if (l < 0L)
        {
            l ^= 0xffffffffffe03f80L;
            continue; /* Loop/switch isn't completed */
        }
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

    final long readRawVarint64SlowPath()
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

    public final int readSFixed32()
    {
        return readRawLittleEndian32();
    }

    public final long readSFixed64()
    {
        return readRawLittleEndian64();
    }

    public final int readSInt32()
    {
        return decodeZigZag32(readRawVarint32());
    }

    public final long readSInt64()
    {
        return decodeZigZag64(readRawVarint64());
    }

    public final String readString()
    {
        int i = readRawVarint32();
        if (i <= bufferSize - bufferPos && i > 0)
        {
            String s = new String(buffer, bufferPos, i, "UTF-8");
            bufferPos = i + bufferPos;
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

    public final String readStringRequireUtf8()
    {
        int j = readRawVarint32();
        int i = bufferPos;
        byte abyte0[];
        if (j <= bufferSize - i && j > 0)
        {
            abyte0 = buffer;
            bufferPos = i + j;
        } else
        {
            if (j == 0)
            {
                return "";
            }
            abyte0 = readRawBytesSlowPath(j);
            i = 0;
        }
        if (!Utf8.isValidUtf8(abyte0, i, i + j))
        {
            throw InvalidProtocolBufferException.invalidUtf8();
        } else
        {
            return new String(abyte0, i, j, "UTF-8");
        }
    }

    public final int readTag()
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

    public final int readUInt32()
    {
        return readRawVarint32();
    }

    public final long readUInt64()
    {
        return readRawVarint64();
    }

    public final void readUnknownGroup(int i, MessageLite.Builder builder)
    {
        readGroup(i, builder, null);
    }

    public final void resetSizeCounter()
    {
        totalBytesRetired = -bufferPos;
    }

    public final int setRecursionLimit(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(47)).append("Recursion limit cannot be negative: ").append(i).toString());
        } else
        {
            int j = recursionLimit;
            recursionLimit = i;
            return j;
        }
    }

    public final int setSizeLimit(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(42)).append("Size limit cannot be negative: ").append(i).toString());
        } else
        {
            int j = sizeLimit;
            sizeLimit = i;
            return j;
        }
    }

    public final boolean skipField(int i)
    {
        switch (WireFormat.getTagWireType(i))
        {
        default:
            throw InvalidProtocolBufferException.invalidWireType();

        case 0: // '\0'
            skipRawVarint();
            return true;

        case 1: // '\001'
            skipRawBytes(8);
            return true;

        case 2: // '\002'
            skipRawBytes(readRawVarint32());
            return true;

        case 3: // '\003'
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            skipRawBytes(4);
            break;
        }
        return true;
    }

    public final boolean skipField(int i, CodedOutputStream codedoutputstream)
    {
        int j;
        switch (WireFormat.getTagWireType(i))
        {
        default:
            throw InvalidProtocolBufferException.invalidWireType();

        case 0: // '\0'
            long l = readInt64();
            codedoutputstream.writeRawVarint32(i);
            codedoutputstream.writeUInt64NoTag(l);
            return true;

        case 1: // '\001'
            long l1 = readRawLittleEndian64();
            codedoutputstream.writeRawVarint32(i);
            codedoutputstream.writeFixed64NoTag(l1);
            return true;

        case 2: // '\002'
            ByteString bytestring = readBytes();
            codedoutputstream.writeRawVarint32(i);
            codedoutputstream.writeBytesNoTag(bytestring);
            return true;

        case 3: // '\003'
            codedoutputstream.writeRawVarint32(i);
            skipMessage(codedoutputstream);
            i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(i);
            codedoutputstream.writeRawVarint32(i);
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            j = readRawLittleEndian32();
            break;
        }
        codedoutputstream.writeRawVarint32(i);
        codedoutputstream.writeFixed32NoTag(j);
        return true;
    }

    public final void skipMessage()
    {
        int i;
        do
        {
            i = readTag();
        } while (i != 0 && skipField(i));
    }

    public final void skipMessage(CodedOutputStream codedoutputstream)
    {
        int i;
        do
        {
            i = readTag();
        } while (i != 0 && skipField(i, codedoutputstream));
    }

    public final void skipRawBytes(int i)
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



    /* member class not found */
    class RefillCallback {}

}
