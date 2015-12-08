// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.widget.Button;
import fpc;
import lu;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            ShowcaseActivity

final class a
    implements lu
{

    private ShowcaseActivity a;

    public final void a(int i)
    {
        if (i < ShowcaseActivity.b(a).b() - 1)
        {
            if (ShowcaseActivity.e(a).getVisibility() == 0)
            {
                ShowcaseActivity.f(a);
            }
        } else
        if (ShowcaseActivity.e(a).getVisibility() == 4)
        {
            ShowcaseActivity.g(a);
            return;
        }
    }

    public final void a(int i, float f, int j)
    {
    }

    public final void b(int i)
    {
    }

    (ShowcaseActivity showcaseactivity)
    {
        a = showcaseactivity;
        super();
    }
}
