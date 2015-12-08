// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.microsoft.advertising.android:
//            j, b, av, g, 
//            ae, ai

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        j.a(a(a.a)).u();
    }

    Listener(Listener listener)
    {
        a = listener;
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


    // Unreferenced inner class com/microsoft/advertising/android/j$2$1

/* anonymous class */
    final class j._cls2._cls1
        implements Runnable
    {

        final j._cls2 a;

        public final void run()
        {
            if (j.c(j._cls2.a(a)) == null)
            {
                return;
            }
            if (j.a(j._cls2.a(a)) != null)
            {
                j.a(j._cls2.a(a)).t();
                j.d(j._cls2.a(a)).removeView(j.a(j._cls2.a(a)));
            }
            j.a(j._cls2.a(a), j.c(j._cls2.a(a)));
            j.e(j._cls2.a(a));
            j.f(j._cls2.a(a)).c().a(j.f(j._cls2.a(a)), ae.c);
            j.f(j._cls2.a(a)).b(new j._cls2._cls1._cls1(this));
        }

            
            {
                a = _pcls2;
                super();
            }
    }

}
