// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import org.json.JSONObject;
import twitter4j.PagableResponseList;
import twitter4j.RateLimitStatus;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            ResponseListImpl

class PagableResponseListImpl extends ResponseListImpl
    implements PagableResponseList
{

    private static final long serialVersionUID = 0x154294b63421ddc1L;
    private final long nextCursor;
    private final long previousCursor;

    PagableResponseListImpl(int i, JSONObject jsonobject, HttpResponse httpresponse)
    {
        super(i, httpresponse);
        previousCursor = z_T4JInternalParseUtil.getLong("previous_cursor", jsonobject);
        nextCursor = z_T4JInternalParseUtil.getLong("next_cursor", jsonobject);
    }

    PagableResponseListImpl(RateLimitStatus ratelimitstatus, RateLimitStatus ratelimitstatus1, int i)
    {
        super(ratelimitstatus, ratelimitstatus1, i);
        previousCursor = 0L;
        nextCursor = 0L;
    }

    public long getNextCursor()
    {
        return nextCursor;
    }

    public long getPreviousCursor()
    {
        return previousCursor;
    }

    public boolean hasNext()
    {
        return 0L != nextCursor;
    }

    public boolean hasPrevious()
    {
        return 0L != previousCursor;
    }
}
