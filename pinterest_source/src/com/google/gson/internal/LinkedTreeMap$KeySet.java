// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal:
//            LinkedTreeMap

final class this._cls0 extends AbstractSet
{

    final LinkedTreeMap this$0;

    public final void clear()
    {
        LinkedTreeMap.this.clear();
    }

    public final boolean contains(Object obj)
    {
        return containsKey(obj);
    }

    public final Iterator iterator()
    {
        class _cls1 extends LinkedTreeMap.LinkedTreeMapIterator
        {

            final LinkedTreeMap.KeySet this$1;

            public Object next()
            {
                return nextNode().key;
            }

            _cls1()
            {
                this$1 = LinkedTreeMap.KeySet.this;
                super(this$0, null);
            }
        }

        return new _cls1();
    }

    public final boolean remove(Object obj)
    {
        return removeInternalByKey(obj) != null;
    }

    public final int size()
    {
        return LinkedTreeMap.this.size;
    }

    _cls1()
    {
        this$0 = LinkedTreeMap.this;
        super();
    }
}
