// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;

public final class cbo extends cbg
{

    public cbo()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eQ;
        cbh1.m = 0x493e0L;
        super(cbh1);
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        cbj cbj1 = new cbj();
        cbj1.d = cay;
        cbj1.c = 1;
        cbj1.b = 2;
        cbj1.h = 44F;
        cbj1.e = resources.getColor(b.cJ);
        cbj1.g = 36F;
        cbj1.k = Typeface.createFromAsset(assetmanager, "fonts/RobotoSlab-Bold.ttf");
        cbj1.a = true;
        cbj1.i = 200;
        cbj1.m = true;
        cbj1.q = resources.getColor(b.cy);
        cbj1.o = 0.03F;
        cbj1.p = 0.04F;
        cbj1.n = 0.02F;
        cbj1.u = 0xf4240L;
        return new cbp(cbj1);
    }

    protected final cay f()
    {
        return new cci(this, cck.d, 0.9F);
    }
}
