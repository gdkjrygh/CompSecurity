// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableMap

abstract class ImmutableMapEntrySet extends ImmutableSet
{
    static final class EntrySetSerializedForm
        implements Serializable
    {

        final ImmutableMap map;

        EntrySetSerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }


    ImmutableMapEntrySet()
    {
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = map().get(((java.util.Map.Entry) (obj)).getKey());
            flag = flag1;
            if (obj1 != null)
            {
                flag = flag1;
                if (obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    boolean isPartialView()
    {
        return map().isPartialView();
    }

    abstract ImmutableMap map();

    public int size()
    {
        return map().size();
    }

    Object writeReplace()
    {
        return new EntrySetSerializedForm(map());
    }
}
