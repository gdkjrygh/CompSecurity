// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            WireProto

public static final class value extends Enum
{

    private static final RELEASE $VALUES[];
    public static final RELEASE DOGFOOD;
    public static final RELEASE FISHFOOD;
    public static final RELEASE RELEASE;
    public static final RELEASE UNKNOWN_FEATURE_LEVEL;
    private static com.google.protobuf.fo.FeatureLevel internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return UNKNOWN_FEATURE_LEVEL;

        case 1: // '\001'
            return FISHFOOD;

        case 2: // '\002'
            return DOGFOOD;

        case 3: // '\003'
            return RELEASE;
        }
    }

    public static RELEASE valueOf(String s)
    {
        return (RELEASE)Enum.valueOf(com/google/commerce/ocr/definitions/WireProto$ClientInfo$FeatureLevel, s);
    }

    public static RELEASE[] values()
    {
        return (RELEASE[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        UNKNOWN_FEATURE_LEVEL = new <init>("UNKNOWN_FEATURE_LEVEL", 0, 0, 0);
        FISHFOOD = new <init>("FISHFOOD", 1, 1, 1);
        DOGFOOD = new <init>("DOGFOOD", 2, 2, 2);
        RELEASE = new <init>("RELEASE", 3, 3, 3);
        $VALUES = (new .VALUES[] {
            UNKNOWN_FEATURE_LEVEL, FISHFOOD, DOGFOOD, RELEASE
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
