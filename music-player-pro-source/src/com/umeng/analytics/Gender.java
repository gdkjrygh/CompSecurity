// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;


public final class Gender extends Enum
{

    public static final Gender Female;
    public static final Gender Male;
    public static final Gender Unknown;
    private static final Gender a[];

    private Gender(String s, int i)
    {
        super(s, i);
    }

    public static Gender valueOf(String s)
    {
        return (Gender)Enum.valueOf(com/umeng/analytics/Gender, s);
    }

    public static Gender[] values()
    {
        Gender agender[] = a;
        int i = agender.length;
        Gender agender1[] = new Gender[i];
        System.arraycopy(agender, 0, agender1, 0, i);
        return agender1;
    }

    static 
    {
        Male = new Gender("Male", 0);
        Female = new Gender("Female", 1);
        Unknown = new Gender("Unknown", 2);
        a = (new Gender[] {
            Male, Female, Unknown
        });
    }
}
