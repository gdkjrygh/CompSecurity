// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            CallNotificationViewAdapter, ChatFragment

final class val.chatFragment
    implements android.view.ViewAdapter._cls1
{

    final CallNotificationViewAdapter this$0;
    final ChatFragment val$chatFragment;

    public final void onClick(View view)
    {
        val$chatFragment.startVideoMessageFlow();
    }

    ()
    {
        this$0 = final_callnotificationviewadapter;
        val$chatFragment = ChatFragment.this;
        super();
    }
}
