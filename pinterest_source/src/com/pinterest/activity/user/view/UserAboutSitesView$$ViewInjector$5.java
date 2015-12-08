// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.pinterest.activity.user.view:
//            UserAboutSitesView

final class val.target extends DebouncingOnClickListener
{

    final UserAboutSitesView val$target;

    public final void doClick(View view)
    {
        val$target.onEditWebsiteClicked();
    }

    I()
    {
        val$target = useraboutsitesview;
        super();
    }
}
