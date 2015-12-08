// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            be

public final class av extends IOException
{

    private be a;

    public av(String s)
    {
        super(s);
        a = null;
    }

    static av b()
    {
        return new av("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static av c()
    {
        return new av("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static av d()
    {
        return new av("CodedInputStream encountered a malformed varint.");
    }

    static av e()
    {
        return new av("Protocol message contained an invalid tag (zero).");
    }

    static av f()
    {
        return new av("Protocol message end-group tag did not match expected tag.");
    }

    static av g()
    {
        return new av("Protocol message tag had invalid wire type.");
    }

    static av h()
    {
        return new av("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static av i()
    {
        return new av("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static av j()
    {
        return new av("Protocol message had invalid UTF-8.");
    }

    public final av a(be be)
    {
        a = be;
        return this;
    }

    public final be a()
    {
        return a;
    }
}
