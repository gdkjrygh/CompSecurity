// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractIndexedListIterator, TransformedImmutableList

class  extends AbstractIndexedListIterator
{

    final TransformedImmutableList this$0;

    protected Object get(int i)
    {
        return TransformedImmutableList.this.get(i);
    }

    (int i, int j)
    {
        this$0 = TransformedImmutableList.this;
        super(i, j);
    }
}
