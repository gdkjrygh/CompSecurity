// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.c;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.template.a.e;
import com.roidapp.cloudlib.template.j;

// Referenced classes of package com.roidapp.cloudlib.template.c:
//            f, b

public final class a extends f
{

    public a()
    {
    }

    protected final void a(View view)
    {
        View view1 = LayoutInflater.from(getActivity()).inflate(as.aa, null);
        Object obj = new android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams(-1, d.a(getResources(), 32F) + g);
        ((android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) (obj)).a();
        view1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        view1.setClickable(true);
        obj = new b(this);
        RelativeLayout relativelayout = (RelativeLayout)view1.findViewById(ar.cw);
        RelativeLayout relativelayout1 = (RelativeLayout)view1.findViewById(ar.ct);
        relativelayout.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        relativelayout1.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        relativelayout1.setSelected(true);
        d.setText(getString(at.aX));
        if (j.b().f() && d != null)
        {
            d.setVisibility(0);
        }
        super.a(view);
        view = new y(a);
        view.a(view1);
        b.a(view);
    }

    public final e c()
    {
        if (a != null && d != null)
        {
            if (a.a() > 0)
            {
                d.setVisibility(8);
            } else
            {
                d.setVisibility(0);
            }
        }
        return a;
    }

    public final void onClick(View view)
    {
        if (view.getId() == ar.cF)
        {
            int i = ((Integer)view.getTag()).intValue();
            view = a.e(i);
            j.b().c(view);
            a(e, 9217, null);
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }
}
