// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.support.ViewUtils;

// Referenced classes of package com.appboy.ui.inappmessage:
//            InAppMessageViewWrapper

class this._cls0
    implements android.view.animation.r
{

    final InAppMessageViewWrapper this$0;

    public void onAnimationEnd(Animation animation)
    {
        InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).clearAnimation();
        InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).setVisibility(8);
        InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).setClickable(true);
        ViewUtils.removeViewFromParent(InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this));
        InAppMessageViewWrapper.access$200(InAppMessageViewWrapper.this).afterClosed(InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).setClickable(false);
    }

    wLifecycleListener()
    {
        this$0 = InAppMessageViewWrapper.this;
        super();
    }
}
