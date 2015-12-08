// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;

public final class sy
{

    private final sD a;

    public sy()
    {
        this(sD.a());
    }

    private sy(sD sd)
    {
        a = sd;
    }

    public final void a(ChatConversation chatconversation, BO bo)
    {
        if (!bo.e())
        {
            throw new IllegalStateException("The provided chatFeedItem cannot be saved/unsaved. Please check canSaveOrUnsave before calling this method.");
        }
        if (bo.g())
        {
            int i = bo.n();
            if (bo instanceof Chat)
            {
                a.a(chatconversation, (Chat)bo, i, false);
            }
        } else
        {
            int j = bo.m();
            if (bo instanceof Chat)
            {
                a.a(chatconversation, (Chat)bo, j, true);
                return;
            }
        }
    }
}
