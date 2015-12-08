// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;


// Referenced classes of package com.soundcloud.android.accounts:
//            AccountOperations

public static final class key extends Enum
{

    private static final SIGNUP $VALUES[];
    public static final SIGNUP SIGNUP;
    public static final SIGNUP USERNAME;
    public static final SIGNUP USER_ID;
    public static final SIGNUP USER_PERMALINK;
    private final String key;

    public static key valueOf(String s)
    {
        return (key)Enum.valueOf(com/soundcloud/android/accounts/AccountOperations$AccountInfoKeys, s);
    }

    public static key[] values()
    {
        return (key[])$VALUES.clone();
    }

    public final String getKey()
    {
        return key;
    }

    static 
    {
        USERNAME = new <init>("USERNAME", 0, "currentUsername");
        USER_ID = new <init>("USER_ID", 1, "currentUserId");
        USER_PERMALINK = new <init>("USER_PERMALINK", 2, "currentUserPermalink");
        SIGNUP = new <init>("SIGNUP", 3, "signup");
        $VALUES = (new .VALUES[] {
            USERNAME, USER_ID, USER_PERMALINK, SIGNUP
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        key = s1;
    }
}
