// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.util.ArrayList;
import twitter4j.RateLimitStatus;
import twitter4j.ResponseList;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.internal.json:
//            RateLimitStatusJSONImpl, z_T4JInternalParseUtil

class ResponseListImpl extends ArrayList
    implements ResponseList
{

    private static final long serialVersionUID = 0x4e5cd1029e2727a0L;
    private transient int accessLevel;
    private transient RateLimitStatus rateLimitStatus;

    ResponseListImpl(int i, HttpResponse httpresponse)
    {
        super(i);
        rateLimitStatus = null;
        init(httpresponse);
    }

    ResponseListImpl(RateLimitStatus ratelimitstatus, int i)
    {
        rateLimitStatus = null;
        rateLimitStatus = ratelimitstatus;
        accessLevel = i;
    }

    ResponseListImpl(HttpResponse httpresponse)
    {
        rateLimitStatus = null;
        init(httpresponse);
    }

    private void init(HttpResponse httpresponse)
    {
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
