// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.http.HttpResponseCode;
import twitter4j.internal.json.z_T4JInternalJSONImplFactory;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j:
//            TwitterResponse, ExceptionDiagnosis, RateLimitStatus, Version

public class TwitterException extends Exception
    implements TwitterResponse, HttpResponseCode
{

    private static final String FILTER[] = {
        "twitter4j"
    };
    private static final long serialVersionUID = 0xdb9822202e937df9L;
    private String errorMessage;
    private ExceptionDiagnosis exceptionDiagnosis;
    boolean nested;
    private String requestPath;
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
        this(s, (Throwable)null);
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
        exceptionDiagnosis = null;
        errorMessage = null;
        requestPath = null;
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
            break MISSING_BLOCK_LABEL_60;
        }
        s = new JSONObject(s);
        if (!s.isNull("error"))
        {
            errorMessage = s.getString("error");
        }
        if (!s.isNull("request"))
        {
            requestPath = s.getString("request");
        }
        return;
        s;
    }

    private static String getCause(int i)
    {
        i;
        JVM INSTR lookupswitch 11: default 100
    //                   304: 127
    //                   400: 133
    //                   401: 139
    //                   403: 145
    //                   404: 151
    //                   406: 157
    //                   413: 163
    //                   420: 169
    //                   500: 175
    //                   502: 181
    //                   503: 187;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        String s = "";
_L14:
        return i + ":" + s;
_L2:
        s = "There was no new data to return.";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "The request was invalid. An accompanying error message will explain why. This is the status code will be returned during rate limiting (https://dev.twitter.com/pages/rate-limiting).";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "Authentication credentials (https://dev.twitter.com/docs/auth) were missing or incorrect. Ensure that you have set valid conumer key/secret, access token/secret, and the system clock in in sync.";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "The request is understood, but it has been refused. An accompanying error message will explain why. This code is used when requests are being denied due to update limits (https://support.twitter.com/articles/15364-about-twitter-limits-update-api-dm-and-following).";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "The URI requested is invalid or the resource requested, such as a user, does not exist.";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "Returned by the Search API when an invalid format is specified in the request.\nReturned by the Streaming API when one or more of the parameters are not suitable for the resource. The track parameter, for example, would throw this error if:\n The track keyword is too long or too short.\n The bounding box specified is invalid.\n No predicates defined for filtered resource, for example, neither track nor follow parameter defined.\n Follow userid cannot be read.";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "A parameter list is too long. The track parameter, for example, would throw this error if:\n Too many track tokens specified for role; contact API team for increased access.\n Too many bounding boxes specified for role; contact API team for increased access.\n Too many follow userids specified for role; contact API team for increased access.";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "Returned by the Search and Trends API when you are being rate limited (https://dev.twitter.com/docs/rate-limiting).\nReturned by the Streaming API:\n Too many login attempts in a short period of time.\n Running too many copies of the same application authenticating with the same account name.";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "Something is broken. Please post to the group (https://dev.twitter.com/docs/support) so the Twitter team can investigate.";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "Twitter is down or being upgraded.";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "The Twitter servers are up, but overloaded with requests. Try again later.";
        if (true) goto _L14; else goto _L13
_L13:
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
            if (!(obj instanceof TwitterException))
            {
                return false;
            }
            obj = (TwitterException)obj;
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
            if (requestPath == null ? ((TwitterException) (obj)).requestPath != null : !requestPath.equals(((TwitterException) (obj)).requestPath))
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
        return statusCode == 400 && getRateLimitStatus() != null || statusCode == 420;
    }

    public int getAccessLevel()
    {
        return z_T4JInternalParseUtil.toAccessLevel(response);
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getExceptionCode()
    {
        return getExceptionDiagnosis().asHexString();
    }

    public RateLimitStatus getFeatureSpecificRateLimitStatus()
    {
        if (response == null)
        {
            return null;
        } else
        {
            return z_T4JInternalJSONImplFactory.createFeatureSpecificRateLimitStatusFromResponseHeader(response);
        }
    }

    public String getMessage()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (errorMessage != null && requestPath != null)
        {
            stringbuffer.append("error - ").append(errorMessage).append("\n");
            stringbuffer.append("request - ").append(requestPath).append("\n");
        } else
        {
            stringbuffer.append(super.getMessage());
        }
        if (statusCode != -1)
        {
            return getCause(statusCode) + "\n" + stringbuffer.toString();
        } else
        {
            return stringbuffer.toString();
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

    public String getRequestPath()
    {
        return requestPath;
    }

    public String getResponseHeader(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (response != null)
        {
            s = (List)response.getResponseHeaderFields().get(s);
            s1 = obj;
            if (s.size() > 0)
            {
                s1 = (String)s.get(0);
            }
        }
        return s1;
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
        int i1 = 0;
        int j1 = statusCode;
        int i;
        int j;
        int k;
        int l;
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
        if (requestPath != null)
        {
            l = requestPath.hashCode();
        } else
        {
            l = 0;
        }
        if (nested)
        {
            i1 = 1;
        }
        return ((((j1 * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
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
        StringBuffer stringbuffer = (new StringBuffer()).append(getMessage());
        String s;
        if (nested)
        {
            s = "";
        } else
        {
            s = "Relevant discussions can be on the Internet at:\n\thttp://www.google.co.jp/search?q=" + getExceptionDiagnosis().getStackLineHashAsHex() + " or\n\thttp://www.google.co.jp/search?q=" + getExceptionDiagnosis().getLineNumberHashAsHex();
        }
        stringbuffer = stringbuffer.append(s).append("\nTwitterException{");
        if (nested)
        {
            s = "";
        } else
        {
            s = "exceptionCode=[" + getExceptionCode() + "], ";
        }
        return stringbuffer.append(s).append("statusCode=").append(statusCode).append(", retryAfter=").append(getRetryAfter()).append(", rateLimitStatus=").append(getRateLimitStatus()).append(", featureSpecificRateLimitStatus=").append(getFeatureSpecificRateLimitStatus()).append(", version=").append(Version.getVersion()).append('}').toString();
    }

}
