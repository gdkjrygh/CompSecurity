// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            PicUser

public static final class  extends Enum
{

    private static final UNFOLLOW $VALUES[];
    public static final UNFOLLOW FOLLOWING;
    public static final UNFOLLOW ME;
    public static final UNFOLLOW UNFOLLOW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/PicUser$PicRelation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ME = new <init>("ME", 0);
        FOLLOWING = new <init>("FOLLOWING", 1);
        UNFOLLOW = new <init>("UNFOLLOW", 2);
        $VALUES = (new .VALUES[] {
            ME, FOLLOWING, UNFOLLOW
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
