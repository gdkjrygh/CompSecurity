// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public final class cgs
{

    private Uri a;
    private int b;
    private String c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private List m;
    private android.graphics.Bitmap.Config n;
    private int o;

    cgs(Uri uri, int i1, android.graphics.Bitmap.Config config)
    {
        a = uri;
        b = i1;
        n = config;
    }

    public final cgs a(int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
        if (j1 < 0)
        {
            throw new IllegalArgumentException("Height must be positive number or 0.");
        }
        if (j1 == 0 && i1 == 0)
        {
            throw new IllegalArgumentException("At least one dimension has to be positive number.");
        } else
        {
            d = i1;
            e = j1;
            return this;
        }
    }

    public final cgs a(chc chc1)
    {
        if (chc1 == null)
        {
            throw new IllegalArgumentException("Transformation must not be null.");
        }
        if (chc1.a() == null)
        {
            throw new IllegalArgumentException("Transformation key must not be null.");
        }
        if (m == null)
        {
            m = new ArrayList(2);
        }
        m.add(chc1);
        return this;
    }

    final boolean a()
    {
        return a != null || b != 0;
    }

    final boolean b()
    {
        return d != 0 || e != 0;
    }

    public final cgs c()
    {
        if (g)
        {
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        } else
        {
            f = true;
            return this;
        }
    }

    public final cgs d()
    {
        if (f)
        {
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        } else
        {
            g = true;
            return this;
        }
    }

    public final cgs e()
    {
        if (e == 0 && d == 0)
        {
            throw new IllegalStateException("onlyScaleDown can not be applied without resize");
        } else
        {
            h = true;
            return this;
        }
    }

    public final cgr f()
    {
        if (g && f)
        {
            throw new IllegalStateException("Center crop and center inside can not be used together.");
        }
        if (f && d == 0 && e == 0)
        {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (g && d == 0 && e == 0)
        {
            throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
        }
        if (o == 0)
        {
            o = cgm.b;
        }
        return new cgr(a, b, c, m, d, e, f, g, h, i, j, k, l, n, o, (byte)0);
    }
}
