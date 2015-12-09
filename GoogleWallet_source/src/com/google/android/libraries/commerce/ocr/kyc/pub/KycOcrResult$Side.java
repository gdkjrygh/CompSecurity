// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.pub;


// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.pub:
//            KycOcrResult

public static final class I extends Enum
{

    private static final BACK $VALUES[];
    public static final BACK BACK;
    public static final BACK FRONT;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/google/android/libraries/commerce/ocr/kyc/pub/KycOcrResult$Side, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        FRONT = new <init>("FRONT", 0);
        BACK = new <init>("BACK", 1);
        $VALUES = (new .VALUES[] {
            FRONT, BACK
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
