// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

final class bz extends AbstractList
    implements Serializable, RandomAccess
{

    final Object a;
    final Object b[];

    bz(Object obj, Object aobj[])
    {
        a = obj;
        b = (Object[])ad.a(((Object) (aobj)));
    }

    public final Object get(int i)
    {
        ad.a(i, size());
        if (i == 0)
        {
            return a;
        } else
        {
            return b[i - 1];
        }
    }

    public final int size()
    {
        return b.length + 1;
    }
}
