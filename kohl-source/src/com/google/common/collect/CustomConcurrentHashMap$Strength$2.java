// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

static final class nit> extends nit>
{

    Equivalence defaultEquivalence()
    {
        return Equivalences.identity();
    }

    nce referenceValue(try try1, Object obj)
    {
        return new ference(obj, try1);
    }

    nce(String s, int i)
    {
        super(s, i, null);
    }
}
