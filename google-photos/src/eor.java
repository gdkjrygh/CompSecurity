// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

final class eor extends hgu
{

    final ekq a;
    private final int b;
    private final String c;
    private final String d;

    public eor(ekq ekq1, int i, String s1, String s2)
    {
        a = ekq1;
        b = i;
        c = s1;
        d = s2;
    }

    public final int a()
    {
        return s.p;
    }

    public final void a(afn afn)
    {
        afn = (eou)afn;
        Object obj1 = ((eou) (afn)).a.getContext();
        eot eot1 = (eot)olm.a(((android.content.Context) (obj1)), eot);
        ((eou) (afn)).p.setText(((elj)a.a(elj)).a);
        ((eou) (afn)).q.setText(c);
        Object obj = (amh)olm.a(((android.content.Context) (obj1)), amh);
        obj1 = (fli)olm.a(((android.content.Context) (obj1)), fli);
        if (TextUtils.isEmpty(d))
        {
            ((amh) (obj)).a(((eou) (afn)).o);
        } else
        {
            ((amh) (obj)).a(new gat(d, b)).a(((fli) (obj1)).f()).a(((eou) (afn)).o);
        }
        if (((hjp)a.a(hjp)).a.c)
        {
            ((eou) (afn)).r.setVisibility(0);
            ((eou) (afn)).s.setVisibility(0);
        } else
        {
            ((eou) (afn)).r.setVisibility(8);
            ((eou) (afn)).s.setVisibility(8);
        }
        obj = ((hpe)a.a(hpe)).a.a;
        b.a(((eou) (afn)).a, new ogu(pwt.j, new String[] {
            obj
        }));
        ((eou) (afn)).a.setOnClickListener(new msj(new eos(this, eot1)));
    }
}
