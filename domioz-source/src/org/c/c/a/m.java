// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.c.c.f;

// Referenced classes of package org.c.c.a:
//            d

final class m extends d
{

    private final HttpResponse a;
    private f b;

    m(HttpResponse httpresponse)
    {
        a = httpresponse;
    }

    protected final void closeInternal()
    {
        HttpEntity httpentity;
        httpentity = a.getEntity();
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        httpentity.consumeContent();
        return;
        IOException ioexception;
        ioexception;
    }

    protected final InputStream getBodyInternal()
    {
        HttpEntity httpentity = a.getEntity();
        if (httpentity != null)
        {
            return httpentity.getContent();
        } else
        {
            return null;
        }
    }

    public final f getHeaders()
    {
        if (b == null)
        {
            b = new f();
            Header aheader[] = a.getAllHeaders();
            int j = aheader.length;
            for (int i = 0; i < j; i++)
            {
                Header header = aheader[i];
                b.add(header.getName(), header.getValue());
            }

        }
        return b;
    }

    public final int getRawStatusCode()
    {
        return a.getStatusLine().getStatusCode();
    }

    public final String getStatusText()
    {
        return a.getStatusLine().getReasonPhrase();
    }
}
