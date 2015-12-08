// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            MediaMailingMetadata

public static final class  extends Enum
{

    private static final FAILED $VALUES[];
    public static final FAILED FAILED;
    public static final FAILED NOT_POSTED;
    public static final FAILED POSTED;
    public static final FAILED POSTING;
    public static final FAILED POSTING_ON_UPLOAD;
    public static final FAILED WILL_POST_AFTER_SAVE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$PostStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_POSTED = new <init>("NOT_POSTED", 0);
        POSTING = new <init>("POSTING", 1);
        WILL_POST_AFTER_SAVE = new <init>("WILL_POST_AFTER_SAVE", 2);
        POSTING_ON_UPLOAD = new <init>("POSTING_ON_UPLOAD", 3);
        POSTED = new <init>("POSTED", 4);
        FAILED = new <init>("FAILED", 5);
        $VALUES = (new .VALUES[] {
            NOT_POSTED, POSTING, WILL_POST_AFTER_SAVE, POSTING_ON_UPLOAD, POSTED, FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
