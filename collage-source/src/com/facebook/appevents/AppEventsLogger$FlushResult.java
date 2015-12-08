// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

private static final class  extends Enum
{

    private static final UNKNOWN_ERROR $VALUES[];
    public static final UNKNOWN_ERROR NO_CONNECTIVITY;
    public static final UNKNOWN_ERROR SERVER_ERROR;
    public static final UNKNOWN_ERROR SUCCESS;
    public static final UNKNOWN_ERROR UNKNOWN_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        SERVER_ERROR = new <init>("SERVER_ERROR", 1);
        NO_CONNECTIVITY = new <init>("NO_CONNECTIVITY", 2);
        UNKNOWN_ERROR = new <init>("UNKNOWN_ERROR", 3);
        $VALUES = (new .VALUES[] {
            SUCCESS, SERVER_ERROR, NO_CONNECTIVITY, UNKNOWN_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
