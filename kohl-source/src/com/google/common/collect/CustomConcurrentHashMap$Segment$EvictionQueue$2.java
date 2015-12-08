// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractLinkedIterator, CustomConcurrentHashMap

class this._cls2 extends AbstractLinkedIterator
{

    final computeNext this$2;

    protected this._cls2 computeNext(this._cls2 _pcls2)
    {
        this._cls2 _lcls2 = _pcls2.ictable();
        _pcls2 = _lcls2;
        if (_lcls2 == ad)
        {
            _pcls2 = null;
        }
        return _pcls2;
    }

    protected volatile Object computeNext(Object obj)
    {
        return computeNext((computeNext)obj);
    }

    ( 1)
    {
        this$2 = this._cls2.this;
        super(1);
    }
}
