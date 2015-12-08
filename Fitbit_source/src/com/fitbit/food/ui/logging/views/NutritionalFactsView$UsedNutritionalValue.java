// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import com.fitbit.food.NutritionalValue;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            NutritionalFactsView

private static final class isFirstPart extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    private static final n o[];
    private boolean isFirstPart;
    private boolean isGeneral;
    private NutritionalValue value;

    public static isFirstPart valueOf(String s)
    {
        return (isFirstPart)Enum.valueOf(com/fitbit/food/ui/logging/views/NutritionalFactsView$UsedNutritionalValue, s);
    }

    public static isFirstPart[] values()
    {
        return (isFirstPart[])o.clone();
    }

    public int a()
    {
        return value.a();
    }

    public String b()
    {
        return value.c();
    }

    public int c()
    {
        return value.b();
    }

    public boolean d()
    {
        return isGeneral;
    }

    public boolean e()
    {
        return isFirstPart;
    }

    static 
    {
        a = new <init>("TOTAL_FAT", 0, NutritionalValue.c, true, true);
        b = new <init>("SATURATED_FAT", 1, NutritionalValue.d, false, true);
        c = new <init>("TRANS_FAT", 2, NutritionalValue.e, false, true);
        d = new <init>("CHOLESTEROL", 3, NutritionalValue.f, true, true);
        e = new <init>("SODIUM", 4, NutritionalValue.g, true, true);
        f = new <init>("POTASSIUM", 5, NutritionalValue.h, true, true);
        g = new <init>("TOTAL_CARBS", 6, NutritionalValue.i, true, true);
        h = new <init>("DIETARTY_FIBER", 7, NutritionalValue.j, false, true);
        i = new <init>("SUGARS", 8, NutritionalValue.k, false, true);
        j = new <init>("PROTEIN", 9, NutritionalValue.l, true, true);
        k = new <init>("VITAMIN_A", 10, NutritionalValue.m, true, false);
        l = new <init>("VITAMIN_C", 11, NutritionalValue.p, true, false);
        m = new <init>("CALCIUM", 12, NutritionalValue.y, true, false);
        n = new <init>("IRON", 13, NutritionalValue.A, true, false);
        o = (new o[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }

    private (String s, int i1, NutritionalValue nutritionalvalue, boolean flag, boolean flag1)
    {
        super(s, i1);
        value = nutritionalvalue;
        isGeneral = flag;
        isFirstPart = flag1;
    }
}
