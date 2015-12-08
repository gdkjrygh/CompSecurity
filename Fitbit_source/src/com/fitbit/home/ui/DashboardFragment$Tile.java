// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.home.ui.tiles.HeartRateTile;
import com.fitbit.home.ui.tiles.a;
import com.fitbit.home.ui.tiles.b;
import com.fitbit.home.ui.tiles.c;
import com.fitbit.home.ui.tiles.d;
import com.fitbit.home.ui.tiles.f;
import com.fitbit.home.ui.tiles.g;
import com.fitbit.home.ui.tiles.h;
import com.fitbit.home.ui.tiles.i;
import com.fitbit.home.ui.tiles.k;
import com.fitbit.home.ui.tiles.l;
import com.fitbit.home.ui.tiles.m;
import com.fitbit.home.ui.tiles.r;
import com.fitbit.home.ui.tiles.s;
import com.fitbit.home.ui.tiles.t;
import com.fitbit.home.ui.tiles.u;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment

public static final class clazz extends Enum
    implements com.fitbit.ui.Tile
{

    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static final p l;
    public static final p m;
    public static final p n;
    public static final p o;
    public static final p p;
    private static final p q[];
    private final Class clazz;

    public static clazz valueOf(String s1)
    {
        return (clazz)Enum.valueOf(com/fitbit/home/ui/DashboardFragment$Tile, s1);
    }

    public static clazz[] values()
    {
        return (clazz[])q.clone();
    }

    public d a()
    {
        if (clazz != null)
        {
            d d1;
            try
            {
                d1 = (d)clazz.newInstance();
            }
            catch (InstantiationException instantiationexception)
            {
                throw new RuntimeException(instantiationexception);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new RuntimeException(illegalaccessexception);
            }
            return d1;
        } else
        {
            return null;
        }
    }

    public boolean b()
    {
        return this != b && this != p && this != c && this != a;
    }

    static 
    {
        a = new <init>("guide", 0, com/fitbit/home/ui/tiles/k);
        b = new <init>("device", 1);
        c = new <init>("information", 2, com/fitbit/home/ui/tiles/m);
        d = new <init>("steps", 3, com/fitbit/home/ui/tiles/s);
        e = new <init>("heartRate", 4, com/fitbit/home/ui/tiles/HeartRateTile);
        f = new <init>("distance", 5, com/fitbit/home/ui/tiles/f);
        g = new <init>("calories", 6, com/fitbit/home/ui/tiles/b);
        h = new <init>("floors", 7, com/fitbit/home/ui/tiles/h);
        i = new <init>("activeMinutes", 8, com/fitbit/home/ui/tiles/a);
        j = new <init>("workouts", 9, com/fitbit/home/ui/tiles/g);
        k = new <init>("weight", 10, com/fitbit/home/ui/tiles/u);
        l = new <init>("sleep", 11, com/fitbit/home/ui/tiles/r);
        m = new <init>("caloriesInOut", 12, com/fitbit/home/ui/tiles/c);
        n = new <init>("food", 13, com/fitbit/home/ui/tiles/i);
        o = new <init>("water", 14, com/fitbit/home/ui/tiles/t);
        p = new <init>("hidden", 15, com/fitbit/home/ui/tiles/l);
        q = (new q[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p
        });
    }

    private (String s1, int i1)
    {
        this(s1, i1, null);
    }

    private <init>(String s1, int i1, Class class1)
    {
        super(s1, i1);
        clazz = class1;
    }
}
