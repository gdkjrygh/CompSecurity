// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.widget.AbsListView;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment

class this._cls0
    implements android.widget.tionCreateFragment._cls4
{

    final ConversationCreateFragment this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
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
        this$0 = ConversationCreateFragment.this;
        super();
    }
}
