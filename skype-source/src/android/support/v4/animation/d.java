// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.animation:
//            b

final class d
    implements b
{

    private TimeInterpolator a;

    d()
    {
    }

    public final void a(View view)
    {
        if (a == null)
        {
            a = (new ValueAnimator()).getInterpolator();
        }
        view.animate().setInterpolator(a);
    }
}
