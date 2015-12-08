// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.c;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.bi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.s;
import com.roidapp.baselib.c.x;
import com.roidapp.baselib.view.w;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.b.u;
import com.roidapp.cloudlib.template.TemplateInfo;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.c:
//            b

public final class a extends com.roidapp.cloudlib.sns.c.b
{

    private Fragment b;
    private List c;
    private x d;

    public a(Fragment fragment, android.view.View.OnClickListener onclicklistener)
    {
        super(onclicklistener);
        b = fragment;
    }

    private int e()
    {
        if (d != null)
        {
            return super.a() + 1;
        } else
        {
            return super.a();
        }
    }

    public final int a()
    {
        int j = 0;
        int i;
        if (d != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (c != null)
        {
            j = c.size() + 1;
        }
        return i + (j + super.a());
    }

    public final int a(int i)
    {
label0:
        {
            int k = super.a(i);
            int j = k;
            if (k == -1)
            {
                if (d == null || ((Integer)d.a).intValue() != i)
                {
                    break label0;
                }
                j = 3;
            }
            return j;
        }
        return i - e() != 0 ? 1 : 2;
    }

    public final bi a(ViewGroup viewgroup, int i)
    {
        return b(viewgroup, i);
    }

    public final volatile void a(bi bi, int i)
    {
        a((s)bi, i);
    }

    public final void a(s s1, int i)
    {
        if (i >= super.a()) goto _L2; else goto _L1
_L1:
        super.a(s1, i);
_L4:
        return;
_L2:
        if (d == null || ((Integer)d.a).intValue() != i)
        {
            break; /* Loop/switch isn't completed */
        }
        TemplateInfo templateinfo = (TemplateInfo)d.b;
        Object obj = s1.b(ar.F);
        TextView textview = (TextView)s1.b(ar.H);
        TextView textview1 = (TextView)s1.b(ar.D);
        ProgressBar progressbar = (ProgressBar)s1.b(ar.I);
        if (templateinfo.d() == 100)
        {
            ((View) (obj)).setVisibility(8);
            textview1.setText(at.V);
            textview.setText(at.an);
            textview.setVisibility(0);
            progressbar.setVisibility(8);
        }
        obj = (ImageView)s1.b(ar.E);
        h.a(b).a(templateinfo.h()).b(com.roidapp.baselib.b.a.b()).g().a(((ImageView) (obj)));
        s1 = s1.b(ar.G);
        s1.setTag(templateinfo);
        s1.setOnClickListener(a);
        if (!s1.isEnabled() && templateinfo.d() == 100)
        {
            s1.setEnabled(true);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i -= e();
        if (i != 0)
        {
            u u1 = (u)c.get(i - 1);
            i = com.roidapp.cloudlib.common.d.a(s1.a.getResources(), 2.0F);
            Object obj1 = new w(u1.g);
            ((w) (obj1)).a(i);
            ((w) (obj1)).a();
            s1.a.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
            Object obj2 = new w(0x33000000);
            ((w) (obj2)).a(i);
            ((w) (obj2)).a();
            obj1 = new StateListDrawable();
            ((StateListDrawable) (obj1)).addState(new int[] {
                0x10100a7
            }, ((android.graphics.drawable.Drawable) (obj2)));
            obj2 = new ColorDrawable(0);
            ((StateListDrawable) (obj1)).addState(new int[0], ((android.graphics.drawable.Drawable) (obj2)));
            ((FrameLayout)s1.a).setForeground(((android.graphics.drawable.Drawable) (obj1)));
            ((TextView)((FrameLayout)s1.a).getChildAt(0)).setText((new StringBuilder("#")).append(u1.a).toString());
            s1.a.setTag(new String[] {
                u1.a, Integer.toHexString(u1.g)
            });
            s1.a.getContext();
            com.roidapp.baselib.c.b.a("SNS", "show", (new StringBuilder("SNS/PopularTags/Show/")).append(u1.a).toString());
            al.g().a(s1.a.getContext(), "SNS", "show", (new StringBuilder("SNS/PopularTags/Show/")).append(u1.a).toString(), Long.valueOf(1L));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(TemplateInfo templateinfo)
    {
        d = new x(Integer.valueOf(2), templateinfo);
    }

    public final void a(List list)
    {
        c = list;
    }

    public final s b(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            return super.b(viewgroup, i);

        case 1: // '\001'
            viewgroup = (FrameLayout)LayoutInflater.from(viewgroup.getContext()).inflate(as.l, viewgroup, false);
            viewgroup.setOnClickListener(a);
            return new s(viewgroup);

        case 2: // '\002'
            TextView textview = new TextView(viewgroup.getContext());
            i = com.roidapp.cloudlib.common.d.a(viewgroup.getContext().getResources(), 8F);
            viewgroup = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
            viewgroup.topMargin = i;
            viewgroup.bottomMargin = i;
            textview.setLayoutParams(viewgroup);
            textview.setText(at.C);
            textview.setTextSize(2, 18F);
            return new s(textview);

        case 3: // '\003'
            return new s(LayoutInflater.from(viewgroup.getContext()).inflate(as.m, viewgroup, false));
        }
    }

    public final void d()
    {
        if (c != null)
        {
            c.clear();
        }
        d = null;
        c = null;
        a = null;
    }

    public final boolean e(int i)
    {
        return 1 == i || super.e(i);
    }
}
