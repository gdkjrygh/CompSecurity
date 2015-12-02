// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;

// Referenced classes of package com.google.common.a:
//            ct, db, cn, cm, 
//            dd

final class cu extends ct
{

    cu(String s, int i)
    {
        super(s, i, null);
    }

    Equivalence defaultEquivalence()
    {
        return Equivalences.equals();
    }

    dd referenceValue(cn cn, cm cm, Object obj)
    {
        return new db(obj);
    }
}
