// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

final class this._cls0 extends AbstractCollection
{

    final this._cls0 this$0;

    public void clear()
    {
        _mth0();
    }

    public boolean contains(Object obj)
    {
        return sValue(obj);
    }

    public boolean isEmpty()
    {
        return ();
    }

    public Iterator iterator()
    {
        return new erator(this._cls0.this);
    }

    public int size()
    {
        return _mth0();
    }

    erator()
    {
        this$0 = this._cls0.this;
        super();
    }
}
