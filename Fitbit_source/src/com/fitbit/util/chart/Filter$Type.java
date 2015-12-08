// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;


// Referenced classes of package com.fitbit.util.chart:
//            Filter, TimeIntervalType

public static final class Type extends Enum
{

    public static final H A;
    public static final H B;
    public static final H C;
    public static final H D;
    public static final H E;
    public static final H F;
    public static final H G;
    public static final H H;
    private static final H I[];
    public static final H a;
    public static final H b;
    public static final H c;
    public static final H d;
    public static final H e;
    public static final H f;
    public static final H g;
    public static final H h;
    public static final H i;
    public static final H j;
    public static final H k;
    public static final H l;
    public static final H m;
    public static final H n;
    public static final H o;
    public static final H p;
    public static final H q;
    public static final H r;
    public static final H s;
    public static final H t;
    public static final H u;
    public static final H v;
    public static final H w;
    public static final H x;
    public static final H y;
    public static final H z;

    public static Type valueOf(String s1)
    {
        return (Type)Enum.valueOf(com/fitbit/util/chart/Filter$Type, s1);
    }

    public static Type[] values()
    {
        return (Type[])I.clone();
    }

    public TimeIntervalType a()
    {
        switch (Type[ordinal()])
        {
        default:
            return TimeIntervalType.g;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return TimeIntervalType.e;

        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            return TimeIntervalType.f;
        }
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("WEEK_WEIGHT", 1);
        c = new <init>("WEEK_ACTIVITY", 2);
        d = new <init>("WEEK_SLEEP", 3);
        e = new <init>("TWO_WEEKS_WEIGHT", 4);
        f = new <init>("TWO_WEEKS_ACTIVITY", 5);
        g = new <init>("TWO_WEEKS_SLEEP", 6);
        h = new <init>("MONTH_WEIGHT", 7);
        i = new <init>("MONTH_ACTIVITY", 8);
        j = new <init>("MONTH_SLEEP", 9);
        k = new <init>("THREE_MONTHS_WEIGHT", 10);
        l = new <init>("THREE_MONTHS_ACTIVITY", 11);
        m = new <init>("THREE_MONTHS_SLEEP", 12);
        n = new <init>("YEAR_WEIGHT", 13);
        o = new <init>("YEAR_ACTIVITY", 14);
        p = new <init>("YEAR_SLEEP", 15);
        q = new <init>("ONE_AND_HALF_YEAR_WEIGHT", 16);
        r = new <init>("ONE_AND_HALF_YEAR_ACTIVITY", 17);
        s = new <init>("ONE_AND_HALF_YEAR_SLEEP", 18);
        t = new <init>("INTRADAY_ACTIVITY", 19);
        u = new <init>("INTRADAY_SLEEP", 20);
        v = new <init>("DAY_HEART_RATE", 21);
        w = new <init>("WEEK_HEART_RATE", 22);
        x = new <init>("MONTH_HEART_RATE", 23);
        y = new <init>("THREE_MONTHS_HEART_RATE", 24);
        z = new <init>("YEAR_HEART_RATE", 25);
        A = new <init>("WEEK_EXERCISE_HEART_RATE", 26);
        B = new <init>("MONTH_EXERCISE_HEART_RATE", 27);
        C = new <init>("THREE_MONTHS_EXERCISE_HEART_RATE", 28);
        D = new <init>("YEAR_EXERCISE_HEART_RATE", 29);
        E = new <init>("WEEK_RESTING_HEART_RATE", 30);
        F = new <init>("MONTH_RESTING_HEART_RATE", 31);
        G = new <init>("THREE_MONTHS_RESTING_HEART_RATE", 32);
        H = new <init>("YEAR_RESTING_HEART_RATE", 33);
        I = (new I[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H
        });
    }

    private Type(String s1, int i1)
    {
        super(s1, i1);
    }
}
