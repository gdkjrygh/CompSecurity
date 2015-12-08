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
import com.kik.sdkutils.y;
import kik.a.d.a.a;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.f.k;
import kik.android.chat.b.b;
import kik.android.chat.b.c;
import kik.android.chat.b.d;
import kik.android.util.cq;
import kik.android.util.cv;
import kik.android.widget.IconImageView;
import kik.android.widget.MaskedFramelayout;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            n

public class l extends com.kik.view.adapters.n
{
    protected class a extends n.a
    {

        TextView a;
        TextView b;
        View c;
        ImageView d;
        final l e;

        protected a()
        {
            e = l.this;
            super();
        }
    }


    protected final ad a;

    public l(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n1, k k, d d1, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n1, k, d1, a3);
        a = ad;
    }

    protected int a()
    {
        return 165;
    }

    protected View a(ViewGroup viewgroup)
    {
        viewgroup = k.inflate(0x7f030066, viewgroup, false);
        a a1 = new a();
        a1.p = (ContactImageView)viewgroup.findViewById(0x7f0e0154);
        a1.q = (ImageView)viewgroup.findViewById(0x7f0e0155);
        a1.h = (IconImageView)viewgroup.findViewById(0x7f0e00e4);
        a1.s = (ImageView)viewgroup.findViewById(0x7f0e0153);
        a1.o = (TextView)viewgroup.findViewById(0x7f0e0151);
        a1.a = (TextView)viewgroup.findViewById(0x7f0e00df);
        a1.b = (TextView)viewgroup.findViewById(0x7f0e00de);
        a1.j = (TextView)viewgroup.findViewById(0x7f0e00e5);
        a1.k = (ImageView)viewgroup.findViewById(0x7f0e00e7);
        a1.i = viewgroup.findViewById(0x7f0e00e0);
        a1.c = viewgroup.findViewById(0x7f0e0159);
        a1.d = (ImageView)viewgroup.findViewById(0x7f0e00e9);
        a1.l = viewgroup.findViewById(0x7f0e00e8);
        a1.m = (MaskedFramelayout)viewgroup.findViewById(0x7f0e00dc);
        a1.r = viewgroup;
        viewgroup.setTag(a1);
        return viewgroup;
    }

    protected void a(kik.a.d.a.a a1, n.a a2, boolean flag)
    {
        a2 = (a)a2;
        String s1;
        if (flag)
        {
            ((a) (a2)).l.setVisibility(0);
        } else
        {
            ((a) (a2)).l.setVisibility(8);
        }
        s1 = a1.g("text");
        if (y.b(14))
        {
            ((a) (a2)).a.setEllipsize(null);
            ((a) (a2)).b.setEllipsize(null);
        }
        if (!cq.c(s1))
        {
            ((a) (a2)).a.setVisibility(0);
            ((a) (a2)).a.setText(s1.trim());
        } else
        if (!kik.a.d.a.a.b(a1.u()))
        {
            ((a) (a2)).a.setText(0x7f0900be);
        } else
        {
            ((a) (a2)).a.setVisibility(8);
        }
        a1 = a1.g("title");
        if (!cq.c(a1))
        {
            ((a) (a2)).b.setVisibility(0);
            ((a) (a2)).b.setText(a1.trim());
            return;
        } else
        {
            ((a) (a2)).b.setVisibility(8);
            return;
        }
    }

    protected void a(s s1, ar.b b1)
    {
        super.a(s1, b1);
        a a1 = (a)b1;
        if (s1.d())
        {
            a1.i.setPadding(0, 0, p, 0);
            cv.b(a1.a).d(p).c(0);
            cv.b(a1.b).d(p).c(0);
        } else
        {
            a1.i.setPadding(p, 0, 0, 0);
            cv.b(a1.a).d(0).c(p);
            cv.b(a1.b).d(0).c(p);
        }
        b1 = d.e();
        if (s1.d())
        {
            b1 = d.c();
        }
        kik.android.chat.b.c.a(a1.k, b1);
        kik.android.chat.b.c.a(a1.m, b1);
        a1.j.setTextColor(b1.b());
        a1.b.setTextColor(b1.b());
        a1.a.setTextColor(b1.b());
        cv.a(a1.a, a());
        a1.a.setLinkTextColor(b1.b());
        cv.b(a1.a, a());
    }

    protected boolean a(ar.b b1)
    {
        return b1 != null && b1.getClass().equals(com/kik/view/adapters/l$a);
    }

    protected final void b(n.a a1)
    {
        a a2 = (a)a1;
        ((ProgressWidget)a1.r.findViewById(0x7f0e01c8)).a(a2.c, a2.d);
    }

    protected final void c(n.a a1)
    {
        ((a)a1).c.setVisibility(8);
    }
}
