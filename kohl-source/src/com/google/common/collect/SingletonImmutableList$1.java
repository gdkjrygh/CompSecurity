// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableListIterator, SingletonImmutableList

class hasNext extends UnmodifiableListIterator
{

    boolean hasNext;
    final SingletonImmutableList this$0;
    final int val$start;

    public boolean hasNext()
    {
        return hasNext;
    }

    public boolean hasPrevious()
    {
        return !hasNext;
    }

    public Object next()
    {
        if (!hasNext)
        {
            throw new NoSuchElementException();
        } else
        {
            hasNext = false;
            return element;
        }
    }

    public int nextIndex()
    {
        return !hasNext ? 1 : 0;
    }

    public Object previous()
    {
        if (hasNext)
        {
            throw new NoSuchElementException();
        } else
        {
            hasNext = true;
            return element;
        }
    }

    public int previousIndex()
    {
        return !hasNext ? 0 : -1;
    }

    ()
    {
        this$0 = final_singletonimmutablelist;
        val$start = I.this;
        super();
        boolean flag;
        if (val$start == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hasNext = flag;
    }
}
