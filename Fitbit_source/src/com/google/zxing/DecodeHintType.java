// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.List;

// Referenced classes of package com.google.zxing:
//            m

public final class DecodeHintType extends Enum
{

    public static final DecodeHintType a;
    public static final DecodeHintType b;
    public static final DecodeHintType c;
    public static final DecodeHintType d;
    public static final DecodeHintType e;
    public static final DecodeHintType f;
    public static final DecodeHintType g;
    public static final DecodeHintType h;
    public static final DecodeHintType i;
    public static final DecodeHintType j;
    public static final DecodeHintType k;
    private static final DecodeHintType l[];
    private final Class valueType;

    private DecodeHintType(String s, int i1, Class class1)
    {
        super(s, i1);
        valueType = class1;
    }

    public static DecodeHintType valueOf(String s)
    {
        return (DecodeHintType)Enum.valueOf(com/google/zxing/DecodeHintType, s);
    }

    public static DecodeHintType[] values()
    {
        return (DecodeHintType[])l.clone();
    }

    public Class a()
    {
        return valueType;
    }

    static 
    {
        a = new DecodeHintType("OTHER", 0, java/lang/Object);
        b = new DecodeHintType("PURE_BARCODE", 1, java/lang/Void);
        c = new DecodeHintType("POSSIBLE_FORMATS", 2, java/util/List);
        d = new DecodeHintType("TRY_HARDER", 3, java/lang/Void);
        e = new DecodeHintType("CHARACTER_SET", 4, java/lang/String);
        f = new DecodeHintType("ALLOWED_LENGTHS", 5, [I);
        g = new DecodeHintType("ASSUME_CODE_39_CHECK_DIGIT", 6, java/lang/Void);
        h = new DecodeHintType("ASSUME_GS1", 7, java/lang/Void);
        i = new DecodeHintType("RETURN_CODABAR_START_END", 8, java/lang/Void);
        j = new DecodeHintType("NEED_RESULT_POINT_CALLBACK", 9, com/google/zxing/m);
        k = new DecodeHintType("ALLOWED_EAN_EXTENSIONS", 10, [I);
        l = (new DecodeHintType[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
