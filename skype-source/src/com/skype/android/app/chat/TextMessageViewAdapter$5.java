// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.text.TextUtils;
import android.view.View;
import com.skype.Message;

// Referenced classes of package com.skype.android.app.chat:
//            TextMessageViewAdapter, ChatFragmentProvider

final class val.position
    implements android.view.ViewAdapter._cls5
{

    final TextMessageViewAdapter this$0;
    final Message val$message;
    final int val$position;

    public final boolean onLongClick(View view)
    {
        if (val$message.getEditTimestampProp() <= 0 || !TextUtils.isEmpty(val$message.getBodyXmlProp()))
        {
            ((ChatFragmentProvider)getContext()).getChatFragment().onItemLongClick(val$message, val$position, true, null);
        }
        return true;
    }

    allback()
    {
        this$0 = final_textmessageviewadapter;
        val$message = message1;
        val$position = I.this;
        super();
    }
}
