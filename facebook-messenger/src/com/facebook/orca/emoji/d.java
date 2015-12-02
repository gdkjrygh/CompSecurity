// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.facebook.orca.emoji:
//            EmojiAttachmentPopup

class d extends Handler
{

    final EmojiAttachmentPopup a;

    d(EmojiAttachmentPopup emojiattachmentpopup)
    {
        a = emojiattachmentpopup;
        super();
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1 && EmojiAttachmentPopup.a(a, false))
        {
            sendMessageDelayed(Message.obtain(this, 1), 100L);
        }
    }
}
