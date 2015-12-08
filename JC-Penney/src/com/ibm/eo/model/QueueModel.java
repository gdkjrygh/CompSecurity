// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.ibm.eo.model:
//            Session

public class QueueModel
{

    private long currentBufferSize;
    private long messageCount;
    private LinkedHashMap sessions;

    public QueueModel()
    {
        messageCount = 0L;
        currentBufferSize = 0L;
        setMessageCount(0L);
        setCurrentBufferSize(0L);
        setSessions(new LinkedHashMap());
    }

    public final void add(long l)
    {
        setCurrentBufferSize(getCurrentBufferSize() + l);
        setMessageCount(getMessageCount() + 1L);
    }

    public final void clear()
    {
        if (getSessions() != null)
        {
            for (Iterator iterator = getSessions().values().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((LinkedHashMap)iterator.next()).values().iterator();
                while (iterator1.hasNext()) 
                {
                    ((Session)iterator1.next()).getMessages().clear();
                }
            }

        }
        setCurrentBufferSize(0L);
        setMessageCount(0L);
    }

    public final long getCurrentBufferSize()
    {
        return currentBufferSize;
    }

    public final long getMessageCount()
    {
        return messageCount;
    }

    public final LinkedHashMap getSessions()
    {
        return sessions;
    }

    public final void setCurrentBufferSize(long l)
    {
        currentBufferSize = l;
    }

    public final void setMessageCount(long l)
    {
        messageCount = l;
    }

    public final void setSessions(LinkedHashMap linkedhashmap)
    {
        sessions = linkedhashmap;
    }

    public final void sub(long l)
    {
        setCurrentBufferSize(getCurrentBufferSize() - l);
        setMessageCount(getMessageCount() - 1L);
    }
}
