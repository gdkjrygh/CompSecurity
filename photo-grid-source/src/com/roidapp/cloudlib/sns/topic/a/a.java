// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic.a;

import android.support.v4.app.Fragment;
import android.support.v7.widget.bi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.c.s;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import java.util.List;

public final class a extends com.roidapp.cloudlib.sns.topic.a
{

    private final int j;

    public a(Fragment fragment, android.view.View.OnClickListener onclicklistener)
    {
        super(fragment, onclicklistener, 3);
        j = d.a(fragment.getResources(), 2.0F);
    }

    public final int a()
    {
        if (d != null)
        {
            return ((e)d).size() - 1;
        } else
        {
            return 0;
        }
    }

    public final int a(int i)
    {
        switch (i)
        {
        default:
            return 34;

        case 0: // '\0'
            return 32;

        case 1: // '\001'
            return 33;
        }
    }

    public final bi a(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            viewgroup = LayoutInflater.from(c).inflate(as.ag, viewgroup, false);
            viewgroup.getLayoutParams().width = e;
            viewgroup.getLayoutParams().height = e;
            return new s(viewgroup, i);

        case 32: // ' '
            viewgroup = LayoutInflater.from(c).inflate(as.ad, viewgroup, false);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)((ImageView)viewgroup.findViewById(ar.cQ)).getLayoutParams();
            marginlayoutparams.width = g;
            marginlayoutparams.height = g;
            return new s(viewgroup, i);

        case 33: // '!'
            viewgroup = LayoutInflater.from(c).inflate(as.ae, viewgroup, false);
            break;
        }
        Object obj = (ImageView)viewgroup.findViewById(ar.cR);
        ImageView imageview = (ImageView)viewgroup.findViewById(ar.cU);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)((ImageView) (obj)).getLayoutParams();
        marginlayoutparams1.width = g / 2;
        marginlayoutparams1.height = g / 2;
        ((ImageView) (obj)).setLayoutParams(marginlayoutparams1);
        obj = (android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams();
        obj.width = g / 2;
        obj.height = g / 2;
        imageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        return new s(viewgroup, i);
    }

    public final com.bumptech.glide.e a(Object obj)
    {
        obj = (n)obj;
        return h.a(b).a(((n) (obj)).a.e).g().a().b(e, e);
    }

    public final void a(bi bi, int i)
    {
        n n2;
        ImageView imageview1;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        bi = (s)bi;
        int k = ((e)d).size();
        if (k == 1 || k == 3)
        {
            bi.b(ar.cT).setVisibility(8);
        }
        switch (((s) (bi)).j)
        {
        default:
            return;

        case 32: // ' '
            n n1 = (n)((e)d).get(i);
            ImageView imageview = (ImageView)bi.b(ar.cQ);
            h.a(b).a(n1.a.f).g().b(com.roidapp.baselib.b.a.b()).a(com.bumptech.glide.load.b.e.c).a(imageview);
            a(((s) (bi)).a, n1);
            return;

        case 33: // '!'
            n n3 = (n)((e)d).get(i);
            View view = bi.b(ar.cS);
            ImageView imageview2 = (ImageView)bi.b(ar.cR);
            h.a(b).a(n3.a.e).g().b(com.roidapp.baselib.b.a.b()).a(imageview2);
            a(view, n3);
            if (k < 3)
            {
                bi.b(ar.cV).setVisibility(8);
                return;
            } else
            {
                n n4 = (n)((e)d).get(i + 1);
                View view1 = bi.b(ar.cV);
                ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()).rightMargin = j / 2;
                ((android.view.ViewGroup.MarginLayoutParams)view1.getLayoutParams()).leftMargin = j / 2;
                bi = (ImageView)bi.b(ar.cU);
                h.a(b).a(n4.a.e).g().b(com.roidapp.baselib.b.a.b()).a(bi);
                a(view1, n4);
                return;
            }

        case 34: // '"'
            n2 = (n)((e)d).get(i + 1);
            imageview1 = (ImageView)bi.b(ar.cP);
            marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)((s) (bi)).a.getLayoutParams();
            marginlayoutparams.width = e;
            marginlayoutparams.height = e;
            marginlayoutparams.rightMargin = 0;
            marginlayoutparams.leftMargin = 0;
            marginlayoutparams.bottomMargin = j;
            break;
        }
        (i - 2) % f;
        JVM INSTR tableswitch 0 2: default 468
    //                   0 521
    //                   1 535
    //                   2 560;
           goto _L1 _L2 _L3 _L4
_L1:
        h.a(b).a(n2.a.e).g().b(com.roidapp.baselib.b.a.b()).b(e, e).a(imageview1);
        a(((s) (bi)).a, n2);
        return;
_L2:
        marginlayoutparams.rightMargin = j / 2;
        continue; /* Loop/switch isn't completed */
_L3:
        marginlayoutparams.leftMargin = j / 2;
        marginlayoutparams.rightMargin = j / 2;
        continue; /* Loop/switch isn't completed */
_L4:
        marginlayoutparams.leftMargin = j / 2;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final volatile int[] b()
    {
        return (new int[] {
            e, e
        });
    }

    public final List c(int i)
    {
        i = (i - this.i) + 1;
        if (i < 0)
        {
            return a;
        }
        a(i);
        JVM INSTR tableswitch 34 34: default 40
    //                   34 45;
           goto _L1 _L2
_L1:
        return a;
_L2:
        if ((i = Math.max(0, i + 1)) < ((e)d).size())
        {
            return ((e)d).subList(i, i + 1);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean e(int i)
    {
        return i == 34;
    }
}
