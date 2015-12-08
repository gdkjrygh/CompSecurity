// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.facebook:
//            Session, SessionLoginBehavior

private static class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0x8697a02191312db1L;
    private final String applicationId;
    private final String defaultAudience;
    private boolean isLegacy;
    private final SessionLoginBehavior loginBehavior;
    private final List permissions;
    private final int requestCode;
    private final String validateSameFbidAsToken;

    private Object readResolve()
    {
        return new <init>(loginBehavior, requestCode, permissions, defaultAudience, isLegacy, applicationId, validateSameFbidAsToken, null);
    }

    private (SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2)
    {
        loginBehavior = sessionloginbehavior;
        requestCode = i;
        permissions = list;
        defaultAudience = s;
        isLegacy = flag;
        applicationId = s1;
        validateSameFbidAsToken = s2;
    }

    validateSameFbidAsToken(SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2, 
            validateSameFbidAsToken validatesamefbidastoken)
    {
        this(sessionloginbehavior, i, list, s, flag, s1, s2);
    }
}
