// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuw;
import cvh;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableEnumMap

class  extends ImmutableSet
{

    final ImmutableEnumMap this$0;

    public final cvh a()
    {
        return cuw.a(ImmutableEnumMap.a(ImmutableEnumMap.this).keySet().iterator());
    }

    public boolean contains(Object obj)
    {
        return ImmutableEnumMap.a(ImmutableEnumMap.this).containsKey(obj);
    }

    final boolean e()
    {
        return true;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return ImmutableEnumMap.this.size();
    }

    ()
    {
        this$0 = ImmutableEnumMap.this;
        super();
    }
}
