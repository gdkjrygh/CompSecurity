// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.facebook:
//            SessionDefaultAudience, SessionLoginBehavior

class authId
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final String applicationId;
    private final String authId;
    private final SessionDefaultAudience defaultAudience;
    private boolean isLegacy;
    private boolean isRerequest;
    private final SessionLoginBehavior loginBehavior;
    private List permissions;
    private final String previousAccessToken;
    private final int requestCode;
    private final transient  startActivityDelegate;

    String getApplicationId()
    {
        return applicationId;
    }

    String getAuthId()
    {
        return authId;
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

    boolean isRerequest()
    {
        return isRerequest;
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

    void setRerequest(boolean flag)
    {
        isRerequest = flag;
    }

    (SessionLoginBehavior sessionloginbehavior, int i, boolean flag, List list, SessionDefaultAudience sessiondefaultaudience, String s, String s1, 
             , String s2)
    {
        isLegacy = false;
        isRerequest = false;
        loginBehavior = sessionloginbehavior;
        requestCode = i;
        isLegacy = flag;
        permissions = list;
        defaultAudience = sessiondefaultaudience;
        applicationId = s;
        previousAccessToken = s1;
        startActivityDelegate = ;
        authId = s2;
    }
}
