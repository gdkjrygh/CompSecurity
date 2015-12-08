// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import PI;
import android.animation.Animator;
import com.snapchat.android.ui.CashReceiverView;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements android.animation.rListener
{

    private ChatFragment a;

    public final void onAnimationCancel(Animator animator)
    {
        ChatFragment.N(a);
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (!ChatFragment.M(a))
        {
            ((CashReceiverView)ChatFragment.J(a).a()).a();
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    _cls9(ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
