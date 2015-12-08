// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;

public final class caw extends cbg
{

    private ccu c;

    public caw()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eJ;
        cbh1.b = b.dV;
        cbh1.c = 1.0F;
        cbh1.d = caz.a;
        super(cbh1);
        c = new cdc(0x493e0L);
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay;
        assetmanager.e = resources.getColor(b.cA);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif-condensed", 1);
        assetmanager.a = true;
        assetmanager.i = 100;
        assetmanager.r = resources.getColor(b.cB);
        assetmanager.m = false;
        return new cax(assetmanager);
    }

    public final pyh b(cnq cnq1)
    {
        if (cnq1.d != cnt.c)
        {
            return null;
        } else
        {
            return b.a(1.05D, 0.029999999999999999D, 0.20000000000000001D, 0.5D, cnq1);
        }
    }

    protected final cay f()
    {
        return new cbr(this);
    }

    public final float v(cba cba1)
    {
        if (!cba1.w && c.b(cba1) >= 0.5F)
        {
            return -1F;
        } else
        {
            return super.v(cba1);
        }
    }
}
