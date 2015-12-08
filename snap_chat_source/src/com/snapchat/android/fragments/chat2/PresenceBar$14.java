// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            PresenceBar

final class a extends AnimatorListenerAdapter
{

    private AnimatorSet a;
    private PresenceBar b;

    public final void onAnimationCancel(Animator animator)
    {
        PresenceBar.b(b, null);
    }

    public final void onAnimationEnd(Animator animator)
    {
        PresenceBar.b(b, null);
    }

    public final void onAnimationStart(Animator animator)
    {
        PresenceBar.f(b);
        PresenceBar.b(b, a);
    }

    _cls9(PresenceBar presencebar, AnimatorSet animatorset)
    {
        b = presencebar;
        a = animatorset;
        super();
    }
}
