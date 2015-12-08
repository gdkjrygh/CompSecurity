// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class cbk extends cbx
{

    private ccu b;
    private TimeInterpolator c;

    public cbk()
    {
        cby cby1 = new cby(84, 40000L, 1.0F, new cbz[] {
            new cbz(b.eg, 0), new cbz(b.eh, 6), new cbz(b.ei, 12), new cbz(b.ej, 18), new cbz(b.ek, 24), new cbz(b.el, 30), new cbz(b.em, 36), new cbz(b.en, 42), new cbz(b.eo, 48), new cbz(b.ep, 54), 
            new cbz(b.eq, 60), new cbz(b.er, 66), new cbz(b.es, 72), new cbz(b.et, 78)
        });
        cby cby2 = new cby(82, 40000L, 0.2F, new cbz[] {
            new cbz(0, 0), new cbz(0, 5, true), new cbz(b.dZ, 8), new cbz(b.dZ, 10, true), new cbz(0, 12), new cbz(0, 16, true), new cbz(b.ea, 17, true), new cbz(b.eb, 18), new cbz(b.eb, 53, true), new cbz(0, 55, true), 
            new cbz(b.ec, 59, true), new cbz(b.ed, 61), new cbz(b.ed, 65, true), new cbz(b.ee, 68), new cbz(b.ee, 71, true), new cbz(b.ef, 74, true)
        });
        super(new int[] {
            2, 1
        }, new cay[] {
            cby1, cby2
        });
        b = new cdb(0x61a80L);
        c = new ccv();
    }

    public final car E_()
    {
        return car.b;
    }

    protected final cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay1;
        assetmanager.e = resources.getColor(b.cH);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif", 0);
        assetmanager.a = false;
        assetmanager.i = 25;
        assetmanager.m = true;
        assetmanager.q = resources.getColor(b.cx);
        assetmanager.n = 0.075F;
        assetmanager.u = 0xf4240L;
        assetmanager.v = 0xf4240L;
        return new cbl(assetmanager);
    }

    public final List c(cnq cnq1)
    {
        return Arrays.asList(new Double[] {
            Double.valueOf(b.a(-4D, 4D, new Random(cnq1.hashCode())))
        });
    }

    public final int e(cba cba1)
    {
        return b.eL;
    }

    protected final cay f()
    {
        return new cbm(this);
    }

    protected final cay g()
    {
        return new cct();
    }

    public final float[] h()
    {
        return cbg.b;
    }

    public final float v(cba cba1)
    {
        if (cba1.w)
        {
            return 0.0F;
        }
        if (b.a(cba1))
        {
            return c.getInterpolation(b.b(cba1));
        } else
        {
            return -super.v(cba1);
        }
    }
}
