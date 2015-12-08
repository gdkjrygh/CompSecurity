// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.amazon.device.associates:
//            p, s

class aq
{

    private ArrayList a;
    private ArrayList b;
    private String c;
    private int d;
    private String e;
    private String f;

    public aq()
    {
        f = null;
    }

    public aq(String s1)
    {
        f = null;
        c = s1;
        a = new ArrayList();
        b = new ArrayList();
    }

    private static String a(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        stringbuilder = new StringBuilder();
_L1:
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        stringbuilder.append((new StringBuilder()).append(s1).append("\n").toString());
          goto _L1
        IOException ioexception;
        ioexception;
        p.d("RestClient", (new StringBuilder()).append("Error converting stream to string. Ex=").append(ioexception).toString());
        Exception exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        return stringbuilder.toString();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        if (true)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw exception;
    }

    private void a(HttpUriRequest httpurirequest, String s1)
    {
        s1 = new DefaultHttpClient();
        s1.getParams().setParameter("http.connection.timeout", Integer.valueOf(1000));
        s1.getParams().setParameter("http.socket.timeout", Integer.valueOf(60000));
        try
        {
            httpurirequest = s1.execute(httpurirequest);
            d = httpurirequest.getStatusLine().getStatusCode();
            e = httpurirequest.getStatusLine().getReasonPhrase();
            httpurirequest = httpurirequest.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            s1.getConnectionManager().shutdown();
            f = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            s1.getConnectionManager().shutdown();
            f = null;
            return;
        }
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        httpurirequest = httpurirequest.getContent();
        f = a(((InputStream) (httpurirequest)));
        httpurirequest.close();
        s1.getConnectionManager().shutdown();
        return;
    }

    public String a()
    {
        return f;
    }

    public void a(s s1)
        throws UnsupportedEncodingException
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[s.values().length];
                try
                {
                    a[s.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[s.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Iterator iterator1;
        switch (_cls1.a[s1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Object obj = "";
            if (!a.isEmpty())
            {
                s1 = (new StringBuilder()).append("").append("?").toString();
                Iterator iterator2 = a.iterator();
                do
                {
                    obj = s1;
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    obj = (NameValuePair)iterator2.next();
                    obj = (new StringBuilder()).append(((NameValuePair) (obj)).getName()).append("=").append(URLEncoder.encode(((NameValuePair) (obj)).getValue(), "UTF-8")).toString();
                    if (s1.length() > 1)
                    {
                        s1 = (new StringBuilder()).append(s1).append("&").append(((String) (obj))).toString();
                    } else
                    {
                        s1 = (new StringBuilder()).append(s1).append(((String) (obj))).toString();
                    }
                } while (true);
            }
            s1 = new HttpGet((new StringBuilder()).append(c).append(((String) (obj))).toString());
            NameValuePair namevaluepair;
            for (Iterator iterator = b.iterator(); iterator.hasNext(); s1.addHeader(namevaluepair.getName(), namevaluepair.getValue()))
            {
                namevaluepair = (NameValuePair)iterator.next();
            }

            a(((HttpUriRequest) (s1)), c);
            return;

        case 2: // '\002'
            s1 = new HttpPost(c);
            iterator1 = b.iterator();
            break;
        }
        NameValuePair namevaluepair1;
        for (; iterator1.hasNext(); s1.addHeader(namevaluepair1.getName(), namevaluepair1.getValue()))
        {
            namevaluepair1 = (NameValuePair)iterator1.next();
        }

        if (!a.isEmpty())
        {
            s1.setEntity(new UrlEncodedFormEntity(a, "UTF-8"));
        }
        a(((HttpUriRequest) (s1)), c);
    }

    public void a(String s1, String s2)
    {
        a.add(new BasicNameValuePair(s1, s2));
    }

    public void a(ArrayList arraylist)
    {
        a = arraylist;
    }

    public int b()
    {
        return d;
    }
}
