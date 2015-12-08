// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableEntry, af

abstract class ImmutableMapEntry extends ImmutableEntry
{

    ImmutableMapEntry(ImmutableMapEntry immutablemapentry)
    {
        super(immutablemapentry.getKey(), immutablemapentry.getValue());
    }

    ImmutableMapEntry(Object obj, Object obj1)
    {
        super(obj, obj1);
        af.a(obj, obj1);
    }

    abstract ImmutableMapEntry getNextInKeyBucket();

    abstract ImmutableMapEntry getNextInValueBucket();
}
