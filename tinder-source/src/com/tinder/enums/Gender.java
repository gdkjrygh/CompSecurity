// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class Gender extends Enum
{

    private static final Gender $VALUES[];
    public static final Gender FEMALE;
    public static final Gender MALE;
    int backendId;

    private Gender(String s, int i, int j)
    {
        super(s, i);
        backendId = j;
    }

    public static Gender valueOf(String s)
    {
        return (Gender)Enum.valueOf(com/tinder/enums/Gender, s);
    }

    public static Gender[] values()
    {
        return (Gender[])$VALUES.clone();
    }

    public final int getBackendId()
    {
        return backendId;
    }

    static 
    {
        MALE = new Gender("MALE", 0, 0);
        FEMALE = new Gender("FEMALE", 1, 1);
        $VALUES = (new Gender[] {
            MALE, FEMALE
        });
    }
}
