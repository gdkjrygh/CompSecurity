// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;


// Referenced classes of package com.accuweather.android:
//            LoadingScreenActivity

private static final class  extends Enum
{

    private static final LOADING $VALUES[];
    public static final LOADING GIVE_US_A_MOMENT;
    public static final LOADING LOADING;
    public static final LOADING OPTIMIZING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/accuweather/android/LoadingScreenActivity$TextAnimationPhase, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GIVE_US_A_MOMENT = new <init>("GIVE_US_A_MOMENT", 0);
        OPTIMIZING = new <init>("OPTIMIZING", 1);
        LOADING = new <init>("LOADING", 2);
        $VALUES = (new .VALUES[] {
            GIVE_US_A_MOMENT, OPTIMIZING, LOADING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
