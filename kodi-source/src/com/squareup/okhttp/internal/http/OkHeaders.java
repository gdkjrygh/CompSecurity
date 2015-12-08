// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Challenge;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HeaderParser

public final class OkHeaders
{

    private static final Comparator FIELD_NAME_COMPARATOR = new Comparator() {

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((String)obj, (String)obj1);
        }

        public int compare(String s, String s1)
        {
            if (s == s1)
            {
                return 0;
            }
            if (s == null)
            {
                return -1;
            }
            if (s1 == null)
            {
                return 1;
            } else
            {
                return String.CASE_INSENSITIVE_ORDER.compare(s, s1);
            }
        }

    };
    static final String PREFIX = Platform.get().getPrefix();
    public static final String RECEIVED_MILLIS = (new StringBuilder()).append(PREFIX).append("-Received-Millis").toString();
    public static final String SELECTED_PROTOCOL = (new StringBuilder()).append(PREFIX).append("-Selected-Protocol").toString();
    public static final String SENT_MILLIS = (new StringBuilder()).append(PREFIX).append("-Sent-Millis").toString();

    public static void addCookies(com.squareup.okhttp.Request.Builder builder, Map map)
    {
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            String s = (String)entry.getKey();
            if (("Cookie".equalsIgnoreCase(s) || "Cookie2".equalsIgnoreCase(s)) && !((List)entry.getValue()).isEmpty())
            {
                builder.addHeader(s, buildCookieHeader((List)entry.getValue()));
            }
        } while (true);
    }

    private static String buildCookieHeader(List list)
    {
        if (list.size() == 1)
        {
            return (String)list.get(0);
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append("; ");
            }
            stringbuilder.append((String)list.get(i));
        }

        return stringbuilder.toString();
    }

    public static long contentLength(Headers headers)
    {
        return stringToLong(headers.get("Content-Length"));
    }

    public static long contentLength(Request request)
    {
        return contentLength(request.headers());
    }

    public static long contentLength(Response response)
    {
        return contentLength(response.headers());
    }

    public static boolean hasVaryAll(Response response)
    {
        return varyFields(response).contains("*");
    }

    static boolean isEndToEnd(String s)
    {
        return !"Connection".equalsIgnoreCase(s) && !"Keep-Alive".equalsIgnoreCase(s) && !"Proxy-Authenticate".equalsIgnoreCase(s) && !"Proxy-Authorization".equalsIgnoreCase(s) && !"TE".equalsIgnoreCase(s) && !"Trailers".equalsIgnoreCase(s) && !"Transfer-Encoding".equalsIgnoreCase(s) && !"Upgrade".equalsIgnoreCase(s);
    }

    public static List parseChallenges(Headers headers, String s)
    {
        ArrayList arraylist;
        int i;
        int k;
        arraylist = new ArrayList();
        i = 0;
        k = headers.size();
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (s.equalsIgnoreCase(headers.name(i)))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String s1;
        int j;
        s1 = headers.value(i);
        j = 0;
_L6:
        if (j >= s1.length()) goto _L4; else goto _L3
_L3:
        String s2;
        int l = HeaderParser.skipUntil(s1, j, " ");
        s2 = s1.substring(j, l).trim();
        j = HeaderParser.skipWhitespace(s1, l);
        if (!s1.regionMatches(true, j, "realm=\"", 0, "realm=\"".length())) goto _L4; else goto _L5
_L5:
        j += "realm=\"".length();
        int i1 = HeaderParser.skipUntil(s1, j, "\"");
        String s3 = s1.substring(j, i1);
        j = HeaderParser.skipWhitespace(s1, HeaderParser.skipUntil(s1, i1 + 1, ",") + 1);
        arraylist.add(new Challenge(s2, s3));
          goto _L6
        return arraylist;
    }

    public static Request processAuthHeader(Authenticator authenticator, Response response, Proxy proxy)
        throws IOException
    {
        if (response.code() == 407)
        {
            return authenticator.authenticateProxy(proxy, response);
        } else
        {
            return authenticator.authenticate(proxy, response);
        }
    }

    private static long stringToLong(String s)
    {
        if (s == null)
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }

    public static Map toMultimap(Headers headers, String s)
    {
        TreeMap treemap = new TreeMap(FIELD_NAME_COMPARATOR);
        int i = 0;
        for (int j = headers.size(); i < j; i++)
        {
            String s1 = headers.name(i);
            String s2 = headers.value(i);
            ArrayList arraylist = new ArrayList();
            List list = (List)treemap.get(s1);
            if (list != null)
            {
                arraylist.addAll(list);
            }
            arraylist.add(s2);
            treemap.put(s1, Collections.unmodifiableList(arraylist));
        }

        if (s != null)
        {
            treemap.put(null, Collections.unmodifiableList(Collections.singletonList(s)));
        }
        return Collections.unmodifiableMap(treemap);
    }

    private static Set varyFields(Response response)
    {
        Object obj;
        Headers headers;
        int i;
        int k;
        obj = Collections.emptySet();
        headers = response.headers();
        i = 0;
        k = headers.size();
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if ("Vary".equalsIgnoreCase(headers.name(i)))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String as[];
        int j;
        int l;
        String s = headers.value(i);
        response = ((Response) (obj));
        if (((Set) (obj)).isEmpty())
        {
            response = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        }
        as = s.split(",");
        l = as.length;
        j = 0;
_L5:
        obj = response;
        if (j >= l) goto _L4; else goto _L3
_L3:
        response.add(as[j].trim());
        j++;
          goto _L5
          goto _L4
        return ((Set) (obj));
    }

    public static Headers varyHeaders(Response response)
    {
        Set set = varyFields(response);
        if (set.isEmpty())
        {
            return (new com.squareup.okhttp.Headers.Builder()).build();
        }
        response = response.networkResponse().request().headers();
        com.squareup.okhttp.Headers.Builder builder = new com.squareup.okhttp.Headers.Builder();
        int i = 0;
        for (int j = response.size(); i < j; i++)
        {
            String s = response.name(i);
            if (set.contains(s))
            {
                builder.add(s, response.value(i));
            }
        }

        return builder.build();
    }

    public static boolean varyMatches(Response response, Headers headers, Request request)
    {
        for (response = varyFields(response).iterator(); response.hasNext();)
        {
            String s = (String)response.next();
            if (!Util.equal(headers.values(s), request.headers(s)))
            {
                return false;
            }
        }

        return true;
    }

}
