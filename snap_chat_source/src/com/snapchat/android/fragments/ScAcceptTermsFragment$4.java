// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import android.animation.Animator;
import android.widget.ImageView;

// Referenced classes of package com.snapchat.android.fragments:
//            ScAcceptTermsFragment

final class a
    implements android.animation.r
{

    private ImageView a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(4);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        a.setVisibility(0);
    }

    (ImageView imageview)
    {
        a = imageview;
        super();
    }
}
