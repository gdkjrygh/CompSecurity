// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            TwitterResponse, RateLimitStatusJSONImpl, ParseUtil, RateLimitStatus, 
//            HttpResponse

abstract class TwitterResponseImpl
    implements Serializable, TwitterResponse
{

    private static final long serialVersionUID = 0x6700d950500789e0L;
    private final transient int accessLevel;
    private transient RateLimitStatus rateLimitStatus;

    public TwitterResponseImpl()
    {
        rateLimitStatus = null;
        accessLevel = 0;
    }

    public TwitterResponseImpl(HttpResponse httpresponse)
    {
        rateLimitStatus = null;
        rateLimitStatus = RateLimitStatusJSONImpl.createFromResponseHeader(httpresponse);
        accessLevel = ParseUtil.toAccessLevel(httpresponse);
    }

    public int getAccessLevel()
    {
        return accessLevel;
    }

    public RateLimitStatus getRateLimitStatus()
    {
        return rateLimitStatus;
    }
}
