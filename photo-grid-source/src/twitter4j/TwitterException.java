// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.http.HttpResponseCode;
import twitter4j.internal.json.z_T4JInternalJSONImplFactory;
import twitter4j.internal.json.z_T4JInternalParseUtil;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j:
//            TwitterResponse, ExceptionDiagnosis, RateLimitStatus, Version

public class TwitterException extends Exception
    implements TwitterResponse, HttpResponseCode
{

    private static final String FILTER[] = {
        "twitter4j"
    };
    private static final long serialVersionUID = 0xdb9822202e937df9L;
    private int errorCode;
    private String errorMessage;
    private ExceptionDiagnosis exceptionDiagnosis;
    boolean nested;
    private HttpResponse response;
    private int statusCode;

    public TwitterException(Exception exception)
    {
        this(exception.getMessage(), ((Throwable) (exception)));
        if (exception instanceof TwitterException)
        {
            ((TwitterException)exception).setNested();
        }
    }

    public TwitterException(String s)
    {
        this(s, ((Throwable) (null)));
    }

    public TwitterException(String s, Exception exception, int i)
    {
        this(s, ((Throwable) (exception)));
        statusCode = i;
    }

    public TwitterException(String s, Throwable throwable)
    {
        super(s, throwable);
        statusCode = -1;
        errorCode = -1;
        exceptionDiagnosis = null;
        errorMessage = null;
        nested = false;
        decode(s);
    }

    public TwitterException(String s, HttpResponse httpresponse)
    {
        this(s);
        response = httpresponse;
        statusCode = httpresponse.getStatusCode();
    }

    private void decode(String s)
    {
        if (s == null || !s.startsWith("{"))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        s = new JSONObject(s);
        if (!s.isNull("errors"))
        {
            s = s.getJSONArray("errors").getJSONObject(0);
            errorMessage = s.getString("message");
            errorCode = z_T4JInternalParseUtil.getInt("code", s);
        }
        return;
        s;
    }

    private static String getCause(int i)
    {
        i;
        JVM INSTR lookupswitch 13: default 116
    //                   304: 143
    //                   400: 149
    //                   401: 155
    //                   403: 161
    //                   404: 167
    //                   406: 173
    //                   420: 179
    //                   422: 185
    //                   429: 191
    //                   500: 197
    //                   502: 203
    //                   503: 209
    //                   504: 215;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        String s = "";
_L16:
        return (new StringBuilder()).append(i).append(":").append(s).toString();
_L2:
        s = "There was no new data to return.";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "The request was invalid. An accompanying error message will explain why. This is the status code will be returned during version 1.0 rate limiting(https://dev.twitter.com/pages/rate-limiting). In API v1.1, a request without authentication is considered invalid and you will get this response.";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "Authentication credentials (https://dev.twitter.com/pages/auth) were missing or incorrect. Ensure that you have set valid consumer key/secret, access token/secret, and the system clock is in sync.";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "The request is understood, but it has been refused. An accompanying error message will explain why. This code is used when requests are being denied due to update limits (https://support.twitter.com/articles/15364-about-twitter-limits-update-api-dm-and-following).";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "The URI requested is invalid or the resource requested, such as a user, does not exists. Also returned when the requested format is not supported by the requested method.";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "Returned by the Search API when an invalid format is specified in the request.\nReturned by the Streaming API when one or more of the parameters are not suitable for the resource. The track parameter, for example, would throw this error if:\n The track keyword is too long or too short.\n The bounding box specified is invalid.\n No predicates defined for filtered resource, for example, neither track nor follow parameter defined.\n Follow userid cannot be read.";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "Returned by the Search and Trends API when you are being rate limited (https://dev.twitter.com/docs/rate-limiting).\nReturned by the Streaming API:\n Too many login attempts in a short period of time.\n Running too many copies of the same application authenticating with the same account name.";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "Returned when an image uploaded to POST account/update_profile_banner(https://dev.twitter.com/docs/api/1/post/account/update_profile_banner) is unable to be processed.";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "Returned in API v1.1 when a request cannot be served due to the application's rate limit having been exhausted for the resource. See Rate Limiting in API v1.1.(https://dev.twitter.com/docs/rate-limiting/1.1)";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "Something is broken. Please post to the group (https://dev.twitter.com/docs/support) so the Twitter team can investigate.";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "Twitter is down or being upgraded.";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "The Twitter servers are up, but overloaded with requests. Try again later.";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "The Twitter servers are up, but the request couldn't be serviced due to some failure within our stack. Try again later.";
        if (true) goto _L16; else goto _L15
_L15:
    }

    private ExceptionDiagnosis getExceptionDiagnosis()
    {
        if (exceptionDiagnosis == null)
        {
            exceptionDiagnosis = new ExceptionDiagnosis(this, FILTER);
        }
        return exceptionDiagnosis;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TwitterException)obj;
            if (errorCode != ((TwitterException) (obj)).errorCode)
            {
                return false;
            }
            if (nested != ((TwitterException) (obj)).nested)
            {
                return false;
            }
            if (statusCode != ((TwitterException) (obj)).statusCode)
            {
                return false;
            }
            if (errorMessage == null ? ((TwitterException) (obj)).errorMessage != null : !errorMessage.equals(((TwitterException) (obj)).errorMessage))
            {
                return false;
            }
            if (exceptionDiagnosis == null ? ((TwitterException) (obj)).exceptionDiagnosis != null : !exceptionDiagnosis.equals(((TwitterException) (obj)).exceptionDiagnosis))
            {
                return false;
            }
            if (response == null ? ((TwitterException) (obj)).response != null : !response.equals(((TwitterException) (obj)).response))
            {
                return false;
            }
        }
        return true;
    }

    public boolean exceededRateLimitation()
    {
        return statusCode == 400 && getRateLimitStatus() != null || statusCode == 420 || statusCode == 429;
    }

    public int getAccessLevel()
    {
        return z_T4JInternalParseUtil.toAccessLevel(response);
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getExceptionCode()
    {
        return getExceptionDiagnosis().asHexString();
    }

    public String getMessage()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (errorMessage != null && errorCode != -1)
        {
            stringbuilder.append("message - ").append(errorMessage).append("\n");
            stringbuilder.append("code - ").append(errorCode).append("\n");
        } else
        {
            stringbuilder.append(super.getMessage());
        }
        if (statusCode != -1)
        {
            return (new StringBuilder()).append(getCause(statusCode)).append("\n").append(stringbuilder.toString()).toString();
        } else
        {
            return stringbuilder.toString();
        }
    }

    public RateLimitStatus getRateLimitStatus()
    {
        if (response == null)
        {
            return null;
        } else
        {
            return z_T4JInternalJSONImplFactory.createRateLimitStatusFromResponseHeader(response);
        }
    }

    public String getResponseHeader(String s)
    {
        if (response != null)
        {
            s = (List)response.getResponseHeaderFields().get(s);
            if (s.size() > 0)
            {
                return (String)s.get(0);
            }
        }
        return null;
    }

    public int getRetryAfter()
    {
        byte byte0 = -1;
        if (statusCode != 400) goto _L2; else goto _L1
_L1:
        int i;
        RateLimitStatus ratelimitstatus = getRateLimitStatus();
        i = byte0;
        if (ratelimitstatus != null)
        {
            i = ratelimitstatus.getSecondsUntilReset();
        }
_L4:
        return i;
_L2:
        i = byte0;
        if (statusCode != 420) goto _L4; else goto _L3
_L3:
        String s;
        try
        {
            s = response.getResponseHeader("Retry-After");
        }
        catch (NumberFormatException numberformatexception)
        {
            return -1;
        }
        i = byte0;
        if (s == null) goto _L4; else goto _L5
_L5:
        i = Integer.valueOf(s).intValue();
        return i;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public int hashCode()
    {
        int l = 0;
        int i1 = statusCode;
        int j1 = errorCode;
        int i;
        int j;
        int k;
        if (exceptionDiagnosis != null)
        {
            i = exceptionDiagnosis.hashCode();
        } else
        {
            i = 0;
        }
        if (response != null)
        {
            j = response.hashCode();
        } else
        {
            j = 0;
        }
        if (errorMessage != null)
        {
            k = errorMessage.hashCode();
        } else
        {
            k = 0;
        }
        if (nested)
        {
            l = 1;
        }
        return (k + (j + (i + (i1 * 31 + j1) * 31) * 31) * 31) * 31 + l;
    }

    public boolean isCausedByNetworkIssue()
    {
        return getCause() instanceof IOException;
    }

    public boolean isErrorMessageAvailable()
    {
        return errorMessage != null;
    }

    public boolean resourceNotFound()
    {
        return statusCode == 404;
    }

    void setNested()
    {
        nested = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(getMessage());
        String s;
        if (nested)
        {
            s = "";
        } else
        {
            s = (new StringBuilder("\nRelevant discussions can be found on the Internet at:\n\thttp://www.google.co.jp/search?q=")).append(getExceptionDiagnosis().getStackLineHashAsHex()).append(" or\n\thttp://www.google.co.jp/search?q=").append(getExceptionDiagnosis().getLineNumberHashAsHex()).toString();
        }
        stringbuilder = stringbuilder.append(s).append("\nTwitterException{");
        if (nested)
        {
            s = "";
        } else
        {
            s = (new StringBuilder("exceptionCode=[")).append(getExceptionCode()).append("], ").toString();
        }
        return stringbuilder.append(s).append("statusCode=").append(statusCode).append(", message=").append(errorMessage).append(", code=").append(errorCode).append(", retryAfter=").append(getRetryAfter()).append(", rateLimitStatus=").append(getRateLimitStatus()).append(", version=").append(Version.getVersion()).append('}').toString();
    }

}
