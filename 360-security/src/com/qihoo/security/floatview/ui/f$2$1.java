// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.view.animation.Animation;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            f, g

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        f.a(a.a);
    }

    tionListener(tionListener tionlistener)
    {
        a = tionlistener;
        super();
    }

    // Unreferenced inner class com/qihoo/security/floatview/ui/f$2

/* anonymous class */
    class f._cls2
        implements android.view.animation.Animation.AnimationListener
    {

        final f a;

        public void onAnimationEnd(Animation animation)
        {
            f.b(a).postDelayed(new f._cls2._cls1(this), 1000L);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                a = f1;
                super();
            }
    }

}
