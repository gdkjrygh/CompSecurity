// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class daj
{

    private static final SparseArray b = new SparseArray(256);
    public final boolean a;

    private daj(boolean flag)
    {
        a = flag;
    }

    public static daj a(int i)
    {
        daj daj2 = (daj)b.get(i);
        daj daj1 = daj2;
        if (daj2 == null)
        {
            daj1 = new daj(false);
        }
        return daj1;
    }

    private static void a(int i, boolean flag)
    {
        daj daj1 = new daj(flag);
        b.put(i, daj1);
    }

    static 
    {
        a(0x80010001, false);
        a(0x80010002, false);
        a(0x80010003, false);
        a(0x80010004, false);
        a(0x80010005, false);
        a(0x80010010, false);
        a(0x80010020, false);
        a(0x80010021, false);
        a(0x80010022, false);
        a(0x80010023, false);
        a(0x80010024, false);
        a(0x800100ff, false);
        a(0x80020001, false);
        a(0x80020002, false);
        a(0x80020003, true);
        a(0x80030000, true);
        a(0x80030001, false);
        a(0x80030002, false);
        a(0x80030004, false);
        a(0x80030005, false);
        a(0x80030014, true);
        a(0x8003001b, true);
        a(0x8003001c, true);
        a(0x8003001d, true);
        a(0x80030032, false);
        a(0x80030033, true);
        a(0x80030040, true);
        a(0x80030047, false);
        a(0x80030053, false);
        a(0x80030054, false);
        a(0x80030064, true);
        a(0x80030067, true);
        a(0x80030fff, false);
        a(0x80031001, false);
        a(0x80031002, false);
        a(0x80031003, false);
        a(0x80031004, false);
        a(0x80031005, false);
        a(0x80031006, false);
        a(0x80031007, false);
        a(0x80031008, false);
        a(0x80031009, false);
        a(0x80031012, false);
        a(0x80031022, false);
        a(0x80031024, false);
        a(0x80031027, true);
        a(0x80031033, false);
        a(0x80031034, false);
        a(0x80031036, false);
        a(0x80031037, true);
        a(0x80031038, false);
        a(0x80031039, false);
        a(0x8003103b, true);
        a(0x8003103f, true);
        a(0x80031040, false);
        a(0x80031041, true);
        a(0x80031042, true);
        a(0x80031043, false);
        a(0x80031044, true);
        a(0x80031045, true);
        a(0x80031046, false);
        a(0x8003104a, false);
        a(0x8003104b, true);
        a(0x8003104c, true);
        a(0x8003104d, true);
        a(0x8003104e, false);
        a(0x8003104f, false);
        a(0x8003104f, true);
        a(0x80031071, false);
        a(0x80031072, false);
        a(0x80031078, false);
        a(0x8003107e, true);
        a(0x80040001, false);
        a(0x80040002, false);
        a(0x80040003, false);
        a(0x80040004, false);
        a(0x80040005, false);
        a(0x80040020, false);
        a(0x80040021, false);
        a(0x80040022, false);
        a(0x80040023, false);
        a(0x80040024, false);
        a(0x800400ff, false);
        a(0x80050001, false);
        a(0x80050002, false);
        a(0x80050003, false);
        a(0x80060000, false);
        a(0x80060001, false);
        a(0x80060002, false);
        a(0x80060003, false);
        a(0x80060010, false);
        a(0x80060011, false);
        a(0x80060012, false);
        a(0x80060013, false);
        a(0x80060020, false);
        a(0x80060021, true);
        a(0x80060022, false);
        a(0x80060023, false);
        a(0x80060024, false);
        a(0x80060026, false);
        a(0x80060027, true);
        a(0x80060028, false);
        a(0x80060030, true);
        a(0x80060031, true);
        a(0x80060032, true);
        a(0x80060035, true);
        a(0x80060040, true);
        a(0x80060041, true);
        a(0x8006004f, true);
        a(0x80060051, true);
        a(0x80060060, true);
        a(0x80060080, false);
        a(0x80070001, false);
        a(0x80070002, false);
        a(0x80070003, false);
        a(0x80070004, false);
        a(0x80070005, false);
        a(0x80070010, false);
        a(0x80070020, false);
        a(0x80070021, false);
        a(0x80070022, false);
        a(0x80070023, false);
        a(0x80070024, false);
        a(0x800700ff, false);
        a(0x80080001, false);
        a(0x80080002, false);
        a(0x80090001, false);
        a(0x800a0001, false);
        a(0x800a0002, false);
        a(0x800a0003, false);
        a(0x800a0004, false);
        a(0x800a0005, false);
        a(0x800a0006, false);
        a(0x800a0007, false);
        a(0x800a0080, true);
        a(0x800a0081, true);
        a(0x800b0001, false);
        a(0x800c0001, false);
        a(0x800c0002, false);
        a(0x800c0003, false);
        a(0x800d0001, false);
        a(0x800d0002, false);
        a(0x800d0003, false);
        a(0x800d0004, false);
        a(0x800d0005, false);
        a(0x800d0006, false);
        a(0x800d0007, false);
        a(0x800d0008, false);
        a(0x800d0009, false);
        a(0x800d0010, false);
        a(0x800d0011, false);
        a(0x800d0012, false);
        a(0x800d0013, false);
        a(0x800d0014, false);
        a(0x800d0015, false);
        a(0x800d0081, false);
        a(0x800d0082, false);
        a(0x800d0083, false);
        a(0x800d0084, false);
        a(0x800d0085, false);
        a(0x800d0086, false);
        a(0x800d0087, false);
        a(0x800e0001, false);
        a(0x800e00ff, false);
        a(0x800f0001, false);
        a(0x80100001, true);
        a(0x80100002, false);
        a(0x80f00001, false);
        a(0x80f00002, false);
        a(0x80f00003, false);
        a(0x80f00004, true);
        a(0x8f0000ff, false);
    }
}
