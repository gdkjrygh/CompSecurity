// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//            RopeByteString, LiteralByteString

final class <init>
    implements <init>
{

    private  bytes;
    int bytesRemaining;
    private final  pieces;
    final RopeByteString this$0;

    private Byte next()
    {
        return Byte.valueOf(nextByte());
    }

    public final boolean hasNext()
    {
        return bytesRemaining > 0;
    }

    public final volatile Object next()
    {
        return next();
    }

    public final byte nextByte()
    {
        if (!bytes.bytes())
        {
            bytes = pieces.t().iterator();
        }
        bytesRemaining = bytesRemaining - 1;
        return bytes.();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    private _cls9()
    {
        this$0 = RopeByteString.this;
        super();
        pieces = new it>(RopeByteString.this, null);
        bytes = pieces.t().iterator();
        bytesRemaining = size();
    }

    bytesRemaining(bytesRemaining bytesremaining)
    {
        this();
    }
}
