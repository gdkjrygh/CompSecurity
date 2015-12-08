// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;

public final class ccd extends cbg
{

    public ccd()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eV;
        cbh1.b = b.fj;
        cbh1.c = 0.5F;
        cbh1.d = caz.a;
        cbh1.e = b.fz;
        cbh1.f = 0.6F;
        cbh1.g = caz.a;
        super(cbh1);
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay;
        assetmanager.c = 1;
        assetmanager.b = 2;
        assetmanager.h = 44F;
        assetmanager.e = resources.getColor(b.cZ);
        assetmanager.g = 36F;
        assetmanager.k = Typeface.create("sans-serif", 2);
        assetmanager.a = false;
        assetmanager.i = 200;
        assetmanager.m = true;
        assetmanager.q = resources.getColor(b.cy);
        return new cce(assetmanager, b.fk, true);
    }

    public final Matrix g(cba cba1)
    {
        float f = b.f((int)cba1.a);
        float f1 = b.f((int)cba1.a + 1);
        cba1 = super.g(cba1);
        cba1.setScale(0.4747775F, 0.3333333F);
        cba1.postTranslate(f * 0.5252225F, f1 * 0.6666666F);
        return cba1;
    }
}
