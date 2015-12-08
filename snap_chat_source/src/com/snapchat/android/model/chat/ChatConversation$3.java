// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import java.util.Comparator;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatConversation, Chat

public final class this._cls0
    implements Comparator
{

    final ChatConversation this$0;

    public final int compare(Object obj, Object obj1)
    {
        obj = (Chat)obj;
        obj1 = (Chat)obj1;
        if (((Chat) (obj)).w() < ((Chat) (obj1)).w())
        {
            return -1;
        }
        return ((Chat) (obj)).w() <= ((Chat) (obj1)).w() ? 0 : 1;
    }

    public ()
    {
        this$0 = ChatConversation.this;
        super();
    }
}
