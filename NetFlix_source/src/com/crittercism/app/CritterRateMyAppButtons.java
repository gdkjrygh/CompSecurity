// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;


public final class CritterRateMyAppButtons extends Enum
{

    private static final CritterRateMyAppButtons $VALUES[];
    public static final CritterRateMyAppButtons LATER;
    public static final CritterRateMyAppButtons NO;
    public static final CritterRateMyAppButtons YES;

    private CritterRateMyAppButtons(String s, int i)
    {
        super(s, i);
    }

    public static CritterRateMyAppButtons valueOf(String s)
    {
        return (CritterRateMyAppButtons)Enum.valueOf(com/crittercism/app/CritterRateMyAppButtons, s);
    }

    public static CritterRateMyAppButtons[] values()
    {
        return (CritterRateMyAppButtons[])$VALUES.clone();
    }

    static 
    {
        YES = new CritterRateMyAppButtons("YES", 0);
        NO = new CritterRateMyAppButtons("NO", 1);
        LATER = new CritterRateMyAppButtons("LATER", 2);
        $VALUES = (new CritterRateMyAppButtons[] {
            YES, NO, LATER
        });
    }
}
