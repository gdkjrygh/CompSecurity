// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            e

class a
    implements android.view.animation.ion.AnimationListener
{

    final stener a;

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    polator(polator polator)
    {
        a = polator;
        super();
    }

    // Unreferenced inner class com/qihoo/security/floatview/ui/e$1

/* anonymous class */
    class e._cls1
        implements Runnable
    {

        final e a;

        public void run()
        {
            a.b();
            e.a(a);
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setInterpolator(new AccelerateInterpolator());
            alphaanimation.setDuration(500L);
            alphaanimation.setAnimationListener(new e._cls1._cls1(this));
        }

            
            {
                a = e1;
                super();
            }
    }

}
