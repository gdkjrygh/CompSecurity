// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class fd
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/fd$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("Post", 0);
            b = new a("Get", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private String a;
    private String b;
    private String c;
    private a d;
    private String e;

    private fd(String s, String s1, String s2, a a1)
    {
        a = s;
        b = s1;
        c = s2;
        e = null;
        d = a1;
    }

    public static fd a(String s, String s1)
    {
        return new fd(s, s1, null, a.b);
    }

    public static fd a(String s, String s1, String s2)
    {
        return new fd(s, s1, s2, a.a);
    }

    public void a()
        throws UnsupportedEncodingException, IOException
    {
        Object obj1 = new DefaultHttpClient();
        Object obj = null;
        HttpParams httpparams;
        int i;
        if (d == a.b)
        {
            obj = new HttpGet(a);
        } else
        if (d == a.a)
        {
            obj = new HttpPost(a);
            ((HttpPost) (obj)).setEntity(new StringEntity(c));
        }
        httpparams = ((HttpUriRequest) (obj)).getParams();
        HttpConnectionParams.setConnectionTimeout(httpparams, 18000);
        HttpConnectionParams.setSoTimeout(httpparams, 18000);
        httpparams.setBooleanParameter("http.protocol.expect-continue", false);
        httpparams.setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
        ((HttpUriRequest) (obj)).setHeader("User-Agent", b);
        obj = ((HttpClient) (obj1)).execute(((HttpUriRequest) (obj)));
        obj1 = ((HttpResponse) (obj)).getEntity();
        if (((HttpResponse) (obj)).getStatusLine() != null)
        {
            i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        } else
        {
            i = 200;
        }
        if (i >= 200 && i < 300)
        {
            obj = new BufferedInputStream(((HttpEntity) (obj1)).getContent());
            obj1 = new StringBuilder(Math.max(0, (int)((HttpEntity) (obj1)).getContentLength()));
            byte abyte0[] = new byte[1024];
            do
            {
                i = ((BufferedInputStream) (obj)).read(abyte0);
                if (i <= 0)
                {
                    break;
                }
                ((StringBuilder) (obj1)).append(new String(abyte0, 0, i));
            } while (true);
            e = ((StringBuilder) (obj1)).toString();
        }
    }

    public String b()
    {
        return e;
    }
}
