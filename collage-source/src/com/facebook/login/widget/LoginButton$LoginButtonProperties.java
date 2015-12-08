// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.Utility;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

static class loginBehavior
{

    private LoginAuthorizationType authorizationType;
    private DefaultAudience defaultAudience;
    private LoginBehavior loginBehavior;
    private List permissions;

    public void clearPermissions()
    {
        permissions = null;
        authorizationType = null;
    }

    public DefaultAudience getDefaultAudience()
    {
        return defaultAudience;
    }

    public LoginBehavior getLoginBehavior()
    {
        return loginBehavior;
    }

    List getPermissions()
    {
        return permissions;
    }

    public void setDefaultAudience(DefaultAudience defaultaudience)
    {
        defaultAudience = defaultaudience;
    }

    public void setLoginBehavior(LoginBehavior loginbehavior)
    {
        loginBehavior = loginbehavior;
    }

    public void setPublishPermissions(List list)
    {
        if (LoginAuthorizationType.READ.equals(authorizationType))
        {
            throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
        }
        if (Utility.isNullOrEmpty(list))
        {
            throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
        } else
        {
            permissions = list;
            authorizationType = LoginAuthorizationType.PUBLISH;
            return;
        }
    }

    public void setReadPermissions(List list)
    {
        if (LoginAuthorizationType.PUBLISH.equals(authorizationType))
        {
            throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
        } else
        {
            permissions = list;
            authorizationType = LoginAuthorizationType.READ;
            return;
        }
    }



    A()
    {
        defaultAudience = DefaultAudience.FRIENDS;
        permissions = Collections.emptyList();
        authorizationType = null;
        loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
    }
}
