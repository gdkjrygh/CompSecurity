// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractIndexedListIterator, RegularImmutableMap

class init> extends AbstractIndexedListIterator
{

    final ry.getValue this$0;

    protected Object get(int i)
    {
        return RegularImmutableMap.access$000(p)[i].getValue();
    }

    ry(int i)
    {
        this$0 = this._cls0.this;
        super(i);
    }
}
