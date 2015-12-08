// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.net;


public final class PhoneType extends Enum
{

    private static final PhoneType $VALUES[];
    public static final PhoneType CDMA;
    public static final PhoneType GSM;
    public static final PhoneType NONE;
    public static final PhoneType UNKNOWN;
    private String desc;
    private int type;

    private PhoneType(String s, int i, int j, String s1)
    {
        super(s, i);
        type = j;
        desc = s1;
    }

    public static PhoneType getPhoneType(int i)
    {
        for (int j = 0; j < values().length; j++)
        {
            if (values()[j].type == i)
            {
                return values()[j];
            }
        }

        return UNKNOWN;
    }

    public static PhoneType valueOf(String s)
    {
        return (PhoneType)Enum.valueOf(com/netflix/mediaclient/net/PhoneType, s);
    }

    public static PhoneType[] values()
    {
        return (PhoneType[])$VALUES.clone();
    }

    public final String getDesc()
    {
        return desc;
    }

    public final int getType()
    {
        return type;
    }

    static 
    {
        UNKNOWN = new PhoneType("UNKNOWN", 0, 0x80000000, "UNKNOWN");
        NONE = new PhoneType("NONE", 1, 0, "NONE");
        GSM = new PhoneType("GSM", 2, 1, "GSM");
        CDMA = new PhoneType("CDMA", 3, 2, "CDMA");
        $VALUES = (new PhoneType[] {
            UNKNOWN, NONE, GSM, CDMA
        });
    }
}
