// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ContactImageView;
import com.kik.e.a;
import com.kik.l.ab;
import kik.a.d.k;
import kik.a.d.s;
import kik.a.e.i;
import kik.a.e.n;
import kik.a.e.r;
import kik.a.e.t;
import kik.a.e.v;
import kik.android.util.DeviceUtils;
import kik.android.util.cq;
import kik.android.util.cv;

// Referenced classes of package com.kik.view.adapters:
//            as

public abstract class ar
{
    public static interface a
    {

        public abstract k a(s s1);
    }

    public static class b
    {

        int n;
        TextView o;
        ContactImageView p;
        ImageView q;
        View r;

        public b()
        {
        }
    }


    private final android.view.View.OnClickListener a;
    protected com.kik.android.a e;
    protected r f;
    protected v g;
    protected ab h;
    protected i i;
    protected t j;
    protected final LayoutInflater k;
    protected final Context l;
    protected final a m;
    protected final n n;

    public ar(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, a a1, com.kik.android.a a2, n n1, com.kik.e.a a3)
    {
        m = a1;
        e = a2;
        n = n1;
        a3.a(this);
        if (DeviceUtils.c())
        {
            if (e == null)
            {
                throw new IllegalArgumentException("MessageViewBinder must not have a null mixpanel");
            }
            if (m == null)
            {
                throw new IllegalArgumentException("MessageViewBinder must have a contact provider");
            }
        }
        k = layoutinflater;
        l = context;
        a = onclicklistener;
    }

    public final View a(int i1, View view, ViewGroup viewgroup, s s1, boolean flag, au.b b1)
    {
        View view1;
label0:
        {
            if (view != null)
            {
                view1 = view;
                if (a((b)view.getTag()))
                {
                    break label0;
                }
            }
            view1 = a(viewgroup);
        }
        view = (b)view1.getTag();
        view.n = i1;
        a(((b) (view)), s1, flag, l, b1);
        a(s1, ((b) (view)));
        return view1;
    }

    protected abstract View a(ViewGroup viewgroup);

    public void a(int i1)
    {
    }

    public void a(b b1, s s1, boolean flag, Context context, au.b b2)
    {
        b1.p.setOnClickListener(a);
        b1.r.setOnClickListener(new as(this, b2));
        if (flag && b1.o != null)
        {
            cv.b(new View[] {
                b1.o
            });
            s1 = cq.a(s1.e(), false);
            b1.o.setText(((kik.android.util.cq.a) (s1)).a);
            b1 = (Spannable)b1.o.getText();
            if (((kik.android.util.cq.a) (s1)).b > 0)
            {
                b1.setSpan(new ForegroundColorSpan(Color.rgb(149, 161, 178)), 0, ((kik.android.util.cq.a) (s1)).b, 0);
            }
            return;
        } else
        {
            cv.e(new View[] {
                b1.o
            });
            return;
        }
    }

    protected abstract void a(s s1, b b1);

    protected abstract boolean a(b b1);

    public void b(int i1)
    {
    }

    public void c()
    {
    }

    public void c(int i1)
    {
    }
}
