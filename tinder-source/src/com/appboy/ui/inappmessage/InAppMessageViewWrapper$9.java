// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.appboy.models.IInAppMessage;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.SimpleSwipeDismissTouchListener;
import com.appboy.ui.support.AnimationUtils;

// Referenced classes of package com.appboy.ui.inappmessage:
//            InAppMessageViewWrapper

class ssTouchListener extends SimpleSwipeDismissTouchListener
{

    private final long sSwipeAnimationDurationMillis = 400L;
    final InAppMessageViewWrapper this$0;

    private void animateAndClose(Animation animation)
    {
        InAppMessageViewWrapper.access$200(InAppMessageViewWrapper.this).onDismissed(InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this));
        InAppMessageViewWrapper.access$700(InAppMessageViewWrapper.this);
        InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).clearAnimation();
        InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).setAnimation(animation);
        animation.startNow();
        InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).invalidate();
        InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this).setAnimateOut(false);
        InAppMessageViewWrapper.access$800(InAppMessageViewWrapper.this);
    }

    public void onSwipeLeft()
    {
        animateAndClose(AnimationUtils.createHorizontalAnimation(0.0F, -1F, 400L, false));
    }

    public void onSwipeRight()
    {
        animateAndClose(AnimationUtils.createHorizontalAnimation(0.0F, 1.0F, 400L, false));
    }

    wLifecycleListener(Context context)
    {
        this$0 = InAppMessageViewWrapper.this;
        super(context);
    }
}
