// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;

public class BasicListHeaderIterator
    implements HeaderIterator
{

    protected final List allHeaders;
    protected int currentIndex;
    protected String headerName;
    protected int lastIndex;

    public BasicListHeaderIterator(List list, String s)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("Header list must not be null.");
        } else
        {
            allHeaders = list;
            headerName = s;
            currentIndex = findNext(-1);
            lastIndex = -1;
            return;
        }
    }

    protected boolean filterHeader(int i)
    {
        if (headerName == null)
        {
            return true;
        } else
        {
            String s = ((Header)allHeaders.get(i)).getName();
            return headerName.equalsIgnoreCase(s);
        }
    }

    protected int findNext(int i)
    {
        if (i >= -1)
        {
            int j = allHeaders.size();
            boolean flag;
            for (flag = false; !flag && i < j - 1; flag = filterHeader(i))
            {
                i++;
            }

            if (flag)
            {
                return i;
            }
        }
        return -1;
    }

    public boolean hasNext()
    {
        return currentIndex >= 0;
    }

    public final Object next()
    {
        return nextHeader();
    }

    public Header nextHeader()
    {
        int i = currentIndex;
        if (i < 0)
        {
            throw new NoSuchElementException("Iteration already finished.");
        } else
        {
            lastIndex = i;
            currentIndex = findNext(i);
            return (Header)allHeaders.get(i);
        }
    }

    public void remove()
    {
        if (lastIndex < 0)
        {
            throw new IllegalStateException("No header to remove.");
        } else
        {
            allHeaders.remove(lastIndex);
            lastIndex = -1;
            currentIndex = currentIndex - 1;
            return;
        }
    }
}
