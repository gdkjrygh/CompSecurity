// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.d;
import kik.a.d.s;
import kik.a.e.n;
import kik.android.chat.KikApplication;
import kik.android.widget.LegacyLazyLoadingImage;

// Referenced classes of package com.kik.view.adapters:
//            ay, y, x

public final class w extends ay
{
    public static final class a extends ay.a
    {

        LegacyLazyLoadingImage a;

        public a()
        {
        }
    }


    public w(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, ar.a a1, ad ad, com.kik.android.a a2, n n, 
            com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, a1, a2, ad, n, a3);
    }

    private void a(d d1, String s1, a a1)
    {
        a1.a.a(d1.b(), s1, n);
        a1.a.setVisibility(0);
    }

    protected final View a(ViewGroup viewgroup)
    {
        viewgroup = k.inflate(0x7f03006b, viewgroup, false);
        a a1 = new a();
        a1.a = (LegacyLazyLoadingImage)viewgroup.findViewById(0x7f0e00dd);
        a1.p = (ContactImageView)viewgroup.findViewById(0x7f0e0154);
        a1.q = (ImageView)viewgroup.findViewById(0x7f0e0155);
        a1.s = (ImageView)viewgroup.findViewById(0x7f0e0153);
        a1.o = (TextView)viewgroup.findViewById(0x7f0e0151);
        a1.r = viewgroup;
        viewgroup.setTag(a1);
        return viewgroup;
    }

    public final void a(ar.b b, s s1, boolean flag, Context context, au.b b1)
    {
        super.a(b, s1, flag, context, b1);
        context = (a)b;
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((a) (context)).a.getLayoutParams();
        if (s1.d())
        {
            layoutparams.addRule(11, -1);
            layoutparams.addRule(9, 0);
            layoutparams.setMargins(KikApplication.a(45), layoutparams.topMargin, KikApplication.a(3), layoutparams.bottomMargin);
        } else
        {
            layoutparams.addRule(11, 0);
            layoutparams.addRule(9, -1);
            layoutparams.setMargins(KikApplication.a(52), layoutparams.topMargin, 0, layoutparams.bottomMargin);
        }
        ((a) (context)).a.setLayoutParams(layoutparams);
        b = (a)b;
        ((a) (b)).a.setOnClickListener(new y(this, b1, b));
    }

    protected final void a(s s1, ar.b b)
    {
        b = (a)b;
        ((a) (b)).a.setPadding(0, 0, 0, 0);
        s1 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (s1 != null)
        {
            d d1 = (d)s1.a("png-preview");
            d d2 = (d)s1.a("preview");
            if (d2 != null && d2.b() != null && d1 == null)
            {
                a(d2, s1.o(), ((a) (b)));
            } else
            if (d1 != null && d1.b() != null)
            {
                a(d1, s1.o(), ((a) (b)));
            } else
            {
                ((a) (b)).a.setImageBitmap(null);
                ((a) (b)).a.setVisibility(8);
            }
        }
        ((a) (b)).a.setOnCreateContextMenuListener(new x(this));
    }

    protected final boolean a(ar.b b)
    {
        return b instanceof a;
    }
}
