// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.AbstractSet;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            ed

abstract class ee extends AbstractSet
{

    ee()
    {
    }

    public boolean removeAll(Collection collection)
    {
        return ed.a(this, collection);
    }

    public boolean retainAll(Collection collection)
    {
        return super.retainAll((Collection)p.a(collection));
    }
}
