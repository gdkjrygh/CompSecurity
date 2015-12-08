// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.jamendo.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.yong.jamendo.api:
//            WSError, RequestCache

public class Caller
{

    private static RequestCache requestCache = null;

    public Caller()
    {
    }

    private static String convertStreamToString(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        stringbuilder = new StringBuilder();
_L2:
        String s = bufferedreader.readLine();
label0:
        {
            {
                if (s != null)
                {
                    break label0;
                }
                Exception exception;
                IOException ioexception;
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (InputStream inputstream)
                {
                    inputstream.printStackTrace();
                }
            }
            return stringbuilder.toString();
        }
        stringbuilder.append((new StringBuilder(String.valueOf(s))).append("\n").toString());
        continue; /* Loop/switch isn't completed */
        ioexception;
        ioexception.printStackTrace();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_37;
        }
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        throw exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String createStringFromIds(int ai[])
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        String s1 = "";
_L4:
        return s1;
_L2:
        String s = "";
        int j = ai.length;
        int i = 0;
        do
        {
            s1 = s;
            if (i >= j)
            {
                continue;
            }
            int k = ai[i];
            s = (new StringBuilder(String.valueOf(s))).append(k).append("+").toString();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String doGet(String s)
        throws WSError
    {
        String s1;
        s1 = null;
        if (requestCache != null)
        {
            String s2 = requestCache.get(s);
            s1 = s2;
            if (s2 != null)
            {
                return s2;
            }
        }
        Object obj = new URI(s);
        obj = new HttpGet(((URI) (obj)));
_L1:
        Object obj1;
        String s3;
        Object obj2;
        obj2 = new DefaultHttpClient();
        obj1 = s1;
        s3 = s1;
        obj = ((HttpClient) (obj2)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        obj1 = s1;
        s3 = s1;
        obj2 = ((HttpResponse) (obj)).getEntity();
        obj = s1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj1 = s1;
        s3 = s1;
        s1 = convertStreamToString(((HttpEntity) (obj2)).getContent());
        obj = s1;
        obj1 = s1;
        s3 = s1;
        if (requestCache == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj1 = s1;
        s3 = s1;
        requestCache.put(s, s1);
        obj = s1;
_L2:
        return ((String) (obj));
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
_L3:
        obj1 = new HttpGet(s.replace(' ', '+'));
        urisyntaxexception.printStackTrace();
        urisyntaxexception = ((URISyntaxException) (obj1));
          goto _L1
        s;
        obj1 = s1;
        s3 = s1;
        try
        {
            throw new WSError((new StringBuilder("Unable to access ")).append(s.getLocalizedMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            urisyntaxexception = ((URISyntaxException) (obj1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            urisyntaxexception = s3;
        }
          goto _L2
        s;
        obj1 = s1;
        s3 = s1;
        throw new WSError(s.getLocalizedMessage());
        urisyntaxexception;
          goto _L3
    }

    public static void setRequestCache(RequestCache requestcache)
    {
        requestCache = requestcache;
    }

}
