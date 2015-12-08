// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.api.model.Feed;
import com.pinterest.api.model.InterestsFeed;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class onse extends com.pinterest.api.remote.estsFeedApiResponse
{

    final LibraryFragment this$0;

    public void onSuccess(Feed feed)
    {
        LibraryFragment.access$2302(LibraryFragment.this, (InterestsFeed)feed);
        LibraryFragment.access$2400(LibraryFragment.this);
    }

    onse()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
