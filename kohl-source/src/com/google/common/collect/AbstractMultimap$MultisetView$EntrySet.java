// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

private class <init> extends AbstractSet
{

    final this._cls1 this$1;

    public void clear()
    {
        AbstractMultimap.this.clear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof <init>)
        {
            obj = (<init>)obj;
            Collection collection = (Collection)AbstractMultimap.access$000(this._cls1.this.<init>).get(((this._cls1) (obj))._mth1());
            if (collection != null && collection.size() == ((this._cls1) (obj))._mth1())
            {
                return true;
            }
        }
        return false;
    }

    public Iterator iterator()
    {
        return new <init>(this._cls1.this.<init>, null);
    }

    public boolean remove(Object obj)
    {
        return contains(obj) && AbstractMultimap.access$500(this._cls1.this.contains, ((this._cls1)obj)._mth1()) > 0;
    }

    public int size()
    {
        return AbstractMultimap.access$000(_fld1).size();
    }

    private ()
    {
        this$1 = this._cls1.this;
        super();
    }

    this._cls1(this._cls1 _pcls1_1)
    {
        this();
    }
}
