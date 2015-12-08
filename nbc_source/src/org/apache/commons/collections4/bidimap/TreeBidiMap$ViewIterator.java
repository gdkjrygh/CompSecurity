// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.bidimap;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

// Referenced classes of package org.apache.commons.collections4.bidimap:
//            TreeBidiMap

abstract class previousNode
{

    private int expectedModifications;
    orderType lastReturnedNode;
    private orderType nextNode;
    private final orderType orderType;
    private orderType previousNode;
    final TreeBidiMap this$0;

    public final boolean hasNext()
    {
        return nextNode != null;
    }

    protected nextNode navigateNext()
    {
        if (nextNode == null)
        {
            throw new NoSuchElementException();
        }
        if (TreeBidiMap.access$2100(TreeBidiMap.this) != expectedModifications)
        {
            throw new ConcurrentModificationException();
        } else
        {
            lastReturnedNode = nextNode;
            previousNode = nextNode;
            nextNode = TreeBidiMap.access$2400(TreeBidiMap.this, nextNode, orderType);
            return lastReturnedNode;
        }
    }

    public final void remove()
    {
        if (lastReturnedNode == null)
        {
            throw new IllegalStateException();
        }
        if (TreeBidiMap.access$2100(TreeBidiMap.this) != expectedModifications)
        {
            throw new ConcurrentModificationException();
        }
        TreeBidiMap.access$2000(TreeBidiMap.this, lastReturnedNode);
        expectedModifications = expectedModifications + 1;
        lastReturnedNode = null;
        if (nextNode == null)
        {
            previousNode = TreeBidiMap.access$2600(TreeBidiMap.this, TreeBidiMap.access$2200(TreeBidiMap.this)[orderType.rdinal()], orderType);
            return;
        } else
        {
            previousNode = TreeBidiMap.access$2500(TreeBidiMap.this, nextNode, orderType);
            return;
        }
    }

    ( )
    {
        this$0 = TreeBidiMap.this;
        super();
        orderType = ;
        expectedModifications = TreeBidiMap.access$2100(TreeBidiMap.this);
        nextNode = TreeBidiMap.access$2300(TreeBidiMap.this, TreeBidiMap.access$2200(TreeBidiMap.this)[.rdinal()], );
        lastReturnedNode = null;
        previousNode = null;
    }
}
