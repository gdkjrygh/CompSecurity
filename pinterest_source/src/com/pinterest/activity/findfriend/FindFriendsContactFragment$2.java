// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import com.pinterest.activity.findfriend.view.FindFriendsHeaderView;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsContactFragment

class this._cls0
    implements com.pinterest.base.tactFragment._cls2
{

    final FindFriendsContactFragment this$0;

    public void onEventMainThread(com.pinterest.activity.findfriend.adapter.hangeEvent hangeevent)
    {
        if (FindFriendsContactFragment.access$000(FindFriendsContactFragment.this) != null && hangeevent.originatingAdapter == FindFriendsContactFragment.access$100(FindFriendsContactFragment.this))
        {
            FindFriendsContactFragment.access$000(FindFriendsContactFragment.this).updateFriendsCount(hangeevent.size);
        }
    }

    ontactsChangeEvent()
    {
        this$0 = FindFriendsContactFragment.this;
        super();
    }
}
