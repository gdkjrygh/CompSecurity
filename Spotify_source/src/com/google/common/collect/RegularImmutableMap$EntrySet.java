// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ImmutableList, RegularImmutableAsList, RegularImmutableMap, 
//            ImmutableMap

class <init> extends ImmutableMapEntrySet
{

    final RegularImmutableMap this$0;

    public final cvh a()
    {
        return b().a();
    }

    final ImmutableMap d()
    {
        return RegularImmutableMap.this;
    }

    final ImmutableList f()
    {
        return new RegularImmutableAsList(this, RegularImmutableMap.a(RegularImmutableMap.this));
    }

    public Iterator iterator()
    {
        return b().a();
    }

    private ()
    {
        this$0 = RegularImmutableMap.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
