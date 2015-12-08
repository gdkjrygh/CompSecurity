// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableAsList, RegularImmutableSortedMap, ImmutableSortedSet, ImmutableList, 
//            Maps, ImmutableCollection

class keyList extends ImmutableAsList
{

    private final ImmutableList keyList;
    final is._cls0 this$1;

    final ImmutableCollection c()
    {
        return this._cls1.this;
    }

    public Object get(int i)
    {
        return Maps.a(keyList.get(i), RegularImmutableSortedMap.a(_fld0).get(i));
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
        keyList = a.b();
    }
}
