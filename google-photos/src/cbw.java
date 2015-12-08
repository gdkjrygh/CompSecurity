// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;
import java.util.List;

public final class cbw extends cbg
{

    public cbw()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eP;
        cbh1.m = 0x493e0L;
        cbh1.n = 0x493e0L;
        cbh1.o = 0x493e0L;
        cbh1.b = b.eE;
        cbh1.d = caz.d;
        super(cbh1);
    }

    protected final cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay1;
        assetmanager.e = resources.getColor(b.cR);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif", 1);
        assetmanager.a = true;
        assetmanager.i = 25;
        assetmanager.m = true;
        assetmanager.q = resources.getColor(b.cx);
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
        return new cbx(new int[] {
            1, 2, 3, 4
        }, new cay[] {
            cci1, cci2, cci3, cci4
        });
    }
}
