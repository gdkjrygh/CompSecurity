// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            hk, hg, hh, gw, 
//            jf

class hj extends AbstractSet
{

    final hh a;

    hj(hh hh1)
    {
        a = hh1;
        super();
    }

    public Iterator iterator()
    {
        return new hk(this, new hg(a.a, null));
    }

    public int size()
    {
        return gw.d(a.a).f().size();
    }
}
