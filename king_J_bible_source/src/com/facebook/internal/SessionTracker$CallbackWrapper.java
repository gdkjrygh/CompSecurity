// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.facebook.internal:
//            SessionTracker

private class wrapped
    implements com.facebook.kWrapper
{

    final SessionTracker this$0;
    private final com.facebook.ion wrapped;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (wrapped != null && isTracking())
        {
            wrapped.wrapped(session, sessionstate, exception);
        }
        if (session == SessionTracker.access$1(SessionTracker.this) && sessionstate.isClosed())
        {
            setSession(null);
        }
    }

    public (com.facebook.kWrapper kwrapper)
    {
        this$0 = SessionTracker.this;
        super();
        wrapped = kwrapper;
    }
}
