// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pandora.android.activity:
//            WelcomeActivity

class a
    implements android.view.nGlobalLayoutListener
{

    final WelcomeActivity a;

    public void onGlobalLayout()
    {
        Handler handler;
        Runnable runnable;
        long l;
        if (android.os.INT < 16)
        {
            WelcomeActivity.b(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else
        {
            WelcomeActivity.b(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        handler = new Handler();
        runnable = new Runnable() {

            final WelcomeActivity._cls2 a;

            public void run()
            {
                WelcomeActivity.b(a.a).setFitsSystemWindows(true);
                WelcomeActivity.a(a.a, a.a.o);
            }

            
            {
                a = WelcomeActivity._cls2.this;
                super();
            }
        };
        if (a.o)
        {
            l = 500L;
        } else
        {
            l = 0L;
        }
        handler.postDelayed(runnable, l);
    }

    _cls1.a(WelcomeActivity welcomeactivity)
    {
        a = welcomeactivity;
        super();
    }
}
