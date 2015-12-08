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

class a
    implements Runnable
{

    final tAnimation a;

    public void run()
    {
        if (!AdChoicesView.a(a.a))
        {
            return;
        } else
        {
            AdChoicesView.a(a.a, false);
            Animation animation = new Animation() {

                final AdChoicesView._cls3._cls1 a;

                protected void applyTransformation(float f, Transformation transformation)
                {
                    int i = (int)((float)a.a.a + (float)(a.a.b - a.a.a) * f);
                    a.a.c.getLayoutParams().width = i;
                    a.a.c.requestLayout();
                    AdChoicesView.e(a.a.c).getLayoutParams().width = i - a.a.b;
                    AdChoicesView.e(a.a.c).requestLayout();
                }

                public boolean willChangeBounds()
                {
                    return true;
                }

            
            {
                a = AdChoicesView._cls3._cls1.this;
                super();
            }
            };
            animation.setDuration(300L);
            animation.setFillAfter(true);
            a.a.startAnimation(animation);
            return;
        }
    }

    nit>(nit> nit>)
    {
        a = nit>;
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

}
