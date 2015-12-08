// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Maps

private class <init>
    implements Iterator
{

    current current;
    current next;
    final Set seenKeys;
    final LinkedListMultimap this$0;

    public boolean hasNext()
    {
        return next != null;
    }

    public Object next()
    {
        LinkedListMultimap.access$100(next);
        current = next;
        seenKeys.add(current.current);
        do
        {
            next = next.next;
        } while (next != null && !seenKeys.add(next.next));
        return current.current;
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
        LinkedListMultimap.access$300(LinkedListMultimap.this, current.current);
        current = null;
    }

    private ()
    {
        this$0 = LinkedListMultimap.this;
        super();
        seenKeys = new HashSet(Maps.capacity(keySet().size()));
        next = LinkedListMultimap.access$000(LinkedListMultimap.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
