// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.profileimages;


// Referenced classes of package com.snapchat.android.util.profileimages:
//            ProfileImageUtils

public static final class  extends Enum
{

    private static final THUMBNAIL $VALUES[];
    public static final THUMBNAIL BIG;
    public static final THUMBNAIL MEDIUM;
    public static final THUMBNAIL THUMBNAIL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/profileimages/ProfileImageUtils$ProfileImageSize, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BIG = new <init>("BIG", 0);
        MEDIUM = new <init>("MEDIUM", 1);
        THUMBNAIL = new <init>("THUMBNAIL", 2);
        $VALUES = (new .VALUES[] {
            BIG, MEDIUM, THUMBNAIL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
