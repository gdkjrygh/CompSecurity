// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;


// Referenced classes of package com.snapchat.android.camera:
//            TakeSnapButtonTouchIntent

public static final class  extends Enum
{

    private static final VIDEO $VALUES[];
    public static final VIDEO PHOTO;
    public static final VIDEO UNKNOWN;
    public static final VIDEO VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/camera/TakeSnapButtonTouchIntent$MediaCaptureType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        PHOTO = new <init>("PHOTO", 1);
        VIDEO = new <init>("VIDEO", 2);
        $VALUES = (new .VALUES[] {
            UNKNOWN, PHOTO, VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
