// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.map;

import org.apache.commons.collections4.MapIterator;

// Referenced classes of package org.apache.commons.collections4.map:
//            AbstractHashedMap

protected static class it> extends it>
    implements MapIterator
{

    public Object getValue()
    {
        it> it> = currentEntry();
        if (it> == null)
        {
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        } else
        {
            return it>.ue();
        }
    }

    public Object next()
    {
        return super.tEntry().();
    }

    protected (AbstractHashedMap abstracthashedmap)
    {
        super(abstracthashedmap);
    }
}
