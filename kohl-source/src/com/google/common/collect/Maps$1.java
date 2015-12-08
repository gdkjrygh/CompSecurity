// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, Maps

static final class tMapEntry extends AbstractMapEntry
{

    final java.util.ry val$entry;

    public Object getKey()
    {
        return val$entry.getKey();
    }

    public Object getValue()
    {
        return val$entry.getValue();
    }

    tMapEntry(java.util.ry ry)
    {
        val$entry = ry;
        super();
    }
}
