// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            he, hg, gw, jf, 
//            gx

class hd extends AbstractSet
{

    final gw a;

    private hd(gw gw1)
    {
        a = gw1;
        super();
    }

    hd(gw gw1, gx gx)
    {
        this(gw1);
    }

    public Iterator iterator()
    {
        return new he(this, new hg(a, null));
    }

    public int size()
    {
        return gw.d(a).f().size();
    }
}
