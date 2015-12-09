// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntry

final class nextInValueBucket extends ImmutableMapEntry
{

    private final ImmutableMapEntry nextInKeyBucket;
    private final ImmutableMapEntry nextInValueBucket;

    final ImmutableMapEntry a()
    {
        return nextInKeyBucket;
    }

    final ImmutableMapEntry b()
    {
        return nextInValueBucket;
    }

    (ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1, ImmutableMapEntry immutablemapentry2)
    {
        super(immutablemapentry);
        nextInKeyBucket = immutablemapentry1;
        nextInValueBucket = immutablemapentry2;
    }
}
