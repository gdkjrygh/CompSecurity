// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            BlemishImageView

final class j extends AnimatorListenerAdapter
{

    final BlemishImageView a;

    j(BlemishImageView blemishimageview)
    {
        a = blemishimageview;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        BlemishImageView.a(a).setVisibility(8);
    }
}
