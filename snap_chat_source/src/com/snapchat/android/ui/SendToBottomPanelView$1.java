// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.ui:
//            SendToBottomPanelView

public final class a
    implements android.animation.r
{

    private SendToBottomPanelView a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        SendToBottomPanelView.a(a).setTranslationY(0.0F);
        SendToBottomPanelView.b(a).setAlpha(1.0F);
        SendToBottomPanelView.b(a).setVisibility(0);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    public (SendToBottomPanelView sendtobottompanelview)
    {
        a = sendtobottompanelview;
        super();
    }
}
