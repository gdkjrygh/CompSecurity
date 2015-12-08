// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.Utility;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

class loginBehavior
{

    private LoginAuthorizationType authorizationType;
    private DefaultAudience defaultAudience;
    private LoginBehavior loginBehavior;
    private List permissions;

    private boolean validatePermissions(List list, LoginAuthorizationType loginauthorizationtype)
    {
        if (LoginAuthorizationType.PUBLISH.equals(loginauthorizationtype) && Utility.isNullOrEmpty(list))
        {
            throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
        }
        loginauthorizationtype = AccessToken.getCurrentAccessToken();
        if (loginauthorizationtype != null && !Utility.isSubset(list, loginauthorizationtype.getPermissions()))
        {
            Log.e(LoginButton.access$000(), "Cannot set additional permissions with existing AccessToken.");
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
        if (validatePermissions(list, LoginAuthorizationType.PUBLISH))
        {
            permissions = list;
            authorizationType = LoginAuthorizationType.PUBLISH;
        }
    }

    public void setReadPermissions(List list)
    {
        if (LoginAuthorizationType.PUBLISH.equals(authorizationType))
        {
            throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
        }
        if (validatePermissions(list, LoginAuthorizationType.READ))
        {
            permissions = list;
            authorizationType = LoginAuthorizationType.READ;
        }
    }



    A()
    {
        defaultAudience = DefaultAudience.FRIENDS;
        permissions = Collections.emptyList();
        authorizationType = null;
        loginBehavior = LoginBehavior.SSO_WITH_FALLBACK;
    }
}
