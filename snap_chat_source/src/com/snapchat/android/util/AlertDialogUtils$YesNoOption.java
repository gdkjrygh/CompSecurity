// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            AlertDialogUtils

public static final class  extends Enum
{

    private static final YES_DONT_ASK_AGAIN $VALUES[];
    public static final YES_DONT_ASK_AGAIN NO;
    public static final YES_DONT_ASK_AGAIN YES;
    public static final YES_DONT_ASK_AGAIN YES_DONT_ASK_AGAIN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/AlertDialogUtils$YesNoOption, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        YES = new <init>("YES", 0);
        NO = new <init>("NO", 1);
        YES_DONT_ASK_AGAIN = new <init>("YES_DONT_ASK_AGAIN", 2);
        $VALUES = (new .VALUES[] {
            YES, NO, YES_DONT_ASK_AGAIN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
