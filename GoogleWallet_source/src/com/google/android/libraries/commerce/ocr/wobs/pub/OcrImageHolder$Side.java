// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.pub;


// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.pub:
//            OcrImageHolder

public static final class imageIndex extends Enum
{

    private static final FRONT $VALUES[];
    public static final FRONT BACK;
    public static final FRONT FRONT;
    private final int imageIndex;

    public static imageIndex valueOf(String s)
    {
        return (imageIndex)Enum.valueOf(com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder$Side, s);
    }

    public static imageIndex[] values()
    {
        return (imageIndex[])$VALUES.clone();
    }

    public final int getImageIndex()
    {
        return imageIndex;
    }

    static 
    {
        BACK = new <init>("BACK", 0, 0);
        FRONT = new <init>("FRONT", 1, 1);
        $VALUES = (new .VALUES[] {
            BACK, FRONT
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        imageIndex = j;
    }
}
