// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryBoardCollabBar

class this._cls0 extends com.pinterest.api.remote.nse
{

    final LibraryBoardCollabBar this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this).getUser() != null)
        {
            feed.appendItem(LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this).getUser());
        }
        LibraryBoardCollabBar.access$200(LibraryBoardCollabBar.this, (UserFeed)feed);
    }

    A()
    {
        this$0 = LibraryBoardCollabBar.this;
        super();
    }
}
