// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class hky extends nzc
{

    public qhn a;
    private final List b;

    public hky(Context context, int i, List list)
    {
        super(context, new nyg(context, i), "removeitems", new pcz(), new pda());
        b = list;
    }

    public final qfu a()
    {
        if (a.b.length == 0)
        {
            return null;
        } else
        {
            qfu qfu1 = new qfu();
            qfu1.b = a.b[0].a.b.a;
            return qfu1;
        }
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcz)qlw;
        qlw.a = new qhm();
        qlw = ((pcz) (qlw)).a;
        qeo aqeo[] = new qeo[b.size()];
        qlw.a = aqeo;
        for (int i = 0; i < b.size(); i++)
        {
            qeo qeo1 = new qeo();
            qeo1.a = (String)b.get(i);
            aqeo[i] = qeo1;
        }

        qlw.b = b.i();
    }

    protected final void b(qlw qlw)
    {
        qlw = (pda)qlw;
        super.b(qlw);
        a = ((pda) (qlw)).a;
    }
}
