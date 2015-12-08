// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;


public final class CritterRateMyAppButtons extends Enum
{

    public static final CritterRateMyAppButtons a;
    public static final CritterRateMyAppButtons b;
    public static final CritterRateMyAppButtons c;
    private static final CritterRateMyAppButtons d[];

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
        return (CritterRateMyAppButtons[])d.clone();
    }

    static 
    {
        a = new CritterRateMyAppButtons("YES", 0);
        b = new CritterRateMyAppButtons("NO", 1);
        c = new CritterRateMyAppButtons("LATER", 2);
        d = (new CritterRateMyAppButtons[] {
            a, b, c
        });
    }
}
