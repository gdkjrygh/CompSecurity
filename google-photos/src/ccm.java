// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;

public final class ccm extends cbg
{

    public ccm()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eX;
        cbh1.m = 0xc3500L;
        cbh1.b = b.eF;
        cbh1.c = 1.0F;
        cbh1.d = caz.a;
        super(cbh1);
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay;
        assetmanager.e = resources.getColor(b.de);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif", 0);
        assetmanager.a = false;
        assetmanager.i = 50;
        assetmanager.m = true;
        assetmanager.q = resources.getColor(b.cy);
        assetmanager.u = 0xf4240L;
        assetmanager.v = 0xf4240L;
        return new ccn(assetmanager);
    }

    protected final cay f()
    {
        return new cci(this, cck.a, 0.93F);
    }
}
