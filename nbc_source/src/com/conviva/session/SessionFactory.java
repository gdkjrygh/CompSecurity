// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.session;

import com.conviva.ConvivaContentInfo;
import com.conviva.utils.PlatformUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.conviva.session:
//            Session

public class SessionFactory
{

    private int _nextSessionId;
    private Map _sessionsById;
    private PlatformUtils _utils;

    public SessionFactory()
        throws Exception
    {
        _nextSessionId = 0;
        _sessionsById = null;
        _utils = null;
        _utils = PlatformUtils.getInstance();
        _nextSessionId = 0;
        _sessionsById = new HashMap();
    }

    public void cleanup()
    {
        if (_sessionsById != null)
        {
            for (Iterator iterator = _sessionsById.entrySet().iterator(); iterator.hasNext(); cleanupSession(((Integer)((java.util.Map.Entry)iterator.next()).getKey()).intValue())) { }
        }
        _sessionsById = null;
        _nextSessionId = 0;
    }

    public void cleanupSession(int i)
    {
        Session session = (Session)_sessionsById.get(Integer.valueOf(i));
        if (session != null)
        {
            _sessionsById.remove(Integer.valueOf(i));
            _utils.log((new StringBuilder()).append("session id(").append(i).append(") is cleaned up and removed from sessionFactory").toString());
            session.cleanup();
        }
    }

    public Session getSession(int i)
    {
        return (Session)_sessionsById.get(Integer.valueOf(i));
    }

    public Session makeSession(Object obj, ConvivaContentInfo convivacontentinfo, Map map, int i, boolean flag)
        throws Exception
    {
        obj = new Session(obj, convivacontentinfo, map, flag);
        _sessionsById.put(Integer.valueOf(i), obj);
        _utils.log("Session is created; session is about to start");
        ((Session) (obj)).start();
        return ((Session) (obj));
    }

    public int newSessionId()
    {
        int i = _nextSessionId;
        _nextSessionId = _nextSessionId + 1;
        return i;
    }
}
