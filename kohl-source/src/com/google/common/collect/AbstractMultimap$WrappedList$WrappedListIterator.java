// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

private class r extends r
    implements ListIterator
{

    final getDelegateListIterator this$1;

    private ListIterator getDelegateListIterator()
    {
        return (ListIterator)getDelegateIterator();
    }

    public void add(Object obj)
    {
        boolean flag = getDelegateIterator();
        getDelegateListIterator().add(obj);
        int _tmp = AbstractMultimap.access$208(this._cls1.this.getDelegateListIterator);
        if (flag)
        {
            _mth1();
        }
    }

    public boolean hasPrevious()
    {
        return getDelegateListIterator().hasPrevious();
    }

    public int nextIndex()
    {
        return getDelegateListIterator().nextIndex();
    }

    public Object previous()
    {
        return getDelegateListIterator().previous();
    }

    public int previousIndex()
    {
        return getDelegateListIterator().previousIndex();
    }

    public void set(Object obj)
    {
        getDelegateListIterator().set(obj);
    }

    r()
    {
        this$1 = this._cls1.this;
        super(r.this);
    }

    public r(int i)
    {
        this$1 = this._cls1.this;
        super(r.this, r.this.r().listIterator(i));
    }
}
