// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.view.View;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatMedia;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            MessageViewHolder

public static interface 
{

    public abstract void a(View view, ChatMedia chatmedia);

    public abstract void a(CashFeedItem cashfeeditem);

    public abstract ChatConversation o();
}
