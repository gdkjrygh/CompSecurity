// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.EventObject;

// Referenced classes of package twitter4j:
//            RateLimitStatus

public final class RateLimitStatusEvent extends EventObject
{

    private static final long serialVersionUID = 0x34086d57354c712eL;
    private final boolean isAccountRateLimitStatus;
    private final RateLimitStatus rateLimitStatus;

    RateLimitStatusEvent(Object obj, RateLimitStatus ratelimitstatus, boolean flag)
    {
        super(obj);
        rateLimitStatus = ratelimitstatus;
        isAccountRateLimitStatus = flag;
    }

    public RateLimitStatus getRateLimitStatus()
    {
        return rateLimitStatus;
    }

    public boolean isAccountRateLimitStatus()
    {
        return isAccountRateLimitStatus;
    }

    public boolean isIPRateLimitStatus()
    {
        return !isAccountRateLimitStatus;
    }
}
