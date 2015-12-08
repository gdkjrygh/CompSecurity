// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;

public abstract class caq
    implements cay
{

    private static final float a[] = {
        0.0F, 0.0F, 0.0F, 1.0F
    };
    private cay b;
    private cay c;
    private cay d;
    private cay e;

    public caq()
    {
    }

    public final cay a()
    {
        if (b == null)
        {
            b = f();
        }
        return b;
    }

    public final cay a(AssetManager assetmanager, Resources resources)
    {
        if (c == null)
        {
            c = a(((cay) (this)), assetmanager, resources);
        }
        return c;
    }

    protected cay a(cay cay1, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay1;
        assetmanager.e = -1;
        assetmanager.g = 36F;
        assetmanager.k = Typeface.create("sans-serif", 0);
        assetmanager.m = true;
        assetmanager.q = resources.getColor(b.cy);
        return assetmanager.a();
    }

    public void a(cpy cpy, cba cba, cho cho1)
    {
        for (int i = 0; i < 4; i++)
        {
            int j = 0;
            while (j < 4) 
            {
                cpy = cho1.a;
                float f1;
                if (i == j)
                {
                    f1 = 1.0F;
                } else
                {
                    f1 = 0.0F;
                }
                cpy[(i << 2) + j] = f1;
                j++;
            }
        }

    }

    public final cay b()
    {
        if (e == null)
        {
            e = g();
        }
        return e;
    }

    public final cay b(AssetManager assetmanager, Resources resources)
    {
        if (d == null)
        {
            d = a(a(), assetmanager, resources);
        }
        return d;
    }

    public int c()
    {
        return 0;
    }

    public boolean d()
    {
        return false;
    }

    public float[] e()
    {
        return a;
    }

    protected cay f()
    {
        return new cat(this);
    }

    protected cay g()
    {
        return (new cbh()).a();
    }

}
