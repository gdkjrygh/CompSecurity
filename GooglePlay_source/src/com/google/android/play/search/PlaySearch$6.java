// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.google.android.play.search:
//            PlaySearch

final class val.show
    implements android.view.animation.mationListener
{

    final PlaySearch this$0;
    final boolean val$show;

    public final void onAnimationEnd(Animation animation)
    {
        if (!val$show)
        {
            PlaySearch.access$100(PlaySearch.this).setVisibility(8);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    stener()
    {
        this$0 = final_playsearch;
        val$show = Z.this;
        super();
    }
}
