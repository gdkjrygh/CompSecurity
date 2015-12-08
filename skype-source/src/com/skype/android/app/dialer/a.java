// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import com.skype.Message;
import com.skype.MessageImpl;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.app.recents.RecentItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

final class a
    implements Callable
{

    private SkyLib lib;
    private int maxResults;

    a(SkyLib skylib, int i)
    {
        lib = skylib;
        maxResults = i;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final List call()
        throws Exception
    {
        ArrayList arraylist = new ArrayList();
        Object obj = lib.getMessageListByType(com.skype.Message.TYPE.ENDED_LIVESESSION, true, 0);
        int k = Math.min(maxResults, ((com.skype.SkyLib.GetMessageListByType_Result) (obj)).m_messageObjectIDList.length);
        int ai[] = new int[k];
        for (int i = 0; i < k; i++)
        {
            int l = ((com.skype.SkyLib.GetMessageListByType_Result) (obj)).m_messageObjectIDList[i];
            MessageImpl messageimpl = new MessageImpl();
            if (lib.getConversationMessage(l, messageimpl))
            {
                ai[i] = lib.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.CONVERSATION, messageimpl.getConvoIdProp());
            }
        }

        obj = new ProptableImpl();
        lib.getPropertyTable(ai, RecentItem.CONVERSATION_PROPKEYS, ((Proptable) (obj)));
        for (int j = 0; j < ((Proptable) (obj)).getCount(); j++)
        {
            arraylist.add(new RecentItem(((Proptable) (obj)), j));
        }

        Collections.sort(arraylist);
        return arraylist;
    }
}
