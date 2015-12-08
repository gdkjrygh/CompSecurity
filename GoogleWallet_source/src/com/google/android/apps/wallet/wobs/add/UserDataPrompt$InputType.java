// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;


// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPrompt

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN BARCODE;
    public static final UNKNOWN BIRTHDATE;
    public static final UNKNOWN BIRTH_MONTH_AND_DAY;
    public static final UNKNOWN COLOR;
    public static final UNKNOWN DATE;
    public static final UNKNOWN EMAIL_ADDRESS;
    public static final UNKNOWN FIRST_NAME;
    public static final UNKNOWN GENDER;
    public static final UNKNOWN LAST_NAME;
    public static final UNKNOWN MONEY;
    public static final UNKNOWN MULTI_LINE_TEXT;
    public static final UNKNOWN NUMERIC;
    public static final UNKNOWN PHONE_NUMBER;
    public static final UNKNOWN STATE;
    public static final UNKNOWN TEXT;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN ZIPCODE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/wobs/add/UserDataPrompt$InputType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PHONE_NUMBER = new <init>("PHONE_NUMBER", 0);
        STATE = new <init>("STATE", 1);
        ZIPCODE = new <init>("ZIPCODE", 2);
        EMAIL_ADDRESS = new <init>("EMAIL_ADDRESS", 3);
        GENDER = new <init>("GENDER", 4);
        FIRST_NAME = new <init>("FIRST_NAME", 5);
        LAST_NAME = new <init>("LAST_NAME", 6);
        DATE = new <init>("DATE", 7);
        BIRTHDATE = new <init>("BIRTHDATE", 8);
        BIRTH_MONTH_AND_DAY = new <init>("BIRTH_MONTH_AND_DAY", 9);
        NUMERIC = new <init>("NUMERIC", 10);
        TEXT = new <init>("TEXT", 11);
        MULTI_LINE_TEXT = new <init>("MULTI_LINE_TEXT", 12);
        MONEY = new <init>("MONEY", 13);
        COLOR = new <init>("COLOR", 14);
        BARCODE = new <init>("BARCODE", 15);
        UNKNOWN = new <init>("UNKNOWN", 16);
        $VALUES = (new .VALUES[] {
            PHONE_NUMBER, STATE, ZIPCODE, EMAIL_ADDRESS, GENDER, FIRST_NAME, LAST_NAME, DATE, BIRTHDATE, BIRTH_MONTH_AND_DAY, 
            NUMERIC, TEXT, MULTI_LINE_TEXT, MONEY, COLOR, BARCODE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
