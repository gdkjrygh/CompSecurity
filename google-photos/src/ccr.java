// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;

public final class ccr extends cbg
{

    private ccu c;
    private TimeInterpolator d;

    public ccr()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eZ;
        cbh1.b = b.fz;
        cbh1.c = 0.25F;
        cbh1.d = caz.a;
        super(cbh1);
        c = new cdb(0x7a120L);
        d = new ccv();
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay;
        assetmanager.e = resources.getColor(b.dj);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif", 1);
        assetmanager.a = true;
        assetmanager.i = 50;
        assetmanager.m = false;
        return new cce(assetmanager, b.fA, false);
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
        return new ccs(this);
    }

    public final int j(cba cba1)
    {
        return b.fp;
    }

    public final float l(cba cba1)
    {
        if (cba1.w || b.e(cba1))
        {
            return 0.0F;
        } else
        {
            return d.getInterpolation(c.b(cba1));
        }
    }

    public final int m(cba cba1)
    {
        return caz.d;
    }
}
