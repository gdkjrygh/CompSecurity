// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.io.InputStream;

public final class cgv
{

    private final cgl a;
    private final Bitmap b;
    private final InputStream c;
    private final int d;

    public cgv(Bitmap bitmap, cgl cgl1)
    {
        this((Bitmap)chf.a(bitmap, "bitmap == null"), null, cgl1, 0);
    }

    cgv(Bitmap bitmap, InputStream inputstream, cgl cgl1, int i)
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
            a = (cgl)chf.a(cgl1, "loadedFrom == null");
            d = i;
            return;
        }
    }

    public cgv(InputStream inputstream, cgl cgl1)
    {
        this(null, (InputStream)chf.a(inputstream, "stream == null"), cgl1, 0);
    }

    public final Bitmap a()
    {
        return b;
    }

    public final InputStream b()
    {
        return c;
    }

    public final cgl c()
    {
        return a;
    }

    final int d()
    {
        return d;
    }
}
