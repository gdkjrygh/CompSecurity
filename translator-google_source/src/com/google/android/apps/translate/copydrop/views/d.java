// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.translate.widget.LangSpinner;

// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            PopoverView

final class d extends AnimatorListenerAdapter
{

    final PopoverView a;

    d(PopoverView popoverview)
    {
        a = popoverview;
        super();
    }

    public final void onAnimationStart(Animator animator)
    {
        PopoverView.b(a).requestLayout();
    }
}
