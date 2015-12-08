// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AuthorizationClient

static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CANCEL;
    public static final ERROR ERROR;
    public static final ERROR SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        CANCEL = new <init>("CANCEL", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            SUCCESS, CANCEL, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
