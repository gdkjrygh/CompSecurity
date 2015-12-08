// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.manager:
//            ActionListener, DataActionListener

public class ListenerManager
{

    private static ListenerManager sInstance = new ListenerManager();
    private boolean dataAvailable;
    private Map mDataListenerMap;
    private Map mListenerMap;

    private ListenerManager()
    {
        mListenerMap = new TreeMap();
        mDataListenerMap = new TreeMap();
    }

    public static ListenerManager getInstance()
    {
        return sInstance;
    }

    public void broadcastListener(String s)
    {
        if (mListenerMap.get(s) != null)
        {
            for (s = ((List)mListenerMap.get(s)).iterator(); s.hasNext(); ((ActionListener)s.next()).onActionPerformed()) { }
        }
    }

    public void broadcastListener(String s, Object obj)
    {
        if (mDataListenerMap.get(s) != null)
        {
            for (s = ((List)mDataListenerMap.get(s)).iterator(); s.hasNext(); ((DataActionListener)s.next()).onActionPerformed(obj)) { }
        }
    }

    public boolean isDataAvailable()
    {
        return dataAvailable;
    }

    public boolean isListenerAlreadyRegistered(ActionListener actionlistener, String s)
    {
        return mListenerMap.get(s) != null;
    }

    public void registerListener(ActionListener actionlistener, String s)
    {
        if (mListenerMap.get(s) == null)
        {
            mListenerMap.put(s, new ArrayList());
        }
        ((List)mListenerMap.get(s)).add(actionlistener);
    }

    public void registerListener(DataActionListener dataactionlistener, String s)
    {
        if (mDataListenerMap.get(s) == null)
        {
            mDataListenerMap.put(s, new ArrayList());
        }
        ((List)mDataListenerMap.get(s)).add(dataactionlistener);
    }

    public void setDataAvailable(boolean flag)
    {
        dataAvailable = flag;
    }

    public void unRegisterListener(String s)
    {
        mListenerMap.remove(s);
    }

    public void unRegisterListener(String s, ActionListener actionlistener)
    {
        if (mListenerMap.get(s) != null && ((List)mListenerMap.get(s)).contains(actionlistener))
        {
            ((List)mListenerMap.get(s)).remove(actionlistener);
        }
    }

    public void unRegisterListener(String s, DataActionListener dataactionlistener)
    {
        if (mDataListenerMap.get(s) != null && ((List)mDataListenerMap.get(s)).contains(dataactionlistener))
        {
            ((List)mDataListenerMap.get(s)).remove(dataactionlistener);
        }
    }

}
