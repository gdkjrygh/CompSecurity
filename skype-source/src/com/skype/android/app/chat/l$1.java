// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.Message;
import com.skype.android.app.Navigation;

// Referenced classes of package com.skype.android.app.chat:
//            l

final class val.message
    implements android.view..OnClickListener
{

    final l this$0;
    final Message val$message;
    final val.message val$viewHolder;

    public final void onClick(View view)
    {
        l.access$100(l.this, l.access$000(l.this, val$viewHolder));
        navigation.playVideoMessage(val$message);
    }

    n()
    {
        this$0 = final_l1;
        val$viewHolder = n;
        val$message = Message.this;
        super();
    }
}
