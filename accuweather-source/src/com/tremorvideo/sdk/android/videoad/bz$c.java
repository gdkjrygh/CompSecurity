// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bz

private class a
    implements Runnable
{

    View a;
    boolean b;
    final bz c;

    public void run()
    {
        if (!b)
        {
            b = true;
            TranslateAnimation translateanimation = new TranslateAnimation(0, 0.0F, 0, 0.0F, 1, 1.0F, 1, 0.0F);
            translateanimation.setInterpolator(new DecelerateInterpolator());
            translateanimation.setDuration(1000L);
            a.setVisibility(0);
            a.startAnimation(translateanimation);
            a.getParent().requestLayout();
        }
    }

    ator(bz bz1, View view)
    {
        c = bz1;
        super();
        b = false;
        a = view;
        a.setVisibility(4);
    }
}
