// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.ads.s;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.au;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.b.a;
import com.roidapp.cloudlib.template.j;

public final class i extends DialogFragment
    implements android.view.View.OnClickListener
{

    private int a;
    private int b;
    private View c;
    private TextView d;
    private TextView e;
    private ProgressBar f;
    private Handler g;
    private TemplateInfo h;

    public i()
    {
        a = 10;
        b = 0;
    }

    private void c()
    {
        Message message = Message.obtain();
        message.what = 8996;
        message.obj = h;
        g.sendMessage(message);
    }

    public final void a()
    {
        if (!isAdded())
        {
            return;
        }
        if (a == 30)
        {
            c();
            return;
        } else
        {
            a = 20;
            c.setEnabled(true);
            d.setText(getString(at.an));
            d.setVisibility(0);
            f.setVisibility(8);
            return;
        }
    }

    public final void a(int k)
    {
        b = k;
    }

    public final void a(TemplateInfo templateinfo)
    {
        h = templateinfo;
    }

    public final void b()
    {
        if (!isAdded())
        {
            return;
        } else
        {
            a = 10;
            c.setEnabled(true);
            d.setText(getString(at.an));
            d.setVisibility(0);
            f.setVisibility(8);
            return;
        }
    }

    public final void b(int k)
    {
        a = k;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof a)
        {
            g = ((a)activity).b();
        }
    }

    public final void onClick(View view)
    {
        if (view.getId() != ar.dd) goto _L2; else goto _L1
_L1:
        dismissAllowingStateLoss();
_L4:
        return;
_L2:
        if (view.getId() != ar.db || g == null) goto _L4; else goto _L3
_L3:
        switch (a)
        {
        default:
            return;

        case 10: // '\n'
        case 30: // '\036'
            if (h != null)
            {
                if (b == 1)
                {
                    view = "Share";
                } else
                {
                    view = "Template";
                }
                com.roidapp.baselib.c.b.f("Unlock/Click/GET_NOW", view);
                if (!j.b(h.e()))
                {
                    if (s.c())
                    {
                        s.d();
                        al.g().a("TemplateSelect_template_card", 2, 5);
                    }
                    if (e != null)
                    {
                        e.setText(getString(at.V));
                    }
                    j.c(h.e());
                }
                if (b == 0)
                {
                    view = Message.obtain();
                    view.what = 8985;
                    view.obj = h;
                    g.sendMessage(view);
                } else
                if (b == 1)
                {
                    g.sendEmptyMessage(8976);
                }
                c.setEnabled(false);
                d.setVisibility(8);
                f.setVisibility(0);
                return;
            }
            break;

        case 20: // '\024'
            if (b == 1)
            {
                view = "Share";
            } else
            {
                view = "Template";
            }
            com.roidapp.baselib.c.b.f("Unlock/Click/PICK", view);
            al.g().a("TemplateSelect_template_card", 3, 5);
            c();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        setStyle(0, au.a);
        return super.onCreateDialog(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().setCanceledOnTouchOutside(false);
        layoutinflater = layoutinflater.inflate(as.ab, null);
        layoutinflater.findViewById(ar.dd).setOnClickListener(this);
        viewgroup = (ImageView)layoutinflater.findViewById(ar.de);
        if (h != null)
        {
            bundle = viewgroup.getLayoutParams();
            bundle.width = Math.round((getResources().getDisplayMetrics().density / 1.5F) * (float)h.k());
            bundle.height = ((android.view.ViewGroup.LayoutParams) (bundle)).width;
            com.bumptech.glide.h.a(this).a(h.h()).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(viewgroup);
        }
        c = layoutinflater.findViewById(ar.db);
        c.setOnClickListener(this);
        f = (ProgressBar)layoutinflater.findViewById(ar.df);
        d = (TextView)layoutinflater.findViewById(ar.dc);
        e = (TextView)layoutinflater.findViewById(ar.dg);
        if (a == 10)
        {
            d.setText(getString(at.S));
            e.setText(getString(at.bn));
            al.g().a("TemplateSelect_template_card", 1, 5);
        } else
        if (a == 20 || a == 30)
        {
            d.setText(getString(at.an));
            e.setText(getString(at.V));
            return layoutinflater;
        }
        return layoutinflater;
    }
}
