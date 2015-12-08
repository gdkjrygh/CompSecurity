// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class iyd extends nzc
{

    private final int a;
    private final List b;
    private final List c;
    private final int d;

    private iyd(Context context, int i, List list, List list1, int j, int k)
    {
        super(context, new nyg(context, i), "deletephotos", new pav(), new paw());
        c = list;
        b = list1;
        a = j;
        d = k;
    }

    public static iyd a(Context context, int i, List list, List list1)
    {
        return new iyd(context, i, list, list1, 1, 1);
    }

    public static iyd a(Context context, int i, List list, List list1, iye iye1)
    {
        p.b(iye1, "origin can not be null.");
        int j;
        if (iye1 == iye.a)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        return new iyd(context, i, list, list1, 2, j);
    }

    public static iyd b(Context context, int i, List list, List list1)
    {
        return new iyd(context, i, list, list1, 3, 2);
    }

    protected final void a(qlw qlw)
    {
        qlw = (pav)qlw;
        qlw.a = new pjn();
        qlw = ((pav) (qlw)).a;
        qlw.e = Boolean.valueOf(true);
        qlw.f = Boolean.valueOf(true);
        qlw.a = (String[])b.toArray(new String[b.size()]);
        qlw.b = (String[])c.toArray(new String[c.size()]);
        qlw.d = a;
        qlw.c = d;
    }
}
