// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class fbr
    implements Comparator
{

    fbr(fbq fbq)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (fcj)obj;
        obj1 = (fcj)obj1;
        return Long.valueOf(((fcj) (obj)).c()).compareTo(Long.valueOf(((fcj) (obj1)).c()));
    }
}
