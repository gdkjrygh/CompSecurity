// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.common.c.j;
import com.facebook.debug.log.b;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.RequestWrapper;

public class v
{

    private static final Class a = com/facebook/http/b/v;
    private final j b;

    public v(j j1)
    {
        b = j1;
    }

    private String a(HttpEntity httpentity)
    {
label0:
        {
            if (httpentity != null)
            {
                try
                {
                    if (httpentity.isRepeatable())
                    {
                        if (httpentity.getContentLength() < 4096L)
                        {
                            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                            httpentity.writeTo(bytearrayoutputstream);
                            return bytearrayoutputstream.toString();
                        }
                        break label0;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (HttpEntity httpentity)
                {
                    return (new StringBuilder()).append("[").append(httpentity.getMessage()).append("]").toString();
                }
            }
            return "[NULL OR NON-REPEATABLE ENTITY]";
        }
        return "[TOO MUCH DATA TO INCLUDE]";
    }

    private URI a(HttpUriRequest httpurirequest)
    {
        URI uri = httpurirequest.getURI();
        if (httpurirequest instanceof RequestWrapper)
        {
            httpurirequest = ((RequestWrapper)httpurirequest).getOriginal();
            if (httpurirequest instanceof HttpUriRequest)
            {
                return ((HttpUriRequest)httpurirequest).getURI();
            }
        }
        return uri;
    }

    public void a(HttpRequest httprequest)
    {
        if (httprequest instanceof HttpUriRequest)
        {
            HttpUriRequest httpurirequest = (HttpUriRequest)httprequest;
            b.a(httpurirequest.getURI().toString());
            if (com.facebook.debug.log.b.b(2))
            {
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append("Http request:");
                stringbuilder.append(a(httpurirequest));
                stringbuilder.append("\n");
                Header aheader[] = httpurirequest.getAllHeaders();
                int k = aheader.length;
                for (int i = 0; i < k; i++)
                {
                    Header header = aheader[i];
                    stringbuilder.append(header.getName());
                    stringbuilder.append(": ");
                    stringbuilder.append(header.getValue());
                    stringbuilder.append("\n");
                }

                stringbuilder.append("\n");
                if (httprequest instanceof HttpEntityEnclosingRequest)
                {
                    stringbuilder.append(a(((HttpEntityEnclosingRequest)httprequest).getEntity()));
                    stringbuilder.append("\n");
                }
                com.facebook.debug.log.b.a(a, stringbuilder.toString());
                return;
            }
        }
    }

    public void a(HttpResponse httpresponse, Object obj)
    {
        if (!com.facebook.debug.log.b.b(2))
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Http Response:\n");
        httpresponse = httpresponse.getAllHeaders();
        int k = httpresponse.length;
        for (int i = 0; i < k; i++)
        {
            Header header = httpresponse[i];
            stringbuilder.append(header.getName());
            stringbuilder.append(": ");
            stringbuilder.append(header.getValue());
            stringbuilder.append("\n");
        }

        stringbuilder.append("\n");
        if (obj != null)
        {
            if (obj instanceof String)
            {
                stringbuilder.append("Body:\n");
                stringbuilder.append((String)obj);
            } else
            if (obj instanceof JsonNode)
            {
                stringbuilder.append("Body:\n");
                stringbuilder.append(obj.toString());
            } else
            {
                stringbuilder.append("Body: ");
                stringbuilder.append("[").append(obj.getClass().getName()).append("]");
                stringbuilder.append("\n");
            }
        }
        com.facebook.debug.log.b.a(a, stringbuilder.toString());
    }

}
