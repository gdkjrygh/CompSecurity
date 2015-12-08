// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsFragment

public static final class  extends Enum
{

    private static final ADD_FRIENDS $VALUES[];
    public static final ADD_FRIENDS ADD_FRIENDS;
    public static final ADD_FRIENDS CONTACTS_ACCESS;
    public static final ADD_FRIENDS PHONE_VERIFICATION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/fragments/addfriends/AddFriendsFragment$Page, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PHONE_VERIFICATION = new <init>("PHONE_VERIFICATION", 0);
        CONTACTS_ACCESS = new <init>("CONTACTS_ACCESS", 1);
        ADD_FRIENDS = new <init>("ADD_FRIENDS", 2);
        $VALUES = (new .VALUES[] {
            PHONE_VERIFICATION, CONTACTS_ACCESS, ADD_FRIENDS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
