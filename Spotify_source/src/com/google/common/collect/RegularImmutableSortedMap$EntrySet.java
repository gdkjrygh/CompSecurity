// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ImmutableList, RegularImmutableSortedMap, ImmutableMap, 
//            ImmutableAsList, ImmutableSortedSet, Maps, ImmutableCollection

class <init> extends ImmutableMapEntrySet
{

    final RegularImmutableSortedMap this$0;

    public final cvh a()
    {
        return b().a();
    }

    final ImmutableMap d()
    {
        return RegularImmutableSortedMap.this;
    }

    final ImmutableList f()
    {
        return new ImmutableAsList() {

            private final ImmutableList keyList;
            final RegularImmutableSortedMap.EntrySet this$1;

            final ImmutableCollection c()
            {
                return RegularImmutableSortedMap.EntrySet.this;
            }

            public Object get(int i)
            {
                return Maps.a(keyList.get(i), RegularImmutableSortedMap.a(this$0).get(i));
            }

            
            {
                this$1 = RegularImmutableSortedMap.EntrySet.this;
                super();
                keyList = a.b();
            }
        };
    }

    public Iterator iterator()
    {
        return b().a();
    }

    private _cls1.keyList()
    {
        this$0 = RegularImmutableSortedMap.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
