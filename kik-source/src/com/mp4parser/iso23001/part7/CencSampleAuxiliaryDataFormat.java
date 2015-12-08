// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso23001.part7;

import com.coremedia.iso.Hex;
import java.math.BigInteger;
import java.util.Arrays;

public class CencSampleAuxiliaryDataFormat
{
    private abstract class AbstractPair
        implements Pair
    {

        final CencSampleAuxiliaryDataFormat this$0;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Pair)obj;
                if (clear() != ((Pair) (obj)).clear())
                {
                    return false;
                }
                if (encrypted() != ((Pair) (obj)).encrypted())
                {
                    return false;
                }
            }
            return true;
        }

        public String toString()
        {
            return (new StringBuilder("P(")).append(clear()).append("|").append(encrypted()).append(")").toString();
        }

        private AbstractPair()
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super();
        }

        AbstractPair(AbstractPair abstractpair)
        {
            this();
        }
    }

    private class ByteBytePair extends AbstractPair
    {

        private byte clear;
        private byte encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public ByteBytePair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (byte)i;
            encrypted = (byte)(int)l;
        }
    }

    private class ByteIntPair extends AbstractPair
    {

        private byte clear;
        private int encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public ByteIntPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (byte)i;
            encrypted = (int)l;
        }
    }

    private class ByteLongPair extends AbstractPair
    {

        private byte clear;
        private long encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return encrypted;
        }

        public ByteLongPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (byte)i;
            encrypted = l;
        }
    }

    private class ByteShortPair extends AbstractPair
    {

        private byte clear;
        private short encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public ByteShortPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (byte)i;
            encrypted = (short)(int)l;
        }
    }

    private class IntBytePair extends AbstractPair
    {

        private int clear;
        private byte encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public IntBytePair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = i;
            encrypted = (byte)(int)l;
        }
    }

    private class IntIntPair extends AbstractPair
    {

        private int clear;
        private int encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public IntIntPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = i;
            encrypted = (int)l;
        }
    }

    private class IntLongPair extends AbstractPair
    {

        private int clear;
        private long encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return encrypted;
        }

        public IntLongPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = i;
            encrypted = l;
        }
    }

    private class IntShortPair extends AbstractPair
    {

        private int clear;
        private short encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public IntShortPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = i;
            encrypted = (short)(int)l;
        }
    }

    public static interface Pair
    {

        public abstract int clear();

        public abstract long encrypted();
    }

    private class ShortBytePair extends AbstractPair
    {

        private short clear;
        private byte encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public ShortBytePair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (short)i;
            encrypted = (byte)(int)l;
        }
    }

    private class ShortIntPair extends AbstractPair
    {

        private short clear;
        private int encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public ShortIntPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (short)i;
            encrypted = (int)l;
        }
    }

    private class ShortLongPair extends AbstractPair
    {

        private short clear;
        private long encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return encrypted;
        }

        public ShortLongPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (short)i;
            encrypted = l;
        }
    }

    private class ShortShortPair extends AbstractPair
    {

        private short clear;
        private short encrypted;
        final CencSampleAuxiliaryDataFormat this$0;

        public int clear()
        {
            return clear;
        }

        public long encrypted()
        {
            return (long)encrypted;
        }

        public ShortShortPair(int i, long l)
        {
            this$0 = CencSampleAuxiliaryDataFormat.this;
            super(null);
            clear = (short)i;
            encrypted = (short)(int)l;
        }
    }


    public byte iv[];
    public Pair pairs[];

    public CencSampleAuxiliaryDataFormat()
    {
        iv = new byte[0];
        pairs = null;
    }

    public Pair createPair(int i, long l)
    {
        if (i <= 127)
        {
            if (l <= 127L)
            {
                return new ByteBytePair(i, l);
            }
            if (l <= 32767L)
            {
                return new ByteShortPair(i, l);
            }
            if (l <= 0x7fffffffL)
            {
                return new ByteIntPair(i, l);
            } else
            {
                return new ByteLongPair(i, l);
            }
        }
        if (i <= 32767)
        {
            if (l <= 127L)
            {
                return new ShortBytePair(i, l);
            }
            if (l <= 32767L)
            {
                return new ShortShortPair(i, l);
            }
            if (l <= 0x7fffffffL)
            {
                return new ShortIntPair(i, l);
            } else
            {
                return new ShortLongPair(i, l);
            }
        }
        if (l <= 127L)
        {
            return new IntBytePair(i, l);
        }
        if (l <= 32767L)
        {
            return new IntShortPair(i, l);
        }
        if (l <= 0x7fffffffL)
        {
            return new IntIntPair(i, l);
        } else
        {
            return new IntLongPair(i, l);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CencSampleAuxiliaryDataFormat)obj;
            if (!(new BigInteger(iv)).equals(new BigInteger(((CencSampleAuxiliaryDataFormat) (obj)).iv)))
            {
                return false;
            }
            if (pairs == null ? ((CencSampleAuxiliaryDataFormat) (obj)).pairs != null : !Arrays.equals(pairs, ((CencSampleAuxiliaryDataFormat) (obj)).pairs))
            {
                return false;
            }
        }
        return true;
    }

    public int getSize()
    {
        int j = iv.length;
        int i = j;
        if (pairs != null)
        {
            i = j;
            if (pairs.length > 0)
            {
                i = j + 2 + pairs.length * 6;
            }
        }
        return i;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (iv != null)
        {
            i = Arrays.hashCode(iv);
        } else
        {
            i = 0;
        }
        if (pairs != null)
        {
            j = Arrays.hashCode(pairs);
        }
        return i * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{iv=")).append(Hex.encodeHex(iv)).append(", pairs=").append(Arrays.toString(pairs)).append('}').toString();
    }
}
