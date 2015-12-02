// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.view.animation.Animation;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            f, g

class a
    implements android.view.animation.ation.AnimationListener
{

    final f a;

    public void onAnimationEnd(Animation animation)
    {
        f.b(a).postDelayed(new Runnable() {

            final f._cls2 a;

            public void run()
            {
                f.a(a.a);
            }

            
            {
                a = f._cls2.this;
                super();
            }
        }, 1000L);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    _cls1.a(f f1)
    {
        a = f1;
        super();
    }
}
