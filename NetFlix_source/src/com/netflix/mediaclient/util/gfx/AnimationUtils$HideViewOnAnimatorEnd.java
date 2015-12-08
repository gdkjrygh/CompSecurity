// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.gfx;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.netflix.mediaclient.util.gfx:
//            AnimationUtils

public static class view
    implements android.animation.wOnAnimatorEnd
{

    private final View view;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        view.setVisibility(8);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    public (View view1)
    {
        view = view1;
    }
}
