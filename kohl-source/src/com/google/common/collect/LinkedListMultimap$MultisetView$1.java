// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

class val.nodes
    implements Iterator
{

    final val.nodes this$1;
    final Iterator val$nodes;

    public boolean hasNext()
    {
        return val$nodes.hasNext();
    }

    public Object next()
    {
        return ((val.nodes)val$nodes.next()).nodes;
    }

    public void remove()
    {
        val$nodes.remove();
    }

    A()
    {
        this$1 = final_a;
        val$nodes = Iterator.this;
        super();
    }
}
