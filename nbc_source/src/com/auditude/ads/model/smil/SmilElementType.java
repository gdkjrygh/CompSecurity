// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.smil;


public final class SmilElementType extends Enum
{

    private static final SmilElementType ENUM$VALUES[];
    public static final SmilElementType LINEAR;
    public static final SmilElementType NON_LINEAR;
    public static final SmilElementType UNKNOWN;

    private SmilElementType(String s, int i)
    {
        super(s, i);
    }

    public static SmilElementType forValue(int i)
    {
        return values()[i];
    }

    public static SmilElementType valueOf(String s)
    {
        return (SmilElementType)Enum.valueOf(com/auditude/ads/model/smil/SmilElementType, s);
    }

    public static SmilElementType[] values()
    {
        SmilElementType asmilelementtype[] = ENUM$VALUES;
        int i = asmilelementtype.length;
        SmilElementType asmilelementtype1[] = new SmilElementType[i];
        System.arraycopy(asmilelementtype, 0, asmilelementtype1, 0, i);
        return asmilelementtype1;
    }

    public int getValue()
    {
        return ordinal();
    }

    static 
    {
        LINEAR = new SmilElementType("LINEAR", 0);
        NON_LINEAR = new SmilElementType("NON_LINEAR", 1);
        UNKNOWN = new SmilElementType("UNKNOWN", 2);
        ENUM$VALUES = (new SmilElementType[] {
            LINEAR, NON_LINEAR, UNKNOWN
        });
    }
}
