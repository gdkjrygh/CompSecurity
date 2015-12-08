// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.util.Log;
import com.facebook.Session;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionLoginBehavior;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.Utility;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.widget:
//            LoginButton

static class loginBehavior
{

    private SessionAuthorizationType authorizationType;
    private SessionDefaultAudience defaultAudience;
    private SessionLoginBehavior loginBehavior;
    private sessionStatusCallback onErrorListener;
    private List permissions;
    private com.facebook. sessionStatusCallback;

    private boolean validatePermissions(List list, SessionAuthorizationType sessionauthorizationtype, Session session)
    {
        if (SessionAuthorizationType.PUBLISH.equals(sessionauthorizationtype) && Utility.isNullOrEmpty(list))
        {
            throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
        }
        if (session != null && session.isOpened() && !Utility.isSubset(list, session.getPermissions()))
        {
            Log.e(LoginButton.access$0(), "Cannot set additional permissions when session is already open.");
            return false;
        } else
        {
            return true;
        }
    }

    public void clearPermissions()
    {
        permissions = null;
        authorizationType = null;
    }

    public SessionDefaultAudience getDefaultAudience()
    {
        return defaultAudience;
    }

    public SessionLoginBehavior getLoginBehavior()
    {
        return loginBehavior;
    }

    public loginBehavior getOnErrorListener()
    {
        return onErrorListener;
    }

    List getPermissions()
    {
        return permissions;
    }

    public com.facebook.erties getSessionStatusCallback()
    {
        return sessionStatusCallback;
    }

    public void setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
    {
        defaultAudience = sessiondefaultaudience;
    }

    public void setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
    {
        loginBehavior = sessionloginbehavior;
    }

    public void setOnErrorListener(loginBehavior loginbehavior)
    {
        onErrorListener = loginbehavior;
    }

    public void setPublishPermissions(List list, Session session)
    {
        if (SessionAuthorizationType.READ.equals(authorizationType))
        {
            throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
        }
        if (validatePermissions(list, SessionAuthorizationType.PUBLISH, session))
        {
            permissions = list;
            authorizationType = SessionAuthorizationType.PUBLISH;
        }
    }

    public void setReadPermissions(List list, Session session)
    {
        if (SessionAuthorizationType.PUBLISH.equals(authorizationType))
        {
            throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
        }
        if (validatePermissions(list, SessionAuthorizationType.READ, session))
        {
            permissions = list;
            authorizationType = SessionAuthorizationType.READ;
        }
    }

    public void setSessionStatusCallback(com.facebook.erties erties)
    {
        sessionStatusCallback = erties;
    }







    ()
    {
        defaultAudience = SessionDefaultAudience.FRIENDS;
        permissions = Collections.emptyList();
        authorizationType = null;
        loginBehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;
    }
}
