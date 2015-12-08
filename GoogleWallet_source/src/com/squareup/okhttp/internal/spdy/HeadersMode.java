// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;


public final class HeadersMode extends Enum
{

    private static final HeadersMode $VALUES[];
    public static final HeadersMode HTTP_20_HEADERS;
    public static final HeadersMode SPDY_HEADERS;
    public static final HeadersMode SPDY_REPLY;
    public static final HeadersMode SPDY_SYN_STREAM;

    private HeadersMode(String s, int i)
    {
        super(s, i);
    }

    public static HeadersMode valueOf(String s)
    {
        return (HeadersMode)Enum.valueOf(com/squareup/okhttp/internal/spdy/HeadersMode, s);
    }

    public static HeadersMode[] values()
    {
        return (HeadersMode[])$VALUES.clone();
    }

    public final boolean failIfHeadersAbsent()
    {
        return this == SPDY_HEADERS;
    }

    public final boolean failIfHeadersPresent()
    {
        return this == SPDY_REPLY;
    }

    public final boolean failIfStreamAbsent()
    {
        return this == SPDY_REPLY || this == SPDY_HEADERS;
    }

    public final boolean failIfStreamPresent()
    {
        return this == SPDY_SYN_STREAM;
    }

    static 
    {
        SPDY_SYN_STREAM = new HeadersMode("SPDY_SYN_STREAM", 0);
        SPDY_REPLY = new HeadersMode("SPDY_REPLY", 1);
        SPDY_HEADERS = new HeadersMode("SPDY_HEADERS", 2);
        HTTP_20_HEADERS = new HeadersMode("HTTP_20_HEADERS", 3);
        $VALUES = (new HeadersMode[] {
            SPDY_SYN_STREAM, SPDY_REPLY, SPDY_HEADERS, HTTP_20_HEADERS
        });
    }
}
