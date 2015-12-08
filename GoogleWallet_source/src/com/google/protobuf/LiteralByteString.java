// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.protobuf:
//            ByteString, RopeByteString, Utf8

class LiteralByteString extends ByteString
{
    final class LiteralByteIterator
        implements ByteString.ByteIterator
    {

        private final int limit;
        private int position;
        final LiteralByteString this$0;

        private Byte next()
        {
            return Byte.valueOf(nextByte());
        }

        public final boolean hasNext()
        {
            return position < limit;
        }

        public final volatile Object next()
        {
            return next();
        }

        public final byte nextByte()
        {
            byte byte0;
            byte abyte0[];
            int i;
            try
            {
                abyte0 = bytes;
                i = position;
                position = i + 1;
            }
            catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
            {
                throw new NoSuchElementException(arrayindexoutofboundsexception.getMessage());
            }
            byte0 = abyte0[i];
            return byte0;
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private LiteralByteIterator()
        {
            this$0 = LiteralByteString.this;
            super();
            position = 0;
            limit = size();
        }

    }


    protected final byte bytes[];
    private int hash;

    LiteralByteString(byte abyte0[])
    {
        hash = 0;
        bytes = abyte0;
    }

    private static int hashCode(int i, byte abyte0[], int j, int k)
    {
        for (int l = j; l < j + k; l++)
        {
            i = i * 31 + abyte0[l];
        }

        return i;
    }

    protected void copyToInternal(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(bytes, i, abyte0, j, k);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ByteString))
        {
            return false;
        }
        if (size() != ((ByteString)obj).size())
        {
            return false;
        }
        if (size() == 0)
        {
            return true;
        }
        if (obj instanceof LiteralByteString)
        {
            LiteralByteString literalbytestring = (LiteralByteString)obj;
            if (hash != 0 && literalbytestring.hash != 0 && hash != literalbytestring.hash)
            {
                return false;
            } else
            {
                return equalsRange((LiteralByteString)obj, 0, size());
            }
        }
        if (obj instanceof RopeByteString)
        {
            return obj.equals(this);
        } else
        {
            obj = String.valueOf(obj.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 49)).append("Has a new type of ByteString been created? Found ").append(((String) (obj))).toString());
        }
    }

    final boolean equalsRange(LiteralByteString literalbytestring, int i, int j)
    {
        if (j > literalbytestring.size())
        {
            i = size();
            throw new IllegalArgumentException((new StringBuilder(40)).append("Length too large: ").append(j).append(i).toString());
        }
        if (i + j > literalbytestring.size())
        {
            int k = literalbytestring.size();
            throw new IllegalArgumentException((new StringBuilder(59)).append("Ran off end of other: ").append(i).append(", ").append(j).append(", ").append(k).toString());
        }
        byte abyte0[] = bytes;
        byte abyte1[] = literalbytestring.bytes;
        int i1 = getOffsetIntoBytes();
        int l = getOffsetIntoBytes();
        for (i = literalbytestring.getOffsetIntoBytes() + i; l < i1 + j; i++)
        {
            if (abyte0[l] != abyte1[i])
            {
                return false;
            }
            l++;
        }

        return true;
    }

    protected int getOffsetIntoBytes()
    {
        return 0;
    }

    protected final int getTreeDepth()
    {
        return 0;
    }

    public int hashCode()
    {
        int j = hash;
        int i = j;
        if (j == 0)
        {
            i = size();
            int k = partialHash(i, 0, i);
            i = k;
            if (k == 0)
            {
                i = 1;
            }
            hash = i;
        }
        return i;
    }

    protected final boolean isBalanced()
    {
        return true;
    }

    public final boolean isValidUtf8()
    {
        int i = getOffsetIntoBytes();
        return Utf8.isValidUtf8(bytes, i, size() + i);
    }

    public ByteString.ByteIterator iterator()
    {
        return new LiteralByteIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    protected final int partialHash(int i, int j, int k)
    {
        return hashCode(i, bytes, getOffsetIntoBytes() + j, k);
    }

    protected final int partialIsValidUtf8(int i, int j, int k)
    {
        j = getOffsetIntoBytes() + j;
        return Utf8.partialIsValidUtf8(i, bytes, j, j + k);
    }

    protected final int peekCachedHashCode()
    {
        return hash;
    }

    public int size()
    {
        return bytes.length;
    }

    public final String toString(String s)
        throws UnsupportedEncodingException
    {
        if (size() == 0 && "UTF-8".equals(s))
        {
            return "";
        } else
        {
            return new String(bytes, getOffsetIntoBytes(), size(), s);
        }
    }

    final void writeToInternal(OutputStream outputstream, int i, int j)
        throws IOException
    {
        outputstream.write(bytes, getOffsetIntoBytes() + i, j);
    }
}
