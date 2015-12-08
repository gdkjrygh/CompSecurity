// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.util.SparseIntArray;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.dialer:
//            b

public class CallHistoryQuery
    implements Callable
{

    private boolean checkForIds;
    private ConversationUtil conversationUtil;
    private SkyLib lib;
    private final ObjectIdMap map;
    private int maxResultCount;
    private boolean maxResultCountSet;
    private SparseIntArray objectIds;

    CallHistoryQuery(SkyLib skylib, ConversationUtil conversationutil, ObjectIdMap objectidmap)
    {
        maxResultCount = -1;
        checkForIds = false;
        objectIds = new SparseIntArray(0);
        maxResultCountSet = false;
        lib = skylib;
        conversationUtil = conversationutil;
        map = objectidmap;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
    {
        com.skype.SkyLib.GetMessageListByType_Result getmessagelistbytype_result = lib.getMessageListByType(com.skype.Message.TYPE.ENDED_LIVESESSION, false);
        ArrayList arraylist = new ArrayList(getmessagelistbytype_result.m_messageObjectIDList.length);
        for (int i = 0; i < getmessagelistbytype_result.m_messageObjectIDList.length && (!maxResultCountSet || i < maxResultCount); i++)
        {
            if (checkForIds && objectIds.indexOfKey(getmessagelistbytype_result.m_messageObjectIDList[i]) < 0)
            {
                continue;
            }
            Message message = (Message)map.a(getmessagelistbytype_result.m_messageObjectIDList[i], com/skype/Message);
            if (message == null)
            {
                continue;
            }
            int j = message.getConvoIdProp();
            ConversationImpl conversationimpl = new ConversationImpl();
            if (lib.getConversationByConvoID(j, conversationimpl) && conversationimpl.getTypeProp() == com.skype.Conversation.TYPE.DIALOG && ContactUtil.g(conversationUtil.r(conversationimpl)))
            {
                arraylist.add(new b(conversationUtil, conversationimpl, message));
            }
        }

        return arraylist;
    }

    public CallHistoryQuery setFilterIds(int ai[])
    {
        objectIds = new SparseIntArray(ai.length);
        checkForIds = true;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            objectIds.put(k, k);
        }

        return this;
    }

    public CallHistoryQuery setMaxCount(int i)
    {
        maxResultCount = i;
        maxResultCountSet = true;
        return this;
    }
}
