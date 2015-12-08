// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;

final class oie extends mzw
{

    public int g;
    public int h;
    public int i;
    public oie j;
    public Bitmap k;
    public volatile int l;
    final oid m;

    public oie(oid oid1, int i1, int j1, int k1)
    {
        m = oid1;
        super();
        l = 1;
        g = i1;
        h = j1;
        i = k1;
    }

    public final void a(int i1, int j1, int k1)
    {
        g = i1;
        h = j1;
        i = k1;
        k();
    }

    protected final void a(Bitmap bitmap)
    {
        oid.b().a(bitmap);
    }

    protected final Bitmap aC_()
    {
        Bitmap bitmap;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag;
        if (l == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mzl.a(flag);
        i1 = oid.c(m);
        j1 = g;
        k1 = i;
        l1 = oid.d(m);
        i2 = h;
        j2 = i;
        a(Math.min(oid.a(m), i1 - j1 >> k1), Math.min(oid.a(m), l1 - i2 >> j2));
        bitmap = k;
        k = null;
        l = 1;
        return bitmap;
    }

    public final int d()
    {
        return oid.a(m);
    }

    public final int e()
    {
        return oid.a(m);
    }

    final boolean m()
    {
        Bitmap bitmap1 = (Bitmap)oid.b().a();
        Bitmap bitmap;
        bitmap = bitmap1;
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        bitmap = bitmap1;
        if (bitmap1.getWidth() != oid.a(m))
        {
            bitmap = null;
        }
        try
        {
            k = oid.b(m).a(i, g, h, bitmap);
        }
        catch (Throwable throwable)
        {
            Log.w("TiledImageRenderer", "fail to decode tile", throwable);
        }
        return k != null;
    }

    public final String toString()
    {
        return String.format("tile(%s, %s, %s / %s)", new Object[] {
            Integer.valueOf(g / oid.a(m)), Integer.valueOf(h / oid.a(m)), Integer.valueOf(oid.f(m)), Integer.valueOf(oid.e(m))
        });
    }
}
