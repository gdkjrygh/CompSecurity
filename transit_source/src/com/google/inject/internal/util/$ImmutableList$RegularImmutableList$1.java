// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableList

class val.start
    implements ListIterator
{

    int index;
    final index this$0;
    final int val$start;

    public void add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext()
    {
        return index < cess._mth300(this._cls0.this);
    }

    public boolean hasPrevious()
    {
        return index > 0;
    }

    public Object next()
    {
        Object obj;
        try
        {
            obj = t(index);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            throw new NoSuchElementException();
        }
        index = index + 1;
        return obj;
    }

    public int nextIndex()
    {
        return index;
    }

    public Object previous()
    {
        Object obj;
        try
        {
            obj = t(index - 1);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            throw new NoSuchElementException();
        }
        index = index - 1;
        return obj;
    }

    public int previousIndex()
    {
        return index - 1;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public void set(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
        this$0 = final_;
        val$start = I.this;
        super();
        index = val$start;
    }
}
