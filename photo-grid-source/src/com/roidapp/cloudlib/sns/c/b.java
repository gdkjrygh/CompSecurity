// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.c;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.al;
import android.support.v7.widget.bi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.s;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;

public class b extends al
{

    protected android.view.View.OnClickListener a;
    private boolean b[];

    public b(android.view.View.OnClickListener onclicklistener)
    {
        b = new boolean[2];
        a = onclicklistener;
    }

    public int a()
    {
        return 2;
    }

    public int a(int i)
    {
        return i != 0 && i != 1 ? -1 : 0;
    }

    public bi a(ViewGroup viewgroup, int i)
    {
        return b(viewgroup, i);
    }

    public volatile void a(bi bi, int i)
    {
        a((s)bi, i);
    }

    public void a(s s1, int i)
    {
        ImageView imageview = (ImageView)s1.b(ar.d);
        ImageView imageview1 = (ImageView)s1.b(ar.c);
        TextView textview = (TextView)s1.b(ar.e);
        if (i == 0)
        {
            if (!b[i])
            {
                s1.a.getContext();
                com.roidapp.baselib.c.b.a("SNS", "show", "SNS/PopularPost/Show/");
                com.roidapp.cloudlib.al.g().a(s1.a.getContext(), "SNS", "show", "SNS/PopularPost/Show/", Long.valueOf(1L));
                b[i] = true;
            }
            s1.a.setId(ar.C);
            n.a(imageview, aq.N);
            n.a(imageview1, aq.P);
            textview.setText(at.A);
        } else
        if (i == 1)
        {
            if (!b[i])
            {
                s1.a.getContext();
                com.roidapp.baselib.c.b.a("SNS", "show", "SNS/PopularUser/Show/");
                com.roidapp.cloudlib.al.g().a(s1.a.getContext(), "SNS", "show", "SNS/PopularUser/Show/", Long.valueOf(1L));
                b[i] = true;
            }
            s1.a.setId(ar.w);
            n.a(imageview, aq.M);
            n.a(imageview1, aq.O);
            textview.setText(at.B);
            return;
        }
    }

    public s b(ViewGroup viewgroup, int i)
    {
        if (i == 0)
        {
            FrameLayout framelayout = (FrameLayout)LayoutInflater.from(viewgroup.getContext()).inflate(as.j, viewgroup, false);
            framelayout.setOnClickListener(a);
            StateListDrawable statelistdrawable = new StateListDrawable();
            ColorDrawable colordrawable = new ColorDrawable(0x33000000);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, colordrawable);
            colordrawable = new ColorDrawable(0);
            statelistdrawable.addState(new int[0], colordrawable);
            framelayout.setForeground(statelistdrawable);
            i = (viewgroup.getWidth() - viewgroup.getPaddingLeft() - viewgroup.getPaddingRight()) / 2 - d.a(viewgroup.getResources(), 4F);
            int j = (int)((float)i / 1.4F);
            viewgroup = framelayout.findViewById(ar.d).getLayoutParams();
            viewgroup.width = i;
            viewgroup.height = j;
            return new s(framelayout);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal view type : ")).append(i).toString());
        }
    }

    public boolean e(int i)
    {
        return i == 0;
    }
}
