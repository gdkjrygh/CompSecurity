// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.c;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.roidapp.baselib.c.y;
import com.roidapp.baselib.view.r;
import com.roidapp.baselib.view.u;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.a.e;
import com.roidapp.cloudlib.template.j;

// Referenced classes of package com.roidapp.cloudlib.template.c:
//            f, d, e

public final class c extends f
    implements u
{

    private r h;
    private int i;

    public c()
    {
    }

    protected final void a(View view)
    {
        Button button = new Button(getActivity());
        Object obj = new android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams(-1, -2);
        ((android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) (obj)).a();
        button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        button.setText(getResources().getString(at.aV));
        button.setTextSize(2, 19F);
        button.setTextColor(getResources().getColor(ao.e));
        button.setBackgroundDrawable(getResources().getDrawable(aq.H));
        button.setHeight(getResources().getDimensionPixelSize(ap.d));
        button.setOnClickListener(new com.roidapp.cloudlib.template.c.d(this));
        obj = LayoutInflater.from(getActivity()).inflate(as.aa, null);
        Object obj1 = new android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams(-1, d.a(getResources(), 32F) + g);
        ((View) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) (obj1)).a();
        ((View) (obj)).setClickable(true);
        obj1 = new com.roidapp.cloudlib.template.c.e(this);
        RelativeLayout relativelayout = (RelativeLayout)((View) (obj)).findViewById(ar.cw);
        ((RelativeLayout)((View) (obj)).findViewById(ar.ct)).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        relativelayout.setSelected(true);
        relativelayout.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        super.a(view);
        view = new y(a);
        view.a(((View) (obj)));
        view.b(button);
        b.a(view);
    }

    public final void b(int k, int l)
    {
        if (l >= 0)
        {
            a(e, 8994, a.e(l));
        }
    }

    public final void onClick(View view)
    {
        if (view.getId() == ar.cy)
        {
            int k = ((Integer)view.getTag()).intValue();
            TemplateInfo templateinfo = a.e(k);
            if (templateinfo != null && !j.a(templateinfo.e()))
            {
                h.a(view.findViewById(ar.cy), k, i, 0);
            }
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i = -getResources().getDimensionPixelSize(ap.c);
        h = new r(getActivity(), new String[] {
            getString(at.v)
        });
        h.a(this);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }
}
