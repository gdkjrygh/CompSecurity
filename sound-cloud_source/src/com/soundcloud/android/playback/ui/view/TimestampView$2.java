// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            TimestampView

class this._cls0 extends AnimatorListenerAdapter
{

    final TimestampView this$0;

    public void onAnimationCancel(Animator animator)
    {
        TimestampView.access$100(TimestampView.this).setLayerType(0, null);
    }

    public void onAnimationEnd(Animator animator)
    {
        TimestampView.access$100(TimestampView.this).setLayerType(0, null);
    }

    ()
    {
        this$0 = TimestampView.this;
        super();
    }
}
