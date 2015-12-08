// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            BasicHeader, BasicListHeaderIterator

public class HeaderGroup
    implements Serializable, Cloneable
{

    private static final long serialVersionUID = 0x243470d8cecee2c1L;
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

    public void clear()
    {
        headers.clear();
    }

    public Object clone()
    {
        return super.clone();
    }

    public boolean containsHeader(String s)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < headers.size())
                {
                    if (!((Header)headers.get(i)).getName().equalsIgnoreCase(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public HeaderGroup copy()
    {
        HeaderGroup headergroup = new HeaderGroup();
        headergroup.headers.addAll(headers);
        return headergroup;
    }

    public Header[] getAllHeaders()
    {
        return (Header[])headers.toArray(new Header[headers.size()]);
    }

    public Header getCondensedHeader(String s)
    {
        int i = 1;
        Header aheader[] = getHeaders(s);
        if (aheader.length == 0)
        {
            return null;
        }
        if (aheader.length == 1)
        {
            return aheader[0];
        }
        CharArrayBuffer chararraybuffer = new CharArrayBuffer(128);
        chararraybuffer.append(aheader[0].getValue());
        for (; i < aheader.length; i++)
        {
            chararraybuffer.append(", ");
            chararraybuffer.append(aheader[i].getValue());
        }

        return new BasicHeader(s.toLowerCase(Locale.ENGLISH), chararraybuffer.toString());
    }

    public Header getFirstHeader(String s)
    {
        for (int i = 0; i < headers.size(); i++)
        {
            Header header = (Header)headers.get(i);
            if (header.getName().equalsIgnoreCase(s))
            {
                return header;
            }
        }

        return null;
    }

    public Header[] getHeaders(String s)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < headers.size(); i++)
        {
            Header header = (Header)headers.get(i);
            if (header.getName().equalsIgnoreCase(s))
            {
                arraylist.add(header);
            }
        }

        return (Header[])arraylist.toArray(new Header[arraylist.size()]);
    }

    public Header getLastHeader(String s)
    {
        for (int i = headers.size() - 1; i >= 0; i--)
        {
            Header header = (Header)headers.get(i);
            if (header.getName().equalsIgnoreCase(s))
            {
                return header;
            }
        }

        return null;
    }

    public HeaderIterator iterator()
    {
        return new BasicListHeaderIterator(headers, null);
    }

    public HeaderIterator iterator(String s)
    {
        return new BasicListHeaderIterator(headers, s);
    }

    public void removeHeader(Header header)
    {
        if (header == null)
        {
            return;
        } else
        {
            headers.remove(header);
            return;
        }
    }

    public void setHeaders(Header aheader[])
    {
        clear();
        if (aheader != null)
        {
            int i = 0;
            while (i < aheader.length) 
            {
                headers.add(aheader[i]);
                i++;
            }
        }
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
