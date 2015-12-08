// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.activity.library.adapter.LibraryAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0
    implements com.pinterest.activity.library.adapter.aryLoadMoreListener
{

    final LibraryFragment this$0;

    public void loadMore()
    {
        if (LibraryFragment.access$4600(LibraryFragment.this) == null || LibraryFragment.access$4700(LibraryFragment.this).getDataSource() == null)
        {
            return;
        }
        if (LibraryFragment.access$4800(LibraryFragment.this).getDataSource().getNextUrl() != null)
        {
            LibraryFragment.access$3800(LibraryFragment.this);
            LibraryFragment.access$4900(LibraryFragment.this).setState(com.pinterest.ui.grid.tate.LOADING);
            return;
        } else
        {
            ((LibraryAdapter)LibraryFragment.access$5000(LibraryFragment.this)).setDataLoaded();
            return;
        }
    }

    ryLoadMoreListener()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
