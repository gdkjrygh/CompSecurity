// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class hrq extends nzc
{

    private final String a;
    private final int b;
    private final int c;
    private qay d;

    hrq(Context context, int i, String s, int j, int k)
    {
        super(context, new nyg(context, i), "autocompleteitems", new paj(), new pak());
        a = s;
        b = j;
        c = k;
    }

    public final List a()
    {
        int i = 0;
        if (d.a != null && d.a.length == 1) goto _L2; else goto _L1
_L1:
        Object obj;
        Log.e("AutoCompleteOperation", "Wrong result size in successful AutoComplete request.");
        obj = Collections.emptyList();
_L4:
        return ((List) (obj));
_L2:
        qav aqav[] = d.a[0].a;
        ArrayList arraylist = new ArrayList(aqav.length);
        int j = aqav.length;
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            obj = aqav[i];
            arraylist.add(new hsi(a, ((qav) (obj))));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void a(qlw qlw)
    {
        qlw = (paj)qlw;
        qlw.a = new qaw();
        qlw = ((paj) (qlw)).a;
        qlw.a = new qax[1];
        qlw = ((qaw) (qlw)).a;
        qax qax1 = new qax();
        qax1.a = a;
        qax1.b = c;
        qax1.c = Integer.valueOf(b);
        qlw[0] = qax1;
    }

    protected final void b(qlw qlw)
    {
        d = ((pak)qlw).a;
    }
}
