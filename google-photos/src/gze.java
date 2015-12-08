// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AnimationUtils;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

public final class gze
    implements Runnable
{

    public final PhotoView a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;

    public gze(PhotoView photoview)
    {
        d = -1L;
        a = photoview;
    }

    public final void a()
    {
        e = false;
        f = true;
    }

    public final void run()
    {
        if (!f)
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f1;
            float f2;
            if (d != -1L)
            {
                f1 = (float)(l - d) / 1000F;
            } else
            {
                f1 = 0.0F;
            }
            a.a(b * f1, c * f1, false);
            d = l;
            f2 = g * f1;
            if (b != 0.0F)
            {
                b = b - f2;
                if (b < 0.0F && f2 > 0.0F || b > 0.0F && f2 < 0.0F)
                {
                    b = 0.0F;
                }
            }
            f1 *= h;
            if (c != 0.0F)
            {
                c = c - f1;
                if (c < 0.0F && f1 > 0.0F || c > 0.0F && f1 < 0.0F)
                {
                    c = 0.0F;
                }
            }
            if (b == 0.0F && c == 0.0F)
            {
                a();
            }
            if (!f)
            {
                mk.a(a, this);
                return;
            }
        }
    }
}
