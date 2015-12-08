// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class value extends Enum
{

    private static final US_LICENSE_NAME $VALUES[];
    public static final US_LICENSE_NAME DEFAULT_FIELD_TYPE;
    public static final US_LICENSE_NAME GIFT_CARD_EVENT_NUMBER;
    public static final US_LICENSE_NAME GIFT_CARD_MERCHANT_NAME;
    public static final US_LICENSE_NAME GIFT_CARD_NUMBER;
    public static final US_LICENSE_NAME GIFT_CARD_PIN;
    public static final US_LICENSE_NAME LOYALTY_ACCOUNT_ID;
    public static final US_LICENSE_NAME LOYALTY_MERCHANT_NAME;
    public static final US_LICENSE_NAME LOYALTY_PROGRAM_NAME;
    public static final US_LICENSE_NAME US_LICENSE_ADDRESS_CITY;
    public static final US_LICENSE_NAME US_LICENSE_ADDRESS_LINE_0;
    public static final US_LICENSE_NAME US_LICENSE_ADDRESS_LINE_1;
    public static final US_LICENSE_NAME US_LICENSE_ADDRESS_STATE;
    public static final US_LICENSE_NAME US_LICENSE_ADDRESS_ZIP;
    public static final US_LICENSE_NAME US_LICENSE_DOB;
    public static final US_LICENSE_NAME US_LICENSE_EXPIRATION_DATE;
    public static final US_LICENSE_NAME US_LICENSE_FAMILY_NAME;
    public static final US_LICENSE_NAME US_LICENSE_GIVEN_NAME;
    public static final US_LICENSE_NAME US_LICENSE_ID;
    public static final US_LICENSE_NAME US_LICENSE_ISSUE_DATE;
    public static final US_LICENSE_NAME US_LICENSE_NAME;
    public static final US_LICENSE_NAME US_LICENSE_NAME_SUFFIX;
    private static com.google.protobuf.Proto.FieldType internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return DEFAULT_FIELD_TYPE;

        case 100: // 'd'
            return LOYALTY_ACCOUNT_ID;

        case 101: // 'e'
            return LOYALTY_MERCHANT_NAME;

        case 102: // 'f'
            return LOYALTY_PROGRAM_NAME;

        case 200: 
            return GIFT_CARD_NUMBER;

        case 201: 
            return GIFT_CARD_PIN;

        case 202: 
            return GIFT_CARD_EVENT_NUMBER;

        case 203: 
            return GIFT_CARD_MERCHANT_NAME;

        case 402: 
            return US_LICENSE_EXPIRATION_DATE;

        case 403: 
            return US_LICENSE_ID;

        case 404: 
            return US_LICENSE_DOB;

        case 406: 
            return US_LICENSE_ISSUE_DATE;

        case 408: 
            return US_LICENSE_ADDRESS_CITY;

        case 409: 
            return US_LICENSE_ADDRESS_LINE_0;

        case 410: 
            return US_LICENSE_ADDRESS_LINE_1;

        case 411: 
            return US_LICENSE_ADDRESS_STATE;

        case 412: 
            return US_LICENSE_ADDRESS_ZIP;

        case 413: 
            return US_LICENSE_FAMILY_NAME;

        case 414: 
            return US_LICENSE_GIVEN_NAME;

        case 415: 
            return US_LICENSE_NAME_SUFFIX;

        case 416: 
            return US_LICENSE_NAME;
        }
    }

    public static US_LICENSE_NAME valueOf(String s)
    {
        return (US_LICENSE_NAME)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$FieldType, s);
    }

    public static US_LICENSE_NAME[] values()
    {
        return (US_LICENSE_NAME[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        DEFAULT_FIELD_TYPE = new <init>("DEFAULT_FIELD_TYPE", 0, 0, 0);
        LOYALTY_ACCOUNT_ID = new <init>("LOYALTY_ACCOUNT_ID", 1, 1, 100);
        LOYALTY_MERCHANT_NAME = new <init>("LOYALTY_MERCHANT_NAME", 2, 2, 101);
        LOYALTY_PROGRAM_NAME = new <init>("LOYALTY_PROGRAM_NAME", 3, 3, 102);
        GIFT_CARD_NUMBER = new <init>("GIFT_CARD_NUMBER", 4, 4, 200);
        GIFT_CARD_PIN = new <init>("GIFT_CARD_PIN", 5, 5, 201);
        GIFT_CARD_EVENT_NUMBER = new <init>("GIFT_CARD_EVENT_NUMBER", 6, 6, 202);
        GIFT_CARD_MERCHANT_NAME = new <init>("GIFT_CARD_MERCHANT_NAME", 7, 7, 203);
        US_LICENSE_EXPIRATION_DATE = new <init>("US_LICENSE_EXPIRATION_DATE", 8, 8, 402);
        US_LICENSE_ID = new <init>("US_LICENSE_ID", 9, 9, 403);
        US_LICENSE_DOB = new <init>("US_LICENSE_DOB", 10, 10, 404);
        US_LICENSE_ISSUE_DATE = new <init>("US_LICENSE_ISSUE_DATE", 11, 11, 406);
        US_LICENSE_ADDRESS_CITY = new <init>("US_LICENSE_ADDRESS_CITY", 12, 12, 408);
        US_LICENSE_ADDRESS_LINE_0 = new <init>("US_LICENSE_ADDRESS_LINE_0", 13, 13, 409);
        US_LICENSE_ADDRESS_LINE_1 = new <init>("US_LICENSE_ADDRESS_LINE_1", 14, 14, 410);
        US_LICENSE_ADDRESS_STATE = new <init>("US_LICENSE_ADDRESS_STATE", 15, 15, 411);
        US_LICENSE_ADDRESS_ZIP = new <init>("US_LICENSE_ADDRESS_ZIP", 16, 16, 412);
        US_LICENSE_FAMILY_NAME = new <init>("US_LICENSE_FAMILY_NAME", 17, 17, 413);
        US_LICENSE_GIVEN_NAME = new <init>("US_LICENSE_GIVEN_NAME", 18, 18, 414);
        US_LICENSE_NAME_SUFFIX = new <init>("US_LICENSE_NAME_SUFFIX", 19, 19, 415);
        US_LICENSE_NAME = new <init>("US_LICENSE_NAME", 20, 20, 416);
        $VALUES = (new .VALUES[] {
            DEFAULT_FIELD_TYPE, LOYALTY_ACCOUNT_ID, LOYALTY_MERCHANT_NAME, LOYALTY_PROGRAM_NAME, GIFT_CARD_NUMBER, GIFT_CARD_PIN, GIFT_CARD_EVENT_NUMBER, GIFT_CARD_MERCHANT_NAME, US_LICENSE_EXPIRATION_DATE, US_LICENSE_ID, 
            US_LICENSE_DOB, US_LICENSE_ISSUE_DATE, US_LICENSE_ADDRESS_CITY, US_LICENSE_ADDRESS_LINE_0, US_LICENSE_ADDRESS_LINE_1, US_LICENSE_ADDRESS_STATE, US_LICENSE_ADDRESS_ZIP, US_LICENSE_FAMILY_NAME, US_LICENSE_GIVEN_NAME, US_LICENSE_NAME_SUFFIX, 
            US_LICENSE_NAME
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
