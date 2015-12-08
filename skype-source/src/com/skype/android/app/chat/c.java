// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import com.skype.Account;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder, SyntheticTypes

final class c
    implements MessageHolder
{

    private Account account;

    public c(Context context, Account account1)
    {
        account = account1;
    }

    public final String getAuthorDisplayName()
    {
        return account.getDisplaynameProp();
    }

    public final String getAuthorIdentity()
    {
        return account.getSkypenameProp();
    }

    public final String getConversationDisplayName()
    {
        return null;
    }

    public final String getConversationIdentity()
    {
        return account.getDisplaynameProp();
    }

    public final long getEditTimestamp()
    {
        return 0L;
    }

    public final CharSequence getFormattableContent()
    {
        return null;
    }

    public final String getMessageId()
    {
        return null;
    }

    public final Object getMessageObject()
    {
        return Integer.valueOf(SyntheticTypes.HEADER.getType());
    }

    public final String getTextContent()
    {
        return SyntheticTypes.HEADER.toString();
    }

    public final long getTimestamp()
    {
        return 0L;
    }

    public final int getTypeOrdinal()
    {
        return SyntheticTypes.HEADER.getType();
    }

    public final boolean isConference()
    {
        return false;
    }

    public final boolean isConsumed()
    {
        return false;
    }

    public final boolean isDeleted()
    {
        return false;
    }
}
