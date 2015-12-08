// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.util;


// Referenced classes of package com.skype.android.app.wear.util:
//            WearDataLayerUtil

public static final class  extends Enum
{

    private static final ASSET_IS_NULL $VALUES[];
    public static final ASSET_IS_NULL ASSET_IS_NULL;
    public static final ASSET_IS_NULL DATA_API_ERROR;
    public static final ASSET_IS_NULL FAILED_TO_DECODE_BITMAP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/wear/util/WearDataLayerUtil$LoadBitmapFromAssetResult$Reason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FAILED_TO_DECODE_BITMAP = new <init>("FAILED_TO_DECODE_BITMAP", 0);
        DATA_API_ERROR = new <init>("DATA_API_ERROR", 1);
        ASSET_IS_NULL = new <init>("ASSET_IS_NULL", 2);
        $VALUES = (new .VALUES[] {
            FAILED_TO_DECODE_BITMAP, DATA_API_ERROR, ASSET_IS_NULL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
