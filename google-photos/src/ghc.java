// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public final class ghc extends omp
{

    private gha a;
    private RadioButton b;
    private RadioButton c;
    private TextView d;

    public ghc()
    {
        new ghb(af, new ghd(this));
    }

    static RadioButton a(ghc ghc1)
    {
        return ghc1.c;
    }

    static void a(ghc ghc1, String s1)
    {
        ghc1.a(s1);
    }

    private void a(String s1)
    {
        if (s1 != null)
        {
            d.setText(s1);
        }
    }

    static gha b(ghc ghc1)
    {
        return ghc1.a;
    }

    static RadioButton c(ghc ghc1)
    {
        return ghc1.b;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.rJ, null);
        b = (RadioButton)layoutinflater.findViewById(s.V);
        c = (RadioButton)layoutinflater.findViewById(s.af);
        d = (TextView)layoutinflater.findViewById(s.ag);
        viewgroup = (TextView)layoutinflater.findViewById(s.aw);
        ((fnp)ae.a(fnp)).a(viewgroup, a(b.rV), fnl.m);
        b.setOnCheckedChangeListener(new ghe(this));
        c.setOnCheckedChangeListener(new ghf(this));
        layoutinflater.findViewById(s.U).setOnClickListener(new ghg(this));
        layoutinflater.findViewById(s.ae).setOnClickListener(new ghh(this));
        a(a.c);
        return layoutinflater;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (gha)ae.a(gha);
    }
}
