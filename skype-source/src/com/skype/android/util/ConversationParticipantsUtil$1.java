// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.Conversation;
import com.skype.Participant;
import com.skype.android.skylib.ObjectIdMap;
import java.util.Iterator;

// Referenced classes of package com.skype.android.util:
//            ConversationParticipantsUtil

final class ipantObjectIDList
    implements Iterator
{

    int a;
    int b[];
    final Conversation c;
    final ConversationParticipantsUtil d;

    public final boolean hasNext()
    {
        return a < b.length;
    }

    public final Object next()
    {
        ObjectIdMap objectidmap = ConversationParticipantsUtil.a(d);
        int ai[] = b;
        int i = a;
        a = i + 1;
        return (Participant)objectidmap.a(ai[i], com/skype/Participant);
    }

    public final void remove()
    {
    }

    (ConversationParticipantsUtil conversationparticipantsutil, Conversation conversation)
    {
        d = conversationparticipantsutil;
        c = conversation;
        super();
        a = 0;
        b = c.getParticipants(com.skype.OTHER_CONSUMERS).m_participantObjectIDList;
    }
}
