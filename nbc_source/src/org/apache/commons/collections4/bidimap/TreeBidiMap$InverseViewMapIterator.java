// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.OrderedMapIterator;

// Referenced classes of package org.apache.commons.collections4.bidimap:
//            TreeBidiMap

class this._cls0 extends this._cls0
    implements OrderedMapIterator
{

    final TreeBidiMap this$0;

    public Comparable getValue()
    {
        if (lastReturnedNode == null)
        {
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        } else
        {
            return lastReturnedNode.lastReturnedNode();
        }
    }

    public volatile Object getValue()
    {
        return getValue();
    }

    public Comparable next()
    {
        return navigateNext().navigateNext();
    }

    public volatile Object next()
    {
        return next();
    }

    public ( )
    {
        this$0 = TreeBidiMap.this;
        super(TreeBidiMap.this, );
    }
}
