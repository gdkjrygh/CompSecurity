// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;


// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment

private static final class resId extends Enum
{

    private static final WEBSITE $VALUES[];
    public static final WEBSITE ABOUT;
    public static final WEBSITE AGE;
    public static final WEBSITE BIRTHDAY;
    public static final WEBSITE CITY;
    public static final WEBSITE COUNTRY;
    public static final WEBSITE GENDER;
    public static final WEBSITE LANGUAGE;
    public static final WEBSITE MS_ACCOUNT;
    public static final WEBSITE SKYPE_NAME;
    public static final WEBSITE STATE;
    public static final WEBSITE WEBSITE;
    private int resId;

    public static resId valueOf(String s)
    {
        return (resId)Enum.valueOf(com/skype/android/app/contacts/ContactProfileFragment$a, s);
    }

    public static resId[] values()
    {
        return (resId[])$VALUES.clone();
    }

    public final int titleResourceId()
    {
        return resId;
    }

    static 
    {
        MS_ACCOUNT = new <init>("MS_ACCOUNT", 0, 0x7f08025d);
        SKYPE_NAME = new <init>("SKYPE_NAME", 1, 0x7f08027b);
        ABOUT = new <init>("ABOUT", 2, 0x7f080224);
        GENDER = new <init>("GENDER", 3, 0x7f08024f);
        LANGUAGE = new <init>("LANGUAGE", 4, 0x7f080253);
        AGE = new <init>("AGE", 5, 0x7f08022e);
        BIRTHDAY = new <init>("BIRTHDAY", 6, 0x7f080230);
        CITY = new <init>("CITY", 7, 0x7f08023a);
        STATE = new <init>("STATE", 8, 0x7f08027d);
        COUNTRY = new <init>("COUNTRY", 9, 0x7f080241);
        WEBSITE = new <init>("WEBSITE", 10, 0x7f080251);
        $VALUES = (new .VALUES[] {
            MS_ACCOUNT, SKYPE_NAME, ABOUT, GENDER, LANGUAGE, AGE, BIRTHDAY, CITY, STATE, COUNTRY, 
            WEBSITE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        resId = j;
    }
}
