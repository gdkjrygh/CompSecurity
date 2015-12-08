// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;

public final class cbs extends cbg
{

    public cbs()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eN;
        cbh1.b = b.eD;
        cbh1.c = 1.0F;
        cbh1.d = caz.a;
        cbh1.k = 5;
        super(cbh1);
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay;
        assetmanager.c = 1;
        assetmanager.b = 2;
        assetmanager.h = 44F;
        assetmanager.e = resources.getColor(b.cO);
        assetmanager.g = 36F;
        assetmanager.k = Typeface.create("sans-serif", 1);
        assetmanager.a = true;
        assetmanager.i = 100;
        assetmanager.m = false;
        assetmanager.v = 0xf4240L;
        return new cce(assetmanager, b.eH, true);
    }

    protected final cay f()
    {
        return new cbt(this, this);
    }

    public final Matrix g(cba cba1)
    {
        float f1 = b.a(-0.7F, 0.7F, (int)cba1.a);
        float f2 = b.a(-0.005F, 0.005F, (int)cba1.a + 1);
        float f3 = b.a(-0.005F, 0.005F, (int)cba1.a + 2);
        Matrix matrix = super.g(cba1);
        matrix.setTranslate(f2, f3);
        b.a(matrix, f1, cba1.u);
        return matrix;
    }
}
