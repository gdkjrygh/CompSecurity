// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.snapchat.videochat.view:
//            LockToStreamView

final class > extends AnimatorListenerAdapter
{

    private boolean a;
    private LockToStreamView b;

    public final void onAnimationEnd(Animator animator)
    {
        if (a)
        {
            b.setVisibility(4);
        }
        LockToStreamView.a(b);
    }

    (LockToStreamView locktostreamview, boolean flag)
    {
        b = locktostreamview;
        a = flag;
        super();
    }
}
