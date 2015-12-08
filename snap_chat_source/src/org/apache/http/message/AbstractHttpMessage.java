// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

// Referenced classes of package org.apache.http.message:
//            HeaderGroup, BasicHeader

public abstract class AbstractHttpMessage
    implements HttpMessage
{

    protected HeaderGroup headergroup;
    protected HttpParams params;

    protected AbstractHttpMessage()
    {
        this(null);
    }

    protected AbstractHttpMessage(HttpParams httpparams)
    {
        headergroup = new HeaderGroup();
        params = httpparams;
    }

    public void addHeader(String s, String s1)
    {
        Args.notNull(s, "Header name");
        headergroup.addHeader(new BasicHeader(s, s1));
    }

    public Header[] getAllHeaders()
    {
        return headergroup.getAllHeaders();
    }

    public void removeHeaders(String s)
    {
        if (s != null)
        {
            HeaderIterator headeriterator = headergroup.iterator();
            while (headeriterator.hasNext()) 
            {
                if (s.equalsIgnoreCase(headeriterator.nextHeader().getName()))
                {
                    headeriterator.remove();
                }
            }
        }
    }

    public void setHeader(String s, String s1)
    {
        Args.notNull(s, "Header name");
        headergroup.updateHeader(new BasicHeader(s, s1));
    }
}
