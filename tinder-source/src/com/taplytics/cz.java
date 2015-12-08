// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

// Referenced classes of package com.taplytics:
//            cv, da, gs

final class cz
    implements Runnable
{

    final cv a;

    cz(cv cv1)
    {
        a = cv1;
        super();
    }

    public final void run()
    {
        try
        {
            if (cv.p(a) != null)
            {
                AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                alphaanimation.setDuration((long)(float)cv.q(a));
                cv.p(a).startAnimation(alphaanimation);
                alphaanimation.setFillAfter(true);
                alphaanimation.setAnimationListener(new da(this));
                if (gs.b())
                {
                    gs.a("delay image hidden");
                }
                cv.r(a);
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("Delay view error", exception);
        }
    }
}
