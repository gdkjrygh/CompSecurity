// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;


// Referenced classes of package com.google.android.libraries.phonenumbers:
//            NumberParseException

public static final class  extends Enum
{

    private static final TOO_LONG $VALUES[];
    public static final TOO_LONG INVALID_COUNTRY_CODE;
    public static final TOO_LONG NOT_A_NUMBER;
    public static final TOO_LONG TOO_LONG;
    public static final TOO_LONG TOO_SHORT_AFTER_IDD;
    public static final TOO_LONG TOO_SHORT_NSN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/phonenumbers/NumberParseException$ErrorType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INVALID_COUNTRY_CODE = new <init>("INVALID_COUNTRY_CODE", 0);
        NOT_A_NUMBER = new <init>("NOT_A_NUMBER", 1);
        TOO_SHORT_AFTER_IDD = new <init>("TOO_SHORT_AFTER_IDD", 2);
        TOO_SHORT_NSN = new <init>("TOO_SHORT_NSN", 3);
        TOO_LONG = new <init>("TOO_LONG", 4);
        $VALUES = (new .VALUES[] {
            INVALID_COUNTRY_CODE, NOT_A_NUMBER, TOO_SHORT_AFTER_IDD, TOO_SHORT_NSN, TOO_LONG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
