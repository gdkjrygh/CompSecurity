// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            ChatTimeStampAnimator

public class keepHolderRecyclability extends AnimatorListenerAdapter
{

    private final android.support.v7.widget..holder holder;
    private boolean keepHolderRecyclability;
    final ChatTimeStampAnimator this$0;

    public void onAnimationEnd(Animator animator)
    {
        if (!keepHolderRecyclability && !holder.holder())
        {
            holder.holder(true);
        }
        animator = holder.holder.getLayoutParams();
        animator.holder = -1;
        animator.holder = -2;
        holder.holder.setLayoutParams(animator);
    }

    public void onAnimationStart(Animator animator)
    {
        boolean flag;
        if (!holder.holder())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        keepHolderRecyclability = flag;
        if (holder.holder())
        {
            holder.holder(false);
        }
    }

    public Q(android.support.v7.widget. )
    {
        this$0 = ChatTimeStampAnimator.this;
        super();
        holder = ;
        keepHolderRecyclability = false;
    }
}
