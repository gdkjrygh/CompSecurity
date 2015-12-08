// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.graphics.Bitmap;
import p.ap.h;
import p.s.k;

public class c
    implements k
{

    private final Bitmap a;
    private final p.t.c b;

    public c(Bitmap bitmap, p.t.c c1)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (c1 == null)
        {
            throw new NullPointerException("BitmapPool must not be null");
        } else
        {
            a = bitmap;
            b = c1;
            return;
        }
    }

    public static c a(Bitmap bitmap, p.t.c c1)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            return new c(bitmap, c1);
        }
    }

    public Bitmap a()
    {
        return a;
    }

    public Object b()
    {
        return a();
    }

    public int c()
    {
        return h.a(a);
    }

    public void d()
    {
        if (!b.a(a))
        {
            a.recycle();
        }
    }
}
