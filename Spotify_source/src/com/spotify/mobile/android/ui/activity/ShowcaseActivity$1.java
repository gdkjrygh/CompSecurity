// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.support.v4.view.ViewPager;
import android.view.View;
import fpc;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            ShowcaseActivity

final class a
    implements android.view.r
{

    private ShowcaseActivity a;

    public final void onClick(View view)
    {
        int i = Math.min(ShowcaseActivity.a(a).b() + 1, ShowcaseActivity.b(a).b());
        ShowcaseActivity.a(a).b(i);
    }

    (ShowcaseActivity showcaseactivity)
    {
        a = showcaseactivity;
        super();
    }
}
