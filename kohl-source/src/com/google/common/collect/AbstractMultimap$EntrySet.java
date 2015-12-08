// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, Sets

private class <init> extends <init>
    implements Set
{

    final AbstractMultimap this$0;

    public boolean equals(Object obj)
    {
        return Sets.equalsImpl(this, obj);
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    private _cls9()
    {
        this$0 = AbstractMultimap.this;
        super(AbstractMultimap.this, null);
    }

    init>(init> init>)
    {
        this();
    }
}
