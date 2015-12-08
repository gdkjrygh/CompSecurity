// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.chat:
//            ChatTimeStampAnimator

final class val.expandView extends AnimatorListenerAdapter
{

    final ChatTimeStampAnimator this$0;
    final TextView val$expandView;

    public final void onAnimationEnd(Animator animator)
    {
        val$expandView.setVisibility(8);
        ChatTimeStampAnimator.access$000(ChatTimeStampAnimator.this, val$expandView, null);
    }

    ()
    {
        this$0 = final_chattimestampanimator;
        val$expandView = TextView.this;
        super();
    }
}
