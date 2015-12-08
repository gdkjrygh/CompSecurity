// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.msnp;


public final class MsnpIdentityType extends Enum
{

    public static final MsnpIdentityType a;
    public static final MsnpIdentityType b;
    public static final MsnpIdentityType c;
    public static final MsnpIdentityType d;
    public static final MsnpIdentityType e;
    public static final MsnpIdentityType f;
    public static final MsnpIdentityType g;
    private static final MsnpIdentityType i[];
    private int h;

    private MsnpIdentityType(String s, int j, int k)
    {
        super(s, j);
        h = k;
    }

    public static MsnpIdentityType a(int j)
    {
        MsnpIdentityType amsnpidentitytype[] = values();
        int l = amsnpidentitytype.length;
        for (int k = 0; k < l; k++)
        {
            MsnpIdentityType msnpidentitytype = amsnpidentitytype[k];
            if (msnpidentitytype.h == j)
            {
                return msnpidentitytype;
            }
        }

        return null;
    }

    public static MsnpIdentityType valueOf(String s)
    {
        return (MsnpIdentityType)Enum.valueOf(com/skype/msnp/MsnpIdentityType, s);
    }

    public static MsnpIdentityType[] values()
    {
        return (MsnpIdentityType[])i.clone();
    }

    static 
    {
        a = new MsnpIdentityType("MICROSOFT", 0, 1);
        b = new MsnpIdentityType("LYNC", 1, 2);
        c = new MsnpIdentityType("PHONE", 2, 4);
        d = new MsnpIdentityType("SKYPE", 3, 8);
        e = new MsnpIdentityType("FEDERATED", 4, 13);
        f = new MsnpIdentityType("THREAD", 5, 19);
        g = new MsnpIdentityType("IMPLICIT", 6, 20);
        i = (new MsnpIdentityType[] {
            a, b, c, d, e, f, g
        });
    }
}
