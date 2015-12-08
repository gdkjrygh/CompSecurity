// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class value extends Enum
{

    private static final CONSTRAINT_QUADRATIC $VALUES[];
    public static final CONSTRAINT_QUADRATIC CONSTRAINT_BOX;
    public static final CONSTRAINT_QUADRATIC CONSTRAINT_LINEAR;
    public static final CONSTRAINT_QUADRATIC CONSTRAINT_QUADRATIC;
    private static com.google.protobuf.Path.Constraint internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return CONSTRAINT_BOX;

        case 2: // '\002'
            return CONSTRAINT_LINEAR;

        case 3: // '\003'
            return CONSTRAINT_QUADRATIC;
        }
    }

    public static CONSTRAINT_QUADRATIC valueOf(String s)
    {
        return (CONSTRAINT_QUADRATIC)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Path$Constraint, s);
    }

    public static CONSTRAINT_QUADRATIC[] values()
    {
        return (CONSTRAINT_QUADRATIC[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        CONSTRAINT_BOX = new <init>("CONSTRAINT_BOX", 0, 0, 1);
        CONSTRAINT_LINEAR = new <init>("CONSTRAINT_LINEAR", 1, 1, 2);
        CONSTRAINT_QUADRATIC = new <init>("CONSTRAINT_QUADRATIC", 2, 2, 3);
        $VALUES = (new .VALUES[] {
            CONSTRAINT_BOX, CONSTRAINT_LINEAR, CONSTRAINT_QUADRATIC
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
