// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Date;
import org.json.JSONObject;
import twitter4j.RateLimitStatus;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            DataObjectFactoryUtil

final class RateLimitStatusJSONImpl
    implements RateLimitStatus, Serializable
{

    private static final long serialVersionUID = 0xb8d1e8292f717f6L;
    private int hourlyLimit;
    private int remainingHits;
    private Date resetTime;
    private int resetTimeInSeconds;
    private int secondsUntilReset;

    private RateLimitStatusJSONImpl(int i, int j, int k, Date date)
    {
        hourlyLimit = i;
        remainingHits = j;
        resetTime = date;
        resetTimeInSeconds = k;
        secondsUntilReset = (int)((date.getTime() - System.currentTimeMillis()) / 1000L);
    }

    RateLimitStatusJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    RateLimitStatusJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    static RateLimitStatus createFeatureSpecificRateLimitStatusFromResponseHeader(HttpResponse httpresponse)
    {
        String s;
        if (httpresponse != null)
        {
            if ((s = httpresponse.getResponseHeader("X-FeatureRateLimit-Limit")) != null)
            {
                int i = Integer.parseInt(s);
                s = httpresponse.getResponseHeader("X-FeatureRateLimit-Remaining");
                if (s != null)
                {
                    int j = Integer.parseInt(s);
                    httpresponse = httpresponse.getResponseHeader("X-FeatureRateLimit-Reset");
                    if (httpresponse != null)
                    {
                        long l = Long.parseLong(httpresponse);
                        return new RateLimitStatusJSONImpl(i, j, (int)(l / 1000L), new Date(l * 1000L));
                    }
                }
            }
        }
        return null;
    }

    static RateLimitStatus createFromResponseHeader(HttpResponse httpresponse)
    {
        String s;
        if (httpresponse != null)
        {
            if ((s = httpresponse.getResponseHeader("X-RateLimit-Limit")) != null)
            {
                int i = Integer.parseInt(s);
                s = httpresponse.getResponseHeader("X-RateLimit-Remaining");
                if (s != null)
                {
                    int j = Integer.parseInt(s);
                    httpresponse = httpresponse.getResponseHeader("X-RateLimit-Reset");
                    if (httpresponse != null)
                    {
                        long l = Long.parseLong(httpresponse);
                        return new RateLimitStatusJSONImpl(i, j, (int)(l / 1000L), new Date(l * 1000L));
                    }
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof RateLimitStatusJSONImpl))
            {
                return false;
            }
            obj = (RateLimitStatusJSONImpl)obj;
            if (hourlyLimit != ((RateLimitStatusJSONImpl) (obj)).hourlyLimit)
            {
                return false;
            }
            if (remainingHits != ((RateLimitStatusJSONImpl) (obj)).remainingHits)
            {
                return false;
            }
            if (resetTimeInSeconds != ((RateLimitStatusJSONImpl) (obj)).resetTimeInSeconds)
            {
                return false;
            }
            if (secondsUntilReset != ((RateLimitStatusJSONImpl) (obj)).secondsUntilReset)
            {
                return false;
            }
            if (resetTime == null ? ((RateLimitStatusJSONImpl) (obj)).resetTime != null : !resetTime.equals(((RateLimitStatusJSONImpl) (obj)).resetTime))
            {
                return false;
            }
        }
        return true;
    }

    public int getHourlyLimit()
    {
        return hourlyLimit;
    }

    public int getRemainingHits()
    {
        return remainingHits;
    }

    public Date getResetTime()
    {
        return resetTime;
    }

    public int getResetTimeInSeconds()
    {
        return resetTimeInSeconds;
    }

    public int getSecondsUntilReset()
    {
        return secondsUntilReset;
    }

    public int hashCode()
    {
        int j = remainingHits;
        int k = hourlyLimit;
        int l = resetTimeInSeconds;
        int i1 = secondsUntilReset;
        int i;
        if (resetTime != null)
        {
            i = resetTime.hashCode();
        } else
        {
            i = 0;
        }
        return (((j * 31 + k) * 31 + l) * 31 + i1) * 31 + i;
    }

    void init(JSONObject jsonobject)
        throws TwitterException
    {
        hourlyLimit = z_T4JInternalParseUtil.getInt("hourly_limit", jsonobject);
        remainingHits = z_T4JInternalParseUtil.getInt("remaining_hits", jsonobject);
        resetTime = z_T4JInternalParseUtil.getDate("reset_time", jsonobject, "EEE MMM d HH:mm:ss Z yyyy");
        resetTimeInSeconds = z_T4JInternalParseUtil.getInt("reset_time_in_seconds", jsonobject);
        secondsUntilReset = (int)((resetTime.getTime() - System.currentTimeMillis()) / 1000L);
    }

    public String toString()
    {
        return "RateLimitStatusJSONImpl{remainingHits=" + remainingHits + ", hourlyLimit=" + hourlyLimit + ", resetTimeInSeconds=" + resetTimeInSeconds + ", secondsUntilReset=" + secondsUntilReset + ", resetTime=" + resetTime + '}';
    }
}
