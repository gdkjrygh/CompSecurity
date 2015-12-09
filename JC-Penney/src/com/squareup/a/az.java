// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.squareup.a:
//            bi, ar, ax

public final class az
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
    private ar o;

    az(Uri uri, int i1, android.graphics.Bitmap.Config config)
    {
        a = uri;
        b = i1;
        n = config;
    }

    public az a(int i1, int j1)
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

    public az a(bi bi1)
    {
        if (bi1 == null)
        {
            throw new IllegalArgumentException("Transformation must not be null.");
        }
        if (bi1.a() == null)
        {
            throw new IllegalArgumentException("Transformation key must not be null.");
        }
        if (m == null)
        {
            m = new ArrayList(2);
        }
        m.add(bi1);
        return this;
    }

    boolean a()
    {
        return a != null || b != 0;
    }

    boolean b()
    {
        return d != 0 || e != 0;
    }

    public ax c()
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
        if (o == null)
        {
            o = ar.b;
        }
        return new ax(a, b, c, m, d, e, f, g, h, i, j, k, l, n, o, null);
    }
}
