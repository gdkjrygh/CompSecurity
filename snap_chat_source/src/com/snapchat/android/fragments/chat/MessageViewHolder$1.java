// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import BO;
import If;
import android.text.method.LinkMovementMethod;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.ui.FixTouchConsumeTextView;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            MessageViewHolder

final class b
    implements Runnable
{

    private ChatFeedItem a;
    private FixTouchConsumeTextView b;

    public final void run()
    {
        if ((a instanceof BO) && If.a(b))
        {
            b.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    (ChatFeedItem chatfeeditem, FixTouchConsumeTextView fixtouchconsumetextview)
    {
        a = chatfeeditem;
        b = fixtouchconsumetextview;
        super();
    }
}
