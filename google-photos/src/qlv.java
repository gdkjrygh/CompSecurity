// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class qlv extends IOException
{

    private static final long serialVersionUID = 0xe9924688c2f20054L;

    public qlv(String s)
    {
        super(s);
    }

    static qlv a()
    {
        return new qlv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static qlv b()
    {
        return new qlv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static qlv c()
    {
        return new qlv("CodedInputStream encountered a malformed varint.");
    }

    static qlv d()
    {
        return new qlv("Protocol message contained an invalid tag (zero).");
    }

    static qlv e()
    {
        return new qlv("Protocol message end-group tag did not match expected tag.");
    }

    static qlv f()
    {
        return new qlv("Protocol message tag had invalid wire type.");
    }

    static qlv g()
    {
        return new qlv("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
