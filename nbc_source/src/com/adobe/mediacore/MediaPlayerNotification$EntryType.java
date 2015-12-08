// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerNotification

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR INFO;
    public static final ERROR WARN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$EntryType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INFO = new <init>("INFO", 0);
        WARN = new <init>("WARN", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            INFO, WARN, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
