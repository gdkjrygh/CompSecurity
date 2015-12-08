// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntry, RegularImmutableMap

static final class nextInKeyBucket extends ImmutableMapEntry
{

    private final ImmutableMapEntry nextInKeyBucket;

    final ImmutableMapEntry getNextInKeyBucket()
    {
        return nextInKeyBucket;
    }

    final ImmutableMapEntry getNextInValueBucket()
    {
        return null;
    }

    (ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1)
    {
        super(immutablemapentry);
        nextInKeyBucket = immutablemapentry1;
    }
}
