// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.msnp;


public final class MsnpMessageType extends Enum
{

    public static final MsnpMessageType a;
    public static final MsnpMessageType b;
    public static final MsnpMessageType c;
    public static final MsnpMessageType d;
    public static final MsnpMessageType e;
    public static final MsnpMessageType f;
    public static final MsnpMessageType g;
    private static final MsnpMessageType i[];
    private String h;

    private MsnpMessageType(String s, int j, String s1)
    {
        super(s, j);
        h = s1;
    }

    public static MsnpMessageType a(String s)
    {
        MsnpMessageType amsnpmessagetype[] = values();
        int k = amsnpmessagetype.length;
        for (int j = 0; j < k; j++)
        {
            MsnpMessageType msnpmessagetype = amsnpmessagetype[j];
            if (msnpmessagetype.h.equalsIgnoreCase(s))
            {
                return msnpmessagetype;
            }
        }

        return a;
    }

    public static MsnpMessageType valueOf(String s)
    {
        return (MsnpMessageType)Enum.valueOf(com/skype/msnp/MsnpMessageType, s);
    }

    public static MsnpMessageType[] values()
    {
        return (MsnpMessageType[])i.clone();
    }

    static 
    {
        a = new MsnpMessageType("UNKNOWN", 0, "");
        b = new MsnpMessageType("NFY", 1, "NFY");
        c = new MsnpMessageType("OUT", 2, "OUT");
        d = new MsnpMessageType("PUT", 3, "PUT");
        e = new MsnpMessageType("SDG", 4, "SDG");
        f = new MsnpMessageType("VER", 5, "VER");
        g = new MsnpMessageType("XFR", 6, "XFR");
        i = (new MsnpMessageType[] {
            a, b, c, d, e, f, g
        });
    }
}
