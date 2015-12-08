// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class iib extends hgu
{

    final ekq a;
    private final iie b = new iie(this);

    public iib(ekq ekq1)
    {
        a = ekq1;
    }

    public final int a()
    {
        return ce.v;
    }

    public final void a(afn afn1)
    {
        android.content.Context context = afn1.a.getContext();
        Object obj = (mmr)olm.a(context, mmr);
        Object obj1 = (iif)olm.a(context, iif);
        Object obj2 = (fli)olm.a(context, fli);
        afn1 = (iid)afn1;
        gat gat1 = new gat(((hjt)a.a(hjt)).a, ((mmr) (obj)).d());
        ((amh)olm.a(context, amh)).a(gat1).a(((fli) (obj2)).f().b(b.zu)).a(((iid) (afn1)).o);
        obj2 = ((elj)a.a(elj)).a;
        ((iid) (afn1)).p.setText(((CharSequence) (obj2)));
        ((iid) (afn1)).r.setText(((ewz)olm.a(context, ewz)).a(((hkd)a.a(hkd)).a, exa.a));
        ((iid) (afn1)).q.setText(((iif) (obj1)).a(((mmr) (obj)).g(), a, ((iid) (afn1)).q));
        obj = ((iid) (afn1)).q;
        obj1 = (android.view.View.OnLayoutChangeListener)((TextView) (obj)).getTag(ce.u);
        if (obj1 != null)
        {
            ((TextView) (obj)).removeOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (obj1)));
        }
        ((TextView) (obj)).addOnLayoutChangeListener(b);
        ((TextView) (obj)).setTag(ce.u, b);
        ((iid) (afn1)).a.setOnClickListener(new msj(new iic(this, context)));
        b.a(((iid) (afn1)).a, new ogu(pwz.j, new String[] {
            ((hpe)a.a(hpe)).a.a
        }));
    }
}
