// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gmr
    implements ftu
{

    private gmq a;

    gmr(gmq gmq1)
    {
        a = gmq1;
        super();
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(int i, int j, List list)
    {
        list.add(Integer.valueOf(i));
        list.add(Integer.valueOf(j));
    }
}
