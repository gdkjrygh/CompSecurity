// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;


// Referenced classes of package com.google.android.libraries.phonenumbers:
//            PhoneNumberUtil

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN FIXED_LINE;
    public static final UNKNOWN FIXED_LINE_OR_MOBILE;
    public static final UNKNOWN MOBILE;
    public static final UNKNOWN PAGER;
    public static final UNKNOWN PERSONAL_NUMBER;
    public static final UNKNOWN PREMIUM_RATE;
    public static final UNKNOWN SHARED_COST;
    public static final UNKNOWN TOLL_FREE;
    public static final UNKNOWN UAN;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN VOICEMAIL;
    public static final UNKNOWN VOIP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/phonenumbers/PhoneNumberUtil$PhoneNumberType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FIXED_LINE = new <init>("FIXED_LINE", 0);
        MOBILE = new <init>("MOBILE", 1);
        FIXED_LINE_OR_MOBILE = new <init>("FIXED_LINE_OR_MOBILE", 2);
        TOLL_FREE = new <init>("TOLL_FREE", 3);
        PREMIUM_RATE = new <init>("PREMIUM_RATE", 4);
        SHARED_COST = new <init>("SHARED_COST", 5);
        VOIP = new <init>("VOIP", 6);
        PERSONAL_NUMBER = new <init>("PERSONAL_NUMBER", 7);
        PAGER = new <init>("PAGER", 8);
        UAN = new <init>("UAN", 9);
        VOICEMAIL = new <init>("VOICEMAIL", 10);
        UNKNOWN = new <init>("UNKNOWN", 11);
        $VALUES = (new .VALUES[] {
            FIXED_LINE, MOBILE, FIXED_LINE_OR_MOBILE, TOLL_FREE, PREMIUM_RATE, SHARED_COST, VOIP, PERSONAL_NUMBER, PAGER, UAN, 
            VOICEMAIL, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
