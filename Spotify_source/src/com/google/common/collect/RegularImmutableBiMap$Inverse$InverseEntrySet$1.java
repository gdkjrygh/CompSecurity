// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableAsList, RegularImmutableBiMap, Maps, ImmutableCollection

class this._cls2 extends ImmutableAsList
{

    final this._cls2 this$2;

    final ImmutableCollection c()
    {
        return this._cls2.this;
    }

    public Object get(int i)
    {
        ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.a(_fld2)[i];
        return Maps.a(immutablemapentry._mth0(), immutablemapentry._mth0());
    }

    ()
    {
        this$2 = this._cls2.this;
        super();
    }
}
