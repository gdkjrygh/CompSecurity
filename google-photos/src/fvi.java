// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class fvi
    implements Comparator
{

    fvi(fvg fvg)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (ekq)obj;
        obj1 = (ekq)obj1;
        obj = (fux)obj;
        obj1 = (fux)obj1;
        long l = ((fux) (obj)).c;
        long l1 = ((fux) (obj1)).c;
        if (!((fux) (obj)).b() && !((fux) (obj1)).b())
        {
            if (((fux) (obj)).c == 0L && ((fux) (obj1)).c == 0L)
            {
                return ((elj)((fux) (obj)).a(elj)).a.compareTo(((elj)((fux) (obj1)).a(elj)).a);
            } else
            {
                return Long.valueOf(l1).compareTo(Long.valueOf(l));
            }
        }
        if (((fux) (obj)).b())
        {
            return !((fux) (obj1)).b() ? -1 : 0;
        } else
        {
            return 1;
        }
    }
}
