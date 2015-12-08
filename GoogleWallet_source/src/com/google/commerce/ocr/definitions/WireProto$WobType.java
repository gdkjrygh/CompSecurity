// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            WireProto

public static final class value extends Enum
{

    private static final US_LICENSE $VALUES[];
    public static final US_LICENSE GIFTCARD;
    public static final US_LICENSE LOYALTY;
    public static final US_LICENSE UNKNOWN;
    public static final US_LICENSE US_LICENSE;
    private static com.google.protobuf.ap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        default:
            return null;

        case 0: // '\0'
            return UNKNOWN;

        case 1: // '\001'
            return LOYALTY;

        case 2: // '\002'
            return GIFTCARD;

        case 4: // '\004'
            return US_LICENSE;
        }
    }

    public static US_LICENSE valueOf(String s)
    {
        return (US_LICENSE)Enum.valueOf(com/google/commerce/ocr/definitions/WireProto$WobType, s);
    }

    public static US_LICENSE[] values()
    {
        return (US_LICENSE[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0, 0, 0);
        LOYALTY = new <init>("LOYALTY", 1, 1, 1);
        GIFTCARD = new <init>("GIFTCARD", 2, 2, 2);
        US_LICENSE = new <init>("US_LICENSE", 3, 3, 4);
        $VALUES = (new .VALUES[] {
            UNKNOWN, LOYALTY, GIFTCARD, US_LICENSE
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
