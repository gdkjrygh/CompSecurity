// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.view;

import android.animation.Animator;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimatorICS

class ener
    implements android.animation.rICS._cls1
{

    final ViewPropertyAnimatorICS this$0;
    final com.nineoldandroids.animation.onAnimationStart val$listener;

    public void onAnimationCancel(Animator animator)
    {
        val$listener.onAnimationCancel(null);
    }

    public void onAnimationEnd(Animator animator)
    {
        val$listener.onAnimationEnd(null);
    }

    public void onAnimationRepeat(Animator animator)
    {
        val$listener.onAnimationRepeat(null);
    }

    public void onAnimationStart(Animator animator)
    {
        val$listener.onAnimationStart(null);
    }

    ener()
    {
        this$0 = final_viewpropertyanimatorics;
        val$listener = com.nineoldandroids.animation.istener.this;
        super();
    }
}
