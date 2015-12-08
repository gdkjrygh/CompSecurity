// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.EventObject;

// Referenced classes of package twitter4j:
//            RateLimitStatus

public final class RateLimitStatusEvent extends EventObject
{

    private static final long serialVersionUID = 0xdfa1449127ffe72eL;
    private boolean isAccountRateLimitStatus;
    private RateLimitStatus rateLimitStatus;

    RateLimitStatusEvent(Object obj, RateLimitStatus ratelimitstatus, boolean flag)
    {
        super(obj);
        rateLimitStatus = ratelimitstatus;
        isAccountRateLimitStatus = flag;
    }

    public final RateLimitStatus getRateLimitStatus()
    {
        return rateLimitStatus;
    }

    public final boolean isAccountRateLimitStatus()
    {
        return isAccountRateLimitStatus;
    }

    public final boolean isIPRateLimitStatus()
    {
        return !isAccountRateLimitStatus;
    }
}
