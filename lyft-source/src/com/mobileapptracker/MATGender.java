// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;


public final class MATGender extends Enum
{

    public static final MATGender a;
    public static final MATGender b;
    public static final MATGender c;
    private static final MATGender d[];

    private MATGender(String s, int i)
    {
        super(s, i);
    }

    public static MATGender valueOf(String s)
    {
        return (MATGender)Enum.valueOf(com/mobileapptracker/MATGender, s);
    }

    public static MATGender[] values()
    {
        return (MATGender[])d.clone();
    }

    static 
    {
        a = new MATGender("MALE", 0);
        b = new MATGender("FEMALE", 1);
        c = new MATGender("UNKNOWN", 2);
        d = (new MATGender[] {
            a, b, c
        });
    }
}
