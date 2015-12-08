// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class q
{
    static interface a
    {

        public abstract boolean a()
            throws Throwable;
    }


    private List a;

    q()
    {
        a = new ArrayList();
    }

    protected void a(a a1)
    {
        a.add(a1);
    }

    final boolean b()
    {
        Iterator iterator = a.iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        flag = ((a)iterator.next()).a();
        if (!flag)
        {
            return false;
        }
          goto _L1
        return true;
        Throwable throwable;
        throwable;
        return false;
    }
}
