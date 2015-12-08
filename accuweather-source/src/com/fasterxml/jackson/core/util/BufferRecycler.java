// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;


public class BufferRecycler
{
    public static final class ByteBufferType extends Enum
    {

        private static final ByteBufferType $VALUES[];
        public static final ByteBufferType BASE64_CODEC_BUFFER;
        public static final ByteBufferType READ_IO_BUFFER;
        public static final ByteBufferType WRITE_CONCAT_BUFFER;
        public static final ByteBufferType WRITE_ENCODING_BUFFER;
        protected final int size;

        public static ByteBufferType valueOf(String s)
        {
            return (ByteBufferType)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$ByteBufferType, s);
        }

        public static ByteBufferType[] values()
        {
            return (ByteBufferType[])$VALUES.clone();
        }

        static 
        {
            READ_IO_BUFFER = new ByteBufferType("READ_IO_BUFFER", 0, 4000);
            WRITE_ENCODING_BUFFER = new ByteBufferType("WRITE_ENCODING_BUFFER", 1, 4000);
            WRITE_CONCAT_BUFFER = new ByteBufferType("WRITE_CONCAT_BUFFER", 2, 2000);
            BASE64_CODEC_BUFFER = new ByteBufferType("BASE64_CODEC_BUFFER", 3, 2000);
            $VALUES = (new ByteBufferType[] {
                READ_IO_BUFFER, WRITE_ENCODING_BUFFER, WRITE_CONCAT_BUFFER, BASE64_CODEC_BUFFER
            });
        }

        private ByteBufferType(String s, int i, int j)
        {
            super(s, i);
            size = j;
        }
    }

    public static final class CharBufferType extends Enum
    {

        private static final CharBufferType $VALUES[];
        public static final CharBufferType CONCAT_BUFFER;
        public static final CharBufferType NAME_COPY_BUFFER;
        public static final CharBufferType TEXT_BUFFER;
        public static final CharBufferType TOKEN_BUFFER;
        protected final int size;

        public static CharBufferType valueOf(String s)
        {
            return (CharBufferType)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$CharBufferType, s);
        }

        public static CharBufferType[] values()
        {
            return (CharBufferType[])$VALUES.clone();
        }

        static 
        {
            TOKEN_BUFFER = new CharBufferType("TOKEN_BUFFER", 0, 2000);
            CONCAT_BUFFER = new CharBufferType("CONCAT_BUFFER", 1, 2000);
            TEXT_BUFFER = new CharBufferType("TEXT_BUFFER", 2, 200);
            NAME_COPY_BUFFER = new CharBufferType("NAME_COPY_BUFFER", 3, 200);
            $VALUES = (new CharBufferType[] {
                TOKEN_BUFFER, CONCAT_BUFFER, TEXT_BUFFER, NAME_COPY_BUFFER
            });
        }

        private CharBufferType(String s, int i, int j)
        {
            super(s, i);
            size = j;
        }
    }


    public static final int DEFAULT_WRITE_CONCAT_BUFFER_LEN = 2000;
    protected final byte _byteBuffers[][] = new byte[ByteBufferType.values().length][];
    protected final char _charBuffers[][] = new char[CharBufferType.values().length][];

    public BufferRecycler()
    {
    }

    private byte[] balloc(int i)
    {
        return new byte[i];
    }

    private char[] calloc(int i)
    {
        return new char[i];
    }

    public final byte[] allocByteBuffer(ByteBufferType bytebuffertype)
    {
        int i = bytebuffertype.ordinal();
        byte abyte0[] = _byteBuffers[i];
        if (abyte0 == null)
        {
            return balloc(bytebuffertype.size);
        } else
        {
            _byteBuffers[i] = null;
            return abyte0;
        }
    }

    public final char[] allocCharBuffer(CharBufferType charbuffertype)
    {
        return allocCharBuffer(charbuffertype, 0);
    }

    public final char[] allocCharBuffer(CharBufferType charbuffertype, int i)
    {
        int j = i;
        if (charbuffertype.size > i)
        {
            j = charbuffertype.size;
        }
        i = charbuffertype.ordinal();
        charbuffertype = _charBuffers[i];
        if (charbuffertype == null || charbuffertype.length < j)
        {
            return calloc(j);
        } else
        {
            _charBuffers[i] = null;
            return charbuffertype;
        }
    }

    public final void releaseByteBuffer(ByteBufferType bytebuffertype, byte abyte0[])
    {
        _byteBuffers[bytebuffertype.ordinal()] = abyte0;
    }

    public final void releaseCharBuffer(CharBufferType charbuffertype, char ac[])
    {
        _charBuffers[charbuffertype.ordinal()] = ac;
    }
}
