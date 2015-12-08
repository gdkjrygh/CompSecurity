// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            PresenceBar

final class a extends AnimatorListenerAdapter
{

    private PresenceBar a;

    public final void onAnimationEnd(Animator animator)
    {
        PresenceBar.a(a, false);
        PresenceBar.a(a);
    }

    (PresenceBar presencebar)
    {
        a = presencebar;
        super();
    }
}
