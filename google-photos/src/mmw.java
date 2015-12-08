// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class mmw
    implements Comparator
{

    mmw()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (mmx)obj;
        obj1 = (mmx)obj1;
        int i = ((mmx) (obj)).a("device_index", 0x7fffffff);
        int j = ((mmx) (obj1)).a("device_index", 0x7fffffff);
        if (i < j)
        {
            return -1;
        }
        return i != j ? 1 : 0;
    }
}
