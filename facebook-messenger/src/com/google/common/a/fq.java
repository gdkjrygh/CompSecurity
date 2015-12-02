// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;

final class fq
    implements Comparator
{

    final Comparator a;

    fq(Comparator comparator)
    {
        a = comparator;
        super();
    }

    public int a(java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        return a.compare(entry.getKey(), entry1.getKey());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((java.util.Map.Entry)obj, (java.util.Map.Entry)obj1);
    }
}
