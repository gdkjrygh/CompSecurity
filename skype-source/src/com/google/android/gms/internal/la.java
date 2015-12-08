// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

public final class la extends IOException
{

    private la(String s)
    {
        super(s);
    }

    static la a()
    {
        return new la("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static la b()
    {
        return new la("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static la c()
    {
        return new la("CodedInputStream encountered a malformed varint.");
    }

    static la d()
    {
        return new la("Protocol message contained an invalid tag (zero).");
    }

    static la e()
    {
        return new la("Protocol message end-group tag did not match expected tag.");
    }

    static la f()
    {
        return new la("Protocol message tag had invalid wire type.");
    }

    static la g()
    {
        return new la("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
