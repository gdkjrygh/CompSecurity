// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import Br;
import com.snapchat.android.Timber;
import com.snapchat.android.database.table.ConversationTable;
import com.snapchat.android.model.chat.ChatConversation;
import sz;

// Referenced classes of package com.snapchat.android.notification:
//            AndroidNotificationManager

public final class b
    implements com.snapchat.android.api2.chat.._cls3
{

    private String a;
    private Br b;

    public final void a(boolean flag)
    {
        Timber.f("AndroidNotificationManager", "CHAT-LOG: AndroidNotificationManager LoadConversationPageTask completed for %s with success: %s", new Object[] {
            a, Boolean.valueOf(flag)
        });
        if (flag)
        {
            ChatConversation chatconversation = sz.a(a);
            if (chatconversation != null)
            {
                if (chatconversation.mIsStub)
                {
                    chatconversation.mIsStub = false;
                }
                ConversationTable.a().c(b);
            }
        }
    }

    public (String s, Br br)
    {
        a = s;
        b = br;
        super();
    }
}
