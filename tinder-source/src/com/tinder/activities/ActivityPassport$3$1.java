// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.EditText;
import com.tinder.e.au;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.activities:
//            ActivityPassport

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        ad.a(a.a, ActivityPassport.f(a.a));
    }

    e(e e)
    {
        a = e;
        super();
    }

    // Unreferenced inner class com/tinder/activities/ActivityPassport$3

/* anonymous class */
    final class ActivityPassport._cls3 extends au
    {

        final Context a;
        final ActivityPassport b;

        public final void onAnimationEnd(Animator animator)
        {
            ActivityPassport.f(b).setFocusableInTouchMode(true);
            ActivityPassport.f(b).requestFocus();
            ActivityPassport.f(b).setCursorVisible(true);
            ActivityPassport.f(b).postDelayed(new ActivityPassport._cls3._cls1(this), 200L);
        }

        public final void onAnimationStart(Animator animator)
        {
            ActivityPassport.d(b).setVisibility(0);
            ActivityPassport.e(b).startTransition(150);
        }

            
            {
                b = activitypassport;
                a = context;
                super();
            }
    }

}
