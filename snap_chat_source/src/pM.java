// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.app.feature.messaging.feed.model.FeedIconChangeType;
import com.snapchat.android.model.chat.ChatConversation;

public final class pM
    implements sO
{

    private final ChatConversation a;
    private final AT b;

    public pM(ChatConversation chatconversation, AT at)
    {
        a = chatconversation;
        b = at;
    }

    public final void a()
    {
    }

    public final void a(long l)
    {
        a.a(b, FeedIconChangeType.VIEWING);
    }

    public final void b()
    {
        a.a(b, FeedIconChangeType.VIEWED);
    }

    public final void c()
    {
        a.a(b, FeedIconChangeType.VIEWED);
    }

    public final void d()
    {
        a.a(b, FeedIconChangeType.VIEWED);
    }
}
