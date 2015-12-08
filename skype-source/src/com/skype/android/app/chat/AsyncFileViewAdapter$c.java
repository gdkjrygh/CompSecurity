// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            AsyncFileViewAdapter

private static final class  extends Enum
{

    private static final NO_NETWORK $VALUES[];
    public static final NO_NETWORK EXPIRED;
    public static final NO_NETWORK MALWARE_DETECTED;
    public static final NO_NETWORK NO_NETWORK;
    public static final NO_NETWORK QUEUED;
    public static final NO_NETWORK SCANNING_MALWARE;
    public static final NO_NETWORK UPLOADING;
    public static final NO_NETWORK UPLOAD_COMPLETED;
    public static final NO_NETWORK UPLOAD_FAILED_GENERIC;
    public static final NO_NETWORK UPLOAD_FAILED_TOO_BIG;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/AsyncFileViewAdapter$c, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        QUEUED = new <init>("QUEUED", 0);
        UPLOADING = new <init>("UPLOADING", 1);
        SCANNING_MALWARE = new <init>("SCANNING_MALWARE", 2);
        UPLOAD_COMPLETED = new <init>("UPLOAD_COMPLETED", 3);
        MALWARE_DETECTED = new <init>("MALWARE_DETECTED", 4);
        EXPIRED = new <init>("EXPIRED", 5);
        UPLOAD_FAILED_TOO_BIG = new <init>("UPLOAD_FAILED_TOO_BIG", 6);
        UPLOAD_FAILED_GENERIC = new <init>("UPLOAD_FAILED_GENERIC", 7);
        NO_NETWORK = new <init>("NO_NETWORK", 8);
        $VALUES = (new .VALUES[] {
            QUEUED, UPLOADING, SCANNING_MALWARE, UPLOAD_COMPLETED, MALWARE_DETECTED, EXPIRED, UPLOAD_FAILED_TOO_BIG, UPLOAD_FAILED_GENERIC, NO_NETWORK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
