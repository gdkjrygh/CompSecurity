// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

public class pm extends IOException
{

    public pm(String s)
    {
        super(s);
    }

    static pm qA()
    {
        return new pm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static pm qB()
    {
        return new pm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static pm qC()
    {
        return new pm("CodedInputStream encountered a malformed varint.");
    }

    static pm qD()
    {
        return new pm("Protocol message contained an invalid tag (zero).");
    }

    static pm qE()
    {
        return new pm("Protocol message end-group tag did not match expected tag.");
    }

    static pm qF()
    {
        return new pm("Protocol message tag had invalid wire type.");
    }

    static pm qG()
    {
        return new pm("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
