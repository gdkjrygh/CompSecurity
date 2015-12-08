// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;


// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpURLConnectionImpl

static final class  extends Enum
{

    private static final DIFFERENT_CONNECTION $VALUES[];
    public static final DIFFERENT_CONNECTION DIFFERENT_CONNECTION;
    public static final DIFFERENT_CONNECTION NONE;
    public static final DIFFERENT_CONNECTION SAME_CONNECTION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        SAME_CONNECTION = new <init>("SAME_CONNECTION", 1);
        DIFFERENT_CONNECTION = new <init>("DIFFERENT_CONNECTION", 2);
        $VALUES = (new .VALUES[] {
            NONE, SAME_CONNECTION, DIFFERENT_CONNECTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
