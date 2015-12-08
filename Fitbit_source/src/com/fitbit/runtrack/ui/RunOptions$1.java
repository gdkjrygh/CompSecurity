// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RunOptions

class a
    implements android.animation.atorListener
{

    final RunOptions a;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        RunOptions.a(a).setVisibility(0);
        RunOptions.b(a).setVisibility(4);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    istener(RunOptions runoptions)
    {
        a = runoptions;
        super();
    }
}
