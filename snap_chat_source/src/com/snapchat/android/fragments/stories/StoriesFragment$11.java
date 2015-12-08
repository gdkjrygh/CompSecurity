// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import android.animation.ValueAnimator;
import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class b
    implements android.animation.torUpdateListener
{

    private android.widget.utParams a;
    private VerticalRecyclerViewFastScroller b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.rightMargin = ((Integer)valueanimator.getAnimatedValue()).intValue();
        b.setLayoutParams(a);
    }

    erViewFastScroller(android.widget.utParams utparams, VerticalRecyclerViewFastScroller verticalrecyclerviewfastscroller)
    {
        a = utparams;
        b = verticalrecyclerviewfastscroller;
        super();
    }
}
