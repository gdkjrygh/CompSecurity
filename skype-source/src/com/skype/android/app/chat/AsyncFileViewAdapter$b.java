// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            AsyncFileViewAdapter

private static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CANCELED;
    public static final ERROR DOWNLOADING;
    public static final ERROR DOWNLOAD_COMPLETED;
    public static final ERROR DOWNLOAD_NOT_STARTED;
    public static final ERROR ERROR;
    public static final ERROR EXPIRED;
    public static final ERROR NO_NETWORK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/AsyncFileViewAdapter$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DOWNLOAD_NOT_STARTED = new <init>("DOWNLOAD_NOT_STARTED", 0);
        DOWNLOADING = new <init>("DOWNLOADING", 1);
        DOWNLOAD_COMPLETED = new <init>("DOWNLOAD_COMPLETED", 2);
        NO_NETWORK = new <init>("NO_NETWORK", 3);
        EXPIRED = new <init>("EXPIRED", 4);
        CANCELED = new <init>("CANCELED", 5);
        ERROR = new <init>("ERROR", 6);
        $VALUES = (new .VALUES[] {
            DOWNLOAD_NOT_STARTED, DOWNLOADING, DOWNLOAD_COMPLETED, NO_NETWORK, EXPIRED, CANCELED, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
