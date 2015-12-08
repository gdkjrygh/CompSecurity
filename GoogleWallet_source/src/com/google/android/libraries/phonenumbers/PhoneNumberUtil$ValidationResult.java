// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;


// Referenced classes of package com.google.android.libraries.phonenumbers:
//            PhoneNumberUtil

public static final class  extends Enum
{

    private static final TOO_LONG $VALUES[];
    public static final TOO_LONG INVALID_COUNTRY_CODE;
    public static final TOO_LONG IS_POSSIBLE;
    public static final TOO_LONG TOO_LONG;
    public static final TOO_LONG TOO_SHORT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/phonenumbers/PhoneNumberUtil$ValidationResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IS_POSSIBLE = new <init>("IS_POSSIBLE", 0);
        INVALID_COUNTRY_CODE = new <init>("INVALID_COUNTRY_CODE", 1);
        TOO_SHORT = new <init>("TOO_SHORT", 2);
        TOO_LONG = new <init>("TOO_LONG", 3);
        $VALUES = (new .VALUES[] {
            IS_POSSIBLE, INVALID_COUNTRY_CODE, TOO_SHORT, TOO_LONG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
