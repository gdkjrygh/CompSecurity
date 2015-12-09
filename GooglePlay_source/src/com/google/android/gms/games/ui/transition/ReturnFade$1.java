// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            ReturnFade

final class val.view
    implements android.animation.atorListener
{

    final ReturnFade this$0;
    final View val$view;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        ((ImageView)val$view).setImageDrawable(ReturnFade.access$000(ReturnFade.this));
    }

    ()
    {
        this$0 = final_returnfade;
        val$view = View.this;
        super();
    }
}
