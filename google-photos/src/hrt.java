// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class hrt extends nzc
{

    qay a;
    private final List b;
    private final int c;

    private hrt(Context context, int i, int j, List list, String s)
    {
        super(context, new nyg(context, i), s, new paj(), new pak());
        b = list;
        c = j;
    }

    static hrt a(Context context, int i, int j, List list)
    {
        return new hrt(context, i, j, list, "autocompleteitems");
    }

    static hrt b(Context context, int i, int j, List list)
    {
        return new hrt(context, i, j, list, "autocompleteitemsbackground");
    }

    protected final void a(qlw qlw)
    {
        qlw = (paj)qlw;
        qlw.a = new qaw();
        qlw = ((paj) (qlw)).a;
        qlw.a = new qax[b.size()];
        for (int i = 0; i < b.size(); i++)
        {
            qax aqax[] = ((qaw) (qlw)).a;
            int j = ((Integer)b.get(i)).intValue();
            qax qax1 = new qax();
            qax1.a = "";
            qax1.b = j;
            qax1.d = Boolean.valueOf(true);
            qax1.c = Integer.valueOf(c);
            aqax[i] = qax1;
        }

    }

    protected final void b(qlw qlw)
    {
        a = ((pak)qlw).a;
    }
}
