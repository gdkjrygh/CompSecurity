// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import twitter4j.RateLimitStatus;
import twitter4j.TwitterResponse;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.internal.json:
//            RateLimitStatusJSONImpl, z_T4JInternalParseUtil

abstract class TwitterResponseImpl
    implements Serializable, TwitterResponse
{

    private static final long serialVersionUID = 0x9ae78473b6244585L;
    private transient int accessLevel;
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
        accessLevel = z_T4JInternalParseUtil.toAccessLevel(httpresponse);
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
