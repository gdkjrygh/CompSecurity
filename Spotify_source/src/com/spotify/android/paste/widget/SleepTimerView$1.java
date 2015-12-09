// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.animation.Animator;
import dgq;

// Referenced classes of package com.spotify.android.paste.widget:
//            SleepTimerView

final class a
    implements android.animation.Listener
{

    private SleepTimerView a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        SleepTimerView.a(a).a();
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (SleepTimerView sleeptimerview)
    {
        a = sleeptimerview;
        super();
    }
}
