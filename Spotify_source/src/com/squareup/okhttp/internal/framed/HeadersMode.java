// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;


public final class HeadersMode extends Enum
{

    public static final HeadersMode a;
    public static final HeadersMode b;
    public static final HeadersMode c;
    public static final HeadersMode d;
    private static final HeadersMode e[];

    private HeadersMode(String s, int i)
    {
        super(s, i);
    }

    public static HeadersMode valueOf(String s)
    {
        return (HeadersMode)Enum.valueOf(com/squareup/okhttp/internal/framed/HeadersMode, s);
    }

    public static HeadersMode[] values()
    {
        return (HeadersMode[])e.clone();
    }

    static 
    {
        a = new HeadersMode("SPDY_SYN_STREAM", 0);
        b = new HeadersMode("SPDY_REPLY", 1);
        c = new HeadersMode("SPDY_HEADERS", 2);
        d = new HeadersMode("HTTP_20_HEADERS", 3);
        e = (new HeadersMode[] {
            a, b, c, d
        });
    }
}
