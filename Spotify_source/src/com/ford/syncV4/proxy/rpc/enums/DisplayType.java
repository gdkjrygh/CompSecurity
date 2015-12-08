// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class DisplayType extends Enum
{

    public static final DisplayType a;
    private static DisplayType b;
    private static DisplayType c;
    private static DisplayType d;
    private static DisplayType e;
    private static DisplayType f;
    private static DisplayType g;
    private static DisplayType h;
    private static DisplayType i;
    private static DisplayType j;
    private static final DisplayType k[];
    final String internalName;

    private DisplayType(String s, int l, String s1)
    {
        super(s, l);
        internalName = s1;
    }

    public static DisplayType a(String s)
    {
        DisplayType adisplaytype[] = values();
        int i1 = adisplaytype.length;
        for (int l = 0; l < i1; l++)
        {
            DisplayType displaytype = adisplaytype[l];
            if (displaytype.toString().equals(s))
            {
                return displaytype;
            }
        }

        throw new IllegalArgumentException((new StringBuilder("Unknown value ")).append(s).toString());
    }

    public static DisplayType valueOf(String s)
    {
        return (DisplayType)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/DisplayType, s);
    }

    public static DisplayType[] values()
    {
        return (DisplayType[])k.clone();
    }

    public final String toString()
    {
        return internalName;
    }

    static 
    {
        b = new DisplayType("CID", 0, "CID");
        c = new DisplayType("TYPE2", 1, "TYPE2");
        d = new DisplayType("TYPE5", 2, "TYPE5");
        e = new DisplayType("NGN", 3, "NGN");
        f = new DisplayType("GEN2_8_DMA", 4, "GEN2_8_DMA");
        g = new DisplayType("GEN2_6_DMA", 5, "GEN2_6_DMA");
        h = new DisplayType("MFD3", 6, "MFD3");
        i = new DisplayType("MFD4", 7, "MFD4");
        j = new DisplayType("MFD5", 8, "MFD5");
        a = new DisplayType("GEN3_8_INCH", 9, "GEN3_8-INCH");
        k = (new DisplayType[] {
            b, c, d, e, f, g, h, i, j, a
        });
    }
}
