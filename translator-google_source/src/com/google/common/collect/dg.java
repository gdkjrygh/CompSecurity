// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;

// Referenced classes of package com.google.common.collect:
//            de

abstract class dg extends AbstractCollection
{

    dg()
    {
    }

    abstract de a();

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            return a().containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
        } else
        {
            return false;
        }
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            return a().remove(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a().size();
    }
}
