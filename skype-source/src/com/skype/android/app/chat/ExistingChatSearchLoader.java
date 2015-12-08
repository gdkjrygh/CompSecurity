// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Contact;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.app.recents.RecentItem;
import com.skype.android.skylib.ObjectIdMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class ExistingChatSearchLoader
    implements Callable
{

    private static final int NONE = -1;
    private final int contactIds[];
    private final int existingConversationId;
    SkyLib lib;
    ObjectIdMap map;

    public ExistingChatSearchLoader(int ai[])
    {
        this(ai, -1);
    }

    public ExistingChatSearchLoader(int ai[], int i)
    {
        contactIds = Arrays.copyOf(ai, ai.length);
        existingConversationId = i;
    }

    private boolean conversationMatchesContacts(Conversation conversation, List list)
    {
        boolean flag;
        int ai[] = conversation.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.CONSUMERS).m_participantObjectIDList;
        flag = true;
        conversation = new ArrayList();
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            int l = ai[i];
            conversation.add(((Participant)map.a(l, com/skype/Participant)).getIdentityProp());
        }

        int j;
        if (existingConversationId == -1)
        {
            j = ai.length - 1;
        } else
        {
            j = ai.length;
        }
        if (j == list.size()) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        boolean flag1;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            flag1 = conversation.contains((String)list.next());
            flag = flag1;
        } while (flag1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return flag1;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
    {
        if (contactIds != null && contactIds.length > 1 && map != null)
        {
            ArrayList arraylist = new ArrayList();
            int ai1[] = contactIds;
            int i1 = ai1.length;
            for (int i = 0; i < i1; i++)
            {
                int j1 = ai1[i];
                arraylist.add(((Contact)map.a(j1, com/skype/Contact)).getIdentity());
            }

            ArrayList arraylist2 = new ArrayList();
            int ai2[] = lib.getConversationList(com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS).m_conversationObjectIDList;
            i1 = ai2.length;
            for (int j = 0; j < i1; j++)
            {
                int k1 = ai2[j];
                if (k1 == existingConversationId)
                {
                    continue;
                }
                Conversation conversation = (Conversation)map.a(k1, com/skype/Conversation);
                if (conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE && conversationMatchesContacts(conversation, arraylist))
                {
                    arraylist2.add(Integer.valueOf(k1));
                }
            }

            i1 = arraylist2.size();
            int ai[] = new int[i1];
            for (int k = 0; k < i1; k++)
            {
                ai[k] = ((Integer)arraylist2.get(k)).intValue();
            }

            if (ai.length > 0)
            {
                ProptableImpl proptableimpl = new ProptableImpl();
                lib.getPropertyTable(ai, RecentItem.CONVERSATION_PROPKEYS, proptableimpl);
                ArrayList arraylist1 = new ArrayList(proptableimpl.getCount());
                for (int l = 0; l < proptableimpl.getCount(); l++)
                {
                    arraylist1.add(new RecentItem(proptableimpl, l));
                }

                Collections.sort(arraylist1);
                return arraylist1;
            }
        }
        return null;
    }
}
