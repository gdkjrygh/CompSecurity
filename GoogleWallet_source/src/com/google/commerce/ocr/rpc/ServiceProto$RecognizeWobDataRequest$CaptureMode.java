// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.rpc;


// Referenced classes of package com.google.commerce.ocr.rpc:
//            ServiceProto

public static final class value extends Enum
{

    private static final CONTINUOUS $VALUES[];
    public static final CONTINUOUS CONTINUOUS;
    public static final CONTINUOUS DETECTED;
    public static final CONTINUOUS SNAP;
    public static final CONTINUOUS UNKNOWN_CAPTURE_MODE;
    private static com.google.protobuf.ureMode internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return UNKNOWN_CAPTURE_MODE;

        case 1: // '\001'
            return SNAP;

        case 2: // '\002'
            return DETECTED;

        case 3: // '\003'
            return CONTINUOUS;
        }
    }

    public static CONTINUOUS valueOf(String s)
    {
        return (CONTINUOUS)Enum.valueOf(com/google/commerce/ocr/rpc/ServiceProto$RecognizeWobDataRequest$CaptureMode, s);
    }

    public static CONTINUOUS[] values()
    {
        return (CONTINUOUS[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        UNKNOWN_CAPTURE_MODE = new <init>("UNKNOWN_CAPTURE_MODE", 0, 0, 0);
        SNAP = new <init>("SNAP", 1, 1, 1);
        DETECTED = new <init>("DETECTED", 2, 2, 2);
        CONTINUOUS = new <init>("CONTINUOUS", 3, 3, 3);
        $VALUES = (new .VALUES[] {
            UNKNOWN_CAPTURE_MODE, SNAP, DETECTED, CONTINUOUS
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
