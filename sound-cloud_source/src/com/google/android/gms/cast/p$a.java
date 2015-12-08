// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            p, o

private final class c
{

    public int a;
    List b;
    SparseArray c;
    final p d;

    public final int a()
    {
        return b.size();
    }

    public final o a(int i)
    {
        Integer integer = (Integer)c.get(i);
        if (integer == null)
        {
            return null;
        } else
        {
            return (o)b.get(integer.intValue());
        }
    }

    final void a(o ao[])
    {
        b.clear();
        c.clear();
        for (int i = 0; i < ao.length; i++)
        {
            o o1 = ao[i];
            b.add(o1);
            c.put(o1.b, Integer.valueOf(i));
        }

    }

    (p p1)
    {
        d = p1;
        super();
        a = 0;
        b = new ArrayList();
        c = new SparseArray();
    }
}
