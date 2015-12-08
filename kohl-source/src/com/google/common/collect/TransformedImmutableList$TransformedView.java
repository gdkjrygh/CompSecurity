// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            TransformedImmutableList, ImmutableList

private class this._cls0 extends TransformedImmutableList
{

    final TransformedImmutableList this$0;

    public volatile ListIterator listIterator(int i)
    {
        return super.listIterator(i);
    }

    public volatile List subList(int i, int j)
    {
        return super.subList(i, j);
    }

    Object transform(Object obj)
    {
        return TransformedImmutableList.this.transform(obj);
    }

    (ImmutableList immutablelist)
    {
        this$0 = TransformedImmutableList.this;
        super(immutablelist);
    }
}
