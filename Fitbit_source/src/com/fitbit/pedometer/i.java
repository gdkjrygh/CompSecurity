// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class i
{

    private static final String a = "PedometerManufacturerDeterminant";
    private List b;

    i()
    {
        b = new ArrayList();
    }

    protected void a(a a1)
    {
        b.add(a1);
    }

    final boolean a()
    {
        Iterator iterator = b.iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_40;
        }
    /* block-local class not found */
    class a {}

        flag = ((a)iterator.next()).a();
        if (!flag)
        {
            return false;
        }
          goto _L1
        return true;
        Throwable throwable;
        throwable;
        com.fitbit.e.a.e("PedometerManufacturerDeterminant", throwable.toString(), new Object[0]);
        return false;
    }
}
