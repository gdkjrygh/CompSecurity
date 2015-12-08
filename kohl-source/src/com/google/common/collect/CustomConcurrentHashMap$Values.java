// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

final class this._cls0 extends AbstractCollection
{

    final CustomConcurrentHashMap this$0;

    public void clear()
    {
        CustomConcurrentHashMap.this.clear();
    }

    public boolean contains(Object obj)
    {
        return containsValue(obj);
    }

    public boolean isEmpty()
    {
        return CustomConcurrentHashMap.this.isEmpty();
    }

    public Iterator iterator()
    {
        return new erator(CustomConcurrentHashMap.this);
    }

    public int size()
    {
        return CustomConcurrentHashMap.this.size();
    }

    erator()
    {
        this$0 = CustomConcurrentHashMap.this;
        super();
    }
}
