// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;

// Referenced classes of package com.snapchat.android.ui:
//            CustomVolumeView

final class a
    implements android.animation.stener
{

    private CustomVolumeView a;

    public final void onAnimationCancel(Animator animator)
    {
        a.setAlpha(1.0F);
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(8);
        a.setAlpha(1.0F);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (CustomVolumeView customvolumeview)
    {
        a = customvolumeview;
        super();
    }
}
