// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class myl
    implements ngp
{

    private myx a;
    private myk b;

    myl(myk myk1)
    {
        b = myk1;
        super();
    }

    public final int a(mmz mmz1)
    {
        a.e("ExpAccountUpdateExt");
        pbg pbg1 = (pbg)a.t();
        b.a(myk.b(b), mmz1.b("account_name"), pbg1.a);
        return ngq.a;
    }

    public final void a(mmx mmx, nyg nyg, List list)
    {
        mmx = myk.a(b).b();
        int j = mmx.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((myc)mmx.get(i)).d);
        }

        a = new myx(myk.b(b), nyg, arraylist);
        list.add(a);
    }
}
