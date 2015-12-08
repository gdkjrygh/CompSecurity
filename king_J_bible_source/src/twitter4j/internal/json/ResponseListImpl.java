// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.util.ArrayList;
import twitter4j.RateLimitStatus;
import twitter4j.ResponseList;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            RateLimitStatusJSONImpl

class ResponseListImpl extends ArrayList
    implements ResponseList
{

    private static final long serialVersionUID = 0x4e5cd1029e2727a0L;
    private transient int accessLevel;
    private transient RateLimitStatus featureSpecificRateLimitStatus;
    private transient RateLimitStatus rateLimitStatus;

    ResponseListImpl(int i, HttpResponse httpresponse)
    {
        super(i);
        rateLimitStatus = null;
        featureSpecificRateLimitStatus = null;
        init(httpresponse);
    }

    ResponseListImpl(RateLimitStatus ratelimitstatus, RateLimitStatus ratelimitstatus1, int i)
    {
        rateLimitStatus = null;
        featureSpecificRateLimitStatus = null;
        rateLimitStatus = ratelimitstatus;
        featureSpecificRateLimitStatus = ratelimitstatus1;
        accessLevel = i;
    }

    ResponseListImpl(HttpResponse httpresponse)
    {
        rateLimitStatus = null;
        featureSpecificRateLimitStatus = null;
        init(httpresponse);
    }

    private void init(HttpResponse httpresponse)
    {
        rateLimitStatus = RateLimitStatusJSONImpl.createFromResponseHeader(httpresponse);
        featureSpecificRateLimitStatus = RateLimitStatusJSONImpl.createFeatureSpecificRateLimitStatusFromResponseHeader(httpresponse);
        accessLevel = z_T4JInternalParseUtil.toAccessLevel(httpresponse);
    }

    public int getAccessLevel()
    {
        return accessLevel;
    }

    public RateLimitStatus getFeatureSpecificRateLimitStatus()
    {
        return featureSpecificRateLimitStatus;
    }

    public RateLimitStatus getRateLimitStatus()
    {
        return rateLimitStatus;
    }
}
