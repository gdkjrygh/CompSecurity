// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            RateLimitStatusEvent

public interface RateLimitStatusListener
{

    public abstract void onRateLimitReached(RateLimitStatusEvent ratelimitstatusevent);

    public abstract void onRateLimitStatus(RateLimitStatusEvent ratelimitstatusevent);
}
