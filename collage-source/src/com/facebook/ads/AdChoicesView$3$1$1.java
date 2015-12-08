// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

// Referenced classes of package com.facebook.ads:
//            AdChoicesView

class t> extends Animation
{

    final  a;

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i = (int)((float)a.a.a + (float)(a.a.a - a.a.a) * f);
        a.a.a.getLayoutParams().width = i;
        a.a.a.requestLayout();
        AdChoicesView.e(a.a.a).getLayoutParams().width = i - a.a.a;
        AdChoicesView.e(a.a.a).requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    ationListener(ationListener ationlistener)
    {
        a = ationlistener;
        super();
    }

    // Unreferenced inner class com/facebook/ads/AdChoicesView$3

/* anonymous class */
    class AdChoicesView._cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final int a;
        final int b;
        final AdChoicesView c;

        public void onAnimationEnd(Animation animation)
        {
            (new Handler()).postDelayed(new AdChoicesView._cls3._cls1(this), 3000L);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                c = adchoicesview;
                a = i;
                b = j;
                super();
            }
    }


    // Unreferenced inner class com/facebook/ads/AdChoicesView$3$1

/* anonymous class */
    class AdChoicesView._cls3._cls1
        implements Runnable
    {

        final AdChoicesView._cls3 a;

        public void run()
        {
            if (!AdChoicesView.a(a.c))
            {
                return;
            } else
            {
                AdChoicesView.a(a.c, false);
                AdChoicesView._cls3._cls1._cls1 _lcls1 = new AdChoicesView._cls3._cls1._cls1(this);
                _lcls1.setDuration(300L);
                _lcls1.setFillAfter(true);
                a.c.startAnimation(_lcls1);
                return;
            }
        }

            
            {
                a = _pcls3;
                super();
            }
    }

}
