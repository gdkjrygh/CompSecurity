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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationContext;
import twitter4j.internal.logging.Logger;

// Referenced classes of package twitter4j.internal.http:
//            HttpClientConfiguration

public abstract class HttpResponse
{

    static Class class$twitter4j$internal$http$HttpResponseImpl;
    private static final Logger logger;
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

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
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
        if (responseAsString != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        jsonArray = new JSONArray(asString());
_L3:
        if (CONF.isPrettyDebugEnabled())
        {
            logger.debug(jsonArray.toString(1));
        }
        Object obj;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception) { }
        }
        disconnectForcibly();
_L2:
        return jsonArray;
        jsonArray = new JSONArray(responseAsString);
          goto _L3
        obj;
        if (logger.isDebugEnabled())
        {
            throw new TwitterException(((JSONException) (obj)).getMessage() + ":" + responseAsString, ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_161;
        obj;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception1) { }
        }
        disconnectForcibly();
        throw obj;
        throw new TwitterException(((JSONException) (obj)).getMessage(), ((Throwable) (obj)));
    }

    public JSONObject asJSONObject()
        throws TwitterException
    {
        if (json != null) goto _L2; else goto _L1
_L1:
        if (responseAsString != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        json = new JSONObject(asString());
_L3:
        if (CONF.isPrettyDebugEnabled())
        {
            logger.debug(json.toString(1));
        }
        Object obj;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception) { }
        }
        disconnectForcibly();
_L2:
        return json;
        json = new JSONObject(responseAsString);
          goto _L3
        obj;
        if (responseAsString == null)
        {
            throw new TwitterException(((JSONException) (obj)).getMessage(), ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_134;
        obj;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception1) { }
        }
        disconnectForcibly();
        throw obj;
        throw new TwitterException(((JSONException) (obj)).getMessage() + ":" + responseAsString, ((Throwable) (obj)));
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
        obj1 = new StringBuffer();
_L5:
        obj2 = ((BufferedReader) (obj4)).readLine();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        ((StringBuffer) (obj1)).append(((String) (obj2))).append("\n");
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
        responseAsString = ((StringBuffer) (obj1)).toString();
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
        return "HttpResponse{statusCode=" + statusCode + ", responseAsString='" + responseAsString + '\'' + ", is=" + is + ", streamConsumed=" + streamConsumed + '}';
    }

    static 
    {
        Class class1;
        if (class$twitter4j$internal$http$HttpResponseImpl == null)
        {
            class1 = _mthclass$("twitter4j.internal.http.HttpResponseImpl");
            class$twitter4j$internal$http$HttpResponseImpl = class1;
        } else
        {
            class1 = class$twitter4j$internal$http$HttpResponseImpl;
        }
        logger = Logger.getLogger(class1);
    }
}
