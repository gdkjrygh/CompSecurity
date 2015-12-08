// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;


// Referenced classes of package com.fitbit.serverinteraction:
//            RequestParametersBuilder

public static final class contentType extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    final String contentType;

    public static contentType valueOf(String s)
    {
        return (contentType)Enum.valueOf(com/fitbit/serverinteraction/RequestParametersBuilder$RequestParameters$ContentType, s);
    }

    public static contentType[] values()
    {
        return (contentType[])e.clone();
    }

    static 
    {
        a = new <init>("DEFAULT", 0, "application/x-www-form-urlencoded;charset=UTF-8");
        b = new <init>("TEXT_PLAIN", 1, "text/plain");
        c = new <init>("XML", 2, "text/xml");
        d = new <init>("BINARY_CONTENT_TYPE", 3, "application/octet-stream;charset=UTF-8");
        e = (new e[] {
            a, b, c, d
        });
    }

    private Y(String s, int i, String s1)
    {
        super(s, i);
        contentType = s1;
    }
}
