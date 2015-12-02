// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            em, gg, mh

class kt extends em
{

    final Object a;

    kt(Object obj)
    {
        a = obj;
    }

    boolean a()
    {
        return true;
    }

    public boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    public mh h_()
    {
        return gg.a(a);
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return 1;
    }
}
