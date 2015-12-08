// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public final class hfv extends omn
    implements nug
{

    android.view.View.OnClickListener ad;
    private hfy ae;
    private TextView ai;
    private ProgressBar aj;

    public hfv()
    {
    }

    private static int a(double d)
    {
        return (int)Math.round(1000D * d);
    }

    static android.view.View.OnClickListener a(hfv hfv1)
    {
        return hfv1.ad;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.vR, null);
        layoutinflater.setSaveEnabled(false);
        ai = (TextView)layoutinflater.findViewById(bu.d);
        ai.setText(ae.a);
        aj = (ProgressBar)layoutinflater.findViewById(bu.c);
        aj.setMax(1000);
        aj.setIndeterminate(ae.c);
        aj.setProgress(a(ae.b));
        ((ImageView)layoutinflater.findViewById(bu.b)).setOnClickListener(new hfw(this));
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(1, 0x1030076);
    }

    public final void b_(Object obj)
    {
        obj = (hfy)obj;
        if (ai != null)
        {
            ai.setText(((hfy) (obj)).a);
            aj.setProgress(a(((hfy) (obj)).b));
            aj.setIndeterminate(((hfy) (obj)).c);
        }
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.c(bundle);
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ae = (hfy)ag.a(hfy);
        ae.d.a(this, false);
    }

    public final void n()
    {
        super.n();
        ae.d.a(this);
    }
}
