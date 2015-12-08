// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;


// Referenced classes of package com.google.android.apps.wallet.plastic:
//            ActivationFragment

public static final class  extends Enum
{

    private static final CONGRATULATIONS $VALUES[];
    public static final CONGRATULATIONS ACTIVATE;
    public static final CONGRATULATIONS CONGRATULATIONS;
    public static final CONGRATULATIONS HOW_IT_WORKS;
    public static final CONGRATULATIONS UNINITIALIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/plastic/ActivationFragment$NavState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        ACTIVATE = new <init>("ACTIVATE", 1);
        HOW_IT_WORKS = new <init>("HOW_IT_WORKS", 2);
        CONGRATULATIONS = new <init>("CONGRATULATIONS", 3);
        $VALUES = (new .VALUES[] {
            UNINITIALIZED, ACTIVATE, HOW_IT_WORKS, CONGRATULATIONS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
