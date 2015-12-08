// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class hrx
    implements Comparator
{

    hrx()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        int j = 0;
        obj = (qav)obj;
        obj1 = (qav)obj1;
        int i;
        if (((qav) (obj)).f == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (((qav) (obj1)).f != null)
        {
            j = 1;
        }
        return j - i;
    }
}
