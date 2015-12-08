// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook:
//            AccessToken, AccessTokenSource

private static class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0xdd772aee317ab613L;
    private final Date expires;
    private final Date lastRefresh;
    private final List permissions;
    private final AccessTokenSource source;
    private final String token;

    private Object readResolve()
    {
        return new AccessToken(token, expires, permissions, source, lastRefresh);
    }

    private (String s, Date date, List list, AccessTokenSource accesstokensource, Date date1)
    {
        expires = date;
        permissions = list;
        token = s;
        source = accesstokensource;
        lastRefresh = date1;
    }

    lastRefresh(String s, Date date, List list, AccessTokenSource accesstokensource, Date date1, lastRefresh lastrefresh)
    {
        this(s, date, list, accesstokensource, date1);
    }
}
