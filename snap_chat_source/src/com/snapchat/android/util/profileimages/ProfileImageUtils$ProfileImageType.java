// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.profileimages;


// Referenced classes of package com.snapchat.android.util.profileimages:
//            ProfileImageUtils

public static final class  extends Enum
{

    private static final PROFILE_IMAGE_4 $VALUES[];
    public static final PROFILE_IMAGE_4 PROFILE_IMAGE_0;
    public static final PROFILE_IMAGE_4 PROFILE_IMAGE_1;
    public static final PROFILE_IMAGE_4 PROFILE_IMAGE_2;
    public static final PROFILE_IMAGE_4 PROFILE_IMAGE_3;
    public static final PROFILE_IMAGE_4 PROFILE_IMAGE_4;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/profileimages/ProfileImageUtils$ProfileImageType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PROFILE_IMAGE_0 = new <init>("PROFILE_IMAGE_0", 0);
        PROFILE_IMAGE_1 = new <init>("PROFILE_IMAGE_1", 1);
        PROFILE_IMAGE_2 = new <init>("PROFILE_IMAGE_2", 2);
        PROFILE_IMAGE_3 = new <init>("PROFILE_IMAGE_3", 3);
        PROFILE_IMAGE_4 = new <init>("PROFILE_IMAGE_4", 4);
        $VALUES = (new .VALUES[] {
            PROFILE_IMAGE_0, PROFILE_IMAGE_1, PROFILE_IMAGE_2, PROFILE_IMAGE_3, PROFILE_IMAGE_4
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
