// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;
import java.util.List;

public final class cco extends cbg
{

    public cco()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eY;
        cbh1.m = 0x493e0L;
        cbh1.n = 0x493e0L;
        cbh1.o = 0x493e0L;
        cbh1.b = b.fz;
        cbh1.c = 0.4F;
        cbh1.d = caz.a;
        cbh1.j = car.e;
        super(cbh1);
    }

    protected final cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay1;
        assetmanager.e = resources.getColor(b.dg);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif-condensed", 1);
        assetmanager.a = true;
        assetmanager.i = 50;
        assetmanager.m = false;
        assetmanager.r = resources.getColor(b.dh);
        return assetmanager.a();
    }

    public final List a(cnq cnq)
    {
        return a().a(cnq);
    }

    public final Matrix b(cba cba)
    {
        return a().b(cba);
    }

    protected final cay f()
    {
        cci cci1 = new cci(this, cck.d, 1.0F);
        cci cci2 = new cci(this, cck.c, 1.0F);
        cci cci3 = new cci(this, cck.b, 1.0F);
        cci cci4 = new cci(this, cck.a, 1.0F);
        return new ccp(this, new int[] {
            1, 2, 3, 4
        }, new cay[] {
            cci1, cci2, cci3, cci4
        });
    }
}
