// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.EditText;
import com.tinder.e.au;
import com.tinder.fragments.FragmentMap;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.activities:
//            ActivityPassport

final class a extends au
{

    final Activity a;
    final ActivityPassport b;

    public final void onAnimationEnd(Animator animator)
    {
        ActivityPassport.d(b).setVisibility(4);
        ad.a(ActivityPassport.f(b).getWindowToken(), a);
    }

    public final void onAnimationStart(Animator animator)
    {
        ActivityPassport.e(b).reverseTransition(150);
        ActivityPassport.f(b).setText("");
        ActivityPassport.f(b).clearFocus();
        ActivityPassport.f(b).setCursorVisible(false);
        ActivityPassport.c(b).getView().requestFocus();
    }

    ble(ActivityPassport activitypassport, Activity activity)
    {
        b = activitypassport;
        a = activity;
        super();
    }
}
