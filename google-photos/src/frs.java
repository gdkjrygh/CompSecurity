// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class frs
{

    public View a;
    private TimeInterpolator b;

    public frs(View view)
    {
        a = view;
    }

    private float e()
    {
        if (a.getWidth() == 0 || a.getHeight() == 0)
        {
            return -1F;
        } else
        {
            float f = a.getResources().getDimensionPixelSize(c.ds) * 2;
            return 1.0F - Math.min(f / (float)a.getWidth(), f / (float)a.getHeight());
        }
    }

    public final void a()
    {
        float f = c();
        a.animate().setInterpolator(d()).scaleX(f).scaleY(f).setDuration(250L);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            float f = e();
            if (f != -1F)
            {
                a.setScaleX(f);
                a.setScaleY(f);
            }
            return;
        } else
        {
            a.setScaleX(1.0F);
            a.setScaleY(1.0F);
            return;
        }
    }

    public final void b()
    {
        a.animate().setInterpolator(d()).scaleX(1.0F).scaleY(1.0F).setDuration(250L);
    }

    public float c()
    {
        float f1 = e();
        float f = f1;
        if (f1 == -1F)
        {
            f = 0.87F;
        }
        return f;
    }

    public final TimeInterpolator d()
    {
        if (b == null)
        {
            b = b.d(a.getContext());
        }
        return b;
    }
}
