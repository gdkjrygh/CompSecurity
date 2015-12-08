// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;

import com.pinterest.activity.search.ui.GuidedSearchBar;

// Referenced classes of package com.pinterest.activity.search:
//            GuidedSearchFragment

class this._cls0
    implements Runnable
{

    final GuidedSearchFragment this$0;

    public void run()
    {
        if (_searchView != null && _searchView.searchHintEnabled())
        {
            _searchView.getFocus();
        }
    }

    ()
    {
        this$0 = GuidedSearchFragment.this;
        super();
    }
}
