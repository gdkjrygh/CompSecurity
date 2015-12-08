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

final class a extends au
{

    final Context a;
    final ActivityPassport b;

    public final void onAnimationEnd(Animator animator)
    {
        ActivityPassport.f(b).setFocusableInTouchMode(true);
        ActivityPassport.f(b).requestFocus();
        ActivityPassport.f(b).setCursorVisible(true);
        ActivityPassport.f(b).postDelayed(new Runnable() {

            final ActivityPassport._cls3 a;

            public final void run()
            {
                ad.a(a.a, ActivityPassport.f(a.b));
            }

            
            {
                a = ActivityPassport._cls3.this;
                super();
            }
        }, 200L);
    }

    public final void onAnimationStart(Animator animator)
    {
        ActivityPassport.d(b).setVisibility(0);
        ActivityPassport.e(b).startTransition(150);
    }

    _cls1.a(ActivityPassport activitypassport, Context context)
    {
        b = activitypassport;
        a = context;
        super();
    }
}
