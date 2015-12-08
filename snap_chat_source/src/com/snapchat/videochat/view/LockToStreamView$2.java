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

    private LockToStreamView a;

    public final void onAnimationEnd(Animator animator)
    {
        LockToStreamView.a(a);
        a.b();
    }

    (LockToStreamView locktostreamview)
    {
        a = locktostreamview;
        super();
    }
}
