// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;


public final class WireType extends Enum
{

    public static final WireType a;
    public static final WireType b;
    public static final WireType c;
    public static final WireType d;
    public static final WireType e;
    public static final WireType f;
    private static final WireType g[];
    public final int value;

    private WireType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static WireType a(int i)
    {
        switch (i & 7)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("No WireType for value ")).append(i).toString());

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;

        case 4: // '\004'
            return e;

        case 5: // '\005'
            return f;
        }
    }

    public static WireType valueOf(String s)
    {
        return (WireType)Enum.valueOf(com/squareup/wire/WireType, s);
    }

    public static WireType[] values()
    {
        return (WireType[])g.clone();
    }

    static 
    {
        a = new WireType("VARINT", 0, 0);
        b = new WireType("FIXED64", 1, 1);
        c = new WireType("LENGTH_DELIMITED", 2, 2);
        d = new WireType("START_GROUP", 3, 3);
        e = new WireType("END_GROUP", 4, 4);
        f = new WireType("FIXED32", 5, 5);
        g = (new WireType[] {
            a, b, c, d, e, f
        });
    }
}
