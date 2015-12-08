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
import com.kik.cache.MaskedContentPreviewImage;
import com.kik.cache.ad;
import com.kik.g.p;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.d;
import kik.a.d.f;
import kik.a.d.s;
import kik.a.e.i;
import kik.a.e.n;
import kik.a.f.k;
import kik.android.chat.KikApplication;
import kik.android.net.a.b;
import kik.android.net.a.e;
import kik.android.util.ac;
import kik.android.util.ae;
import kik.android.util.cv;
import kik.android.widget.ClampedContentPreviewView;
import kik.android.widget.IconImageView;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            s, aa, ab

public final class z extends com.kik.view.adapters.s
{

    public z(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n, k k, kik.android.chat.b.d d1, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n, k, d1, a3);
    }

    protected final int a()
    {
        return 0x7f030068;
    }

    protected final View a(ViewGroup viewgroup)
    {
        s.a a1 = new s.a();
        viewgroup = super.a(viewgroup, a1);
        a1.d = (MaskedContentPreviewImage)viewgroup.findViewById(0x7f0e00dd);
        a1.d.b(KikApplication.e(0x7f0c0020));
        viewgroup.setTag(a1);
        return viewgroup;
    }

    protected final d a(a a1)
    {
        return (d)a1.a("preview");
    }

    protected final void a(a a1, n.a a2, boolean flag)
    {
        super.a(a1, a2, flag);
        a2 = (s.a)a2;
        if (a1 != null)
        {
            cv.a(((s.a) (a2)).j);
            ((s.a) (a2)).j.setText(ae.a(a1));
            ((s.a) (a2)).h.a(a1, n);
            ((s.a) (a2)).j.setMaxWidth(KikApplication.a(120));
            cv.a(((s.a) (a2)).j, ac.a);
        }
    }

    protected final void a(s s1, n.a a1)
    {
        super.a(s1, a1);
        a1 = (s.a)a1;
        ((s.a) (a1)).d.a(kik.android.widget.c.a.c);
        if (s1.d())
        {
            ((s.a) (a1)).d.a(q, p);
            return;
        } else
        {
            ((s.a) (a1)).d.a(p, q);
            return;
        }
    }

    protected final void a(b b1, ProgressWidget progresswidget, n.a a1, s s1)
    {
        f f1 = i.a(s1.i());
        g((a)g.a(s1, kik/a/d/a/a));
        e.a().a(b1);
        progresswidget.b(new aa(this, b1, a1, progresswidget, f1, s1));
        progresswidget.a();
        if (s1.c() == -100)
        {
            a1.s.setImageResource(0x7f02022e);
            f1.a(s1.b(), 101, g);
        }
        if (s1.c() == 101)
        {
            b1.l().a(new ab(this, s1));
        }
    }

    protected final void d(a a1)
    {
        super.d(a1);
        g(a1);
    }
}
