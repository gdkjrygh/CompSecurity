// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;

public final class cau extends cbg
{

    public cau()
    {
        cbh cbh1 = (new cbh()).a(0xf4240L);
        cbh1.m = 0x61a80L;
        cbh1.n = 0x61a80L;
        cbh1.o = 0x61a80L;
        cbh1.a = b.eI;
        cbh1.b = b.eF;
        cbh1.c = 1.0F;
        cbh1.d = caz.a;
        super(cbh1);
    }

    protected final cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay1;
        assetmanager.c = 1;
        assetmanager.b = 2;
        assetmanager.h = 44F;
        assetmanager.e = resources.getColor(b.cv);
        assetmanager.g = 36F;
        assetmanager.k = Typeface.create("sans-serif-condensed", 1);
        assetmanager.a = true;
        assetmanager.i = 500;
        assetmanager.r = resources.getColor(b.cw);
        assetmanager.m = false;
        assetmanager.s = car.d;
        assetmanager.v = 0xf4240L;
        return assetmanager.a();
    }

    public final Matrix b(cba cba)
    {
        if (b.d(cba))
        {
            return a().b(cba);
        } else
        {
            return super.b(cba);
        }
    }

    public final pyh b(cnq cnq1)
    {
        if (cnq1.d != cnt.c)
        {
            return null;
        } else
        {
            return b.a(1.05D, 0.02D, 0.050000000000000003D, 0.5D, cnq1);
        }
    }

    protected final cay f()
    {
        return new cbr(this);
    }
}
