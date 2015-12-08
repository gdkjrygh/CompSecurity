// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.util.MethodTrace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.recents:
//            RecentItem

public class RecentQuery
    implements Callable
{

    private SkyLib lib;
    private int objectIds[];

    public RecentQuery(SkyLib skylib)
    {
        lib = skylib;
    }

    RecentQuery(SkyLib skylib, int ai[])
    {
        lib = skylib;
        objectIds = ai;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
    {
        MethodTrace methodtrace = new MethodTrace("RecentQuery", "call");
        ProptableImpl proptableimpl = new ProptableImpl();
        ArrayList arraylist;
        int j;
        if (objectIds == null)
        {
            lib.getConversationTable(com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS, RecentItem.CONVERSATION_PROPKEYS, proptableimpl);
        } else
        {
            lib.getPropertyTable(objectIds, RecentItem.CONVERSATION_PROPKEYS, proptableimpl);
        }
        j = proptableimpl.getCount();
        arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new RecentItem(proptableimpl, i));
        }

        Collections.sort(arraylist);
        methodtrace.b();
        return arraylist;
    }
}
