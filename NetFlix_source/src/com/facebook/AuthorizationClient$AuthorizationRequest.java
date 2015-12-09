// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.facebook:
//            AuthorizationClient, SessionDefaultAudience, SessionLoginBehavior

static class startActivityDelegate
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String applicationId;
    private SessionDefaultAudience defaultAudience;
    private boolean isLegacy;
    private SessionLoginBehavior loginBehavior;
    private List permissions;
    private String previousAccessToken;
    private int requestCode;
    private final transient  startActivityDelegate;

    String getApplicationId()
    {
        return applicationId;
    }

    SessionDefaultAudience getDefaultAudience()
    {
        return defaultAudience;
    }

    SessionLoginBehavior getLoginBehavior()
    {
        return loginBehavior;
    }

    List getPermissions()
    {
        return permissions;
    }

    String getPreviousAccessToken()
    {
        return previousAccessToken;
    }

    int getRequestCode()
    {
        return requestCode;
    }

     getStartActivityDelegate()
    {
        return startActivityDelegate;
    }

    boolean isLegacy()
    {
        return isLegacy;
    }

    boolean needsNewTokenValidation()
    {
        return previousAccessToken != null && !isLegacy;
    }

    void setIsLegacy(boolean flag)
    {
        isLegacy = flag;
    }

    void setPermissions(List list)
    {
        permissions = list;
    }

    (SessionLoginBehavior sessionloginbehavior, int i, boolean flag, List list, SessionDefaultAudience sessiondefaultaudience, String s, String s1, 
             )
    {
        isLegacy = false;
        loginBehavior = sessionloginbehavior;
        requestCode = i;
        isLegacy = flag;
        permissions = list;
        defaultAudience = sessiondefaultaudience;
        applicationId = s;
        previousAccessToken = s1;
        startActivityDelegate = ;
    }
}
