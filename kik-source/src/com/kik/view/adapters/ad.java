// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kik.g.p;
import kik.a.d.d;
import kik.a.e.n;
import kik.a.f.k;
import kik.android.gifs.a;
import kik.android.gifs.view.GifView;
import kik.android.util.cv;

// Referenced classes of package com.kik.view.adapters:
//            s, ae

public final class ad extends s
{
    public static final class a extends s.a
    {

        GifView a;

        public a()
        {
        }
    }


    public ad(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, com.kik.cache.ad ad1, com.kik.android.a a2, 
            n n, k k, kik.android.chat.b.d d1, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad1, a2, n, k, d1, a3);
    }

    static String b(kik.a.d.a.a a1)
    {
        return a1.a(kik.android.gifs.a.b);
    }

    protected final int a()
    {
        return 0x7f030069;
    }

    protected final View a(ViewGroup viewgroup)
    {
        a a1 = new a();
        viewgroup = super.a(viewgroup, a1);
        a1.a = (GifView)viewgroup.findViewById(0x7f0e00e2);
        a1.d = a1.a;
        return viewgroup;
    }

    protected final d a(kik.a.d.a.a a1)
    {
        return (d)a1.a("preview");
    }

    protected final void a(kik.a.d.a.a a1, n.a a2, boolean flag)
    {
        super.a(a1, a2, flag);
        a2 = (a)a2;
        cv.e(new View[] {
            ((a) (a2)).i
        });
        String s1;
        if (a1 != null && !flag)
        {
            if ((s1 = a1.a(kik.android.gifs.a.a)) != null)
            {
                ((a) (a2)).a.a(s1, kik.android.gifs.a.c).a(new ae(this, a2, a1));
                return;
            }
        }
    }

    protected final boolean a(ar.b b1)
    {
        return b1 instanceof a;
    }

    protected final View[] a(n.a a1)
    {
        return null;
    }

    protected final String e(kik.a.d.a.a a1)
    {
        return a1.a(kik.android.gifs.a.a);
    }
}
