// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

public interface RateLimitStatus
    extends Serializable
{

    public abstract int getLimit();

    public abstract int getRemaining();

    public abstract int getRemainingHits();

    public abstract int getResetTimeInSeconds();

    public abstract int getSecondsUntilReset();
}
