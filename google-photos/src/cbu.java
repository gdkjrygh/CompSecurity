// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class cbu extends cbg
{

    private static final TimeInterpolator c = new AccelerateDecelerateInterpolator();

    public cbu()
    {
        cbh cbh1 = (new cbh()).a(0xf4240L);
        cbh1.m = 0x61a80L;
        cbh1.n = 0x61a80L;
        cbh1.o = 0x61a80L;
        cbh1.a = b.eO;
        cbh1.j = car.c;
        cbh1.g = caz.d;
        super(cbh1);
    }

    protected final cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay1;
        assetmanager.e = resources.getColor(b.cQ);
        assetmanager.g = 36F;
        assetmanager.h = 44F;
        assetmanager.k = Typeface.create("sans-serif-condensed", 0);
        assetmanager.a = false;
        assetmanager.i = 25;
        assetmanager.m = true;
        assetmanager.q = resources.getColor(b.cx);
        assetmanager.n = 0.075F;
        assetmanager.v = 0xf4240L;
        return new cbv(assetmanager);
    }

    public final boolean a(cba cba1)
    {
        return b.d(cba1);
    }

    public final Matrix b(cba cba1)
    {
        if (b.d(cba1))
        {
            return a().b(cba1);
        } else
        {
            return super.b(cba1);
        }
    }

    public final Matrix c(cba cba1)
    {
        return a().c(cba1);
    }

    public final List c(cnq cnq1)
    {
        return Arrays.asList(new Double[] {
            Double.valueOf(b.a(-4D, 4D, new Random(cnq1.hashCode())))
        });
    }

    public final Matrix d(cba cba1)
    {
        if (b.d(cba1))
        {
            return a().d(cba1);
        } else
        {
            return super.d(cba1);
        }
    }

    protected final cay f()
    {
        return new cbd(this, 1.05F, 1.2F, null, 0, true);
    }

    protected final cay g()
    {
        return new cct();
    }

    public final float[] h()
    {
        return cbg.b;
    }

    public final int j(cba cba1)
    {
        if (b.d(cba1))
        {
            return a().j(cba1);
        } else
        {
            return 0;
        }
    }

    public final Matrix k(cba cba1)
    {
        if (b.d(cba1))
        {
            return a().k(cba1);
        } else
        {
            return super.k(cba1);
        }
    }

    public final float l(cba cba1)
    {
        if (b.d(cba1))
        {
            return a().l(cba1);
        } else
        {
            return 0.0F;
        }
    }

    public final float v(cba cba1)
    {
        if (cba1.w)
        {
            return 0.0F;
        }
        float f1;
        if (cba1.f != 0)
        {
            f1 = 1.0F;
        } else
        {
            long l1 = Math.min(0xf4240L, (long)((float)(cba1.v - 0xf4240L) * 0.25F));
            f1 = ddl.a(((float)cba1.a * 1.0F) / (float)l1);
        }
        if (f1 < 1.0F)
        {
            return c.getInterpolation(1.0F - f1);
        } else
        {
            return -super.v(cba1);
        }
    }

}
