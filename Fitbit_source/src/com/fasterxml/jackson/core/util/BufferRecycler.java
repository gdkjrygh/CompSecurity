// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;


public class BufferRecycler
{
    public static final class ByteBufferType extends Enum
    {

        public static final ByteBufferType a;
        public static final ByteBufferType b;
        public static final ByteBufferType c;
        public static final ByteBufferType d;
        private static final ByteBufferType e[];
        protected final int size;

        public static ByteBufferType valueOf(String s)
        {
            return (ByteBufferType)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$ByteBufferType, s);
        }

        public static ByteBufferType[] values()
        {
            return (ByteBufferType[])e.clone();
        }

        static 
        {
            a = new ByteBufferType("READ_IO_BUFFER", 0, 4000);
            b = new ByteBufferType("WRITE_ENCODING_BUFFER", 1, 4000);
            c = new ByteBufferType("WRITE_CONCAT_BUFFER", 2, 2000);
            d = new ByteBufferType("BASE64_CODEC_BUFFER", 3, 2000);
            e = (new ByteBufferType[] {
                a, b, c, d
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

        public static final CharBufferType a;
        public static final CharBufferType b;
        public static final CharBufferType c;
        public static final CharBufferType d;
        private static final CharBufferType e[];
        protected final int size;

        public static CharBufferType valueOf(String s)
        {
            return (CharBufferType)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$CharBufferType, s);
        }

        public static CharBufferType[] values()
        {
            return (CharBufferType[])e.clone();
        }

        static 
        {
            a = new CharBufferType("TOKEN_BUFFER", 0, 2000);
            b = new CharBufferType("CONCAT_BUFFER", 1, 2000);
            c = new CharBufferType("TEXT_BUFFER", 2, 200);
            d = new CharBufferType("NAME_COPY_BUFFER", 3, 200);
            e = (new CharBufferType[] {
                a, b, c, d
            });
        }

        private CharBufferType(String s, int i, int j)
        {
            super(s, i);
            size = j;
        }
    }


    public static final int a = 2000;
    protected final byte b[][] = new byte[ByteBufferType.values().length][];
    protected final char c[][] = new char[CharBufferType.values().length][];

    public BufferRecycler()
    {
    }

    private byte[] a(int i)
    {
        return new byte[i];
    }

    private char[] b(int i)
    {
        return new char[i];
    }

    public final void a(ByteBufferType bytebuffertype, byte abyte0[])
    {
        b[bytebuffertype.ordinal()] = abyte0;
    }

    public final void a(CharBufferType charbuffertype, char ac[])
    {
        c[charbuffertype.ordinal()] = ac;
    }

    public final byte[] a(ByteBufferType bytebuffertype)
    {
        int i = bytebuffertype.ordinal();
        byte abyte0[] = b[i];
        if (abyte0 == null)
        {
            return a(bytebuffertype.size);
        } else
        {
            b[i] = null;
            return abyte0;
        }
    }

    public final char[] a(CharBufferType charbuffertype)
    {
        return a(charbuffertype, 0);
    }

    public final char[] a(CharBufferType charbuffertype, int i)
    {
        int j = i;
        if (charbuffertype.size > i)
        {
            j = charbuffertype.size;
        }
        i = charbuffertype.ordinal();
        charbuffertype = c[i];
        if (charbuffertype == null || charbuffertype.length < j)
        {
            return b(j);
        } else
        {
            c[i] = null;
            return charbuffertype;
        }
    }
}
