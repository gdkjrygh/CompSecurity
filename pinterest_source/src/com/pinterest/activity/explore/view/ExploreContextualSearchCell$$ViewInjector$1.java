// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.pinterest.activity.explore.view:
//            ExploreContextualSearchCell

final class val.target extends DebouncingOnClickListener
{

    final ExploreContextualSearchCell val$target;

    public final void doClick(View view)
    {
        val$target.onSearchCellClicked(view);
    }

    ()
    {
        val$target = explorecontextualsearchcell;
        super();
    }
}
