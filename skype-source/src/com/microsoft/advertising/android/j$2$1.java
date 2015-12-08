// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.microsoft.advertising.android:
//            j, b, g, ae, 
//            ai, av

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        if (j.c(a(a)) == null)
        {
            return;
        }
        if (j.a(a(a)) != null)
        {
            j.a(a(a)).t();
            j.d(a(a)).removeView(j.a(a(a)));
        }
        j.a(a(a), j.c(a(a)));
        j.e(a(a));
        j.f(a(a)).c().a(j.f(a(a)), ae.c);
        j.f(a(a)).b(new Runnable() {

            final j._cls2._cls1 a;

            public final void run()
            {
                j.a(j._cls2.a(a.a)).u();
            }

            
            {
                a = j._cls2._cls1.this;
                super();
            }
        });
    }

    _cls1.a(_cls1.a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/microsoft/advertising/android/j$2

/* anonymous class */
    final class j._cls2
        implements android.view.animation.Animation.AnimationListener
    {

        final j a;

        static j a(j._cls2 _pcls2)
        {
            return _pcls2.a;
        }

        public final void onAnimationEnd(Animation animation)
        {
            av.a("AdLayoutVector", "new ad animation end");
            j.b(a).post(new j._cls2._cls1(this));
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
            av.a("AdLayoutVector", "new ad animation start");
        }

            
            {
                a = j1;
                super();
            }
    }

}
