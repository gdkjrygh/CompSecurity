// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.i;

import com.facebook.debug.log.f;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

public class d
{

    private static final Class a = com/facebook/analytics/i/d;

    public d()
    {
    }

    public long a(HttpMessage httpmessage)
    {
        long l = 0L;
        for (httpmessage = httpmessage.headerIterator(); httpmessage.hasNext();)
        {
            l += httpmessage.nextHeader().toString().length();
        }

        return l;
    }

    public long a(HttpRequest httprequest)
    {
        long l = a(((HttpMessage) (httprequest)));
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            HttpEntity httpentity = ((HttpEntityEnclosingRequest)httprequest).getEntity();
            if (httpentity != null)
            {
                long l1 = httpentity.getContentLength();
                if (l1 > 0L)
                {
                    l += l1;
                }
            }
        }
        httprequest = httprequest.getRequestLine();
        long l2 = l;
        if (httprequest != null)
        {
            l2 = l + (long)httprequest.toString().length();
        }
        return l2;
    }

    public String a(HttpResponse httpresponse)
    {
        String s1 = null;
        HttpEntity httpentity = httpresponse.getEntity();
        String s = s1;
        if (httpentity != null)
        {
            s = s1;
            if (httpentity.getContentType() != null)
            {
                s = httpentity.getContentType().getValue();
            }
        }
        s1 = s;
        if (s == null)
        {
            httpresponse = httpresponse.getFirstHeader("Content-Type");
            s1 = s;
            if (httpresponse != null)
            {
                s1 = httpresponse.getValue();
            }
        }
        return s1;
    }

    public long b(HttpMessage httpmessage)
    {
        long l;
        long l1;
        int j = 1;
        boolean flag = false;
        httpmessage = httpmessage.getHeaders("Content-Length");
        String s;
        int i;
        long l2;
        if (httpmessage != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (httpmessage.length <= 0)
        {
            j = 0;
        }
        if (!((i & j) != 0)) goto _L2; else goto _L1
_L1:
        j = httpmessage.length;
        l = 0L;
        i = ((flag) ? 1 : 0);
_L4:
        l1 = l;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = httpmessage[i].getValue();
        l1 = l;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        l2 = Long.parseLong(s);
        l1 = l;
        if (l2 > 0L)
        {
            l1 = l + l2;
        }
_L5:
        i++;
        l = l1;
        if (true) goto _L4; else goto _L3
        NumberFormatException numberformatexception;
        numberformatexception;
        f.a(a, "Failure in getting content length from the header", numberformatexception);
        l1 = l;
          goto _L5
_L2:
        l1 = -1L;
_L3:
        return l1;
    }

}
