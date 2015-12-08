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
    implements Runnable
{

    final a a;

    public void run()
    {
        WelcomeActivity.b(a.a).setFitsSystemWindows(true);
        WelcomeActivity.a(a.a, a.a.o);
    }

    ner(ner ner)
    {
        a = ner;
        super();
    }

    // Unreferenced inner class com/pandora/android/activity/WelcomeActivity$2

/* anonymous class */
    class WelcomeActivity._cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final WelcomeActivity a;

        public void onGlobalLayout()
        {
            Handler handler;
            WelcomeActivity._cls2._cls1 _lcls1;
            long l;
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                WelcomeActivity.b(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else
            {
                WelcomeActivity.b(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            handler = new Handler();
            _lcls1 = new WelcomeActivity._cls2._cls1(this);
            if (a.o)
            {
                l = 500L;
            } else
            {
                l = 0L;
            }
            handler.postDelayed(_lcls1, l);
        }

            
            {
                a = welcomeactivity;
                super();
            }
    }

}
