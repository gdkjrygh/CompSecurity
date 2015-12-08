// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AnimationUtils;
import com.google.android.apps.moviemaker.ui.VideoTrimView;

public final class dca
    implements Runnable
{

    private float a;
    private long b;
    private VideoTrimView c;

    public dca(VideoTrimView videotrimview)
    {
        c = videotrimview;
        super();
    }

    public final void a(float f)
    {
        if (a == f)
        {
            return;
        }
        if (a == 0.0F)
        {
            c.postOnAnimation(this);
            b = AnimationUtils.currentAnimationTimeMillis();
        }
        a = f;
    }

    public final boolean a()
    {
        return a != 0.0F;
    }

    public final void run()
    {
        if (!a())
        {
            VideoTrimView.h(c);
            c.removeCallbacks(this);
            return;
        } else
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f = (float)(l - b) / 1000F;
            float f1 = VideoTrimView.i(c);
            float f2 = a;
            VideoTrimView.a(c, f * f1 * f2);
            b = l;
            c.postOnAnimation(this);
            return;
        }
    }
}
