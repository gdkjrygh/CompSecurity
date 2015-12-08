// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.openidconnect;

import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.api.client.auth.openidconnect:
//            IdToken

public class IdTokenVerifier
{
    public static class Builder
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

        public Builder setAcceptableTimeSkewSeconds(long l)
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

        public Builder setAudience(Collection collection)
        {
            audience = collection;
            return this;
        }

        public Builder setClock(Clock clock1)
        {
            clock = (Clock)Preconditions.checkNotNull(clock1);
            return this;
        }

        public Builder setIssuer(String s)
        {
            issuer = s;
            return this;
        }

        public Builder()
        {
            clock = Clock.SYSTEM;
            acceptableTimeSkewSeconds = 300L;
        }
    }


    public static final long DEFAULT_TIME_SKEW_SECONDS = 300L;
    private final long acceptableTimeSkewSeconds;
    private final Collection audience;
    private final Clock clock;
    private final String issuer;

    public IdTokenVerifier()
    {
        this(new Builder());
    }

    protected IdTokenVerifier(Builder builder)
    {
        clock = builder.clock;
        acceptableTimeSkewSeconds = builder.acceptableTimeSkewSeconds;
        issuer = builder.issuer;
        if (builder.audience == null)
        {
            builder = null;
        } else
        {
            builder = Collections.unmodifiableCollection(builder.audience);
        }
        audience = builder;
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

    public boolean verify(IdToken idtoken)
    {
        return (issuer == null || idtoken.verifyIssuer(issuer)) && (audience == null || idtoken.verifyAudience(audience)) && idtoken.verifyTime(clock.currentTimeMillis(), acceptableTimeSkewSeconds);
    }
}
