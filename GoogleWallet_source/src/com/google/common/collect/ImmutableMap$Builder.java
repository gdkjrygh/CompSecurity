// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ObjectArrays, RegularImmutableMap

public static class size
{

    minalEntry entries[];
    int size;

    private void ensureCapacity(int i)
    {
        if (i > entries.length)
        {
            entries = (minalEntry[])ObjectArrays.arraysCopyOf(entries, uilder.expandedCapacity(entries.length, i));
        }
    }

    public ImmutableMap build()
    {
        switch (size)
        {
        default:
            return new RegularImmutableMap(size, entries);

        case 0: // '\0'
            return ImmutableMap.of();

        case 1: // '\001'
            return ImmutableMap.of(entries[0].getKey(), entries[0].getValue());
        }
    }

    public minalEntry.getValue put(Object obj, Object obj1)
    {
        ensureCapacity(size + 1);
        obj = ImmutableMap.entryOf(obj, obj1);
        obj1 = entries;
        int i = size;
        size = i + 1;
        obj1[i] = obj;
        return this;
    }

    public minalEntry()
    {
        this(4);
    }

    private <init>(int i)
    {
        entries = new minalEntry[i];
        size = 0;
    }
}
