// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.api.model.Feed;
import com.pinterest.api.model.InterestsFeed;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryAllPinsFragment

class nit> extends com.pinterest.api.remote.dApiResponse
{

    final LibraryAllPinsFragment this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        LibraryAllPinsFragment.access$702(LibraryAllPinsFragment.this, (InterestsFeed)feed);
        LibraryAllPinsFragment.access$800(LibraryAllPinsFragment.this, false);
    }

    ()
    {
        this$0 = LibraryAllPinsFragment.this;
        super();
    }
}
