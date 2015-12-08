// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kik.cache.MaskedContentPreviewImage;
import com.kik.cache.ad;
import kik.a.d.a.a;
import kik.a.d.d;
import kik.a.e.n;
import kik.a.f.k;
import kik.android.chat.KikApplication;
import kik.android.i.b;
import kik.android.util.ae;
import kik.android.util.cv;
import kik.android.widget.ClampedContentPreviewView;
import kik.android.widget.IconImageView;

// Referenced classes of package com.kik.view.adapters:
//            bf, af

public final class ac extends bf
{

    public ac(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n, k k, com.kik.e.a a3, b b, af af)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n, k, null, a3, b, af);
    }

    protected final int a()
    {
        return 0x7f030068;
    }

    protected final View a(ViewGroup viewgroup)
    {
        bf.b b = new bf.b();
        viewgroup = super.a(viewgroup, b);
        b.d = (MaskedContentPreviewImage)viewgroup.findViewById(0x7f0e00dd);
        b.d.b(KikApplication.e(0x7f0c0020));
        viewgroup.setTag(b);
        return viewgroup;
    }

    protected final d a(a a1)
    {
        return (d)a1.a("preview");
    }

    protected final void a(bf.b b)
    {
        cv.e(new View[] {
            b.i
        });
    }

    protected final void a(a a1, n.a a2, boolean flag)
    {
        super.a(a1, a2, flag);
        a2 = (bf.b)a2;
        if (a1 != null)
        {
            cv.a(((bf.b) (a2)).j);
            ((bf.b) (a2)).j.setText(ae.a(a1));
            ((bf.b) (a2)).h.a(a1, n);
            ((bf.b) (a2)).j.setMaxWidth(KikApplication.a(120));
            cv.a(((bf.b) (a2)).j, kik.android.util.ac.a);
        }
    }
}
