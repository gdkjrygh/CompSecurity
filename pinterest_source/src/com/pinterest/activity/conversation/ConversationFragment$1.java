// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.widget.AbsListView;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment, ConversationAdapter

class this._cls0
    implements android.widget.tener
{

    final ConversationFragment this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (i == 0 && k > 0 && ConversationFragment.access$000(ConversationFragment.this).getNextUrl() != null && !ConversationFragment.access$100(ConversationFragment.this))
        {
            ConversationFragment.access$102(ConversationFragment.this, true);
            ConversationApi.h(ConversationFragment.access$000(ConversationFragment.this).getNextUrl(), ConversationFragment.access$200(ConversationFragment.this), getApiTag());
            ConversationFragment.access$000(ConversationFragment.this).setShowSpinner(true);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i != 0)
        {
            Device.hideSoftKeyboard(abslistview);
        }
    }

    ()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
