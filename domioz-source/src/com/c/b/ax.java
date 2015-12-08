// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.net.Uri;
import java.util.List;

// Referenced classes of package com.c.b:
//            aq, aw

public final class ax
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

    ax(Uri uri, android.graphics.Bitmap.Config config)
    {
        a = uri;
        b = 0;
        n = config;
    }

    public final ax a(int i1, int j1)
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

    final boolean a()
    {
        return a != null || b != 0;
    }

    final boolean b()
    {
        return d != 0 || e != 0;
    }

    public final ax c()
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

    public final aw d()
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
            o = aq.b;
        }
        return new aw(a, b, c, m, d, e, f, g, h, i, j, k, l, n, o, (byte)0);
    }
}
