// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.graphics.Bitmap;
import java.io.InputStream;

// Referenced classes of package com.c.b:
//            bj, ap

public final class ba
{

    private final ap a;
    private final Bitmap b;
    private final InputStream c;
    private final int d;

    public ba(Bitmap bitmap, ap ap1)
    {
        this((Bitmap)bj.a(bitmap, "bitmap == null"), null, ap1, 0);
    }

    ba(Bitmap bitmap, InputStream inputstream, ap ap1, int i)
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
            a = (ap)bj.a(ap1, "loadedFrom == null");
            d = i;
            return;
        }
    }

    public ba(InputStream inputstream, ap ap1)
    {
        this(null, (InputStream)bj.a(inputstream, "stream == null"), ap1, 0);
    }

    public final Bitmap a()
    {
        return b;
    }

    public final InputStream b()
    {
        return c;
    }

    public final ap c()
    {
        return a;
    }

    final int d()
    {
        return d;
    }
}
