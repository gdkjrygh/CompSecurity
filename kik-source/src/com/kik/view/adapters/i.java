// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ad;
import kik.a.d.a.a;
import kik.a.d.d;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.f.k;
import kik.android.chat.KikApplication;
import kik.android.chat.b.c;
import kik.android.i.b;
import kik.android.util.ac;
import kik.android.util.ae;
import kik.android.util.cv;
import kik.android.widget.ClampedContentPreviewView;

// Referenced classes of package com.kik.view.adapters:
//            bf, af

public final class i extends bf
{
    protected static final class a extends bf.b
    {

        TextView a;

        protected a()
        {
        }
    }


    public i(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n, k k, kik.android.chat.b.d d1, com.kik.e.a a3, b b, af af)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n, k, d1, a3, b, af);
    }

    protected final int a()
    {
        return 0x7f03006a;
    }

    protected final View a(ViewGroup viewgroup)
    {
        a a1 = new a();
        viewgroup = super.a(viewgroup, a1);
        a1.a = (TextView)viewgroup.findViewById(0x7f0e00de);
        viewgroup.setTag(a1);
        return viewgroup;
    }

    protected final d a(kik.a.d.a.a a1)
    {
        d d1 = (d)a1.a("png-preview");
        a1 = (d)a1.a("preview");
        if (a1 != null && a1.b() != null && d1 == null)
        {
            return a1;
        }
        if (d1 != null && d1.b() != null)
        {
            return d1;
        } else
        {
            return null;
        }
    }

    protected final void a(bf.b b)
    {
    }

    protected final void a(kik.a.d.a.a a1, n.a a2, boolean flag)
    {
label0:
        {
            super.a(a1, a2, flag);
            a2 = (a)a2;
            if (a1 != null)
            {
                a1 = a1.g("title");
                if (a1 == null)
                {
                    break label0;
                }
                ((a) (a2)).a.setVisibility(0);
                ((a) (a2)).a.setMaxLines(2);
                ((a) (a2)).a.setText(a1.trim());
            }
            return;
        }
        ((a) (a2)).a.setVisibility(8);
    }

    protected final void a(s s, ar.b b)
    {
        super.a(s, b);
        b = (a)b;
        s = (kik.a.d.a.a)kik.a.d.a.a.a(s, kik/a/d/a/a);
        ((a) (b)).k.setBackgroundResource(0x7f070045);
        if (ae.b(s))
        {
            ((a) (b)).j.setTextColor(-1);
            cv.a(((a) (b)).j, ac.a);
            cv.a(((a) (b)).a, ac.a);
            cv.b(((a) (b)).i, ((a) (b)).i.getResources().getDimensionPixelSize(0x7f0d0006));
            cv.b(((a) (b)).i, ((a) (b)).e);
            ((a) (b)).i.setBackgroundResource(0x7f02009c);
            ((a) (b)).a.setTextColor(-1);
            ((a) (b)).j.setTextColor(-1);
            ((a) (b)).k.setImageResource(0x7f020269);
            return;
        } else
        {
            cv.a(((a) (b)).j, ac.b);
            cv.a(((a) (b)).a, ac.b);
            cv.a(((a) (b)).i, ((a) (b)).e);
            cv.b(((a) (b)).i, -2);
            cv.e(new View[] {
                ((a) (b)).a
            });
            ((a) (b)).i.setBackgroundColor(kik.android.chat.b.d.a);
            c.a(((a) (b)).a, d.d());
            c.a(((a) (b)).j, d.d());
            c.a(((a) (b)).k, d.d());
            cv.a(((a) (b)).i, f(s));
            ((a) (b)).d.d(KikApplication.a(40));
            return;
        }
    }

    protected final boolean a(ar.b b)
    {
        return b instanceof a;
    }

    protected final View[] a(n.a a1)
    {
        a1 = (a)a1;
        return (new View[] {
            ((a) (a1)).h, ((a) (a1)).j, ((a) (a1)).k
        });
    }
}
