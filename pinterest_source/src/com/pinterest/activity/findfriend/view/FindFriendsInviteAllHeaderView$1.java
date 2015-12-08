// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.view;

import android.widget.TextView;
import com.pinterest.activity.findfriend.event.SingleCheckEvent;

// Referenced classes of package com.pinterest.activity.findfriend.view:
//            FindFriendsInviteAllHeaderView

class this._cls0
    implements com.pinterest.base.viteAllHeaderView._cls1
{

    final FindFriendsInviteAllHeaderView this$0;

    public void onEventMainThread(SingleCheckEvent singlecheckevent)
    {
        FindFriendsInviteAllHeaderView.access$002(FindFriendsInviteAllHeaderView.this, singlecheckevent.isAllChecked());
        singlecheckevent = _deselectAllTv;
        int i;
        if (FindFriendsInviteAllHeaderView.access$000(FindFriendsInviteAllHeaderView.this))
        {
            i = 0x7f0701f8;
        } else
        {
            i = 0x7f070506;
        }
        singlecheckevent.setText(i);
    }

    ()
    {
        this$0 = FindFriendsInviteAllHeaderView.this;
        super();
    }
}
