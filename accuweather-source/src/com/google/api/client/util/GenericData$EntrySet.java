// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.api.client.util:
//            GenericData, DataMap, ClassInfo

final class se extends AbstractSet
{

    private final  dataEntrySet;
    final GenericData this$0;

    public void clear()
    {
        unknownFields.clear();
        dataEntrySet.r();
    }

    public Iterator iterator()
    {
        return new ator(GenericData.this, dataEntrySet);
    }

    public int size()
    {
        return unknownFields.size() + dataEntrySet.();
    }

    ator()
    {
        this$0 = GenericData.this;
        super();
        dataEntrySet = (new DataMap(GenericData.this, classInfo.getIgnoreCase())).entrySet();
    }
}
