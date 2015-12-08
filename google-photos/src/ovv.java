// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;

final class ovv
{

    float a;
    private boolean b;
    private float c;
    private final ObjectAnimator d;

    public ovv(ovu ovu1)
    {
        b = true;
        a = 1.0F;
        c = 1.0F;
        d = ObjectAnimator.ofFloat(this, ovu.a(ovu1), new float[] {
            a
        }).setDuration(150L);
    }

    public final float a()
    {
        return Math.min(a, c);
    }

    public final void a(float f)
    {
        c = Math.max(Math.min(f, 1.0F), 0.0F);
        f = (float)Math.floor(c);
        boolean flag;
        if (f == 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!d.isRunning() || flag != b)
        {
            d.setFloatValues(new float[] {
                f
            });
            d.start();
            b = flag;
        }
    }
}
