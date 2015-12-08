// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;


// Referenced classes of package com.soundcloud.android.api:
//            ApiRequest

public static final class parameter extends Enum
{

    private static final LOCALE $VALUES[];
    public static final LOCALE LOCALE;
    public static final LOCALE OAUTH_TOKEN;
    public static final LOCALE PAGE_SIZE;
    private final String parameter;

    public static parameter valueOf(String s)
    {
        return (parameter)Enum.valueOf(com/soundcloud/android/api/ApiRequest$Param, s);
    }

    public static parameter[] values()
    {
        return (parameter[])$VALUES.clone();
    }

    public final String toString()
    {
        return parameter;
    }

    static 
    {
        PAGE_SIZE = new <init>("PAGE_SIZE", 0, "limit");
        OAUTH_TOKEN = new <init>("OAUTH_TOKEN", 1, "oauth_token");
        LOCALE = new <init>("LOCALE", 2, "locale");
        $VALUES = (new .VALUES[] {
            PAGE_SIZE, OAUTH_TOKEN, LOCALE
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        parameter = s1;
    }
}
