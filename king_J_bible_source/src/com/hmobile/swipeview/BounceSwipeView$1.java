// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.hmobile.swipeview:
//            BounceSwipeView, AnimationUtil

class this._cls0 extends Handler
{

    final BounceSwipeView this$0;

    public void handleMessage(Message message)
    {
        int i = AnimationUtil.quadraticOutEase(BounceSwipeView.access$12(BounceSwipeView.this), BounceSwipeView.access$13(BounceSwipeView.this), -BounceSwipeView.access$14(BounceSwipeView.this), 4F);
        if (!BounceSwipeView.access$15(BounceSwipeView.this)) goto _L2; else goto _L1
_L1:
        BounceSwipeView.access$9(BounceSwipeView.this, i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
_L4:
        message = BounceSwipeView.this;
        BounceSwipeView.access$16(message, BounceSwipeView.access$12(message) + 1);
        if (BounceSwipeView.access$12(BounceSwipeView.this) <= 4)
        {
            mEaseAnimationFrameHandler.sendEmptyMessageDelayed(0, 30L);
        }
        return;
_L2:
        if (!BounceSwipeView.access$15(BounceSwipeView.this))
        {
            BounceSwipeView.access$9(BounceSwipeView.this, getPaddingLeft(), getPaddingTop(), i, getPaddingBottom());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = BounceSwipeView.this;
        super();
    }
}
