// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.animation.Animator;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui:
//            WarningView

class this._cls0
    implements android.animation.torListener
{

    final WarningView this$0;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        warningBanner.setVisibility(8);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    orListener()
    {
        this$0 = WarningView.this;
        super();
    }
}
