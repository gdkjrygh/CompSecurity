// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.apache.commons.collections4.map:
//            AbstractReferenceMap, AbstractHashedMap

static class  extends 
{

    public Object[] toArray()
    {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(size());
        for (Iterator iterator = iterator(); iterator.hasNext(); arraylist.add(iterator.next())) { }
        return arraylist.toArray(aobj);
    }

    protected (AbstractHashedMap abstracthashedmap)
    {
        super(abstracthashedmap);
    }
}
