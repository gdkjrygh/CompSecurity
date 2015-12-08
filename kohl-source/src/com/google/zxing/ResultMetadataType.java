// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


public final class ResultMetadataType extends Enum
{

    private static final ResultMetadataType $VALUES[];
    public static final ResultMetadataType BYTE_SEGMENTS;
    public static final ResultMetadataType ERROR_CORRECTION_LEVEL;
    public static final ResultMetadataType ISSUE_NUMBER;
    public static final ResultMetadataType ORIENTATION;
    public static final ResultMetadataType OTHER;
    public static final ResultMetadataType PDF417_EXTRA_METADATA;
    public static final ResultMetadataType POSSIBLE_COUNTRY;
    public static final ResultMetadataType SUGGESTED_PRICE;
    public static final ResultMetadataType UPC_EAN_EXTENSION;

    private ResultMetadataType(String s, int i)
    {
        super(s, i);
    }

    public static ResultMetadataType valueOf(String s)
    {
        return (ResultMetadataType)Enum.valueOf(com/google/zxing/ResultMetadataType, s);
    }

    public static ResultMetadataType[] values()
    {
        return (ResultMetadataType[])$VALUES.clone();
    }

    static 
    {
        OTHER = new ResultMetadataType("OTHER", 0);
        ORIENTATION = new ResultMetadataType("ORIENTATION", 1);
        BYTE_SEGMENTS = new ResultMetadataType("BYTE_SEGMENTS", 2);
        ERROR_CORRECTION_LEVEL = new ResultMetadataType("ERROR_CORRECTION_LEVEL", 3);
        ISSUE_NUMBER = new ResultMetadataType("ISSUE_NUMBER", 4);
        SUGGESTED_PRICE = new ResultMetadataType("SUGGESTED_PRICE", 5);
        POSSIBLE_COUNTRY = new ResultMetadataType("POSSIBLE_COUNTRY", 6);
        UPC_EAN_EXTENSION = new ResultMetadataType("UPC_EAN_EXTENSION", 7);
        PDF417_EXTRA_METADATA = new ResultMetadataType("PDF417_EXTRA_METADATA", 8);
        $VALUES = (new ResultMetadataType[] {
            OTHER, ORIENTATION, BYTE_SEGMENTS, ERROR_CORRECTION_LEVEL, ISSUE_NUMBER, SUGGESTED_PRICE, POSSIBLE_COUNTRY, UPC_EAN_EXTENSION, PDF417_EXTRA_METADATA
        });
    }
}
