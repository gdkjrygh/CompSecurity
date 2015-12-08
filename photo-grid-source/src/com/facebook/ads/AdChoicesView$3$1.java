// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.animation.Animation;

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
            class _cls1 extends Animation
            {

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

            _cls1()
            {
                a = AdChoicesView._cls3._cls1.this;
                super();
            }
            }

            _cls1 _lcls1 = new _cls1();
            _lcls1.setDuration(300L);
            _lcls1.setFillAfter(true);
            a.a.startAnimation(_lcls1);
            return;
        }
    }

    _cls1(_cls1 _pcls1)
    {
        a = _pcls1;
        super();
    }
}
