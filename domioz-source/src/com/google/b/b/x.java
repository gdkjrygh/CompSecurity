// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.util.Comparator;

final class x
    implements Comparator
{

    x()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        return ((Comparable)obj).compareTo((Comparable)obj1);
    }
}
