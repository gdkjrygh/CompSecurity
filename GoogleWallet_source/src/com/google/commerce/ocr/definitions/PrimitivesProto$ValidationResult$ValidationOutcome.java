// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class value extends Enum
{

    private static final VALIDATION_OUTCOME_INCONCLUSIVE $VALUES[];
    public static final VALIDATION_OUTCOME_INCONCLUSIVE VALIDATION_OUTCOME_FAIL;
    public static final VALIDATION_OUTCOME_INCONCLUSIVE VALIDATION_OUTCOME_INCONCLUSIVE;
    public static final VALIDATION_OUTCOME_INCONCLUSIVE VALIDATION_OUTCOME_PASS;
    public static final VALIDATION_OUTCOME_INCONCLUSIVE VALIDATION_OUTCOME_UNKNOWN;
    private static com.google.protobuf.lidationOutcome internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return VALIDATION_OUTCOME_UNKNOWN;

        case 1: // '\001'
            return VALIDATION_OUTCOME_PASS;

        case 2: // '\002'
            return VALIDATION_OUTCOME_FAIL;

        case 3: // '\003'
            return VALIDATION_OUTCOME_INCONCLUSIVE;
        }
    }

    public static VALIDATION_OUTCOME_INCONCLUSIVE valueOf(String s)
    {
        return (VALIDATION_OUTCOME_INCONCLUSIVE)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$ValidationResult$ValidationOutcome, s);
    }

    public static VALIDATION_OUTCOME_INCONCLUSIVE[] values()
    {
        return (VALIDATION_OUTCOME_INCONCLUSIVE[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        VALIDATION_OUTCOME_UNKNOWN = new <init>("VALIDATION_OUTCOME_UNKNOWN", 0, 0, 0);
        VALIDATION_OUTCOME_PASS = new <init>("VALIDATION_OUTCOME_PASS", 1, 1, 1);
        VALIDATION_OUTCOME_FAIL = new <init>("VALIDATION_OUTCOME_FAIL", 2, 2, 2);
        VALIDATION_OUTCOME_INCONCLUSIVE = new <init>("VALIDATION_OUTCOME_INCONCLUSIVE", 3, 3, 3);
        $VALUES = (new .VALUES[] {
            VALIDATION_OUTCOME_UNKNOWN, VALIDATION_OUTCOME_PASS, VALIDATION_OUTCOME_FAIL, VALIDATION_OUTCOME_INCONCLUSIVE
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
