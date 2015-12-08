// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;
import java.util.List;

final class nnq
    implements ngp
{

    private final Context a;
    private nyx b;

    nnq(nnp nnp1, Context context)
    {
        a = context;
    }

    public final int a(mmz mmz1)
    {
        int i = b.b(nnp.b());
        qrq qrq1 = (qrq)b.a(i, qrq.a);
        if (qrq1.b == null)
        {
            throw new IOException("Could not update account status");
        } else
        {
            mmz1.b("gaia_id", qrq1.b);
            return ngq.a;
        }
    }

    public final void a(mmx mmx, nyg nyg, List list)
    {
        b = new nyx(a, nyg);
        mmx = b;
        nyg = qrq.a;
        int i = nnp.b();
        mmx.a(nyx.a(nyg), null, i);
        list.add(b);
    }
}
