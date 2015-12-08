// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public final class htv extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private hrr ad;
    private hrr ae;
    private htu ai;
    private hrs aj;
    private int ak;

    public htv()
    {
        (new msi(pwy.m)).a(ag);
    }

    public static htv a(hrr hrr1, hrr hrr2, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("cluster2", hrr2);
        bundle.putParcelable("cluster1", hrr1);
        bundle.putInt("account_id", i);
        hrr1 = new htv();
        hrr1.f(bundle);
        return hrr1;
    }

    private void a(msp msp)
    {
        mry.a(af, 4, (new msn()).a(new msm(msp)).a(af));
    }

    public final Dialog c(Bundle bundle)
    {
        ae = (hrr)super.q.getParcelable("cluster2");
        ad = (hrr)super.q.getParcelable("cluster1");
        ak = super.q.getInt("account_id");
        ai = (htu)ag.a(htu);
        aj = (hrs)ag.a(hrs);
        bundle = new android.app.AlertDialog.Builder(O_());
        View view = O_().getLayoutInflater().inflate(b.xJ, null);
        ImageView imageview = (ImageView)view.findViewById(au.w);
        ImageView imageview1 = (ImageView)view.findViewById(au.v);
        aj.a(imageview, ad.as_(), ak);
        aj.a(imageview1, ae.as_(), ak);
        imageview.setContentDescription(ad.c());
        imageview1.setContentDescription(ae.c());
        bundle.setView(view).setPositiveButton(b.xW, this).setNegativeButton(b.xV, this);
        return bundle.create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            a(pwy.u);
            ai.a(ae);
            dialoginterface.dismiss();
            return;

        case -2: 
            a(pwy.o);
            ai.a(new hse(ae.c(), ae.c()));
            dialoginterface.dismiss();
            return;
        }
    }
}
