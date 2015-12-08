// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Conversation;
import com.skype.Message;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.MethodTrace;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.chat:
//            MessageTimeComparator

public class MessageLoader
    implements Callable
{
    private static final class a extends MessageTimeComparator
    {

        public final int compare(Message message, Message message1)
        {
            int j = super.compare(message, message1);
            int i = j;
            if (j == 0)
            {
                i = message.getDbID() - message1.getDbID();
            }
            return i;
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((Message)obj, (Message)obj1);
        }

        private a()
        {
        }

    }


    private static final int ALL_MESSAGES_COUNT = 10000;
    private static final Comparator COMPARATOR = new a(null);
    private static final int MESSAGES_COUNT = 20;
    private Conversation conversation;
    private ObjectIdMap map;
    private int requireTimestamp;
    private boolean returnNewer;
    private FormattedMessageCache spannedText;

    public MessageLoader(Conversation conversation1, ObjectIdMap objectidmap, FormattedMessageCache formattedmessagecache, int i)
    {
        this(conversation1, objectidmap, formattedmessagecache, i, false);
    }

    public MessageLoader(Conversation conversation1, ObjectIdMap objectidmap, FormattedMessageCache formattedmessagecache, int i, boolean flag)
    {
        conversation = conversation1;
        map = objectidmap;
        requireTimestamp = i;
        spannedText = formattedmessagecache;
        returnNewer = flag;
    }

    private boolean canAdd(Message message)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];

            static 
            {
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.BLOCKED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.skype.Message.TYPE[message.getTypeProp().ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
            return false;
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
    {
        MethodTrace methodtrace = new MethodTrace("MessageLoader", "loadInBackground");
        methodtrace.a();
        if (requireTimestamp <= 0)
        {
            requireTimestamp = conversation.getInboxTimestampProp();
        }
        ArrayList arraylist = new ArrayList();
        Object obj = conversation;
        int j = requireTimestamp;
        int ai[];
        int i;
        if (returnNewer)
        {
            i = 10000;
        } else
        {
            i = 20;
        }
        obj = ((Conversation) (obj)).loadMessages(j, i, returnNewer);
        ai = ((com.skype.Conversation.LoadMessages_Result) (obj)).m_messageObjectIDList;
        j = ai.length;
        for (i = 0; i < j; i++)
        {
            int l = ai[i];
            Message message1 = (Message)map.a(l, com/skype/Message);
            if (canAdd(message1))
            {
                arraylist.add(message1);
            }
        }

        com.skype.Conversation.GetLastMessages_Result getlastmessages_result = conversation.getLastMessages(requireTimestamp);
        i = getlastmessages_result.m_contextMessageObjectIDList.length;
        j = getlastmessages_result.m_unconsumedMessageObjectIDList.length;
        ai = new int[getlastmessages_result.m_contextMessageObjectIDList.length + getlastmessages_result.m_unconsumedMessageObjectIDList.length];
        System.arraycopy(getlastmessages_result.m_contextMessageObjectIDList, 0, ai, 0, i);
        System.arraycopy(getlastmessages_result.m_unconsumedMessageObjectIDList, 0, ai, i, j);
        int i1 = ai.length;
        i = 0;
label0:
        do
        {
            if (i < i1)
            {
                int j1 = ai[i];
                boolean flag1 = false;
                int ai1[] = ((com.skype.Conversation.LoadMessages_Result) (obj)).m_messageObjectIDList;
                int k1 = ai1.length;
                int k = 0;
                do
                {
label1:
                    {
                        boolean flag = flag1;
                        if (k < k1)
                        {
                            if (ai1[k] != j1)
                            {
                                break label1;
                            }
                            flag = true;
                        }
                        if (!flag)
                        {
                            Message message2 = (Message)map.a(j1, com/skype/Message);
                            if (canAdd(message2))
                            {
                                arraylist.add(message2);
                            }
                        }
                        i++;
                        continue label0;
                    }
                    k++;
                } while (true);
            }
            Message message;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); spannedText.a(message))
            {
                message = (Message)iterator.next();
            }

            Collections.sort(arraylist, COMPARATOR);
            methodtrace.b();
            return arraylist;
        } while (true);
    }

}
