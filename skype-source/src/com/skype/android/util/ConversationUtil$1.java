// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.util:
//            ConversationUtil

final class a
    implements llExtractor
{

    final ConversationUtil a;

    public final volatile Object a(Conversation conversation)
    {
        return conversation;
    }

    llExtractor(ConversationUtil conversationutil)
    {
        a = conversationutil;
        super();
    }
}
