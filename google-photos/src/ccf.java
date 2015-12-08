// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;
import java.util.Arrays;
import java.util.List;

public final class ccf extends cbg
{

    private static final float c = 1.0F / (float)Math.sqrt(2D);
    private ccy d;

    public ccf()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eW;
        cbh1.m = 0xc3500L;
        cbh1.e = b.fs;
        cbh1.f = 0.8F;
        cbh1.g = caz.a;
        super(cbh1);
        d = new ccg(this, 0x61a80L, -1, 256, 982, cda.b);
    }

    private boolean A(cba cba1)
    {
        return d.a(cba1) && !b.e(cba1);
    }

    private float B(cba cba1)
    {
        return 1.0F - Math.abs(d.b(cba1) - 0.5F) * 2.0F;
    }

    private Matrix C(cba cba1)
    {
        int j = cba1.h;
        int l = cba1.f;
        cba1 = d.c(cba1);
        float f1 = b.a(0.0F, 360F, j + l * 7);
        cba1.preScale(c, c, 0.5F, 0.5F);
        cba1.preRotate(f1, 0.5F, 0.5F);
        return cba1;
    }

    public final List D_()
    {
        return Arrays.asList(new Integer[] {
            Integer.valueOf(b.dY), Integer.valueOf(b.eG)
        });
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        cbj cbj1 = new cbj();
        cbj1.d = cay;
        cbj1.e = resources.getColor(b.db);
        cbj1.g = 36F;
        cbj1.h = 44F;
        cbj1.k = Typeface.createFromAsset(assetmanager, "fonts/RobotoSlab-Regular.ttf");
        cbj1.a = false;
        cbj1.i = 50;
        cbj1.m = true;
        cbj1.q = resources.getColor(b.cy);
        cbj1.r = resources.getColor(b.dc);
        return cbj1.a();
    }

    public final int f(cba cba1)
    {
        if (A(cba1))
        {
            return b.eG;
        } else
        {
            return b.dX;
        }
    }

    protected final cay f()
    {
        return new cch(this);
    }

    public final Matrix g(cba cba1)
    {
        if (A(cba1))
        {
            return C(cba1);
        } else
        {
            return super.g(cba1);
        }
    }

    public final float h(cba cba1)
    {
        if (A(cba1))
        {
            return B(cba1);
        } else
        {
            return 1.0F;
        }
    }

    public final float[] h()
    {
        return cbg.b;
    }

    public final int i(cba cba1)
    {
        if (A(cba1))
        {
            return caz.b;
        } else
        {
            return caz.a;
        }
    }

    public final Matrix k(cba cba1)
    {
        float f1 = b.f((int)cba1.a);
        float f2 = b.f((int)cba1.a + 1);
        cba1 = super.k(cba1);
        cba1.setScale(0.3333333F, 0.25F);
        cba1.postTranslate(f1 * 0.6666666F, f2 * 0.75F);
        return cba1;
    }

    public final int n(cba cba1)
    {
        if (cba1.i == cnt.c && A(cba1))
        {
            return b.eG;
        }
        if (A(cba1))
        {
            return b.dX;
        } else
        {
            return 0;
        }
    }

    public final Matrix o(cba cba1)
    {
        if (cba1.i == cnt.c && A(cba1))
        {
            return C(cba1);
        } else
        {
            return super.o(cba1);
        }
    }

    public final float p(cba cba1)
    {
        if (cba1.i == cnt.c && A(cba1))
        {
            return B(cba1);
        } else
        {
            return 1.0F;
        }
    }

    public final int q(cba cba1)
    {
        if (cba1.i == cnt.c)
        {
            return caz.b;
        } else
        {
            return caz.a;
        }
    }

}
