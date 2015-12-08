// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package twitter4j:
//            TwitterException, JSONException, JSONObject, HTMLEntity, 
//            HttpResponse

final class ParseUtil
{

    private static final Map formatMapQueue = new HashMap();

    private ParseUtil()
    {
        throw new AssertionError();
    }

    public static boolean getBoolean(String s, JSONObject jsonobject)
    {
        s = getRawString(s, jsonobject);
        if (s == null || "null".equals(s))
        {
            return false;
        } else
        {
            return Boolean.valueOf(s).booleanValue();
        }
    }

    public static Date getDate(String s, String s1)
        throws TwitterException
    {
        LinkedBlockingQueue linkedblockingqueue;
        Object obj;
        obj = (LinkedBlockingQueue)formatMapQueue.get(s1);
        linkedblockingqueue = ((LinkedBlockingQueue) (obj));
        if (obj == null)
        {
            linkedblockingqueue = new LinkedBlockingQueue();
            formatMapQueue.put(s1, linkedblockingqueue);
        }
        SimpleDateFormat simpledateformat = (SimpleDateFormat)linkedblockingqueue.poll();
        obj = simpledateformat;
        if (simpledateformat == null)
        {
            obj = new SimpleDateFormat(s1, Locale.US);
            ((SimpleDateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        s1 = ((SimpleDateFormat) (obj)).parse(s);
        try
        {
            linkedblockingqueue.put(obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s1;
        s1;
        throw new TwitterException((new StringBuilder()).append("Unexpected date format(").append(s).append(") returned from twitter.com").toString(), s1);
        s;
        try
        {
            linkedblockingqueue.put(obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s;
    }

    public static Date getDate(String s, JSONObject jsonobject)
        throws TwitterException
    {
        return getDate(s, jsonobject, "EEE MMM d HH:mm:ss z yyyy");
    }

    public static Date getDate(String s, JSONObject jsonobject, String s1)
        throws TwitterException
    {
        s = getUnescapedString(s, jsonobject);
        if ("null".equals(s) || s == null)
        {
            return null;
        } else
        {
            return getDate(s, s1);
        }
    }

    public static double getDouble(String s, JSONObject jsonobject)
    {
        s = getRawString(s, jsonobject);
        if (s == null || "".equals(s) || "null".equals(s))
        {
            return -1D;
        } else
        {
            return Double.valueOf(s).doubleValue();
        }
    }

    public static int getInt(String s)
    {
        if (s == null || "".equals(s) || "null".equals(s))
        {
            return -1;
        }
        int i;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    public static int getInt(String s, JSONObject jsonobject)
    {
        return getInt(getRawString(s, jsonobject));
    }

    public static long getLong(String s)
    {
        if (s == null || "".equals(s) || "null".equals(s))
        {
            return -1L;
        }
        if (s.endsWith("+"))
        {
            return Long.valueOf(s.substring(0, s.length() - 1)).longValue() + 1L;
        } else
        {
            return Long.valueOf(s).longValue();
        }
    }

    public static long getLong(String s, JSONObject jsonobject)
    {
        return getLong(getRawString(s, jsonobject));
    }

    public static String getRawString(String s, JSONObject jsonobject)
    {
        if (jsonobject.isNull(s))
        {
            return null;
        }
        try
        {
            s = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    static String getURLDecodedString(String s, JSONObject jsonobject)
    {
        jsonobject = getRawString(s, jsonobject);
        s = jsonobject;
        if (jsonobject != null)
        {
            try
            {
                s = URLDecoder.decode(jsonobject, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return jsonobject;
            }
        }
        return s;
    }

    static String getUnescapedString(String s, JSONObject jsonobject)
    {
        return HTMLEntity.unescape(getRawString(s, jsonobject));
    }

    public static Date parseTrendsDate(String s)
        throws TwitterException
    {
        switch (s.length())
        {
        default:
            return getDate(s, "EEE, d MMM yyyy HH:mm:ss z");

        case 10: // '\n'
            return new Date(Long.parseLong(s) * 1000L);

        case 20: // '\024'
            return getDate(s, "yyyy-MM-dd'T'HH:mm:ss'Z'");
        }
    }

    public static int toAccessLevel(HttpResponse httpresponse)
    {
        if (httpresponse == null)
        {
            return -1;
        }
        httpresponse = httpresponse.getResponseHeader("X-Access-Level");
        if (httpresponse == null)
        {
            return 0;
        }
        switch (httpresponse.length())
        {
        default:
            return 0;

        case 4: // '\004'
            return 1;

        case 10: // '\n'
            return 2;

        case 25: // '\031'
            return 3;

        case 26: // '\032'
            return 3;
        }
    }

}
