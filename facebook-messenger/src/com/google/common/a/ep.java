// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            em, gg, es, en, 
//            mh

class ep extends em
{

    private static final Object a[] = new Object[0];

    private ep()
    {
    }

    ep(en en)
    {
        this();
    }

    boolean a()
    {
        return false;
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public mh h_()
    {
        return gg.a;
    }

    es i()
    {
        return es.d();
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return 0;
    }

    public Object[] toArray()
    {
        return a;
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }

}
