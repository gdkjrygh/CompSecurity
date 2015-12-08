// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import android.animation.ValueAnimator;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesScrollBar

final class a
    implements android.animation.torUpdateListener
{

    private android.widget.utParams a;
    private StoriesScrollBar b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.setMargins(0, 0, ((Integer)valueanimator.getAnimatedValue()).intValue(), 0);
        StoriesScrollBar.b(b).setLayoutParams(a);
    }

    (StoriesScrollBar storiesscrollbar, android.widget.utParams utparams)
    {
        b = storiesscrollbar;
        a = utparams;
        super();
    }
}
