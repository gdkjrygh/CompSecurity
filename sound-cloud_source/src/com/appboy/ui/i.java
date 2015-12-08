// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.View;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedbackFragment

final class i
    implements android.view.View.OnClickListener
{

    final AppboyFeedbackFragment a;

    i(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        a = appboyfeedbackfragment;
        super();
    }

    public final void onClick(View view)
    {
        AppboyFeedbackFragment.c(a);
        if (AppboyFeedbackFragment.d(a) != null)
        {
            AppboyFeedbackFragment.d(a);
            int j = AppboyFeedbackFragment.b.b;
        }
        AppboyFeedbackFragment.e(a);
    }
}
