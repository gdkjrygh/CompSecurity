// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            FriendListProperty

public static final class  extends Enum
{

    private static final NON_TAPPABLE $VALUES[];
    public static final NON_TAPPABLE ALWAYS_TAPPABLE;
    public static final NON_TAPPABLE NON_TAPPABLE;
    public static final NON_TAPPABLE SWIPEABLE;
    public static final NON_TAPPABLE TAPPABLE_FRIENDS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/fragments/addfriends/FriendListProperty$TouchMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ALWAYS_TAPPABLE = new <init>("ALWAYS_TAPPABLE", 0);
        TAPPABLE_FRIENDS = new <init>("TAPPABLE_FRIENDS", 1);
        SWIPEABLE = new <init>("SWIPEABLE", 2);
        NON_TAPPABLE = new <init>("NON_TAPPABLE", 3);
        $VALUES = (new .VALUES[] {
            ALWAYS_TAPPABLE, TAPPABLE_FRIENDS, SWIPEABLE, NON_TAPPABLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
