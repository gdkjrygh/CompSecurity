// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.activity.pin.view.comments.PinCommentsStandaloneCell;
import com.pinterest.api.model.Comment;
import com.pinterest.api.model.CommentFeed;
import com.pinterest.api.model.Pin;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinCommentsFragment

class this._cls0
    implements com.pinterest.base.r
{

    final PinCommentsFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.sFragment._cls1 _pcls1)
    {
        if (PinCommentsFragment.access$000(PinCommentsFragment.this) != null && _pcls1 != null && _commentsCell != null && _pcls1.tComment().getPinUid().equals(PinCommentsFragment.access$000(PinCommentsFragment.this).getUid()))
        {
            CommentFeed commentfeed = _commentsCell.getComments();
            if (commentfeed != null)
            {
                commentfeed.appendItem(_pcls1.tComment());
                PinCommentsFragment.access$100(PinCommentsFragment.this, commentfeed);
                return;
            }
        }
    }

    public void onEventMainThread(com.pinterest.api.model.sFragment._cls1 _pcls1)
    {
        if (PinCommentsFragment.access$000(PinCommentsFragment.this) != null && _pcls1 != null && _pcls1.sDeleted() && _commentsCell != null && _pcls1.tComment().getPinUid().equals(PinCommentsFragment.access$000(PinCommentsFragment.this).getUid()))
        {
            CommentFeed commentfeed = _commentsCell.getComments();
            if (commentfeed != null)
            {
                commentfeed.removeItem(_pcls1.tComment());
                if (commentfeed.getCount() == 0)
                {
                    PinCommentsFragment.access$200(PinCommentsFragment.this);
                    return;
                } else
                {
                    PinCommentsFragment.access$100(PinCommentsFragment.this, commentfeed);
                    return;
                }
            }
        }
    }

    loneCell()
    {
        this$0 = PinCommentsFragment.this;
        super();
    }
}
