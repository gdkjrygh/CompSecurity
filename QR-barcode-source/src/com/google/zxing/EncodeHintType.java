// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


public final class EncodeHintType extends Enum
{

    private static final EncodeHintType $VALUES[];
    public static final EncodeHintType AZTEC_LAYERS;
    public static final EncodeHintType CHARACTER_SET;
    public static final EncodeHintType DATA_MATRIX_SHAPE;
    public static final EncodeHintType ERROR_CORRECTION;
    public static final EncodeHintType MARGIN;
    public static final EncodeHintType MAX_SIZE;
    public static final EncodeHintType MIN_SIZE;
    public static final EncodeHintType PDF417_COMPACT;
    public static final EncodeHintType PDF417_COMPACTION;
    public static final EncodeHintType PDF417_DIMENSIONS;

    private EncodeHintType(String s, int i)
    {
        super(s, i);
    }

    public static EncodeHintType valueOf(String s)
    {
        return (EncodeHintType)Enum.valueOf(com/google/zxing/EncodeHintType, s);
    }

    public static EncodeHintType[] values()
    {
        return (EncodeHintType[])$VALUES.clone();
    }

    static 
    {
        ERROR_CORRECTION = new EncodeHintType("ERROR_CORRECTION", 0);
        CHARACTER_SET = new EncodeHintType("CHARACTER_SET", 1);
        DATA_MATRIX_SHAPE = new EncodeHintType("DATA_MATRIX_SHAPE", 2);
        MIN_SIZE = new EncodeHintType("MIN_SIZE", 3);
        MAX_SIZE = new EncodeHintType("MAX_SIZE", 4);
        MARGIN = new EncodeHintType("MARGIN", 5);
        PDF417_COMPACT = new EncodeHintType("PDF417_COMPACT", 6);
        PDF417_COMPACTION = new EncodeHintType("PDF417_COMPACTION", 7);
        PDF417_DIMENSIONS = new EncodeHintType("PDF417_DIMENSIONS", 8);
        AZTEC_LAYERS = new EncodeHintType("AZTEC_LAYERS", 9);
        $VALUES = (new EncodeHintType[] {
            ERROR_CORRECTION, CHARACTER_SET, DATA_MATRIX_SHAPE, MIN_SIZE, MAX_SIZE, MARGIN, PDF417_COMPACT, PDF417_COMPACTION, PDF417_DIMENSIONS, AZTEC_LAYERS
        });
    }
}
