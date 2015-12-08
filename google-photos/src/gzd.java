// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

public final class gzd
    implements Runnable
{

    public float a;
    public float b;
    public final PhotoView c;
    public float d;
    public float e;
    public long f;
    public boolean g;
    public boolean h;
    private long i;

    public gzd(PhotoView photoview)
    {
        f = -1L;
        c = photoview;
    }

    public final void a()
    {
        c.removeCallbacks(this);
        g = false;
        h = true;
        f = -1L;
    }

    public final void run()
    {
        if (h)
        {
            return;
        }
        long l = System.currentTimeMillis();
        float f1;
        float f2;
        if (f != -1L)
        {
            f1 = l - f;
        } else
        {
            f1 = 0.0F;
        }
        if (f == -1L)
        {
            i = l;
            f = l;
        }
        if (f1 >= 250F)
        {
            f2 = d;
            f1 = e;
        } else
        {
            long l1 = l - i;
            f1 = a;
            f2 = (float)l1 * f1;
            f1 = b * (float)l1;
        }
        i = l;
        c.a(f2, f1, true);
        d = d - f2;
        e = e - f1;
        if (d == 0.0F)
        {
            a = 0.0F;
        }
        if (e == 0.0F)
        {
            b = 0.0F;
        }
        if (a == 0.0F && b == 0.0F)
        {
            a();
        }
        mk.a(c, this, 1L);
    }
}
