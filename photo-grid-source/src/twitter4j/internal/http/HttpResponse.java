// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationContext;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;
import twitter4j.internal.org.json.JSONTokener;

// Referenced classes of package twitter4j.internal.http:
//            HttpResponseImpl, HttpClientConfiguration

public abstract class HttpResponse
{

    private static final Logger logger = Logger.getLogger(twitter4j/internal/http/HttpResponseImpl);
    protected final HttpClientConfiguration CONF;
    protected InputStream is;
    private JSONObject json;
    private JSONArray jsonArray;
    protected String responseAsString;
    protected int statusCode;
    private boolean streamConsumed;

    HttpResponse()
    {
        responseAsString = null;
        streamConsumed = false;
        json = null;
        jsonArray = null;
        CONF = ConfigurationContext.getInstance();
    }

    public HttpResponse(HttpClientConfiguration httpclientconfiguration)
    {
        responseAsString = null;
        streamConsumed = false;
        json = null;
        jsonArray = null;
        CONF = httpclientconfiguration;
    }

    private void disconnectForcibly()
    {
        try
        {
            disconnect();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public JSONArray asJSONArray()
    {
        if (jsonArray != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        String s;
        Logger logger1;
        s = null;
        logger1 = null;
        obj2 = null;
        obj1 = s;
        obj = logger1;
        if (responseAsString != null) goto _L4; else goto _L3
_L3:
        obj1 = s;
        obj = logger1;
        obj2 = asReader();
        obj1 = obj2;
        obj = obj2;
        jsonArray = new JSONArray(new JSONTokener(((Reader) (obj2))));
_L7:
        obj1 = obj2;
        obj = obj2;
        if (!CONF.isPrettyDebugEnabled()) goto _L6; else goto _L5
_L5:
        obj1 = obj2;
        obj = obj2;
        logger.debug(jsonArray.toString(1));
_L12:
        if (obj2 != null)
        {
            try
            {
                ((Reader) (obj2)).close();
            }
            catch (IOException ioexception) { }
        }
        disconnectForcibly();
_L2:
        return jsonArray;
_L4:
        obj1 = s;
        obj = logger1;
        jsonArray = new JSONArray(responseAsString);
          goto _L7
        obj2;
        obj = obj1;
        if (!logger.isDebugEnabled()) goto _L9; else goto _L8
_L8:
        obj = obj1;
        throw new TwitterException((new StringBuilder()).append(((JSONException) (obj2)).getMessage()).append(":").append(responseAsString).toString(), ((Throwable) (obj2)));
        obj1;
        if (obj != null)
        {
            try
            {
                ((Reader) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        disconnectForcibly();
        throw obj1;
_L6:
        obj1 = obj2;
        obj = obj2;
        logger1 = logger;
        obj1 = obj2;
        obj = obj2;
        if (responseAsString == null) goto _L11; else goto _L10
_L10:
        obj1 = obj2;
        obj = obj2;
        s = responseAsString;
_L13:
        obj1 = obj2;
        obj = obj2;
        logger1.debug(s);
          goto _L12
_L11:
        obj1 = obj2;
        obj = obj2;
        s = jsonArray.toString();
          goto _L13
_L9:
        obj = obj1;
        throw new TwitterException(((JSONException) (obj2)).getMessage(), ((Throwable) (obj2)));
          goto _L7
    }

    public JSONObject asJSONObject()
    {
        if (json != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        String s;
        Logger logger1;
        s = null;
        logger1 = null;
        obj2 = null;
        obj1 = s;
        obj = logger1;
        if (responseAsString != null) goto _L4; else goto _L3
_L3:
        obj1 = s;
        obj = logger1;
        obj2 = asReader();
        obj1 = obj2;
        obj = obj2;
        json = new JSONObject(new JSONTokener(((Reader) (obj2))));
_L7:
        obj1 = obj2;
        obj = obj2;
        if (!CONF.isPrettyDebugEnabled()) goto _L6; else goto _L5
_L5:
        obj1 = obj2;
        obj = obj2;
        logger.debug(json.toString(1));
_L12:
        if (obj2 != null)
        {
            try
            {
                ((Reader) (obj2)).close();
            }
            catch (IOException ioexception) { }
        }
        disconnectForcibly();
_L2:
        return json;
_L4:
        obj1 = s;
        obj = logger1;
        json = new JSONObject(responseAsString);
          goto _L7
        obj2;
        obj = obj1;
        if (responseAsString != null) goto _L9; else goto _L8
_L8:
        obj = obj1;
        throw new TwitterException(((JSONException) (obj2)).getMessage(), ((Throwable) (obj2)));
        obj1;
        if (obj != null)
        {
            try
            {
                ((Reader) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        disconnectForcibly();
        throw obj1;
_L6:
        obj1 = obj2;
        obj = obj2;
        logger1 = logger;
        obj1 = obj2;
        obj = obj2;
        if (responseAsString == null) goto _L11; else goto _L10
_L10:
        obj1 = obj2;
        obj = obj2;
        s = responseAsString;
_L13:
        obj1 = obj2;
        obj = obj2;
        logger1.debug(s);
          goto _L12
_L11:
        obj1 = obj2;
        obj = obj2;
        s = json.toString();
          goto _L13
_L9:
        obj = obj1;
        throw new TwitterException((new StringBuilder()).append(((JSONException) (obj2)).getMessage()).append(":").append(responseAsString).toString(), ((Throwable) (obj2)));
          goto _L7
    }

    public Reader asReader()
    {
        BufferedReader bufferedreader;
        try
        {
            bufferedreader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return new InputStreamReader(is);
        }
        return bufferedreader;
    }

    public InputStream asStream()
    {
        if (streamConsumed)
        {
            throw new IllegalStateException("Stream has already been consumed.");
        } else
        {
            return is;
        }
    }

    public String asString()
    {
        if (responseAsString != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        Object obj;
        try
        {
            obj = asStream();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj1 = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = null;
            obj2 = null;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (obj == null)
        {
            String s;
            Object obj3;
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            disconnectForcibly();
            return null;
        }
        obj2 = new BufferedReader(new InputStreamReader(((InputStream) (obj)), "UTF-8"));
        obj1 = new StringBuilder();
_L5:
        s = ((BufferedReader) (obj2)).readLine();
        if (s == null) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append(s).append("\n");
          goto _L5
        obj3;
        obj1 = obj2;
        obj2 = obj3;
_L9:
        throw new TwitterException(((IOException) (obj2)).getMessage(), ((Throwable) (obj2)));
        obj3;
        obj2 = obj1;
        obj1 = obj3;
_L7:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        disconnectForcibly();
        throw obj1;
_L4:
        responseAsString = ((StringBuilder) (obj1)).toString();
        logger.debug(responseAsString);
        ((InputStream) (obj)).close();
        streamConsumed = true;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        try
        {
            ((BufferedReader) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        disconnectForcibly();
_L2:
        return responseAsString;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L7; else goto _L6
        obj2;
        obj1 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public abstract void disconnect();

    public abstract String getResponseHeader(String s);

    public abstract Map getResponseHeaderFields();

    public int getStatusCode()
    {
        return statusCode;
    }

    public String toString()
    {
        return (new StringBuilder("HttpResponse{statusCode=")).append(statusCode).append(", responseAsString='").append(responseAsString).append('\'').append(", is=").append(is).append(", streamConsumed=").append(streamConsumed).append('}').toString();
    }

}
