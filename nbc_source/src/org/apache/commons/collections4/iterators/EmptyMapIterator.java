// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.ResettableIterator;

// Referenced classes of package org.apache.commons.collections4.iterators:
//            AbstractEmptyMapIterator

public class EmptyMapIterator extends AbstractEmptyMapIterator
    implements MapIterator, ResettableIterator
{

    public static final MapIterator INSTANCE = new EmptyMapIterator();

    protected EmptyMapIterator()
    {
    }

    public static MapIterator emptyMapIterator()
    {
        return INSTANCE;
    }

}
