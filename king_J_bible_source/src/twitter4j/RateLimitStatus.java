// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Date;

public interface RateLimitStatus
    extends Serializable
{

    public abstract int getHourlyLimit();

    public abstract int getRemainingHits();

    public abstract Date getResetTime();

    public abstract int getResetTimeInSeconds();

    public abstract int getSecondsUntilReset();
}
