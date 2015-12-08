// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

public final class gzc
    implements Runnable
{

    private final PhotoView a;
    private boolean b;
    private float c;
    private float d;
    private float e;
    private long f;
    private boolean g;
    private boolean h;
    private long i;
    private boolean j;

    public gzc(PhotoView photoview)
    {
        j = false;
        a = photoview;
    }

    public final void a(boolean flag)
    {
        if (i > 0L && !flag)
        {
            return;
        } else
        {
            a.removeCallbacks(this);
            g = false;
            h = true;
            j = false;
            i = 0L;
            a.d();
            return;
        }
    }

    public final boolean a(float f1, float f2, long l)
    {
        boolean flag1 = g;
        if (g && (i == 0L || j))
        {
            return false;
        }
        c = f2;
        f = -1L;
        d = f1;
        boolean flag;
        if (c > d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        e = (c - d) / 250F;
        g = true;
        h = false;
        i = l;
        if (!flag1)
        {
            mk.a(a, this, l);
        }
        return true;
    }

    public final void run()
    {
        if (!h) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1;
label0:
        {
            f1 = a.l;
            if (!b && f1 <= c || b && f1 >= c)
            {
                a(true);
                return;
            }
            if (f == -1L)
            {
                f = System.currentTimeMillis();
            }
            j = true;
            long l = System.currentTimeMillis();
            long l1 = f;
            f1 = d;
            float f2 = e;
            f2 = (float)(l - l1) * f2 + f1;
            if (b || f2 >= c)
            {
                f1 = f2;
                if (!b)
                {
                    break label0;
                }
                f1 = f2;
                if (f2 <= c)
                {
                    break label0;
                }
            }
            f1 = c;
        }
        a.a(f1, a.j, a.k);
        if (!h)
        {
            mk.a(a, this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
