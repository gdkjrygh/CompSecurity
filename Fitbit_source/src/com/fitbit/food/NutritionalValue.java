// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food;


public final class NutritionalValue extends Enum
{

    public static final NutritionalValue A;
    public static final NutritionalValue B;
    public static final NutritionalValue C;
    public static final NutritionalValue D;
    public static final NutritionalValue E;
    private static final NutritionalValue F[];
    public static final NutritionalValue a;
    public static final NutritionalValue b;
    public static final NutritionalValue c;
    public static final NutritionalValue d;
    public static final NutritionalValue e;
    public static final NutritionalValue f;
    public static final NutritionalValue g;
    public static final NutritionalValue h;
    public static final NutritionalValue i;
    public static final NutritionalValue j;
    public static final NutritionalValue k;
    public static final NutritionalValue l;
    public static final NutritionalValue m;
    public static final NutritionalValue n;
    public static final NutritionalValue o;
    public static final NutritionalValue p;
    public static final NutritionalValue q;
    public static final NutritionalValue r;
    public static final NutritionalValue s;
    public static final NutritionalValue t;
    public static final NutritionalValue u;
    public static final NutritionalValue v;
    public static final NutritionalValue w;
    public static final NutritionalValue x;
    public static final NutritionalValue y;
    public static final NutritionalValue z;
    private String key;
    private int title;
    private int units;

    private NutritionalValue(String s1, int i1, int j1, int k1, String s2)
    {
        super(s1, i1);
        title = j1;
        units = k1;
        key = s2;
    }

    public static NutritionalValue valueOf(String s1)
    {
        return (NutritionalValue)Enum.valueOf(com/fitbit/food/NutritionalValue, s1);
    }

    public static NutritionalValue[] values()
    {
        return (NutritionalValue[])F.clone();
    }

    public int a()
    {
        return title;
    }

    public int b()
    {
        return units;
    }

    public String c()
    {
        return key;
    }

    static 
    {
        a = new NutritionalValue("CALORIES", 0, 0x7f0801d4, 0x7f0800bb, "calories");
        b = new NutritionalValue("CALORIES_FROM_FAT", 1, 0x7f0801d6, 0x7f0800bb, "caloriesFromFat");
        c = new NutritionalValue("TOTAL_FAT", 2, 0x7f080207, 0x7f080240, "totalFat");
        d = new NutritionalValue("SATURATED_FAT", 3, 0x7f0801fe, 0x7f080240, "saturatedFat");
        e = new NutritionalValue("TRANS_FAT", 4, 0x7f080208, 0x7f080240, "transFat");
        f = new NutritionalValue("CHOLESTEROL", 5, 0x7f0801d9, 0x7f0803d2, "cholesterol");
        g = new NutritionalValue("SODIUM", 6, 0x7f080202, 0x7f0803d2, "sodium");
        h = new NutritionalValue("POTASSIUM", 7, 0x7f0801f9, 0x7f080240, "potassium");
        i = new NutritionalValue("TOTAL_CARBS", 8, 0x7f080206, 0x7f080240, "totalCarbohydrate");
        j = new NutritionalValue("DIETARTY_FIBER", 9, 0x7f0801e0, 0x7f080240, "dietaryFiber");
        k = new NutritionalValue("SUGARS", 10, 0x7f080203, 0x7f080240, "sugars");
        l = new NutritionalValue("PROTEIN", 11, 0x7f0801fa, 0x7f080240, "protein");
        m = new NutritionalValue("VITAMIN_A", 12, 0x7f08020c, 0x7f0803d2, "vitaminA");
        n = new NutritionalValue("VITAMIN_B6", 13, 0x7f08020e, 0x7f0803d2, "vitaminB6");
        o = new NutritionalValue("VITAMIN_B12", 14, 0x7f08020d, 0x7f0803d2, "vitaminB12");
        p = new NutritionalValue("VITAMIN_C", 15, 0x7f08020f, 0x7f0803d2, "vitaminC");
        q = new NutritionalValue("VITAMIN_D", 16, 0x7f080210, 0x7f0803d2, "vitaminD");
        r = new NutritionalValue("VITAMIN_E", 17, 0x7f080211, 0x7f0803d2, "vitaminE");
        s = new NutritionalValue("BIOTIN", 18, 0x7f0801cf, 0x7f0803d2, "biotin");
        t = new NutritionalValue("FOLIC_ACID", 19, 0x7f0801e5, 0x7f0803d2, "folicAcid");
        u = new NutritionalValue("NIACIN", 20, 0x7f0801f1, 0x7f0803d2, "niacin");
        v = new NutritionalValue("PANTOTHENIC_ACID", 21, 0x7f0801f6, 0x7f0803d2, "pantothenicAcid");
        w = new NutritionalValue("RIBOFLAVIN", 22, 0x7f0801fd, 0x7f0803d2, "riboflavin");
        x = new NutritionalValue("THIAMIN", 23, 0x7f080204, 0x7f0803d2, "thiamin");
        y = new NutritionalValue("CALCIUM", 24, 0x7f0801d3, 0x7f0803d2, "calcium");
        z = new NutritionalValue("COPPER", 25, 0x7f0801da, 0x7f0803d2, "copper");
        A = new NutritionalValue("IRON", 26, 0x7f0801ea, 0x7f0803d2, "iron");
        B = new NutritionalValue("MAGNEZIUM", 27, 0x7f0801ed, 0x7f0803d2, "magnesium");
        C = new NutritionalValue("PHOSPHORUS", 28, 0x7f0801f8, 0x7f0803d2, "phosphorus");
        D = new NutritionalValue("IODINE", 29, 0x7f0801e9, 0x7f0803d2, "iodine");
        E = new NutritionalValue("ZINC", 30, 0x7f080212, 0x7f0803d2, "zinc");
        F = (new NutritionalValue[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E
        });
    }
}
