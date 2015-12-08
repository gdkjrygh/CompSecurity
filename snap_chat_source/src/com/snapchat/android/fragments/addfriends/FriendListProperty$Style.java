// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            FriendListProperty

public static final class a extends Enum
{

    private static final WHITE_TEXT $VALUES[];
    public static final WHITE_TEXT OPAQUE_CHECKBOX;
    public static final WHITE_TEXT TRANSPARENT_CHECKBOX;
    public static final WHITE_TEXT WHITE_TEXT;
    private int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/fragments/addfriends/FriendListProperty$Style, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final int getBackgroundResId()
    {
        return a;
    }

    static 
    {
        OPAQUE_CHECKBOX = new <init>("OPAQUE_CHECKBOX", 0, 0x7f020077);
        TRANSPARENT_CHECKBOX = new <init>("TRANSPARENT_CHECKBOX", 1, 0x7f020078);
        WHITE_TEXT = new <init>("WHITE_TEXT", 2, 0x7f020079);
        $VALUES = (new .VALUES[] {
            OPAQUE_CHECKBOX, TRANSPARENT_CHECKBOX, WHITE_TEXT
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
