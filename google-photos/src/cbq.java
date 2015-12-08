// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class cbq extends cbg
{

    private ccy c;
    private ccy d;

    public cbq()
    {
        cbh cbh1 = new cbh();
        cbh1.a = b.eM;
        cbh1.b = b.eu;
        cbh1.d = caz.b;
        cbh1.g = caz.d;
        cbh1.k = 14;
        cbh1.j = car.e;
        super(cbh1);
        c = new ccy(0x61a80L, 3, 2048, 256, cda.c);
        d = new ccy(0x61a80L, 2, 2048, 256, cda.d);
    }

    public final List D_()
    {
        return Arrays.asList(new Integer[] {
            Integer.valueOf(b.eu), Integer.valueOf(b.ev), Integer.valueOf(b.ew), Integer.valueOf(b.ex), Integer.valueOf(b.ey)
        });
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        cbj cbj1 = new cbj();
        cbj1.d = cay;
        cbj1.e = resources.getColor(b.cL);
        cbj1.g = 36F;
        cbj1.h = 44F;
        cbj1.k = Typeface.createFromAsset(assetmanager, "fonts/Roboto-Black.ttf");
        cbj1.a = true;
        cbj1.i = 25;
        cbj1.m = false;
        cbj1.r = resources.getColor(b.cM);
        return cbj1.a();
    }

    public final List a(cnq cnq1)
    {
        double d1;
        ArrayList arraylist;
        arraylist = new ArrayList();
        cnq1 = new Random(cnq1.hashCode());
        if (cnq1.nextDouble() < 0.40000000596046448D)
        {
            arraylist.add(Integer.valueOf(1));
        }
        d1 = cnq1.nextDouble();
        if (d1 >= 0.30000001192092896D) goto _L2; else goto _L1
_L1:
        arraylist.add(Integer.valueOf(3));
_L4:
        return Collections.unmodifiableList(arraylist);
_L2:
        if (d1 < 0.60000002384185791D)
        {
            arraylist.add(Integer.valueOf(2));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final pyh b(cnq cnq1)
    {
        if (cnq1.d != cnt.c)
        {
            return null;
        } else
        {
            return b.a(1.0D, 0.10000000000000001D, 0.0D, 0.5D, cnq1);
        }
    }

    protected final cay f()
    {
        return new cbr(this);
    }

    public final int j(cba cba1)
    {
        if (c.a(cba1))
        {
            if (b.f((int)cba1.a + 1) < 0.3F)
            {
                return b.ew;
            } else
            {
                return b.ev;
            }
        }
        if (d.a(cba1))
        {
            if (b.f((int)cba1.a + 1) < 0.3F)
            {
                return b.ey;
            } else
            {
                return b.ex;
            }
        } else
        {
            return 0;
        }
    }

    public final Matrix k(cba cba1)
    {
        if (c.a(cba1))
        {
            return c.c(cba1);
        } else
        {
            return d.c(cba1);
        }
    }

    public final float t(cba cba1)
    {
        if (b.a(1, cba1.x))
        {
            return b.a(-0.7F, -0.65F, (int)cba1.a);
        } else
        {
            return 0.0F;
        }
    }
}
