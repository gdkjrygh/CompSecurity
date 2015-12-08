// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import android.animation.Animator;
import com.snapchat.android.ui.SendToBottomPanelView;

// Referenced classes of package com.snapchat.android.fragments.sendto:
//            SendToFragment

final class a
    implements android.animation.Listener
{

    private SendToFragment a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        SendToFragment.q(a).b();
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        SendToFragment.q(a).a();
    }

    (SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }
}
