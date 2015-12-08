// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;


// Referenced classes of package com.soundcloud.android.accounts:
//            SoundCloudTokenOperations

private static final class key extends Enum
{

    private static final EXPIRES_IN $VALUES[];
    public static final EXPIRES_IN ACCESS_TOKEN;
    public static final EXPIRES_IN EXPIRES_IN;
    public static final EXPIRES_IN REFRESH_TOKEN;
    public static final EXPIRES_IN SCOPE;
    private String key;

    public static key valueOf(String s)
    {
        return (key)Enum.valueOf(com/soundcloud/android/accounts/SoundCloudTokenOperations$TokenDataKeys, s);
    }

    public static key[] values()
    {
        return (key[])$VALUES.clone();
    }

    public final String key()
    {
        return key;
    }

    static 
    {
        ACCESS_TOKEN = new <init>("ACCESS_TOKEN", 0, "access_token");
        REFRESH_TOKEN = new <init>("REFRESH_TOKEN", 1, "refresh_token");
        SCOPE = new <init>("SCOPE", 2, "scope");
        EXPIRES_IN = new <init>("EXPIRES_IN", 3, "expires_in");
        $VALUES = (new .VALUES[] {
            ACCESS_TOKEN, REFRESH_TOKEN, SCOPE, EXPIRES_IN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        key = s1;
    }
}
