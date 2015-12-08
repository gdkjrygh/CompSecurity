// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.Intent;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ConversationUtil;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAgent

private final class cess._cls100 extends CheckedBroadcastReceiver
{

    final MessageAgent this$0;

    public final void onReceiveFiltered(Context context, Intent intent, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            MessageAgent.access$200(MessageAgent.this, System.currentTimeMillis());
            return;

        case 1: // '\001'
            i = intent.getIntExtra("0", 0);
            break;
        }
        MessageAgent.access$300(MessageAgent.this).b(i);
    }

    eiver()
    {
        this$0 = MessageAgent.this;
        super(MessageAgent.access$100());
    }
}
