// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.rendering;


// Referenced classes of package com.snapchat.android.rendering:
//            SnapMediaRenderer

public static final class  extends Enum
{

    private static final PLAYBACK_ERROR $VALUES[];
    public static final PLAYBACK_ERROR CANNOT_DECRYPT_MEDIA_ERROR;
    public static final PLAYBACK_ERROR EXTERNAL_STORAGE_REQUIRED;
    public static final PLAYBACK_ERROR MEDIA_UNAVAILABLE_LOCALLY;
    public static final PLAYBACK_ERROR PLAYBACK_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/rendering/SnapMediaRenderer$ErrorCode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EXTERNAL_STORAGE_REQUIRED = new <init>("EXTERNAL_STORAGE_REQUIRED", 0);
        MEDIA_UNAVAILABLE_LOCALLY = new <init>("MEDIA_UNAVAILABLE_LOCALLY", 1);
        CANNOT_DECRYPT_MEDIA_ERROR = new <init>("CANNOT_DECRYPT_MEDIA_ERROR", 2);
        PLAYBACK_ERROR = new <init>("PLAYBACK_ERROR", 3);
        $VALUES = (new .VALUES[] {
            EXTERNAL_STORAGE_REQUIRED, MEDIA_UNAVAILABLE_LOCALLY, CANNOT_DECRYPT_MEDIA_ERROR, PLAYBACK_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
