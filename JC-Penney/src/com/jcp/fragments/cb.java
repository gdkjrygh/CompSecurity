// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.jcp.fragments:
//            MultipleVideosGridFragment

class cb
    implements android.view.animation.Animation.AnimationListener
{

    final MultipleVideosGridFragment a;

    cb(MultipleVideosGridFragment multiplevideosgridfragment)
    {
        a = multiplevideosgridfragment;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.mGridLayout.setVisibility(8);
        a.mGridLayout.setAlpha(0.0F);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a.mGridLayout.setVisibility(0);
        a.mGridLayout.setAlpha(1.0F);
    }
}
