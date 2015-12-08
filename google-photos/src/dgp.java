// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.List;

final class dgp
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private dge a;
    private dgk b;

    dgp(dgk dgk1, dge dge1)
    {
        b = dgk1;
        a = dge1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        float f1 = a.b();
        f1 /= (float)a.a() + f1;
        if (f > 1.0F - f1)
        {
            f = (f - (1.0F - f1)) / f1;
        } else
        {
            f = 0.0F;
        }
        for (valueanimator = dgk.b(b).iterator(); valueanimator.hasNext(); ((dgz)valueanimator.next()).a(a, f)) { }
    }
}
