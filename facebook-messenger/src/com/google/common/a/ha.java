// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            hb, hn, gw, jf

class ha extends AbstractSequentialList
{

    final gw a;

    ha(gw gw1)
    {
        a = gw1;
        super();
    }

    public ListIterator listIterator(int i)
    {
        return new hb(this, new hn(a, i));
    }

    public int size()
    {
        return gw.d(a).size();
    }
}
