// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.Session;
import com.facebook.SessionState;

public class SessionTracker
{
    private class ActiveSessionBroadcastReceiver extends BroadcastReceiver
    {

        final SessionTracker this$0;

        public void onReceive(Context context, Intent intent)
        {
            if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(intent.getAction()))
            {
                context = Session.getActiveSession();
                if (context != null)
                {
                    context.addCallback(callback);
                }
            }
        }

        private ActiveSessionBroadcastReceiver()
        {
            this$0 = SessionTracker.this;
            super();
        }

        ActiveSessionBroadcastReceiver(ActiveSessionBroadcastReceiver activesessionbroadcastreceiver)
        {
            this();
        }
    }

    private class CallbackWrapper
        implements com.facebook.Session.StatusCallback
    {

        final SessionTracker this$0;
        private final com.facebook.Session.StatusCallback wrapped;

        public void call(Session session1, SessionState sessionstate, Exception exception)
        {
            if (wrapped != null && isTracking())
            {
                wrapped.call(session1, sessionstate, exception);
            }
            if (session1 == session && sessionstate.isClosed())
            {
                setSession(null);
            }
        }

        public CallbackWrapper(com.facebook.Session.StatusCallback statuscallback)
        {
            this$0 = SessionTracker.this;
            super();
            wrapped = statuscallback;
        }
    }


    private final LocalBroadcastManager broadcastManager;
    private final com.facebook.Session.StatusCallback callback;
    private boolean isTracking;
    private final BroadcastReceiver receiver;
    private Session session;

    public SessionTracker(Context context, com.facebook.Session.StatusCallback statuscallback)
    {
        this(context, statuscallback, null);
    }

    SessionTracker(Context context, com.facebook.Session.StatusCallback statuscallback, Session session1)
    {
        this(context, statuscallback, session1, true);
    }

    public SessionTracker(Context context, com.facebook.Session.StatusCallback statuscallback, Session session1, boolean flag)
    {
        isTracking = false;
        callback = new CallbackWrapper(statuscallback);
        session = session1;
        receiver = new ActiveSessionBroadcastReceiver(null);
        broadcastManager = LocalBroadcastManager.getInstance(context);
        if (flag)
        {
            startTracking();
        }
    }

    private void addBroadcastReceiver()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_SET");
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        broadcastManager.registerReceiver(receiver, intentfilter);
    }

    public Session getOpenSession()
    {
        Session session1 = getSession();
        if (session1 != null && session1.isOpened())
        {
            return session1;
        } else
        {
            return null;
        }
    }

    public Session getSession()
    {
        if (session == null)
        {
            return Session.getActiveSession();
        } else
        {
            return session;
        }
    }

    public boolean isTracking()
    {
        return isTracking;
    }

    public boolean isTrackingActiveSession()
    {
        return session == null;
    }

    public void setSession(Session session1)
    {
        if (session1 == null)
        {
            if (session != null)
            {
                session.removeCallback(callback);
                session = null;
                addBroadcastReceiver();
                if (getSession() != null)
                {
                    getSession().addCallback(callback);
                }
            }
            return;
        }
        if (session == null)
        {
            Session session2 = Session.getActiveSession();
            if (session2 != null)
            {
                session2.removeCallback(callback);
            }
            broadcastManager.unregisterReceiver(receiver);
        } else
        {
            session.removeCallback(callback);
        }
        session = session1;
        session.addCallback(callback);
    }

    public void startTracking()
    {
        if (isTracking)
        {
            return;
        }
        if (session == null)
        {
            addBroadcastReceiver();
        }
        if (getSession() != null)
        {
            getSession().addCallback(callback);
        }
        isTracking = true;
    }

    public void stopTracking()
    {
        if (!isTracking)
        {
            return;
        }
        Session session1 = getSession();
        if (session1 != null)
        {
            session1.removeCallback(callback);
        }
        broadcastManager.unregisterReceiver(receiver);
        isTracking = false;
    }


}
