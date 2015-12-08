// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView

final class > extends AnimatorListenerAdapter
{

    private HoldToStreamView a;

    public final void onAnimationEnd(Animator animator)
    {
        if (a.e.getVisibility() != 4)
        {
            HoldToStreamView.e(a);
        }
    }

    (HoldToStreamView holdtostreamview)
    {
        a = holdtostreamview;
        super();
    }
}
