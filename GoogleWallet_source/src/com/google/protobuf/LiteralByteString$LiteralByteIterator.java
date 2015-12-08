// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.protobuf:
//            LiteralByteString

final class <init>
    implements <init>
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

    private ()
    {
        this$0 = LiteralByteString.this;
        super();
        position = 0;
        limit = size();
    }

    limit(limit limit1)
    {
        this();
    }
}
