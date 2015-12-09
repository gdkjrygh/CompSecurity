// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout

public final class a
    implements android.view.animation.stener
{

    private View a;

    public final void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    (View view)
    {
        a = view;
        super();
    }
}
