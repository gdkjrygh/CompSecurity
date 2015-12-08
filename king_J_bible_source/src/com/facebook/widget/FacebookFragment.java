// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.Session;
import com.facebook.SessionLoginBehavior;
import com.facebook.SessionState;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.SessionTracker;
import java.util.Date;
import java.util.List;

class FacebookFragment extends Fragment
{
    private class DefaultSessionStatusCallback
        implements com.facebook.Session.StatusCallback
    {

        final FacebookFragment this$0;

        public void call(Session session, SessionState sessionstate, Exception exception)
        {
            onSessionStateChange(sessionstate, exception);
        }

        private DefaultSessionStatusCallback()
        {
            this$0 = FacebookFragment.this;
            super();
        }

        DefaultSessionStatusCallback(DefaultSessionStatusCallback defaultsessionstatuscallback)
        {
            this();
        }
    }


    private SessionTracker sessionTracker;

    FacebookFragment()
    {
    }

    private void openSession(String s, List list, SessionLoginBehavior sessionloginbehavior, int i, SessionAuthorizationType sessionauthorizationtype)
    {
        Session session;
label0:
        {
label1:
            {
label2:
                {
                    if (sessionTracker == null)
                    {
                        break label1;
                    }
                    Session session1 = sessionTracker.getSession();
                    if (session1 != null)
                    {
                        session = session1;
                        if (!session1.getState().isClosed())
                        {
                            break label2;
                        }
                    }
                    session = (new com.facebook.Session.Builder(getActivity())).setApplicationId(s).build();
                    Session.setActiveSession(session);
                }
                if (!session.isOpened())
                {
                    s = (new com.facebook.Session.OpenRequest(this)).setPermissions(list).setLoginBehavior(sessionloginbehavior).setRequestCode(i);
                    if (!SessionAuthorizationType.PUBLISH.equals(sessionauthorizationtype))
                    {
                        break label0;
                    }
                    session.openForPublish(s);
                }
            }
            return;
        }
        session.openForRead(s);
    }

    protected final void closeSession()
    {
        if (sessionTracker != null)
        {
            Session session = sessionTracker.getOpenSession();
            if (session != null)
            {
                session.close();
            }
        }
    }

    protected final void closeSessionAndClearTokenInformation()
    {
        if (sessionTracker != null)
        {
            Session session = sessionTracker.getOpenSession();
            if (session != null)
            {
                session.closeAndClearTokenInformation();
            }
        }
    }

    protected final String getAccessToken()
    {
        Object obj = null;
        String s = obj;
        if (sessionTracker != null)
        {
            Session session = sessionTracker.getOpenSession();
            s = obj;
            if (session != null)
            {
                s = session.getAccessToken();
            }
        }
        return s;
    }

    protected final Date getExpirationDate()
    {
        Object obj = null;
        Date date = obj;
        if (sessionTracker != null)
        {
            Session session = sessionTracker.getOpenSession();
            date = obj;
            if (session != null)
            {
                date = session.getExpirationDate();
            }
        }
        return date;
    }

    protected final Session getSession()
    {
        if (sessionTracker != null)
        {
            return sessionTracker.getSession();
        } else
        {
            return null;
        }
    }

    protected final List getSessionPermissions()
    {
        Object obj = null;
        List list = obj;
        if (sessionTracker != null)
        {
            Session session = sessionTracker.getSession();
            list = obj;
            if (session != null)
            {
                list = session.getPermissions();
            }
        }
        return list;
    }

    protected final SessionState getSessionState()
    {
        Object obj = null;
        SessionState sessionstate = obj;
        if (sessionTracker != null)
        {
            Session session = sessionTracker.getSession();
            sessionstate = obj;
            if (session != null)
            {
                sessionstate = session.getState();
            }
        }
        return sessionstate;
    }

    protected final boolean isSessionOpen()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (sessionTracker != null)
        {
            flag = flag1;
            if (sessionTracker.getOpenSession() != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        sessionTracker = new SessionTracker(getActivity(), new DefaultSessionStatusCallback(null));
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        sessionTracker.getSession().onActivityResult(getActivity(), i, j, intent);
    }

    public void onDestroy()
    {
        super.onDestroy();
        sessionTracker.stopTracking();
    }

    protected void onSessionStateChange(SessionState sessionstate, Exception exception)
    {
    }

    protected final void openSession()
    {
        openSessionForRead(null, null);
    }

    protected final void openSessionForPublish(String s, List list)
    {
        openSessionForPublish(s, list, SessionLoginBehavior.SSO_WITH_FALLBACK, 64206);
    }

    protected final void openSessionForPublish(String s, List list, SessionLoginBehavior sessionloginbehavior, int i)
    {
        openSession(s, list, sessionloginbehavior, i, SessionAuthorizationType.PUBLISH);
    }

    protected final void openSessionForRead(String s, List list)
    {
        openSessionForRead(s, list, SessionLoginBehavior.SSO_WITH_FALLBACK, 64206);
    }

    protected final void openSessionForRead(String s, List list, SessionLoginBehavior sessionloginbehavior, int i)
    {
        openSession(s, list, sessionloginbehavior, i, SessionAuthorizationType.READ);
    }

    public void setSession(Session session)
    {
        if (sessionTracker != null)
        {
            sessionTracker.setSession(session);
        }
    }
}
