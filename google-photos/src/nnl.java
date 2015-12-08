// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class nnl
    implements ngp
{

    private final Context a;
    private final List b;
    private nyx c;

    nnl(nnk nnk, Context context, List list)
    {
        a = context;
        b = list;
    }

    public final int a(mmz mmz)
    {
        int j = b.size();
        if (j == 0)
        {
            return ngq.a;
        }
        for (int i = 0; i < j; i++)
        {
            b.get(i);
        }

        return ngq.a;
    }

    public final void a(mmx mmx1, nyg nyg, List list)
    {
        int j = b.size();
        if (j == 0)
        {
            return;
        }
        nyg = mmx1.b("account_name");
        mmx1 = mmx1.b("effective_gaia_id");
        nyh nyh1 = new nyh();
        nyh1.a = nyg;
        nyh1.b = mmx1;
        nyh1.e = true;
        mmx1 = nyh1.a();
        c = new nyx(a, mmx1);
        for (int i = 0; i < j; i++)
        {
            b.get(i);
        }

        list.add(c);
    }
}
