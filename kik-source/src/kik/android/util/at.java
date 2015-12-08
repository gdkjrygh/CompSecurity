// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.util.Comparator;

final class at
    implements Comparator
{

    at()
    {
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (int[])obj;
        obj1 = (int[])obj1;
        return obj.length - obj1.length;
    }
}
