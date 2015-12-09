// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food;


public final class CommonMeasurementUnits extends Enum
{

    public static final CommonMeasurementUnits A;
    public static final CommonMeasurementUnits B;
    public static final CommonMeasurementUnits C;
    private static final CommonMeasurementUnits D[];
    public static final CommonMeasurementUnits a;
    public static final CommonMeasurementUnits b;
    public static final CommonMeasurementUnits c;
    public static final CommonMeasurementUnits d;
    public static final CommonMeasurementUnits e;
    public static final CommonMeasurementUnits f;
    public static final CommonMeasurementUnits g;
    public static final CommonMeasurementUnits h;
    public static final CommonMeasurementUnits i;
    public static final CommonMeasurementUnits j;
    public static final CommonMeasurementUnits k;
    public static final CommonMeasurementUnits l;
    public static final CommonMeasurementUnits m;
    public static final CommonMeasurementUnits n;
    public static final CommonMeasurementUnits o;
    public static final CommonMeasurementUnits p;
    public static final CommonMeasurementUnits q;
    public static final CommonMeasurementUnits r;
    public static final CommonMeasurementUnits s;
    public static final CommonMeasurementUnits t;
    public static final CommonMeasurementUnits u;
    public static final CommonMeasurementUnits v;
    public static final CommonMeasurementUnits w;
    public static final CommonMeasurementUnits x;
    public static final CommonMeasurementUnits y;
    public static final CommonMeasurementUnits z;
    private long serverId;

    private CommonMeasurementUnits(String s1, int i1, int j1)
    {
        super(s1, i1);
        serverId = j1;
    }

    public static CommonMeasurementUnits a(long l1)
    {
        CommonMeasurementUnits acommonmeasurementunits[] = values();
        int j1 = acommonmeasurementunits.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            CommonMeasurementUnits commonmeasurementunits = acommonmeasurementunits[i1];
            if (l1 == commonmeasurementunits.a())
            {
                return commonmeasurementunits;
            }
        }

        return null;
    }

    public static CommonMeasurementUnits valueOf(String s1)
    {
        return (CommonMeasurementUnits)Enum.valueOf(com/fitbit/food/CommonMeasurementUnits, s1);
    }

    public static CommonMeasurementUnits[] values()
    {
        return (CommonMeasurementUnits[])D.clone();
    }

    public long a()
    {
        return serverId;
    }

    static 
    {
        a = new CommonMeasurementUnits("BAR", 0, 17);
        b = new CommonMeasurementUnits("BOTTLE", 1, 27);
        c = new CommonMeasurementUnits("BOX", 2, 29);
        d = new CommonMeasurementUnits("CAN", 3, 43);
        e = new CommonMeasurementUnits("CONTAINER", 4, 69);
        f = new CommonMeasurementUnits("CUDE", 5, 88);
        g = new CommonMeasurementUnits("CUP", 6, 91);
        h = new CommonMeasurementUnits("FL_OZ", 7, 128);
        i = new CommonMeasurementUnits("GRAM", 8, 147);
        j = new CommonMeasurementUnits("JAR", 9, 170);
        k = new CommonMeasurementUnits("KG", 10, 389);
        l = new CommonMeasurementUnits("LARGE", 11, 179);
        m = new CommonMeasurementUnits("LB", 12, 180);
        n = new CommonMeasurementUnits("LITER", 13, 189);
        o = new CommonMeasurementUnits("MEDIUM", 14, 204);
        p = new CommonMeasurementUnits("MILLIGRAM", 15, 513);
        q = new CommonMeasurementUnits("ML", 16, 209);
        r = new CommonMeasurementUnits("OZ", 17, 226);
        s = new CommonMeasurementUnits("PACKAGE", 18, 228);
        t = new CommonMeasurementUnits("PIECE", 19, 251);
        u = new CommonMeasurementUnits("PINT", 20, 256);
        v = new CommonMeasurementUnits("QUART", 21, 279);
        w = new CommonMeasurementUnits("SCOOP", 22, 301);
        x = new CommonMeasurementUnits("SERVING", 23, 304);
        y = new CommonMeasurementUnits("SLICE", 24, 311);
        z = new CommonMeasurementUnits("SMALL", 25, 319);
        A = new CommonMeasurementUnits("STICK", 26, 339);
        B = new CommonMeasurementUnits("TBLSP", 27, 400);
        C = new CommonMeasurementUnits("TSP", 28, 364);
        D = (new CommonMeasurementUnits[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C
        });
    }
}
