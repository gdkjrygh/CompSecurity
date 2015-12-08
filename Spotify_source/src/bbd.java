// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class bbd extends bbc
{

    final List h;

    public bbd(bax bax1, long l, long l1, long l2, 
            int i, long l3, List list, List list1)
    {
        super(bax1, l, l1, l2, i, l3, list);
        h = list1;
    }

    public final int a()
    {
        return (e + h.size()) - 1;
    }

    public final bax a(bay bay, int i)
    {
        return (bax)h.get(i - e);
    }

    public final boolean b()
    {
        return true;
    }
}
