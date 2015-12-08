// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.widget.ListView;
import android.widget.TextView;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class this._cls0
    implements Runnable
{

    final ConversationFragment this$0;

    public void run()
    {
        if (ConversationFragment.access$1400(ConversationFragment.this) == null)
        {
            ConversationFragment.access$1402(ConversationFragment.this, new TextView(getActivity()));
            int i = (int)Resources.dimension(0x7f0a00c5);
            int j = (int)Resources.dimension(0x7f0a00c4);
            ConversationFragment.access$1400(ConversationFragment.this).setGravity(1);
            ConversationFragment.access$1400(ConversationFragment.this).setPadding(j, i, j, i);
            ConversationFragment.access$1400(ConversationFragment.this).setText(0x7f07027f);
            ConversationFragment.access$1400(ConversationFragment.this).setTextColor(Resources.color(0x7f0e00aa));
            ConversationFragment.access$500(ConversationFragment.this).addFooterView(ConversationFragment.access$1400(ConversationFragment.this));
        }
    }

    ()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
