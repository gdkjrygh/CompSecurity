// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.support.v4.util.j;
import android.support.v7.util.a;
import android.text.TextUtils;
import com.skype.Message;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.skype.android.app.chat:
//            i, MessageHolder, SyntheticTypes, MessageHolderUtil

final class h extends android.support.v7.util.a.b
{

    private static final Comparator MESSAGE_COMPARATOR = new i();
    private static final String SYNTH_DELIM = " : ";
    private static final String SYNTH_PREFIX = "SYNTH:";
    private android.support.v7.util.a.a batchedCallback;
    private a messages;
    private final j messagesMap = new j();
    private final Map syntheticMessagesMap = new HashMap();

    h()
    {
        batchedCallback = new android.support.v7.util.a.a(this);
        messages = new a(com/skype/android/app/chat/MessageHolder, batchedCallback);
    }

    private void addToMap(MessageHolder messageholder)
    {
        if (SyntheticTypes.isSynthetic(messageholder))
        {
            syntheticMessagesMap.put(getSynthKey(messageholder), messageholder);
            return;
        } else
        {
            messagesMap.a(((Message)messageholder.getMessageObject()).getObjectID(), messageholder);
            return;
        }
    }

    private String getSynthKey(Message message)
    {
        return (new StringBuilder("SYNTH:")).append(message.getAuthorProp()).append(" : ").append(message.getBodyXmlProp()).toString();
    }

    private String getSynthKey(MessageHolder messageholder)
    {
        return (new StringBuilder("SYNTH:")).append(messageholder.getAuthorIdentity()).append(" : ").append(messageholder.getTextContent()).toString();
    }

    public final int add(MessageHolder messageholder, boolean flag)
    {
        int k = messages.a(messageholder);
        addToMap(messageholder);
        if (flag)
        {
            dispatchLastEvent();
        }
        return k;
    }

    public final boolean areContentsTheSame(MessageHolder messageholder, MessageHolder messageholder1)
    {
        return areItemsTheSame(messageholder, messageholder1) && messageholder.getEditTimestamp() == messageholder1.getEditTimestamp();
    }

    public final volatile boolean areContentsTheSame(Object obj, Object obj1)
    {
        return areContentsTheSame((MessageHolder)obj, (MessageHolder)obj1);
    }

    public final boolean areItemsTheSame(MessageHolder messageholder, MessageHolder messageholder1)
    {
        return TextUtils.equals(messageholder.getMessageId(), messageholder1.getMessageId());
    }

    public final volatile boolean areItemsTheSame(Object obj, Object obj1)
    {
        return areItemsTheSame((MessageHolder)obj, (MessageHolder)obj1);
    }

    public final int compare(MessageHolder messageholder, MessageHolder messageholder1)
    {
        int k;
        if (messageholder == messageholder1)
        {
            k = 0;
        } else
        {
            int l = MESSAGE_COMPARATOR.compare(messageholder, messageholder1);
            k = l;
            if (l == 0)
            {
                if (MessageHolderUtil.isLiveSession(messageholder) && MessageHolderUtil.isLiveSession(messageholder1))
                {
                    k = l;
                    if (((Message)messageholder.getMessageObject()).getOtherLiveMessage() == ((Message)messageholder1.getMessageObject()).getObjectID())
                    {
                        k = l;
                        if (MessageHolderUtil.isStartedLiveSession(messageholder))
                        {
                            k = -1;
                        }
                        if (MessageHolderUtil.isEndedLiveSession(messageholder))
                        {
                            return 1;
                        }
                    }
                } else
                {
                    return -1;
                }
            }
        }
        return k;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((MessageHolder)obj, (MessageHolder)obj1);
    }

    public final boolean contains(Message message)
    {
        if (messagesMap.a(message.getObjectID()) != null)
        {
            return true;
        } else
        {
            return syntheticMessagesMap.containsKey(getSynthKey(message));
        }
    }

    public final void dispatchLastEvent()
    {
        batchedCallback.a();
    }

    public final MessageHolder get(int k)
    {
        return (MessageHolder)messages.b(k);
    }

    public final int getIndexOf(MessageHolder messageholder)
    {
        return messages.c(messageholder);
    }

    public final Message getMessageById(int k)
    {
        MessageHolder messageholder = (MessageHolder)messagesMap.a(k);
        if (messageholder == null)
        {
            return null;
        } else
        {
            return (Message)messageholder.getMessageObject();
        }
    }

    public final MessageHolder getMessageHolderById(int k)
    {
        return (MessageHolder)messagesMap.a(k);
    }

    public final a getMessages()
    {
        return messages;
    }

    public final void onChanged(int k, int l)
    {
    }

    public final void onInserted(int k, int l)
    {
    }

    public final void onMoved(int k, int l)
    {
    }

    public final void onRemoved(int k, int l)
    {
    }

    public final MessageHolder remove(int k, boolean flag)
    {
        MessageHolder messageholder = (MessageHolder)messages.a(k);
        if (SyntheticTypes.isSynthetic(messageholder))
        {
            syntheticMessagesMap.remove(getSynthKey(messageholder));
        } else
        {
            messagesMap.c(((Message)messageholder.getMessageObject()).getObjectID());
        }
        if (flag)
        {
            dispatchLastEvent();
        }
        return messageholder;
    }

    public final void removeSyntheticMessages()
    {
        for (int k = 0; k < messages.a(); k++)
        {
            MessageHolder messageholder = (MessageHolder)messages.b(k);
            if (messageholder != null && SyntheticTypes.isSynthetic(messageholder))
            {
                messages.b(messageholder);
                syntheticMessagesMap.remove(getSynthKey(messageholder));
            }
        }

    }

    public final int size()
    {
        return messages.a();
    }

}
