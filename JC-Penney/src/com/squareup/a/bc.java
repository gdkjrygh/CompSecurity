// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.graphics.Bitmap;
import java.io.InputStream;

// Referenced classes of package com.squareup.a:
//            bm, aq

public final class bc
{

    private final aq a;
    private final Bitmap b;
    private final InputStream c;
    private final int d;

    public bc(Bitmap bitmap, aq aq1)
    {
        this((Bitmap)bm.a(bitmap, "bitmap == null"), null, aq1, 0);
    }

    bc(Bitmap bitmap, InputStream inputstream, aq aq1, int i)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (bitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (inputstream == null)
        {
            flag1 = false;
        }
        if (!(flag1 ^ flag))
        {
            throw new AssertionError();
        } else
        {
            b = bitmap;
            c = inputstream;
            a = (aq)bm.a(aq1, "loadedFrom == null");
            d = i;
            return;
        }
    }

    public bc(InputStream inputstream, aq aq1)
    {
        this(null, (InputStream)bm.a(inputstream, "stream == null"), aq1, 0);
    }

    public Bitmap a()
    {
        return b;
    }

    public InputStream b()
    {
        return c;
    }

    public aq c()
    {
        return a;
    }

    int d()
    {
        return d;
    }
}
