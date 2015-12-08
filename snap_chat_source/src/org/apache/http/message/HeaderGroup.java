// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;

// Referenced classes of package org.apache.http.message:
//            BasicListHeaderIterator

public class HeaderGroup
    implements Serializable, Cloneable
{

    private final List headers = new ArrayList(16);

    public HeaderGroup()
    {
    }

    public void addHeader(Header header)
    {
        if (header == null)
        {
            return;
        } else
        {
            headers.add(header);
            return;
        }
    }

    public Object clone()
    {
        return super.clone();
    }

    public Header[] getAllHeaders()
    {
        return (Header[])headers.toArray(new Header[headers.size()]);
    }

    public HeaderIterator iterator()
    {
        return new BasicListHeaderIterator(headers, null);
    }

    public String toString()
    {
        return headers.toString();
    }

    public void updateHeader(Header header)
    {
        if (header == null)
        {
            return;
        }
        for (int i = 0; i < headers.size(); i++)
        {
            if (((Header)headers.get(i)).getName().equalsIgnoreCase(header.getName()))
            {
                headers.set(i, header);
                return;
            }
        }

        headers.add(header);
    }
}
