// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;

public final class cca extends cbx
{

    private Matrix b;

    public cca()
    {
        cbg cbg1 = new cbg(b.eR);
        Object obj = new cbh();
        obj.a = b.eS;
        obj.e = b.fc;
        obj = ((cbh) (obj)).a();
        Object obj1 = new cbh();
        obj1.a = b.eT;
        obj1.e = b.fc;
        obj1 = ((cbh) (obj1)).a();
        super(new int[] {
            1, 2, 3
        }, new cay[] {
            cbg1, obj, obj1
        });
        b = new Matrix();
    }

    protected final cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        cbj cbj1 = new cbj();
        cbj1.d = cay1;
        cbj1.f = 83;
        cbj1.e = resources.getColor(b.cU);
        cbj1.g = 60F;
        cbj1.h = 60F;
        cbj1.k = Typeface.createFromAsset(assetmanager, "fonts/Roboto-Black.ttf");
        cbj1.a = true;
        cbj1.i = 50;
        cbj1.m = true;
        cbj1.q = resources.getColor(b.cy);
        return new ccb(cbj1);
    }

    public final int f(cba cba1)
    {
        return b.fz;
    }

    public final Matrix g(cba cba1)
    {
        return b;
    }

    public final float h(cba cba1)
    {
        return b.a(0.5F, 0.7F, (int)cba1.a);
    }

    public final int r(cba cba1)
    {
        return 8;
    }
}
