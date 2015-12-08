// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.skype.android.app.chat:
//            ChatListManager, ChatLinearLayoutManager, MessageAdapter

final class t> extends android.support.v7.widget.
{

    final ChatListManager this$0;

    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        super.crollStateChanged(recyclerview, i);
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (((LinearLayoutManager)recyclerview.getLayoutManager()).findFirstVisibleItemPosition() == 0 && !ChatListManager.access$000(ChatListManager.this) && !ChatListManager.access$100(ChatListManager.this))
        {
            ChatListManager.access$102(ChatListManager.this, true);
            ChatListManager.access$200(ChatListManager.this);
            return;
        }
        i = ((ChatLinearLayoutManager)recyclerview.getLayoutManager()).findLastVisibleMessage();
        if (i != -1 && i < ChatListManager.access$300(ChatListManager.this).getItemCount())
        {
            ChatListManager.access$400(ChatListManager.this, i);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    nager()
    {
        this$0 = ChatListManager.this;
        super();
    }
}
