// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public final class dsp extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private ixe ad;
    private fnp ae;

    public dsp()
    {
    }

    public static dsp a(hyw hyw1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_media", hyw1);
        hyw1 = new dsp();
        hyw1.f(bundle);
        return hyw1;
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = O_();
        View view = View.inflate(bundle, b.je, null);
        TextView textview = (TextView)view.findViewById(p.d);
        ae.a(textview, a(b.jq), fnl.f);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        bundle = (new android.app.AlertDialog.Builder(bundle)).setPositiveButton(b.jp, this).setNegativeButton(b.jo, this).setView(view).create();
        b(false);
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (ixe)ag.a(ixe);
        ae = (fnp)ag.a(fnp);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        switch (j)
        {
        default:
            return;

        case -1: 
            hyw hyw1 = (hyw)super.q.getParcelable("selected_media");
            ad.a(hyw1);
            // fall through

        case -2: 
            dialoginterface.dismiss();
            return;
        }
    }
}
