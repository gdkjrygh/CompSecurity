// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

final class this._cls0 extends AbstractSet
{

    final CustomConcurrentHashMap this$0;

    public void clear()
    {
        CustomConcurrentHashMap.this.clear();
    }

    public boolean contains(Object obj)
    {
        return containsKey(obj);
    }

    public boolean isEmpty()
    {
        return CustomConcurrentHashMap.this.isEmpty();
    }

    public Iterator iterator()
    {
        return new ator(CustomConcurrentHashMap.this);
    }

    public boolean remove(Object obj)
    {
        return CustomConcurrentHashMap.this.remove(obj) != null;
    }

    public int size()
    {
        return CustomConcurrentHashMap.this.size();
    }

    ator()
    {
        this$0 = CustomConcurrentHashMap.this;
        super();
    }
}
