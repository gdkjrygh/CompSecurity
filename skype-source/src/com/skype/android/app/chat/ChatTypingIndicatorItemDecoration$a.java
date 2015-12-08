// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Contact;
import com.skype.Participant;
import com.skype.android.util.ConversationUtil;

// Referenced classes of package com.skype.android.app.chat:
//            ChatTypingIndicatorItemDecoration

private final class participant
{

    private Contact contact;
    private Participant participant;
    final ChatTypingIndicatorItemDecoration this$0;

    public final boolean equals(Object obj)
    {
        if (obj instanceof participant)
        {
            return obj.hashCode() == hashCode();
        } else
        {
            return super.equals(obj);
        }
    }

    public final Contact getContact()
    {
        if (contact == null)
        {
            contact = ChatTypingIndicatorItemDecoration.access$100(ChatTypingIndicatorItemDecoration.this).a(participant.getIdentityProp());
        }
        return contact;
    }

    public final int hashCode()
    {
        if (participant != null)
        {
            return participant.hashCode();
        } else
        {
            return super.hashCode();
        }
    }

    public (Participant participant1)
    {
        this$0 = ChatTypingIndicatorItemDecoration.this;
        super();
        participant = participant1;
    }
}
