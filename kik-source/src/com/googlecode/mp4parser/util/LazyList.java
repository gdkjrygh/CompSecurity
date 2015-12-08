// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.googlecode.mp4parser.util:
//            Logger

public class LazyList extends AbstractList
{

    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/util/LazyList);
    Iterator elementSource;
    List underlying;

    public LazyList(List list, Iterator iterator1)
    {
        underlying = list;
        elementSource = iterator1;
    }

    private void blowup()
    {
        LOG.logDebug("blowup running");
        do
        {
            if (!elementSource.hasNext())
            {
                return;
            }
            underlying.add(elementSource.next());
        } while (true);
    }

    public Object get(int i)
    {
        if (underlying.size() > i)
        {
            return underlying.get(i);
        }
        if (elementSource.hasNext())
        {
            underlying.add(elementSource.next());
            return get(i);
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public List getUnderlying()
    {
        return underlying;
    }

    public Iterator iterator()
    {
        return new _cls1();
    }

    public int size()
    {
        LOG.logDebug("potentially expensive size() call");
        blowup();
        return underlying.size();
    }


    private class _cls1
        implements Iterator
    {

        int pos;
        final LazyList this$0;

        public boolean hasNext()
        {
            return pos < underlying.size() || elementSource.hasNext();
        }

        public Object next()
        {
            if (pos < underlying.size())
            {
                List list = underlying;
                int i = pos;
                pos = i + 1;
                return list.get(i);
            } else
            {
                underlying.add(elementSource.next());
                return next();
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        _cls1()
        {
            this$0 = LazyList.this;
            super();
            pos = 0;
        }
    }

}
