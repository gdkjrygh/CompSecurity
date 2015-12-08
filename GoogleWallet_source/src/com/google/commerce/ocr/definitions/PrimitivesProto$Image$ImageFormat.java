// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class value extends Enum
{

    private static final JPEG $VALUES[];
    public static final JPEG JPEG;
    private static com.google.protobuf.age.ImageFormat internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

    };
    private final int value;

    public static value valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return JPEG;
        }
    }

    public static JPEG valueOf(String s)
    {
        return (JPEG)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Image$ImageFormat, s);
    }

    public static JPEG[] values()
    {
        return (JPEG[])$VALUES.clone();
    }

    public final int getNumber()
    {
        return value;
    }

    static 
    {
        JPEG = new <init>("JPEG", 0, 0, 1);
        $VALUES = (new .VALUES[] {
            JPEG
        });
    }

    private _cls1(String s, int i, int j, int k)
    {
        super(s, i);
        value = k;
    }
}
