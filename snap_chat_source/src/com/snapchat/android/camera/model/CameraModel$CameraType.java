// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.model;


// Referenced classes of package com.snapchat.android.camera.model:
//            CameraModel

public static final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE BACK_FACING;
    public static final NONE FRONT_FACING;
    public static final NONE NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/camera/model/CameraModel$CameraType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FRONT_FACING = new <init>("FRONT_FACING", 0);
        BACK_FACING = new <init>("BACK_FACING", 1);
        NONE = new <init>("NONE", 2);
        $VALUES = (new .VALUES[] {
            FRONT_FACING, BACK_FACING, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
