// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            q

public final class m extends IOException
{

    private static final long serialVersionUID = 0xe9924688c2f20054L;
    public q a;

    public m(String s)
    {
        super(s);
        a = null;
    }

    static m a()
    {
        return new m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static m b()
    {
        return new m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static m c()
    {
        return new m("CodedInputStream encountered a malformed varint.");
    }

    static m d()
    {
        return new m("Protocol message contained an invalid tag (zero).");
    }

    static m e()
    {
        return new m("Protocol message end-group tag did not match expected tag.");
    }

    static m f()
    {
        return new m("Protocol message tag had invalid wire type.");
    }

    static m g()
    {
        return new m("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static m h()
    {
        return new m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static m i()
    {
        return new m("Protocol message had invalid UTF-8.");
    }
}
