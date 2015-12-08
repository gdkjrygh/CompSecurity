// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public static final class >
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (TZ)obj;
        obj1 = (TZ)obj1;
        int i = Math.max(((TZ) (obj)).b().intValue(), ((TZ) (obj)).c().intValue());
        int j = Math.min(((TZ) (obj)).b().intValue(), ((TZ) (obj)).c().intValue());
        int k = Math.max(((TZ) (obj1)).b().intValue(), ((TZ) (obj1)).c().intValue());
        int l = Math.min(((TZ) (obj1)).b().intValue(), ((TZ) (obj1)).c().intValue());
        if (i != k)
        {
            return i - k;
        } else
        {
            return j - l;
        }
    }

    protected >()
    {
    }
}
