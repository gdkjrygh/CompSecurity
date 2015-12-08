// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.activity.create.CreateActivity;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            BoardPickerFragment

class this._cls0
    implements com.pinterest.base.r
{

    final BoardPickerFragment this$0;

    private boolean shouldBoardPickerClose()
    {
        return getActivity() instanceof CreateActivity;
    }

    public void onEventMainThread(com.pinterest.activity.create.helper.dCreatedEvent dcreatedevent)
    {
        if (shouldBoardPickerClose())
        {
            Events.removeStickyEvent(dcreatedevent);
            BoardPickerFragment.access$500(BoardPickerFragment.this);
        }
    }

    public void onEventMainThread(com.pinterest.events.alidated alidated)
    {
        if (_adapter != null)
        {
            loadCachedBoards();
        }
    }

    reatedEvent()
    {
        this$0 = BoardPickerFragment.this;
        super();
    }
}
