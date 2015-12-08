// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

final class this._cls0 extends AbstractSet
{

    final this._cls0 this$0;

    public void clear()
    {
        _mth0();
    }

    public boolean contains(Object obj)
    {
        return sKey(obj);
    }

    public boolean isEmpty()
    {
        return ();
    }

    public Iterator iterator()
    {
        return new ator(this._cls0.this);
    }

    public boolean remove(Object obj)
    {
        return _mth0(obj) != null;
    }

    public int size()
    {
        return _mth0();
    }

    ator()
    {
        this$0 = this._cls0.this;
        super();
    }
}
