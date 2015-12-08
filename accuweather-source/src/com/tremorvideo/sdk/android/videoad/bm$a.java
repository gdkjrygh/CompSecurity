// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;
import android.view.animation.AlphaAnimation;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bm

private class a
    implements Runnable
{

    View a;
    final bm b;

    public void run()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(500L);
        alphaanimation.setFillAfter(true);
        a.setAnimation(alphaanimation);
    }

    (bm bm1, View view)
    {
        b = bm1;
        super();
        a = view;
    }
}
