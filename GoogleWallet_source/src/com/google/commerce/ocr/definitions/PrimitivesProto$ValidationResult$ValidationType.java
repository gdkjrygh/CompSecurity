// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class value extends Enum
{

    private static final VALIDATION_TYPE_BARCODE_MATCHES_TEXT $VALUES[];
    public static final VALIDATION_TYPE_BARCODE_MATCHES_TEXT VALIDATION_TYPE_BARCODE_MATCHES_TEXT;
    public static final VALIDATION_TYPE_BARCODE_MATCHES_TEXT VALIDATION_TYPE_UNKNOWN;
    private static com.google.protobuf..ValidationType internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return VALIDATION_TYPE_UNKNOWN;

        case 1: // '\001'
            return VALIDATION_TYPE_BARCODE_MATCHES_TEXT;
        }
    }

    public static VALIDATION_TYPE_BARCODE_MATCHES_TEXT valueOf(String s)
    {
        return (VALIDATION_TYPE_BARCODE_MATCHES_TEXT)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$ValidationResult$ValidationType, s);
    }

    public static VALIDATION_TYPE_BARCODE_MATCHES_TEXT[] values()
    {
        return (VALIDATION_TYPE_BARCODE_MATCHES_TEXT[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        VALIDATION_TYPE_UNKNOWN = new <init>("VALIDATION_TYPE_UNKNOWN", 0, 0, 0);
        VALIDATION_TYPE_BARCODE_MATCHES_TEXT = new <init>("VALIDATION_TYPE_BARCODE_MATCHES_TEXT", 1, 1, 1);
        $VALUES = (new .VALUES[] {
            VALIDATION_TYPE_UNKNOWN, VALIDATION_TYPE_BARCODE_MATCHES_TEXT
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
