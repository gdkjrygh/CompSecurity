// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, Sets, ImmutableList

class  extends UnmodifiableIterator
{

    int index;
    final  this$0;

    public boolean hasNext()
    {
        return index < ze;
    }

    public volatile Object next()
    {
        return next();
    }

    public List next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        Object aobj[] = new Object[es.size()];
        for (int i = 0; i < aobj.length; i++)
        {
            aobj[i] = ((is)es.get(i)).getForIndex(index);
        }

        index = index + 1;
        return ImmutableList.copyOf(aobj);
    }

    is()
    {
        this$0 = this._cls0.this;
        super();
    }
}
