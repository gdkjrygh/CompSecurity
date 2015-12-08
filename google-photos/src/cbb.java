// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.List;

public final class cbb extends cbx
{

    private ccu b;
    private TimeInterpolator c;

    public cbb()
    {
        cav cav1 = new cav(b.dP, b.dQ, 0xf4240L);
        cav cav2 = new cav(b.dR, b.dS, 0xf4240L);
        cav cav3 = new cav(b.dT, b.dU, 0xf4240L);
        super(new int[] {
            1, 2, 3
        }, new cay[] {
            cav1, cav2, cav3
        });
        b = new ccx(0xc3500L);
        c = new ccv();
    }

    public final car E_()
    {
        return car.e;
    }

    public final long a(cnt cnt1, cnt cnt2)
    {
        return cnt1 != cnt.c || cnt2 != cnt.c ? 0L : 0x493e0L;
    }

    protected final cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        cbj cbj1 = new cbj();
        cbj1.d = cay1;
        cbj1.f = 83;
        cbj1.e = resources.getColor(b.cD);
        cbj1.g = 36F;
        cbj1.h = 36F;
        cbj1.k = Typeface.createFromAsset(assetmanager, "fonts/Roboto-Black.ttf");
        cbj1.a = false;
        cbj1.m = false;
        cbj1.s = car.d;
        return new cbc(cbj1);
    }

    public final int e(cba cba1)
    {
        return b.eK;
    }

    protected final cay f()
    {
        return new cci((cay)super.a.get(1), cck.d, 0.9F);
    }

    public final float v(cba cba1)
    {
        if (!cba1.w && b.a(cba1))
        {
            return c.getInterpolation(b.b(cba1));
        } else
        {
            return super.v(cba1);
        }
    }
}
