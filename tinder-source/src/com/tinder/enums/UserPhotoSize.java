// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class UserPhotoSize extends Enum
{

    private static final UserPhotoSize $VALUES[];
    public static final UserPhotoSize ANY;
    public static final UserPhotoSize LARGE;
    public static final UserPhotoSize MED;
    public static final UserPhotoSize SMALL;
    public static final UserPhotoSize XLARGE;
    public static final UserPhotoSize XSMALL;

    private UserPhotoSize(String s, int i)
    {
        super(s, i);
    }

    public static UserPhotoSize valueOf(String s)
    {
        return (UserPhotoSize)Enum.valueOf(com/tinder/enums/UserPhotoSize, s);
    }

    public static UserPhotoSize[] values()
    {
        return (UserPhotoSize[])$VALUES.clone();
    }

    static 
    {
        XSMALL = new UserPhotoSize("XSMALL", 0);
        SMALL = new UserPhotoSize("SMALL", 1);
        MED = new UserPhotoSize("MED", 2);
        LARGE = new UserPhotoSize("LARGE", 3);
        XLARGE = new UserPhotoSize("XLARGE", 4);
        ANY = new UserPhotoSize("ANY", 5);
        $VALUES = (new UserPhotoSize[] {
            XSMALL, SMALL, MED, LARGE, XLARGE, ANY
        });
    }
}
