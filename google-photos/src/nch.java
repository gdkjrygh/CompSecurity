// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class nch
    implements Comparator
{

    nch(ncg ncg)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (nbw)obj;
        obj1 = (nbw)obj1;
        return Long.signum(((nbw) (obj)).c - ((nbw) (obj1)).c);
    }
}
