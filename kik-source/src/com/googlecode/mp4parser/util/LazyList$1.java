// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.util:
//            LazyList

class pos
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

    ()
    {
        this$0 = LazyList.this;
        super();
        pos = 0;
    }
}
