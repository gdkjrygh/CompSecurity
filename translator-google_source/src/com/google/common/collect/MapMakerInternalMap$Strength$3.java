// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;

// Referenced classes of package com.google.common.collect:
//            cx, cj, cr

final class nit> extends nit>
{

    final Equivalence defaultEquivalence()
    {
        return Equivalence.identity();
    }

    final cr referenceValue(nit> nit>, cj cj, Object obj)
    {
        return new cx(nit>.ueReferenceQueue, obj, cj);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
