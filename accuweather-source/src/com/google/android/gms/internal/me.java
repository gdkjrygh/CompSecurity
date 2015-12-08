// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

public class me extends IOException
{

    public me(String s)
    {
        super(s);
    }

    static me nN()
    {
        return new me("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static me nO()
    {
        return new me("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static me nP()
    {
        return new me("CodedInputStream encountered a malformed varint.");
    }

    static me nQ()
    {
        return new me("Protocol message contained an invalid tag (zero).");
    }

    static me nR()
    {
        return new me("Protocol message end-group tag did not match expected tag.");
    }

    static me nS()
    {
        return new me("Protocol message tag had invalid wire type.");
    }

    static me nT()
    {
        return new me("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
