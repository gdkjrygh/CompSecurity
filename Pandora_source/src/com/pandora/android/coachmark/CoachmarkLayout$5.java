// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout, Spotlight

class  extends AnimatorListenerAdapter
{

    final Spotlight a;
    final CoachmarkLayout b;

    public void onAnimationStart(Animator animator)
    {
        CoachmarkLayout.a(b, a);
    }

    (CoachmarkLayout coachmarklayout, Spotlight spotlight)
    {
        b = coachmarklayout;
        a = spotlight;
        super();
    }
}
