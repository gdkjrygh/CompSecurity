// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            fi, fm, jp, mh

abstract class fl extends fi
{

    final Object a[];
    final int b;

    fl(Object aobj[], int i)
    {
        a = aobj;
        b = i;
    }

    abstract Object a(Object obj);

    boolean c()
    {
        return true;
    }

    public mh h_()
    {
        return new fm(this, a.length);
    }

    public final int hashCode()
    {
        return b;
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
        return a.length;
    }

    public Object[] toArray()
    {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = jp.a(aobj, i);
_L4:
        for (i = 0; i < a.length; i++)
        {
            aobj1[i] = a(a[i]);
        }

        break; /* Loop/switch isn't completed */
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return aobj1;
    }
}
