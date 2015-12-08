// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.view.View;
import android.widget.TextView;

final class eon extends hgu
{

    final epf a;
    private final msp b;
    private final int c;

    public eon(epf epf1, msp msp, int i)
    {
        a = epf1;
        b = msp;
        c = i;
    }

    public final int a()
    {
        return s.q;
    }

    public final void a(afn afn)
    {
        eoq eoq1 = (eoq)afn;
        Object obj = eoq1.a.getContext();
        eop eop1 = (eop)olm.a(((android.content.Context) (obj)), eop);
        eoq1.p.setText(a.a);
        afn = a;
        int i = c;
        Object obj1 = Uri.parse(((epf) (afn)).b);
        if (((Uri) (obj1)).getScheme().equals("android.resource"))
        {
            afn = new gan(((Uri) (obj1)));
        } else
        {
            afn = new gat(((epf) (afn)).b, i);
        }
        obj1 = (amh)olm.a(((android.content.Context) (obj)), amh);
        obj = (fli)olm.a(((android.content.Context) (obj)), fli);
        ((amh) (obj1)).a(afn).a(((fli) (obj)).b()).a(eoq1.o);
        b.a(eoq1.a, new msm(b));
        eoq1.a.setOnClickListener(new msj(new eoo(this, eop1)));
    }
}
