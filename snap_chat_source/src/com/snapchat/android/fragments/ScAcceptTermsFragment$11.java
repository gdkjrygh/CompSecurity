// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import android.animation.Animator;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments:
//            ScAcceptTermsFragment

final class b
    implements android.animation.
{

    private TextView a;
    private TextView b;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        a.setVisibility(0);
        b.setVisibility(0);
    }

    (TextView textview, TextView textview1)
    {
        a = textview;
        b = textview1;
        super();
    }
}
