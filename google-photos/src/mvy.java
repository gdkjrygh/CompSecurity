// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public final class mvy
    implements Comparator
{

    public mvy()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (mvx)obj;
        obj1 = (mvx)obj1;
        return ((mvx) (obj)).a().compareTo(((mvx) (obj1)).a());
    }
}
