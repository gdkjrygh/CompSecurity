// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.view.View;
import gix;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            ShowcaseActivity

final class a
    implements android.view.r
{

    private ShowcaseActivity a;

    public final void onClick(View view)
    {
        ShowcaseActivity.d(a).a(ShowcaseActivity.c(a));
        a.finish();
    }

    (ShowcaseActivity showcaseactivity)
    {
        a = showcaseactivity;
        super();
    }
}
