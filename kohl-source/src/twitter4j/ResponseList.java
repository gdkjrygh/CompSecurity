// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.List;

// Referenced classes of package twitter4j:
//            TwitterResponse, RateLimitStatus

public interface ResponseList
    extends TwitterResponse, List
{

    public abstract RateLimitStatus getRateLimitStatus();
}
