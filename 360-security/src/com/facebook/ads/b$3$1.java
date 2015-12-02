// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

// Referenced classes of package com.facebook.ads:
//            b

class 
    implements Runnable
{

    final Animation a;

    public void run()
    {
        if (!b.a(a.a))
        {
            return;
        } else
        {
            b.a(a.a, false);
            Animation animation = new Animation() {

                final b._cls3._cls1 a;

                protected void applyTransformation(float f, Transformation transformation)
                {
                    int i = (int)((float)a.a.a + (float)(a.a.b - a.a.a) * f);
                    a.a.c.getLayoutParams().width = i;
                    a.a.c.requestLayout();
                    b.e(a.a.c).getLayoutParams().width = i - a.a.b;
                    b.e(a.a.c).requestLayout();
                }

                public boolean willChangeBounds()
                {
                    return true;
                }

            
            {
                a = b._cls3._cls1.this;
                super();
            }
            };
            animation.setDuration(300L);
            animation.setFillAfter(true);
            a.a.startAnimation(animation);
            return;
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/facebook/ads/b$3

/* anonymous class */
    class b._cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final int a;
        final int b;
        final b c;

        public void onAnimationEnd(Animation animation)
        {
            (new Handler()).postDelayed(new b._cls3._cls1(this), 3000L);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                c = b1;
                a = i;
                b = j;
                super();
            }
    }

}
