// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.protobuf:
//            LiteralByteString, RopeByteString, Internal

public abstract class ByteString
    implements Serializable, Iterable
{
    public static interface ByteIterator
        extends Iterator
    {

        public abstract byte nextByte();
    }

    public static final class Output extends OutputStream
    {

        private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
        private byte buffer[];
        private int bufferPos;
        private final ArrayList flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        private static byte[] copyArray(byte abyte0[], int i)
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 0, abyte1, 0, Math.min(abyte0.length, i));
            return abyte1;
        }

        private void flushFullBuffer(int i)
        {
            flushedBuffers.add(new LiteralByteString(buffer));
            flushedBuffersTotalBytes = flushedBuffersTotalBytes + buffer.length;
            buffer = new byte[Math.max(initialCapacity, Math.max(i, flushedBuffersTotalBytes >>> 1))];
            bufferPos = 0;
        }

        private void flushLastBuffer()
        {
            if (bufferPos < buffer.length)
            {
                if (bufferPos > 0)
                {
                    byte abyte0[] = copyArray(buffer, bufferPos);
                    flushedBuffers.add(new LiteralByteString(abyte0));
                }
            } else
            {
                flushedBuffers.add(new LiteralByteString(buffer));
                buffer = EMPTY_BYTE_ARRAY;
            }
            flushedBuffersTotalBytes = flushedBuffersTotalBytes + bufferPos;
            bufferPos = 0;
        }

        private int size()
        {
            this;
            JVM INSTR monitorenter ;
            int i;
            int j;
            i = flushedBuffersTotalBytes;
            j = bufferPos;
            this;
            JVM INSTR monitorexit ;
            return i + j;
            Exception exception;
            exception;
            throw exception;
        }

        public final ByteString toByteString()
        {
            this;
            JVM INSTR monitorenter ;
            ByteString bytestring;
            flushLastBuffer();
            bytestring = ByteString.copyFrom(flushedBuffers);
            this;
            JVM INSTR monitorexit ;
            return bytestring;
            Exception exception;
            exception;
            throw exception;
        }

        public final String toString()
        {
            return String.format("<ByteString.Output@%s size=%d>", new Object[] {
                Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())
            });
        }

        public final void write(int i)
        {
            this;
            JVM INSTR monitorenter ;
            byte abyte0[];
            int j;
            if (bufferPos == buffer.length)
            {
                flushFullBuffer(1);
            }
            abyte0 = buffer;
            j = bufferPos;
            bufferPos = j + 1;
            abyte0[j] = (byte)i;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void write(byte abyte0[], int i, int j)
        {
            this;
            JVM INSTR monitorenter ;
            if (j > buffer.length - bufferPos) goto _L2; else goto _L1
_L1:
            System.arraycopy(abyte0, i, buffer, bufferPos, j);
            bufferPos = bufferPos + j;
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            int k;
            k = buffer.length - bufferPos;
            System.arraycopy(abyte0, i, buffer, bufferPos, k);
            j -= k;
            flushFullBuffer(j);
            System.arraycopy(abyte0, i + k, buffer, 0, j);
            bufferPos = j;
            if (true) goto _L4; else goto _L3
_L3:
            abyte0;
            throw abyte0;
        }


        Output(int i)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException("Buffer size < 0");
            } else
            {
                initialCapacity = i;
                flushedBuffers = new ArrayList();
                buffer = new byte[i];
                return;
            }
        }
    }


    static final boolean $assertionsDisabled;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    ByteString()
    {
    }

    private static ByteString balancedConcat(Iterator iterator1, int i)
    {
        if (!$assertionsDisabled && i <= 0)
        {
            throw new AssertionError();
        }
        if (i == 1)
        {
            return (ByteString)iterator1.next();
        } else
        {
            int j = i >>> 1;
            return balancedConcat(iterator1, j).concat(balancedConcat(iterator1, i - j));
        }
    }

    public static ByteString copyFrom(Iterable iterable)
    {
        if (!(iterable instanceof Collection))
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator1 = iterable.iterator();
            do
            {
                iterable = arraylist;
                if (!iterator1.hasNext())
                {
                    break;
                }
                arraylist.add((ByteString)iterator1.next());
            } while (true);
        } else
        {
            iterable = (Collection)iterable;
        }
        if (iterable.isEmpty())
        {
            return EMPTY;
        } else
        {
            return balancedConcat(iterable.iterator(), iterable.size());
        }
    }

    public static ByteString copyFrom(byte abyte0[])
    {
        return copyFrom(abyte0, 0, abyte0.length);
    }

    public static ByteString copyFrom(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new LiteralByteString(abyte1);
    }

    public static Output newOutput(int i)
    {
        return new Output(i);
    }

    public final ByteString concat(ByteString bytestring)
    {
        int i = size();
        int j = bytestring.size();
        if ((long)i + (long)j >= 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder(53)).append("ByteString would be too long: ").append(i).append("+").append(j).toString());
        } else
        {
            return RopeByteString.concatenate(this, bytestring);
        }
    }

    public final void copyTo(byte abyte0[], int i, int j, int k)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Source offset < 0: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Target offset < 0: ").append(j).toString());
        }
        if (k < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(23)).append("Length < 0: ").append(k).toString());
        }
        if (i + k > size())
        {
            throw new IndexOutOfBoundsException((new StringBuilder(34)).append("Source end offset < 0: ").append(i + k).toString());
        }
        if (j + k > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(34)).append("Target end offset < 0: ").append(j + k).toString());
        }
        if (k > 0)
        {
            copyToInternal(abyte0, i, j, k);
        }
    }

    protected abstract void copyToInternal(byte abyte0[], int i, int j, int k);

    public abstract boolean equals(Object obj);

    protected abstract int getTreeDepth();

    public abstract int hashCode();

    protected abstract boolean isBalanced();

    public final boolean isEmpty()
    {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract ByteIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    protected abstract int partialHash(int i, int j, int k);

    protected abstract int partialIsValidUtf8(int i, int j, int k);

    protected abstract int peekCachedHashCode();

    public abstract int size();

    public final byte[] toByteArray()
    {
        int i = size();
        if (i == 0)
        {
            return Internal.EMPTY_BYTE_ARRAY;
        } else
        {
            byte abyte0[] = new byte[i];
            copyToInternal(abyte0, 0, 0, i);
            return abyte0;
        }
    }

    public String toString()
    {
        return String.format("<ByteString@%s size=%d>", new Object[] {
            Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())
        });
    }

    public abstract String toString(String s)
        throws UnsupportedEncodingException;

    public final String toStringUtf8()
    {
        String s;
        try
        {
            s = toString("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("UTF-8 not supported?", unsupportedencodingexception);
        }
        return s;
    }

    final void writeTo(OutputStream outputstream, int i, int j)
        throws IOException
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Source offset < 0: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(23)).append("Length < 0: ").append(j).toString());
        }
        if (i + j > size())
        {
            throw new IndexOutOfBoundsException((new StringBuilder(39)).append("Source end offset exceeded: ").append(i + j).toString());
        }
        if (j > 0)
        {
            writeToInternal(outputstream, i, j);
        }
    }

    abstract void writeToInternal(OutputStream outputstream, int i, int j)
        throws IOException;

    static 
    {
        boolean flag;
        if (!com/google/protobuf/ByteString.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
