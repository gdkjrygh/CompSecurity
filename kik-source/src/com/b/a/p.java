// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            s

public final class p extends s
{

    private p(String s1)
    {
        super(s1);
    }

    private p(String s1, Throwable throwable)
    {
        super(s1, throwable);
    }

    static p a()
    {
        return new p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static p a(Throwable throwable)
    {
        return new p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.", throwable);
    }

    static p b()
    {
        return new p("CodedInput encountered an embedded string or bytes that misreported its size.");
    }

    static p c()
    {
        return new p("CodedInput encountered an embedded string or message which claimed to have negative size.");
    }

    static p d()
    {
        return new p("CodedInput encountered a malformed varint.");
    }

    static p e()
    {
        return new p("Protocol message contained an invalid tag (zero).");
    }

    static p f()
    {
        return new p("Protocol message end-group tag did not match expected tag.");
    }

    static p g()
    {
        return new p("Protocol message tag had invalid wire type.");
    }

    static p h()
    {
        return new p("Protocol message was too large.  May be malicious.  Use CodedInput.setSizeLimit() to increase the size limit.");
    }
}
