// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            UnmodifiableListIterator, ImmutableList

class val.forward extends UnmodifiableListIterator
{

    final val.forward this$0;
    final UnmodifiableListIterator val$forward;

    public boolean hasNext()
    {
        return val$forward.hasPrevious();
    }

    public boolean hasPrevious()
    {
        return val$forward.hasNext();
    }

    public Object next()
    {
        return val$forward.previous();
    }

    public int nextIndex()
    {
        return cess._mth000(this._cls0.this, val$forward.previousIndex());
    }

    public Object previous()
    {
        return val$forward.next();
    }

    public int previousIndex()
    {
        return cess._mth000(this._cls0.this, val$forward.nextIndex());
    }

    ()
    {
        this$0 = final_;
        val$forward = UnmodifiableListIterator.this;
        super();
    }
}
