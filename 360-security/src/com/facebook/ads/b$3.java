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

class t>
    implements android.view.animation.ation.AnimationListener
{

    final int a;
    final int b;
    final b c;

    public void onAnimationEnd(Animation animation)
    {
        (new Handler()).postDelayed(new Runnable() {

            final b._cls3 a;

            public void run()
            {
                if (!com.facebook.ads.b.a(a.c))
                {
                    return;
                } else
                {
                    com.facebook.ads.b.a(a.c, false);
                    Animation animation1 = new Animation(this) {

                        final _cls1 a;

                        protected void applyTransformation(float f, Transformation transformation)
                        {
                            int i = (int)((float)a.a.a + (float)(a.a.b - a.a.a) * f);
                            a.a.c.getLayoutParams().width = i;
                            a.a.c.requestLayout();
                            com.facebook.ads.b.e(a.a.c).getLayoutParams().width = i - a.a.b;
                            com.facebook.ads.b.e(a.a.c).requestLayout();
                        }

                        public boolean willChangeBounds()
                        {
                            return true;
                        }

            
            {
                a = _pcls1;
                super();
            }
                    };
                    animation1.setDuration(300L);
                    animation1.setFillAfter(true);
                    a.c.startAnimation(animation1);
                    return;
                }
            }

            
            {
                a = b._cls3.this;
                super();
            }
        }, 3000L);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    t>(b b1, int i, int j)
    {
        c = b1;
        a = i;
        b = j;
        super();
    }
}
