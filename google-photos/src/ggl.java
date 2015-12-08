// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

public final class ggl extends omp
{

    private gha a;
    private TextView b;

    public ggl()
    {
        new ghb(af, new ggm(this));
    }

    static gha a(ggl ggl1)
    {
        return ggl1.a;
    }

    static void a(ggl ggl1, String s1)
    {
        ggl1.a(s1);
    }

    private void a(String s1)
    {
        b.setText(a(b.sI, new Object[] {
            s1
        }));
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.rI, null);
        viewgroup = (Switch)layoutinflater.findViewById(s.J);
        b = (TextView)layoutinflater.findViewById(s.aA);
        bundle = (Switch)layoutinflater.findViewById(s.az);
        TextView textview = (TextView)layoutinflater.findViewById(s.ax);
        TextView textview1 = (TextView)layoutinflater.findViewById(s.M);
        ((fnp)ae.a(fnp)).a(textview1, a(b.rW), fnl.l);
        viewgroup.setChecked(a.d);
        bundle.setChecked(a.e);
        if (((ConnectivityManager)ad.getSystemService("connectivity")).getNetworkInfo(0) == null)
        {
            layoutinflater.findViewById(s.ay).setVisibility(8);
            bundle.setChecked(false);
        }
        viewgroup.setOnCheckedChangeListener(new ggn(this, bundle, textview));
        bundle.setOnCheckedChangeListener(new ggo(this));
        a(a.b);
        return layoutinflater;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (gha)ae.a(gha);
    }
}
