// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.Message;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapter, ChatFragmentProvider

final class val.isUrlPreviewMessage
    implements android.view.ner
{

    final MessageViewAdapter this$0;
    final boolean val$isUrlPreviewMessage;
    final Message val$message;
    final int val$position;
    final boolean val$showTimestampMenuItem;
    final String val$url;

    public final boolean onLongClick(View view)
    {
        ((ChatFragmentProvider)getContext()).getChatFragment().onItemLongClick(val$message, val$position, val$showTimestampMenuItem, val$url);
        if (val$isUrlPreviewMessage)
        {
            MessageViewAdapter.access$000(MessageViewAdapter.this, "LONG_CLICK");
        }
        return true;
    }

    istCallback()
    {
        this$0 = final_messageviewadapter;
        val$message = message1;
        val$position = i;
        val$showTimestampMenuItem = flag;
        val$url = s;
        val$isUrlPreviewMessage = Z.this;
        super();
    }
}
