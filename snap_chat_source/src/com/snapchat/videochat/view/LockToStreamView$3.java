// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;

// Referenced classes of package com.snapchat.videochat.view:
//            LockToStreamView

final class a
    implements android.animation.torUpdateListener
{

    private LockToStreamView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
        LockToStreamView.b(a).setAlpha(i);
        a.invalidate();
    }

    istener(LockToStreamView locktostreamview)
    {
        a = locktostreamview;
        super();
    }
}
