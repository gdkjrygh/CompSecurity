// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            MediaMailingMetadata

public static final class  extends Enum
{

    private static final PENDING $VALUES[];
    public static final PENDING FAILED;
    public static final PENDING PENDING;
    public static final PENDING SENDING;
    public static final PENDING SENDING_ON_UPLOAD;
    public static final PENDING SENT;
    public static final PENDING UNSENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$SendStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNSENT = new <init>("UNSENT", 0);
        SENDING = new <init>("SENDING", 1);
        SENDING_ON_UPLOAD = new <init>("SENDING_ON_UPLOAD", 2);
        SENT = new <init>("SENT", 3);
        FAILED = new <init>("FAILED", 4);
        PENDING = new <init>("PENDING", 5);
        $VALUES = (new .VALUES[] {
            UNSENT, SENDING, SENDING_ON_UPLOAD, SENT, FAILED, PENDING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
