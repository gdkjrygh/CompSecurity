// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import aof;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.facebook:
//            SessionDefaultAudience, SessionLoginBehavior

class authId
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final transient aof a;
    final String applicationId;
    final String authId;
    final SessionDefaultAudience defaultAudience;
    boolean isLegacy;
    boolean isRerequest;
    final SessionLoginBehavior loginBehavior;
    List permissions;
    final String previousAccessToken;
    final int requestCode;

    final boolean a()
    {
        return previousAccessToken != null && !isLegacy;
    }

    (SessionLoginBehavior sessionloginbehavior, int i, boolean flag, List list, SessionDefaultAudience sessiondefaultaudience, String s, String s1, 
            aof aof, String s2)
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
        a = aof;
        authId = s2;
    }
}
