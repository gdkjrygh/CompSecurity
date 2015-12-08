// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import android.animation.ValueAnimator;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesScrollBar

final class a
    implements android.animation.torUpdateListener
{

    private StoriesScrollBar a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        StoriesScrollBar.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    (StoriesScrollBar storiesscrollbar)
    {
        a = storiesscrollbar;
        super();
    }
}
