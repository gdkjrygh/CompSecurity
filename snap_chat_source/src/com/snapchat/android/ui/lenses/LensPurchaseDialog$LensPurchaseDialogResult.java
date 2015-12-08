// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;


// Referenced classes of package com.snapchat.android.ui.lenses:
//            LensPurchaseDialog

public static final class  extends Enum
{

    private static final CANCEL $VALUES[];
    public static final CANCEL BUY;
    public static final CANCEL CANCEL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/lenses/LensPurchaseDialog$LensPurchaseDialogResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BUY = new <init>("BUY", 0);
        CANCEL = new <init>("CANCEL", 1);
        $VALUES = (new .VALUES[] {
            BUY, CANCEL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
