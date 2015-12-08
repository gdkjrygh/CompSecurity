// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal:
//            LinkedTreeMap

class this._cls0 extends AbstractSet
{

    final LinkedTreeMap this$0;

    public void clear()
    {
        LinkedTreeMap.this.clear();
    }

    public boolean contains(Object obj)
    {
        return containsKey(obj);
    }

    public Iterator iterator()
    {
        return new LinkedTreeMap.LinkedTreeMapIterator() {

            final LinkedTreeMap.KeySet this$1;

            public Object next()
            {
                return nextNode().key;
            }

            
            {
                this$1 = LinkedTreeMap.KeySet.this;
                super(this$0, null);
            }
        };
    }

    public boolean remove(Object obj)
    {
        return removeInternalByKey(obj) != null;
    }

    public int size()
    {
        return LinkedTreeMap.this.size;
    }

    this._cls0()
    {
        this$0 = LinkedTreeMap.this;
        super();
    }
}
