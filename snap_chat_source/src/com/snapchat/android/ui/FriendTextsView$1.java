// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.ui:
//            FriendTextsView

final class a
    implements android.animation.istener
{

    private FriendTextsView a;

    public final void onAnimationCancel(Animator animator)
    {
        FriendTextsView.a(a, a);
    }

    public final void onAnimationEnd(Animator animator)
    {
        FriendTextsView.a(a, c);
        FriendTextsView.a(a).setAlpha(1.0F);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    r(FriendTextsView friendtextsview)
    {
        a = friendtextsview;
        super();
    }
}
