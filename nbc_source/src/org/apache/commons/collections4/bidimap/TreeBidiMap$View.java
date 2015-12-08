// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.bidimap;

import java.util.AbstractSet;

// Referenced classes of package org.apache.commons.collections4.bidimap:
//            TreeBidiMap

abstract class orderType extends AbstractSet
{

    final lement orderType;
    final TreeBidiMap this$0;

    public void clear()
    {
        TreeBidiMap.this.clear();
    }

    public int size()
    {
        return TreeBidiMap.this.size();
    }

    lement(lement lement)
    {
        this$0 = TreeBidiMap.this;
        super();
        orderType = lement;
    }
}
