// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums;

import bo.app.ak;
import com.appboy.models.IPutIntoJson;

public final class Gender extends Enum
    implements IPutIntoJson
{

    public static final Gender FEMALE;
    public static final Gender MALE;
    private static final Gender a[];

    private Gender(String s, int i)
    {
        super(s, i);
    }

    public static Gender valueOf(String s)
    {
        return (Gender)Enum.valueOf(com/appboy/enums/Gender, s);
    }

    public static Gender[] values()
    {
        return (Gender[])a.clone();
    }

    public final volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public final String forJsonPut()
    {
        switch (ak.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "m";

        case 2: // '\002'
            return "f";
        }
    }

    static 
    {
        MALE = new Gender("MALE", 0);
        FEMALE = new Gender("FEMALE", 1);
        a = (new Gender[] {
            MALE, FEMALE
        });
    }
}
