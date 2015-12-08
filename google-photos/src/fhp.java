// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class fhp extends omp
    implements fpl, opl, ops
{

    private mtj a;
    private dgk b;
    private int c;
    private String d;
    private String e;
    private ekq f;
    private View g;
    private int h;

    public fhp()
    {
        new fpk(af, this);
    }

    static void a(fhp fhp1)
    {
        fht fht1 = new fht(fhp1.c, fhp1.d, fhp1.e, false);
        fhp1.a.a(fht1);
    }

    static void a(fhp fhp1, mue mue1)
    {
        if (mue1 == null || mue1.c())
        {
            mue1 = fhp1.b.a();
            mue1.d = fhp1.ad.getResources().getString(b.oW);
            mue1.a().c();
            return;
        } else
        {
            mue1 = fhp1.b.a();
            mue1.d = fhp1.ad.getResources().getString(b.oX);
            mue1.a().c();
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(b.oT, null);
        h = ad.getResources().getDimensionPixelSize(b.oN);
        viewgroup = (mmr)ae.a(mmr);
        bundle = (egf)ae.a(egf);
        b = (dgk)ae.a(dgk);
        a = ((mtj)ae.a(mtj)).a("remotemedia.tasks.JoinOrPinEnvelope", new fhq(this));
        f = ((ejz)ae.a(ejz)).b();
        Object obj = (hpe)p.a(f.a(hpe));
        TextView textview = (TextView)layoutinflater.findViewById(b.oS);
        ImageView imageview = (ImageView)layoutinflater.findViewById(b.oR);
        Button button = (Button)layoutinflater.findViewById(b.oO);
        g = layoutinflater.findViewById(b.oP);
        d = (String)p.a(((hpe) (obj)).a.a, "Media key must be not empty.");
        button.setOnClickListener(new fhr(this));
        e = super.q.getString("auth_key");
        obj = viewgroup.g();
        textview.setText((CharSequence)p.a(((mmx) (obj)).b("account_name")));
        c = viewgroup.d();
        bundle.a(((mmx) (obj)).b("profile_photo_url"), imageview);
        viewgroup = (hjl)f.a(hjl);
        bundle = (TextView)layoutinflater.findViewById(b.oQ);
        if (viewgroup != null && ((hjl) (viewgroup)).a)
        {
            bundle.setText(ad.getResources().getString(b.oU));
            return layoutinflater;
        } else
        {
            bundle.setText(ad.getResources().getString(b.oV));
            return layoutinflater;
        }
    }

    public final void a(fpj fpj, Rect rect)
    {
        g.setPadding(0, 0, 0, rect.bottom - h);
    }
}
