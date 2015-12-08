// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryBoardHeaderView

class val.smoothScroll
    implements Runnable
{

    final LibraryBoardHeaderView this$0;
    final boolean val$smoothScroll;

    public void run()
    {
        int i;
        if (LibraryBoardHeaderView.access$000(LibraryBoardHeaderView.this) == -1)
        {
            i = 0;
        } else
        {
            i = LibraryBoardHeaderView.access$000(LibraryBoardHeaderView.this);
        }
        if (val$smoothScroll)
        {
            _topicList.smoothScrollToPositionFromOffset(i, 0, 700);
            return;
        } else
        {
            _topicList.setSelection(i);
            return;
        }
    }

    ()
    {
        this$0 = final_libraryboardheaderview;
        val$smoothScroll = Z.this;
        super();
    }
}
