// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.explore.view:
//            ExploreContextualSearchCell

public class _cls1
{

    public static void inject(butterknife.earchCell earchcell, final ExploreContextualSearchCell target, Object obj)
    {
        target._title = (TextView)earchcell._title(obj, 0x7f0f0077, "field '_title'");
        class _cls1 extends DebouncingOnClickListener
        {

            final ExploreContextualSearchCell val$target;

            public final void doClick(View view)
            {
                target.onSearchCellClicked(view);
            }

            _cls1()
            {
                target = explorecontextualsearchcell;
                super();
            }
        }

        earchcell.earchCell(obj, 0x7f0f01ce, "method 'onSearchCellClicked'").setOnClickListener(new _cls1());
    }

    public static void reset(ExploreContextualSearchCell explorecontextualsearchcell)
    {
        explorecontextualsearchcell._title = null;
    }

    public _cls1()
    {
    }
}
