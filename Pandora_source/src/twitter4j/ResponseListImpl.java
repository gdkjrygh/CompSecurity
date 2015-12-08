// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.ArrayList;

// Referenced classes of package twitter4j:
//            ResponseList, RateLimitStatusJSONImpl, ParseUtil, RateLimitStatus, 
//            HttpResponse

class ResponseListImpl extends ArrayList
    implements ResponseList
{

    private static final long serialVersionUID = 0x7e5ed61656096958L;
    private transient int accessLevel;
    private transient RateLimitStatus rateLimitStatus;

    ResponseListImpl(int i, HttpResponse httpresponse)
    {
        super(i);
        rateLimitStatus = null;
        init(httpresponse);
    }

    ResponseListImpl(HttpResponse httpresponse)
    {
        rateLimitStatus = null;
        init(httpresponse);
    }

    ResponseListImpl(RateLimitStatus ratelimitstatus, int i)
    {
        rateLimitStatus = null;
        rateLimitStatus = ratelimitstatus;
        accessLevel = i;
    }

    private void init(HttpResponse httpresponse)
    {
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
