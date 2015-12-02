// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.facebook.messages.model.threads.Message;
import java.util.List;

// Referenced classes of package com.facebook.orca.messageview:
//            MessageViewActivity

class b extends q
{

    final MessageViewActivity a;

    b(MessageViewActivity messageviewactivity, Context context, IntentFilter intentfilter)
    {
        a = messageviewactivity;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        context = intent.getStringExtra("threadid");
        if (MessageViewActivity.a(a).equals(context) && intent.getStringArrayListExtra("message_ids").contains(MessageViewActivity.b(a).d()))
        {
            a.finish();
        }
    }
}
