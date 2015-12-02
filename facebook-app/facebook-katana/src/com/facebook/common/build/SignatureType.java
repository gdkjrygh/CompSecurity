// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.build;


public final class SignatureType extends Enum
{

    private static final SignatureType $VALUES[];
    public static final SignatureType DEBUG;
    public static final SignatureType IN_HOUSE;
    public static final SignatureType PROD;
    public static final SignatureType WORK;
    public static final SignatureType WORKDEV;

    private SignatureType(String s, int i)
    {
        super(s, i);
    }

    public static SignatureType valueOf(String s)
    {
        return (SignatureType)Enum.valueOf(com/facebook/common/build/SignatureType, s);
    }

    public static SignatureType[] values()
    {
        return (SignatureType[])$VALUES.clone();
    }

    public final String getPermission()
    {
        return String.format("com.facebook.permission.%s.FB_APP_COMMUNICATION", new Object[] {
            name().toLowerCase()
        });
    }

    static 
    {
        DEBUG = new SignatureType("DEBUG", 0);
        IN_HOUSE = new SignatureType("IN_HOUSE", 1);
        PROD = new SignatureType("PROD", 2);
        WORKDEV = new SignatureType("WORKDEV", 3);
        WORK = new SignatureType("WORK", 4);
        $VALUES = (new SignatureType[] {
            DEBUG, IN_HOUSE, PROD, WORKDEV, WORK
        });
    }
}
