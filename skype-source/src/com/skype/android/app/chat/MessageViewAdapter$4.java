// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapter, ChatFragmentProvider

final class val.position
    implements android.view.ViewAdapter._cls4
{

    final MessageViewAdapter this$0;
    final int val$position;

    public final void onClick(View view)
    {
        ((ChatFragmentProvider)getContext()).getChatFragment().onOtherLovedThisClick(val$position);
    }

    istCallback()
    {
        this$0 = final_messageviewadapter;
        val$position = I.this;
        super();
    }
}
