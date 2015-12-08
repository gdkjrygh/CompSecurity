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
import com.kik.cache.ContentPreviewImageView;
import com.kik.cache.ad;
import kik.a.d.a.a;
import kik.a.d.d;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.f.k;
import kik.a.h.i;
import kik.android.chat.KikApplication;
import kik.android.chat.b.c;
import kik.android.util.ac;
import kik.android.util.cv;
import kik.android.widget.IconImageView;
import kik.android.widget.MaskedFramelayout;

// Referenced classes of package com.kik.view.adapters:
//            l

public final class m extends l
{
    private class a extends l.a
    {

        ContentPreviewImageView f;
        final m g;

        private a()
        {
            g = m.this;
            super(m.this);
        }

        a(byte byte0)
        {
            this();
        }
    }


    public m(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n, k k, kik.android.chat.b.d d1, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n, k, d1, a3);
    }

    private void a(d d1, String s, a a1, boolean flag)
    {
        a1.f.a(d1, s, a, flag, n);
        cv.b(new View[] {
            a1.f
        });
    }

    public static boolean a(kik.a.d.a.a a1)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        kik.a.d.o o = a1.a("png-preview");
        a1 = a1.a("preview");
        boolean flag;
        if (o != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L1; else goto _L3
_L3:
        return true;
    }

    protected final int a()
    {
        return 255;
    }

    protected final View a(ViewGroup viewgroup)
    {
        viewgroup = k.inflate(0x7f030067, viewgroup, false);
        a a1 = new a((byte)0);
        a1.f = (ContentPreviewImageView)viewgroup.findViewById(0x7f0e00dd);
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

    protected final void a(kik.a.d.a.a a1, n.a a2, boolean flag)
    {
        super.a(a1, a2, flag);
        if (!(a2 instanceof a))
        {
            return;
        }
        a2 = (a)a2;
        d d1 = (d)a1.a("png-preview");
        d d2 = (d)a1.a("preview");
        int j;
        if (d2 != null && d2.b() != null && d1 == null)
        {
            a(d2, a1.o(), ((a) (a2)), flag);
        } else
        if (d1 != null && d1.b() != null)
        {
            a(d1, a1.o(), ((a) (a2)), flag);
        } else
        {
            cv.e(new View[] {
                ((a) (a2)).f
            });
        }
        if (!i.a(((a) (a2)).b.getText()))
        {
            j = KikApplication.e(0x7f0c0005);
        } else
        {
            j = 0;
        }
        ((a) (a2)).f.b(j);
    }

    protected final void a(s s, ar.b b)
    {
        super.a(s, b);
        s = (a)b;
        ((a) (s)).b.setTextColor(-1);
        cv.a(((a) (s)).b, ac.a);
        b = d.d();
        c.a(((a) (s)).k, b);
        c.a(((a) (s)).a, b);
        c.a(((a) (s)).j, b);
    }

    protected final boolean a(ar.b b)
    {
        return b != null && b.getClass().equals(com/kik/view/adapters/m$a);
    }
}
