// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;

// Referenced classes of package com.google.common.a:
//            ct, dj, cn, cm, 
//            dd

final class cw extends ct
{

    cw(String s, int i)
    {
        super(s, i, null);
    }

    Equivalence defaultEquivalence()
    {
        return Equivalences.identity();
    }

    dd referenceValue(cn cn1, cm cm, Object obj)
    {
        return new dj(cn1.h, obj, cm);
    }
}
