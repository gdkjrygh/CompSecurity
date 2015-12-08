// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;


// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

public static final class  extends Enum
{

    private static final CUSTOM $VALUES[];
    public static final CUSTOM CUSTOM;
    public static final CUSTOM EVERYONE;
    public static final CUSTOM FRIENDS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/fragments/settings/SettingsFragment$PrivacyOptions, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EVERYONE = new <init>("EVERYONE", 0);
        FRIENDS = new <init>("FRIENDS", 1);
        CUSTOM = new <init>("CUSTOM", 2);
        $VALUES = (new .VALUES[] {
            EVERYONE, FRIENDS, CUSTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
