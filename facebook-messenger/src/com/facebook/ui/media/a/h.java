// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.a;

import android.net.Uri;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.StatusLine;

// Referenced classes of package com.facebook.ui.media.a:
//            b

class h
{

    private h()
    {
    }

    h(b b)
    {
        this();
    }

    private static Uri a(Uri uri, Uri uri1)
    {
        uri1 = URI.create(uri1.toString());
        return Uri.parse(URI.create(uri.toString()).resolve(uri1).toString());
    }

    public Uri a(HttpResponse httpresponse, Uri uri)
    {
        Object obj = httpresponse.getFirstHeader("Location");
        if (obj == null)
        {
            throw new ProtocolException((new StringBuilder()).append("Received redirect response ").append(httpresponse.getStatusLine()).append(" but no Location header").toString());
        }
        obj = Uri.parse(((Header) (obj)).getValue());
        httpresponse = ((HttpResponse) (obj));
        if (!((Uri) (obj)).isAbsolute())
        {
            httpresponse = a(uri, ((Uri) (obj)));
        }
        uri = httpresponse;
        if ("https".equals(httpresponse.getScheme()))
        {
            uri = httpresponse;
            if (httpresponse.getHost().equals("attachment.fbsbx.com"))
            {
                uri = httpresponse.buildUpon().scheme("http").build();
            }
        }
        return uri;
    }

    public boolean a(HttpResponse httpresponse)
    {
        return httpresponse.getStatusLine().getStatusCode() == 302;
    }
}
