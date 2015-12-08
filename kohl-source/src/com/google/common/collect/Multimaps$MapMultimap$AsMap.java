// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multimaps

class it> extends it>
{

    final All this$0;

    public boolean containsKey(Object obj)
    {
        return it>.containsKey(obj);
    }

    protected Set createEntrySet()
    {
        return new ntries(this._cls0.this);
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Collection get(Object obj)
    {
        Set set = get.this.get(obj);
        obj = set;
        if (set.isEmpty())
        {
            obj = null;
        }
        return ((Collection) (obj));
    }

    public volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public Collection remove(Object obj)
    {
        Set set = All(obj);
        obj = set;
        if (set.isEmpty())
        {
            obj = null;
        }
        return ((Collection) (obj));
    }

    ntries()
    {
        this$0 = this._cls0.this;
        super();
    }
}
