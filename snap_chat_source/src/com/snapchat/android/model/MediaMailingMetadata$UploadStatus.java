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
    public static final FAILED NOT_UPLOADED;
    public static final FAILED UPLOADED;
    public static final FAILED UPLOADING;
    public static final FAILED WILL_UPLOAD_AFTER_SAVE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$UploadStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_UPLOADED = new <init>("NOT_UPLOADED", 0);
        UPLOADING = new <init>("UPLOADING", 1);
        WILL_UPLOAD_AFTER_SAVE = new <init>("WILL_UPLOAD_AFTER_SAVE", 2);
        UPLOADED = new <init>("UPLOADED", 3);
        FAILED = new <init>("FAILED", 4);
        $VALUES = (new .VALUES[] {
            NOT_UPLOADED, UPLOADING, WILL_UPLOAD_AFTER_SAVE, UPLOADED, FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
