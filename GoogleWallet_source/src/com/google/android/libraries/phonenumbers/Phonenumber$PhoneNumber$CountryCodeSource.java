// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;


// Referenced classes of package com.google.android.libraries.phonenumbers:
//            Phonenumber

public static final class Y extends Enum
{

    private static final FROM_DEFAULT_COUNTRY $VALUES[];
    public static final FROM_DEFAULT_COUNTRY FROM_DEFAULT_COUNTRY;
    public static final FROM_DEFAULT_COUNTRY FROM_NUMBER_WITHOUT_PLUS_SIGN;
    public static final FROM_DEFAULT_COUNTRY FROM_NUMBER_WITH_IDD;
    public static final FROM_DEFAULT_COUNTRY FROM_NUMBER_WITH_PLUS_SIGN;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/google/android/libraries/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        FROM_NUMBER_WITH_PLUS_SIGN = new <init>("FROM_NUMBER_WITH_PLUS_SIGN", 0);
        FROM_NUMBER_WITH_IDD = new <init>("FROM_NUMBER_WITH_IDD", 1);
        FROM_NUMBER_WITHOUT_PLUS_SIGN = new <init>("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
        FROM_DEFAULT_COUNTRY = new <init>("FROM_DEFAULT_COUNTRY", 3);
        $VALUES = (new .VALUES[] {
            FROM_NUMBER_WITH_PLUS_SIGN, FROM_NUMBER_WITH_IDD, FROM_NUMBER_WITHOUT_PLUS_SIGN, FROM_DEFAULT_COUNTRY
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
