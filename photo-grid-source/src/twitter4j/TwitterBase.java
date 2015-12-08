// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            RateLimitStatusListener

public interface TwitterBase
{

    public abstract void addRateLimitStatusListener(RateLimitStatusListener ratelimitstatuslistener);

    public abstract Authorization getAuthorization();

    public abstract Configuration getConfiguration();

    public abstract long getId();

    public abstract String getScreenName();

    public abstract void shutdown();
}
