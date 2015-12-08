// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.activity.library.adapter.LibraryAdapter;
import com.pinterest.activity.library.model.LibraryFeed;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0 extends BaseApiResponseHandler
{

    final LibraryFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (LibraryFragment.access$4200(LibraryFragment.this) == null || LibraryFragment.access$4300(LibraryFragment.this) == null)
        {
            return;
        } else
        {
            LibraryFragment.access$4400(LibraryFragment.this).setState(com.pinterest.ui.grid.tate.LOADED);
            ((LibraryAdapter)LibraryFragment.access$4500(LibraryFragment.this)).finishedLoading();
            return;
        }
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        if (LibraryFragment.access$3600(LibraryFragment.this) == null || LibraryFragment.access$3700(LibraryFragment.this) == null)
        {
            return;
        }
        pinterestjsonobject = new LibraryFeed(pinterestjsonobject, getBaseUrl(), "board");
        if (pinterestjsonobject.getCount() == 0)
        {
            LibraryFragment.access$3800(LibraryFragment.this);
        }
        LibraryFragment.access$2900(LibraryFragment.this, pinterestjsonobject);
        LibraryFragment.access$3900(LibraryFragment.this).setState(com.pinterest.ui.grid.tate.LOADED);
        ((LibraryAdapter)LibraryFragment.access$4000(LibraryFragment.this)).finishedLoading();
        ((LibraryAdapter)LibraryFragment.access$4100(LibraryFragment.this)).appendItems(pinterestjsonobject);
    }

    ()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
