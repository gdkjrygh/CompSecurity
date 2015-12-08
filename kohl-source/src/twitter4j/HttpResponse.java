// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j:
//            HttpResponseImpl, Logger, TwitterException, JSONException, 
//            JSONArray, JSONTokener, HttpClientConfiguration, JSONObject

public abstract class HttpResponse
{

    private static final Logger logger = Logger.getLogger(twitter4j/HttpResponseImpl);
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
        CONF = ConfigurationContext.getInstance().getHttpClientConfiguration();
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
        throws TwitterException
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
        throws TwitterException
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
        throws TwitterException
    {
        if (responseAsString != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj4 = null;
        obj5 = null;
        obj3 = null;
        obj1 = null;
        obj2 = obj4;
        Object obj = asStream();
        if (obj == null)
        {
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            if (false)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            disconnectForcibly();
            return null;
        }
        obj2 = obj4;
        obj1 = obj;
        obj3 = obj;
        obj4 = new BufferedReader(new InputStreamReader(((InputStream) (obj)), "UTF-8"));
        obj2 = new StringBuilder();
_L5:
        obj1 = ((BufferedReader) (obj4)).readLine();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj2)).append(((String) (obj1))).append("\n");
          goto _L5
        obj1;
        obj2 = obj4;
        obj4 = obj1;
_L9:
        obj1 = obj;
        throw new TwitterException(((IOException) (obj4)).getMessage(), ((Throwable) (obj4)));
        obj;
_L7:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        disconnectForcibly();
        throw obj;
_L4:
        responseAsString = ((StringBuilder) (obj2)).toString();
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
        if (obj4 != null)
        {
            try
            {
                ((BufferedReader) (obj4)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        disconnectForcibly();
_L2:
        return responseAsString;
        obj3;
        obj2 = obj4;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        obj4;
        obj2 = obj5;
        obj = obj3;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public abstract void disconnect()
        throws IOException;

    public abstract String getResponseHeader(String s);

    public abstract Map getResponseHeaderFields();

    public int getStatusCode()
    {
        return statusCode;
    }

    public String toString()
    {
        return (new StringBuilder()).append("HttpResponse{statusCode=").append(statusCode).append(", responseAsString='").append(responseAsString).append('\'').append(", is=").append(is).append(", streamConsumed=").append(streamConsumed).append('}').toString();
    }

}
