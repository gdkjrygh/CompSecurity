// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.view.animation.Animation;
import android.widget.Button;
import gbu;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            ShowcaseActivity

final class a extends gbu
{

    private ShowcaseActivity a;

    public final void onAnimationEnd(Animation animation)
    {
        ShowcaseActivity.e(a).setVisibility(4);
    }

    (ShowcaseActivity showcaseactivity)
    {
        a = showcaseactivity;
        super();
    }
}
