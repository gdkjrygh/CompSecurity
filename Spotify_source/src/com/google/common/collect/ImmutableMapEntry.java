// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuj;

// Referenced classes of package com.google.common.collect:
//            ImmutableEntry

public abstract class ImmutableMapEntry extends ImmutableEntry
{

    ImmutableMapEntry(ImmutableMapEntry immutablemapentry)
    {
        super(immutablemapentry.getKey(), immutablemapentry.getValue());
    }

    ImmutableMapEntry(Object obj, Object obj1)
    {
        super(obj, obj1);
        cuj.a(obj, obj1);
    }

    abstract ImmutableMapEntry a();

    abstract ImmutableMapEntry b();
}
