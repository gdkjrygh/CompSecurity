// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.animation.AnimationUtils;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.ui.passenger:
//            InviteToolbarItemView

class val.delay
    implements Action0
{

    final InviteToolbarItemView this$0;
    final long val$delay;

    public void call()
    {
        clearAnimation();
        startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040002));
        animateShakeInviteMenuItem(val$delay + 10000L);
    }

    ()
    {
        this$0 = final_invitetoolbaritemview;
        val$delay = J.this;
        super();
    }
}
