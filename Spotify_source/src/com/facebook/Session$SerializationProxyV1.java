// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.facebook:
//            Session, SessionState, AccessToken

class pendingAuthorizationRequest
    implements Serializable
{

    private static final long serialVersionUID = 0x6a59fe98cd935affL;
    private final String applicationId;
    private final Date lastAttemptedTokenExtendDate;
    private final pendingAuthorizationRequest pendingAuthorizationRequest;
    private final boolean shouldAutoPublish = false;
    private final SessionState state;
    private final AccessToken tokenInfo;

    private Object readResolve()
    {
        return new Session(applicationId, state, tokenInfo, lastAttemptedTokenExtendDate, pendingAuthorizationRequest, (byte)0);
    }

    (String s, SessionState sessionstate, AccessToken accesstoken, Date date,  )
    {
        applicationId = s;
        state = sessionstate;
        tokenInfo = accesstoken;
        lastAttemptedTokenExtendDate = date;
        pendingAuthorizationRequest = ;
    }
}
