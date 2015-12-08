// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

private class <init>
    implements Iterator
{

    current current;
    current next;
    final LinkedListMultimap this$0;

    public boolean hasNext()
    {
        return next != null;
    }

    public next next()
    {
        LinkedListMultimap.access$100(next);
        current = next;
        next = next.next;
        return current;
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        boolean flag;
        if (current != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        LinkedListMultimap.access$200(LinkedListMultimap.this, current);
        current = null;
    }

    private ()
    {
        this$0 = LinkedListMultimap.this;
        super();
        next = LinkedListMultimap.access$000(LinkedListMultimap.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
