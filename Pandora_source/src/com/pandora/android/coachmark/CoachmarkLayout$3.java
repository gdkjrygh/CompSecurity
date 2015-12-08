// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout

class  extends AnimatorListenerAdapter
{

    final a a;
    final CoachmarkLayout b;

    public void onAnimationEnd(Animator animator)
    {
        CoachmarkLayout.a(b, a);
    }

    (CoachmarkLayout coachmarklayout,  )
    {
        b = coachmarklayout;
        a = ;
        super();
    }
}
