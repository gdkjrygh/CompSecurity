// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            StandardTable

class init> extends init>
{

    final StandardTable this$0;

    public boolean contains(Object obj)
    {
        return containsRow(obj);
    }

    public Iterator iterator()
    {
        return StandardTable.keyIteratorImpl(rowMap());
    }

    public boolean remove(Object obj)
    {
        return obj != null && backingMap.remove(obj) != null;
    }

    public int size()
    {
        return backingMap.size();
    }

    ()
    {
        this$0 = StandardTable.this;
        super(StandardTable.this, null);
    }
}
