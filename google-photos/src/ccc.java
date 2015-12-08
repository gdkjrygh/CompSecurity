// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;

public final class ccc extends cbg
{

    private ccu c;
    private TimeInterpolator d;

    public ccc()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eU;
        cbh1.b = b.fo;
        cbh1.d = caz.b;
        cbh1.c = 0.1F;
        cbh1.e = b.fi;
        cbh1.g = caz.e;
        cbh1.j = car.b;
        super(cbh1);
        c = new cdb(0x61a80L);
        d = new ccv();
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay;
        assetmanager.e = resources.getColor(b.cW);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif-condensed", 1);
        assetmanager.r = resources.getColor(b.cX);
        assetmanager.v = 0xf4240L;
        assetmanager.s = car.d;
        return assetmanager.a();
    }

    public final pyh b(cnq cnq1)
    {
        if (cnq1.d != cnt.c)
        {
            return null;
        } else
        {
            return b.a(1.0D, 0.050000000000000003D, 0.0D, 1.0D, cnq1);
        }
    }

    protected final cay f()
    {
        return new cbr(this);
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
        if (c.a(cba1))
        {
            return d.getInterpolation(c.b(cba1));
        } else
        {
            return super.v(cba1);
        }
    }
}
