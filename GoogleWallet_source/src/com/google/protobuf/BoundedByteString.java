// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.protobuf:
//            LiteralByteString

final class BoundedByteString extends LiteralByteString
{
    final class BoundedByteIterator
        implements ByteString.ByteIterator
    {

        private final int limit;
        private int position;
        final BoundedByteString this$0;

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
            if (position >= limit)
            {
                throw new NoSuchElementException();
            } else
            {
                byte abyte0[] = bytes;
                int i = position;
                position = i + 1;
                return abyte0[i];
            }
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private BoundedByteIterator()
        {
            this$0 = BoundedByteString.this;
            super();
            position = getOffsetIntoBytes();
            limit = position + size();
        }

    }


    private final int bytesLength;
    private final int bytesOffset;

    BoundedByteString(byte abyte0[], int i, int j)
    {
        super(abyte0);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Offset too small: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Length too small: ").append(i).toString());
        }
        if ((long)i + (long)j > (long)abyte0.length)
        {
            throw new IllegalArgumentException((new StringBuilder(48)).append("Offset+Length too large: ").append(i).append("+").append(j).toString());
        } else
        {
            bytesOffset = i;
            bytesLength = j;
            return;
        }
    }

    protected final void copyToInternal(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(bytes, getOffsetIntoBytes() + i, abyte0, j, k);
    }

    protected final int getOffsetIntoBytes()
    {
        return bytesOffset;
    }

    public final ByteString.ByteIterator iterator()
    {
        return new BoundedByteIterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return bytesLength;
    }
}
