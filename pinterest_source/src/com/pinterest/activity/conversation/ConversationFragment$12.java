// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.animation.Animator;
import com.pinterest.activity.search.AddPinSearchFragment;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class it> extends com.pinterest.kit.utils.Listener
{

    final ConversationFragment this$0;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        ViewHelper.setVisibility(ConversationFragment.access$1100(ConversationFragment.this).getView(), 8);
    }

    A()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
