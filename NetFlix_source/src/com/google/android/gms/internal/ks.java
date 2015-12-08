// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

public class ks extends IOException
{

    public ks(String s)
    {
        super(s);
    }

    static ks mA()
    {
        return new ks("CodedInputStream encountered a malformed varint.");
    }

    static ks mB()
    {
        return new ks("Protocol message contained an invalid tag (zero).");
    }

    static ks mC()
    {
        return new ks("Protocol message end-group tag did not match expected tag.");
    }

    static ks mD()
    {
        return new ks("Protocol message tag had invalid wire type.");
    }

    static ks mE()
    {
        return new ks("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static ks my()
    {
        return new ks("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static ks mz()
    {
        return new ks("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
