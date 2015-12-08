// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class iej
    implements Comparator
{

    iej()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (iei)obj;
        return Integer.valueOf(((iei)obj1).d).compareTo(Integer.valueOf(((iei) (obj)).d));
    }
}
