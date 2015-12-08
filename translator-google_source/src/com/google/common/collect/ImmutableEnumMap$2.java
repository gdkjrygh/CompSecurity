// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ar, ImmutableEnumMap, ej, 
//            ImmutableMap

class t extends ImmutableMapEntrySet
{

    final ImmutableEnumMap this$0;

    public ej iterator()
    {
        return new ar(this);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    ImmutableMap map()
    {
        return ImmutableEnumMap.this;
    }

    t()
    {
        this$0 = ImmutableEnumMap.this;
        super();
    }
}
