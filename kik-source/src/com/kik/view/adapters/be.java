// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import kik.a.d.a.b;
import kik.a.d.a.d;
import kik.a.d.a.g;
import kik.a.d.a.l;
import kik.a.d.a.m;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.e.r;
import kik.android.util.cq;
import kik.android.util.cv;

// Referenced classes of package com.kik.view.adapters:
//            ar

public final class be extends ar
{
    public static final class a extends ar.b
    {

        TextView a;

        public a()
        {
        }
    }


    private final ad a;
    private kik.android.util.bw.a b;

    public be(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, kik.android.util.bw.a a1, ar.a a2, ad ad, com.kik.android.a a3, 
            kik.a.e.n n1, com.kik.e.a a4)
    {
        super(layoutinflater, context, onclicklistener, a2, a3, n1, a4);
        a = ad;
        b = a1;
    }

    protected final View a(ViewGroup viewgroup)
    {
        viewgroup = k.inflate(0x7f03006c, viewgroup, false);
        a a1 = new a();
        a1.a = (TextView)viewgroup.findViewById(0x7f0e0164);
        a1.p = (ContactImageView)viewgroup.findViewById(0x7f0e0162);
        a1.q = (ImageView)viewgroup.findViewById(0x7f0e0163);
        a1.o = (TextView)viewgroup.findViewById(0x7f0e0151);
        a1.r = viewgroup;
        viewgroup.setTag(a1);
        return viewgroup;
    }

    protected final void a(s s1, ar.b b1)
    {
        Object obj;
        l l1;
        m m1;
        b b2;
        Context context;
        int i;
        boolean flag;
        i = 0;
        flag = false;
        b1 = (a)b1;
        l1 = (l)g.a(s1, kik/a/d/a/l);
        m1 = (m)g.a(s1, kik/a/d/a/m);
        b2 = (b)g.a(s1, kik/a/d/a/b);
        obj = (d)g.a(s1, kik/a/d/a/d);
        context = ((a) (b1)).a.getContext();
        if (l1 == null) goto _L2; else goto _L1
_L1:
        ((a) (b1)).a.setText(l1.a());
        if (cq.c(l1.b())) goto _L4; else goto _L3
_L3:
        obj = f.a(s1.i(), false);
        ad ad;
        boolean flag1;
        if (obj != null && (obj instanceof n) && ((n)obj).I())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        s1 = m.a(s1);
        ((a) (b1)).p.setVisibility(0);
        obj = ((a) (b1)).p;
        ad = a;
        if (i == 0 && (s1 == null || !s1.p()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((ContactImageView) (obj)).a(s1, ad, flag1, f, e);
        b1 = ((a) (b1)).q;
        if (s1 != null && s1.i())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        b1.setVisibility(i);
_L6:
        return;
_L4:
        ((a) (b1)).p.setVisibility(8);
        ((a) (b1)).q.setVisibility(8);
        return;
_L2:
        if (m1 != null)
        {
            ((a) (b1)).a.setText(m1.a());
            ((a) (b1)).p.setVisibility(8);
            ((a) (b1)).q.setVisibility(8);
            return;
        }
        if (b2 != null)
        {
            if (b2.a() == 1)
            {
                s1 = context.getString(0x7f09015e);
            } else
            {
                s1 = context.getString(0x7f09015d, new Object[] {
                    Integer.valueOf(b2.a())
                });
            }
            ((a) (b1)).a.setText(s1);
            ((a) (b1)).p.setVisibility(8);
            ((a) (b1)).q.setVisibility(8);
            Linkify.addLinks(((a) (b1)).a, 15);
            return;
        }
        if (obj != null)
        {
            if (((d) (obj)).g())
            {
                s1 = m.a(s1);
                ((a) (b1)).a.setText(((d) (obj)).e());
                ((a) (b1)).p.a(s1, a, false, f, e);
                cv.b(new View[] {
                    ((a) (b1)).p
                });
                b1 = ((a) (b1)).q;
                if (s1 == null || !s1.i())
                {
                    i = 8;
                }
                b1.setVisibility(i);
                return;
            } else
            {
                cv.e(new View[] {
                    ((a) (b1)).p, ((a) (b1)).a, ((a) (b1)).o
                });
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final boolean a(ar.b b1)
    {
        return b1 instanceof a;
    }
}
