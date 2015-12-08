// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.microsoft.advertising.android:
//            j, av, b, g, 
//            ae, ai

final class a
    implements android.view.animation.ation.AnimationListener
{

    final j a;

    static j a(Listener listener)
    {
        return listener.a;
    }

    public final void onAnimationEnd(Animation animation)
    {
        av.a("AdLayoutVector", "new ad animation end");
        j.b(a).post(new Runnable() {

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
                j.f(j._cls2.a(a)).b(new Runnable(this) {

                    final _cls1 a;

                    public final void run()
                    {
                        j.a(j._cls2.a(a.a)).u();
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = j._cls2.this;
                super();
            }
        });
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        av.a("AdLayoutVector", "new ad animation start");
    }

    _cls1.a(j j1)
    {
        a = j1;
        super();
    }
}
