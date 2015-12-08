// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ContactImageView;
import com.kik.cache.MaskedContentPreviewImage;
import com.kik.cache.ad;
import com.kik.l.ab;
import java.io.File;
import kik.a.d.a.a;
import kik.a.e.n;
import kik.a.e.v;
import kik.a.f.k;
import kik.a.h.e;
import kik.android.chat.KikApplication;
import kik.android.chat.b.d;
import kik.android.i.i;
import kik.android.util.aa;
import kik.android.util.ae;
import kik.android.widget.ClampedContentPreviewView;
import kik.android.widget.IconImageView;
import kik.android.widget.MaskedFramelayout;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            n

public abstract class s extends com.kik.view.adapters.n
{
    protected static class a extends n.a
    {

        View b;
        ImageView c;
        ClampedContentPreviewView d;
        ViewGroup e;

        protected a()
        {
        }
    }


    public s(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n1, k k, d d, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n1, k, d, a3);
    }

    protected abstract int a();

    protected View a(ViewGroup viewgroup)
    {
        return a(viewgroup, new a());
    }

    protected final View a(ViewGroup viewgroup, a a1)
    {
        viewgroup = k.inflate(a(), viewgroup, false);
        a1.d = (ClampedContentPreviewView)viewgroup.findViewById(0x7f0e00dd);
        a1.p = (ContactImageView)viewgroup.findViewById(0x7f0e0154);
        a1.q = (ImageView)viewgroup.findViewById(0x7f0e0155);
        a1.h = (IconImageView)viewgroup.findViewById(0x7f0e00e4);
        a1.s = (ImageView)viewgroup.findViewById(0x7f0e0153);
        a1.o = (TextView)viewgroup.findViewById(0x7f0e0151);
        a1.j = (TextView)viewgroup.findViewById(0x7f0e00e5);
        a1.k = (ImageView)viewgroup.findViewById(0x7f0e00e7);
        a1.i = viewgroup.findViewById(0x7f0e00e0);
        a1.b = viewgroup.findViewById(0x7f0e0159);
        a1.c = (ImageView)viewgroup.findViewById(0x7f0e00e9);
        a1.m = (MaskedFramelayout)viewgroup.findViewById(0x7f0e00dc);
        a1.l = viewgroup.findViewById(0x7f0e00e8);
        a1.e = (FrameLayout)viewgroup.findViewById(0x7f0e015b);
        a1.r = viewgroup;
        viewgroup.setTag(a1);
        return viewgroup;
    }

    protected abstract kik.a.d.d a(kik.a.d.a.a a1);

    protected void a(kik.a.d.a.a a1, n.a a2, boolean flag)
    {
        kik.a.d.d d;
label0:
        {
            a2 = (a)a2;
            if (flag)
            {
                ((a) (a2)).l.setVisibility(0);
            } else
            {
                ((a) (a2)).l.setVisibility(8);
            }
            if (((a) (a2)).r.findViewById(0x7f0e01c8) != null && (((a) (a2)).d instanceof MaskedContentPreviewImage))
            {
                ((ProgressWidget)((a) (a2)).r.findViewById(0x7f0e01c8)).a((MaskedContentPreviewImage)((a) (a2)).d);
            }
            if (a1 != null)
            {
                if (ae.b(a1))
                {
                    d = a(a1);
                    if (aa.a(g, d))
                    {
                        ((a) (a2)).d.b(KikApplication.e(0x7f0c0020));
                        ((a) (a2)).i.setBackgroundResource(0x7f02009d);
                    } else
                    {
                        ((a) (a2)).d.b(0);
                        ((a) (a2)).i.setBackgroundResource(0x7f02009c);
                    }
                } else
                {
                    ((a) (a2)).i.setBackgroundDrawable(null);
                    ((a) (a2)).d.b(0);
                }
                d = a(a1);
                if (d != null)
                {
                    break label0;
                }
                ((a) (a2)).d.setImageBitmap(null);
                ((a) (a2)).d.setVisibility(8);
            }
            return;
        }
        a1 = e(a1);
        ((a) (a2)).d.a(d, a1, o, flag, n);
        ((a) (a2)).d.setVisibility(0);
    }

    protected boolean a(ar.b b1)
    {
        return b1 instanceof a;
    }

    protected void b(n.a a1)
    {
        a a2 = (a)a1;
        ((ProgressWidget)a1.r.findViewById(0x7f0e01c8)).a(a2.b, a2.c);
    }

    protected final void c(n.a a1)
    {
        ((a)a1).b.setVisibility(8);
    }

    protected String e(kik.a.d.a.a a1)
    {
        return a1.o();
    }

    protected final Bitmap f(kik.a.d.a.a a1)
    {
        a1 = a(a1);
        if (a1 != null)
        {
            if ((a1 = kik.a.h.e.a().a(a1)) != null)
            {
                try
                {
                    a1 = BitmapFactory.decodeByteArray(a1, 0, a1.length);
                }
                // Misplaced declaration of an exception variable
                catch (kik.a.d.a.a a1)
                {
                    return null;
                }
                return a1;
            }
        }
        return null;
    }

    protected final void g(kik.a.d.a.a a1)
    {
label0:
        {
            {
                boolean flag = true;
                if (a1 == null || e == null || g == null)
                {
                    return;
                }
                if (!"com.kik.ext.video-gallery".equals(a1.u()) && !"com.kik.ext.video-camera".equals(a1.u()))
                {
                    break label0;
                }
                if (a1.k() != null)
                {
                    if (h.c(a1.o()) || i.a().a(a1.k().toString()) == null)
                    {
                        flag = false;
                    }
                } else
                {
                    flag = false;
                }
            }
            e.b("Content Upload Retry").a("App ID", a1.u()).a("Is Upload Content Expired", flag).b();
            return;
        }
        if (g.u(a1.o()))
        {
            flag = false;
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_84;
        }
    }
}
