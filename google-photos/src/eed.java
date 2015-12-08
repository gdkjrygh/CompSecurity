// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class eed
    implements Comparator
{

    eed(eec eec)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (dum)obj;
        obj1 = (dum)obj1;
        if (((dum) (obj)).f != ((dum) (obj1)).f)
        {
            return ((dum) (obj)).f.compareTo(((dum) (obj1)).f);
        }
        long l = ((dum) (obj)).b;
        long l1 = ((dum) (obj1)).b;
        byte byte0;
        if (l < l1)
        {
            byte0 = -1;
        } else
        if (l == l1)
        {
            byte0 = 0;
        } else
        {
            byte0 = 1;
        }
        return -byte0;
    }
}
