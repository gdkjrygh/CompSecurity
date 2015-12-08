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
import com.kik.android.a;
import com.kik.android.c.f;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import kik.a.d.a.g;
import kik.a.d.a.m;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.f.e.k;
import kik.android.d.b;
import kik.android.d.c;
import kik.android.d.d;
import kik.android.util.be;
import kik.android.util.cv;
import kik.android.util.v;

// Referenced classes of package com.kik.view.adapters:
//            b, f, g

public class e extends com.kik.view.adapters.b
{
    protected static final class a extends b.a
    {

        TextView b;

        protected a()
        {
        }
    }


    private kik.android.util.bw.a b;
    private kik.android.e.f c;

    public e(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, kik.android.util.bw.a a1, ar.a a2, ad ad, kik.android.e.f f1, 
            com.kik.android.a a3, n n, kik.android.chat.b.d d1, com.kik.e.a a4)
    {
        super(layoutinflater, context, onclicklistener, a2, ad, a3, n, d1, a4);
        b = a1;
        c = f1;
    }

    protected final View a(ViewGroup viewgroup)
    {
        viewgroup = k.inflate(0x7f030065, viewgroup, false);
        a a1 = new a();
        a1.s = (ImageView)viewgroup.findViewById(0x7f0e0153);
        a1.p = (ContactImageView)viewgroup.findViewById(0x7f0e0154);
        a1.q = (ImageView)viewgroup.findViewById(0x7f0e0155);
        a1.b = (TextView)viewgroup.findViewById(0x7f0e0152);
        a1.o = (TextView)viewgroup.findViewById(0x7f0e0151);
        a1.a = viewgroup.findViewById(0x7f0e00dc);
        a1.r = viewgroup;
        viewgroup.setTag(a1);
        return viewgroup;
    }

    public final void a(ar.b b1, s s1, boolean flag, Context context, au.b b2)
    {
        super.a(b1, s1, flag, context, b2);
        b1 = (a)b1;
        ((a) (b1)).b.setOnClickListener(new com.kik.view.adapters.f(this, b2, b1));
        ((a) (b1)).b.setOnCreateContextMenuListener(new com.kik.view.adapters.g(this));
    }

    protected void a(s s1, ar.b b1)
    {
        byte byte1 = 12;
        a a1 = (a)b1;
        Object obj = s1.a();
        b1 = ((ar.b) (obj));
        if (obj == null)
        {
            m m1 = (m)g.a(s1, kik/a/d/a/m);
            b1 = ((ar.b) (obj));
            if (m1 != null)
            {
                b1 = m1.a();
            }
        }
        k k1 = (k)g.a(s1, kik/a/f/e/k);
        obj = b1;
        if (s1.o() != null)
        {
            obj = b1;
            if (((Boolean)d.a(l).a("show-lock-icon").b()).booleanValue())
            {
                obj = (new StringBuilder()).append(b1).append(" (E)").toString();
            }
        }
        TextView textview;
        Context context;
        byte byte0;
        if (s1.d())
        {
            b1 = a.c();
            a1.b.setLinkTextColor(b1.b());
        } else
        {
            b1 = a.e();
            a1.b.setLinkTextColor(a.b());
        }
        kik.android.chat.b.c.a(a1.b, b1);
        textview = a1.b;
        context = a1.b.getContext();
        if (k1 == null)
        {
            b1 = null;
        } else
        {
            b1 = k1.b();
        }
        textview.setText(f.a(context, ((CharSequence) (obj)), b1, 21, false, c));
        b1 = a1.b;
        v.a(b1, be.a(), be.b(), b);
        v.a(b1);
        if (s1.d())
        {
            byte0 = 17;
        } else
        {
            byte0 = 12;
            byte1 = 17;
        }
        cv.a(a1.a, byte1, byte0);
    }

    protected final boolean a(ar.b b1)
    {
        return b1 instanceof a;
    }
}
