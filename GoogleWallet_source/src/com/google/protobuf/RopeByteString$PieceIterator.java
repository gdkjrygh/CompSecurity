// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

// Referenced classes of package com.google.protobuf:
//            RopeByteString, LiteralByteString, ByteString

static final class <init>
    implements Iterator
{

    private final Stack breadCrumbs;
    private LiteralByteString next;

    private LiteralByteString getLeafByLeft(ByteString bytestring)
    {
        for (; bytestring instanceof RopeByteString; bytestring = RopeByteString.access$400(bytestring))
        {
            bytestring = (RopeByteString)bytestring;
            breadCrumbs.push(bytestring);
        }

        return (LiteralByteString)bytestring;
    }

    private LiteralByteString getNextNonEmptyLeaf()
    {
        LiteralByteString literalbytestring;
        do
        {
            if (breadCrumbs.isEmpty())
            {
                return null;
            }
            literalbytestring = getLeafByLeft(RopeByteString.access$500((RopeByteString)breadCrumbs.pop()));
        } while (literalbytestring.isEmpty());
        return literalbytestring;
    }

    public final boolean hasNext()
    {
        return next != null;
    }

    public final LiteralByteString next()
    {
        if (next == null)
        {
            throw new NoSuchElementException();
        } else
        {
            LiteralByteString literalbytestring = next;
            next = getNextNonEmptyLeaf();
            return literalbytestring;
        }
    }

    public final volatile Object next()
    {
        return next();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    private (ByteString bytestring)
    {
        breadCrumbs = new Stack();
        next = getLeafByLeft(bytestring);
    }

    getLeafByLeft(ByteString bytestring, getLeafByLeft getleafbyleft)
    {
        this(bytestring);
    }
}
