// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.List;

// Referenced classes of package com.google.zxing:
//            ResultPointCallback

public final class DecodeHintType extends Enum
{

    private static final DecodeHintType $VALUES[];
    public static final DecodeHintType ALLOWED_LENGTHS;
    public static final DecodeHintType ASSUME_CODE_39_CHECK_DIGIT;
    public static final DecodeHintType ASSUME_GS1;
    public static final DecodeHintType CHARACTER_SET;
    public static final DecodeHintType NEED_RESULT_POINT_CALLBACK;
    public static final DecodeHintType OTHER;
    public static final DecodeHintType POSSIBLE_FORMATS;
    public static final DecodeHintType PURE_BARCODE;
    public static final DecodeHintType RETURN_CODABAR_START_END;
    public static final DecodeHintType TRY_HARDER;
    private final Class valueType;

    private DecodeHintType(String s, int i, Class class1)
    {
        super(s, i);
        valueType = class1;
    }

    public static DecodeHintType valueOf(String s)
    {
        return (DecodeHintType)Enum.valueOf(com/google/zxing/DecodeHintType, s);
    }

    public static DecodeHintType[] values()
    {
        return (DecodeHintType[])$VALUES.clone();
    }

    public Class getValueType()
    {
        return valueType;
    }

    static 
    {
        OTHER = new DecodeHintType("OTHER", 0, java/lang/Object);
        PURE_BARCODE = new DecodeHintType("PURE_BARCODE", 1, java/lang/Void);
        POSSIBLE_FORMATS = new DecodeHintType("POSSIBLE_FORMATS", 2, java/util/List);
        TRY_HARDER = new DecodeHintType("TRY_HARDER", 3, java/lang/Void);
        CHARACTER_SET = new DecodeHintType("CHARACTER_SET", 4, java/lang/String);
        ALLOWED_LENGTHS = new DecodeHintType("ALLOWED_LENGTHS", 5, [I);
        ASSUME_CODE_39_CHECK_DIGIT = new DecodeHintType("ASSUME_CODE_39_CHECK_DIGIT", 6, java/lang/Void);
        ASSUME_GS1 = new DecodeHintType("ASSUME_GS1", 7, java/lang/Void);
        RETURN_CODABAR_START_END = new DecodeHintType("RETURN_CODABAR_START_END", 8, java/lang/Void);
        NEED_RESULT_POINT_CALLBACK = new DecodeHintType("NEED_RESULT_POINT_CALLBACK", 9, com/google/zxing/ResultPointCallback);
        $VALUES = (new DecodeHintType[] {
            OTHER, PURE_BARCODE, POSSIBLE_FORMATS, TRY_HARDER, CHARACTER_SET, ALLOWED_LENGTHS, ASSUME_CODE_39_CHECK_DIGIT, ASSUME_GS1, RETURN_CODABAR_START_END, NEED_RESULT_POINT_CALLBACK
        });
    }
}
