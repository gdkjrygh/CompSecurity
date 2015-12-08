// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.openidconnect;

import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import java.util.Collection;

// Referenced classes of package com.google.api.client.auth.openidconnect:
//            IdTokenVerifier

public static class acceptableTimeSkewSeconds
{

    long acceptableTimeSkewSeconds;
    Collection audience;
    Clock clock;
    String issuer;

    public IdTokenVerifier build()
    {
        return new IdTokenVerifier(this);
    }

    public final long getAcceptableTimeSkewSeconds()
    {
        return acceptableTimeSkewSeconds;
    }

    public final Collection getAudience()
    {
        return audience;
    }

    public final Clock getClock()
    {
        return clock;
    }

    public final String getIssuer()
    {
        return issuer;
    }

    public issuer setAcceptableTimeSkewSeconds(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        acceptableTimeSkewSeconds = l;
        return this;
    }

    public acceptableTimeSkewSeconds setAudience(Collection collection)
    {
        audience = collection;
        return this;
    }

    public audience setClock(Clock clock1)
    {
        clock = (Clock)Preconditions.checkNotNull(clock1);
        return this;
    }

    public clock setIssuer(String s)
    {
        issuer = s;
        return this;
    }

    public ()
    {
        clock = Clock.SYSTEM;
        acceptableTimeSkewSeconds = 300L;
    }
}
