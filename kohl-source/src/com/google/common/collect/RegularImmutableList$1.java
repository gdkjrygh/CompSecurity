// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractIndexedListIterator, RegularImmutableList

class ator extends AbstractIndexedListIterator
{

    final RegularImmutableList this$0;

    protected Object get(int i)
    {
        return RegularImmutableList.access$000(RegularImmutableList.this)[RegularImmutableList.access$100(RegularImmutableList.this) + i];
    }

    ator(int i, int j)
    {
        this$0 = RegularImmutableList.this;
        super(i, j);
    }
}
