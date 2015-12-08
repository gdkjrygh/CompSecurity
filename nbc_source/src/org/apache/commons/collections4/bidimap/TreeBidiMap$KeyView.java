// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.bidimap;

import java.util.Iterator;

// Referenced classes of package org.apache.commons.collections4.bidimap:
//            TreeBidiMap

class ent extends ent
{

    final TreeBidiMap this$0;

    public boolean contains(Object obj)
    {
        TreeBidiMap.access$1500(obj, ent.KEY);
        return TreeBidiMap.access$1600(TreeBidiMap.this, obj) != null;
    }

    public Iterator iterator()
    {
        return new terator(TreeBidiMap.this, orderType);
    }

    public boolean remove(Object obj)
    {
        return TreeBidiMap.access$1700(TreeBidiMap.this, obj) != null;
    }

    public ent(ent ent)
    {
        this$0 = TreeBidiMap.this;
        super(TreeBidiMap.this, ent);
    }
}
