// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import java.util.Iterator;

public class ConversationParticipantsUtil
{

    private SkyLib a;
    private ObjectIdMap b;

    public ConversationParticipantsUtil(SkyLib skylib, ObjectIdMap objectidmap)
    {
        a = skylib;
        b = objectidmap;
    }

    static ObjectIdMap a(ConversationParticipantsUtil conversationparticipantsutil)
    {
        return conversationparticipantsutil.b;
    }

    static SkyLib b(ConversationParticipantsUtil conversationparticipantsutil)
    {
        return conversationparticipantsutil.a;
    }

    // Unreferenced inner class com/skype/android/util/ConversationParticipantsUtil$1

/* anonymous class */
    final class _cls1
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

            
            {
                d = ConversationParticipantsUtil.this;
                c = conversation;
                super();
                a = 0;
                b = c.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).m_participantObjectIDList;
            }
    }


    // Unreferenced inner class com/skype/android/util/ConversationParticipantsUtil$2

/* anonymous class */
    final class _cls2
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
            Object obj = ConversationParticipantsUtil.a(d);
            int ai[] = b;
            int i = a;
            a = i + 1;
            obj = (Participant)((ObjectIdMap) (obj)).a(ai[i], com/skype/Participant);
            ContactImpl contactimpl = new ContactImpl();
            ConversationParticipantsUtil.b(d).getContact(((Participant) (obj)).getIdentityProp(), contactimpl);
            return contactimpl;
        }

        public final void remove()
        {
        }

            
            {
                d = ConversationParticipantsUtil.this;
                c = conversation;
                super();
                a = 0;
                b = c.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).m_participantObjectIDList;
            }
    }

}
