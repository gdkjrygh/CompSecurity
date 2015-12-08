// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            ChatViewMonitor

final class t> extends android.support.v7.widget.
{

    final ChatViewMonitor this$0;

    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            if (ChatViewMonitor.access$000(ChatViewMonitor.this) != 0)
            {
                for (Iterator iterator = ChatViewMonitor.access$100(ChatViewMonitor.this).iterator(); iterator.hasNext(); ((ChatScrollListener)iterator.next()).onScrollStopped(recyclerview)) { }
            }
            ChatViewMonitor.access$002(ChatViewMonitor.this, i);
            return;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (ChatViewMonitor.access$000(ChatViewMonitor.this) == 0)
        {
            for (Iterator iterator1 = ChatViewMonitor.access$100(ChatViewMonitor.this).iterator(); iterator1.hasNext(); ((ChatScrollListener)iterator1.next()).onScrollStarted(recyclerview)) { }
        }
        ChatViewMonitor.access$002(ChatViewMonitor.this, i);
    }

    ChatScrollListener()
    {
        this$0 = ChatViewMonitor.this;
        super();
    }
}
