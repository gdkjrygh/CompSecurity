// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.kik.android.a;
import com.kik.g.p;
import com.kik.l.ab;
import java.util.List;
import kik.android.chat.KikApplication;
import kik.android.gifs.a.e;
import kik.android.gifs.a.f;
import kik.android.gifs.view.ResultListGifView;

// Referenced classes of package kik.android.widget:
//            av, by

public final class au extends android.support.v7.widget.RecyclerView.a
{
    static final class a extends android.support.v7.widget.RecyclerView.t
    {

        public a(View view)
        {
            super(view);
        }
    }

    static final class b extends android.support.v7.widget.RecyclerView.t
        implements android.view.View.OnClickListener
    {

        ResultListGifView j;
        f k;
        e l;
        int m;
        by n;

        static void a(b b1, int i)
        {
            b1.m = i;
        }

        static void a(b b1, e e1)
        {
            b1.l = e1;
        }

        static void a(b b1, f f1)
        {
            b1.k = f1;
        }

        static void a(b b1, boolean flag)
        {
            b1.b(flag);
        }

        private void b(boolean flag)
        {
            if (flag)
            {
                a.setOnClickListener(this);
                return;
            } else
            {
                a.setOnClickListener(null);
                return;
            }
        }

        public final void onClick(View view)
        {
            n.a(k, m);
        }

        public b(ResultListGifView resultlistgifview, by by1)
        {
            super(resultlistgifview);
            n = by1;
            j = resultlistgifview;
            b(false);
        }
    }


    private List a;
    private Context b;
    private ab c;
    private com.kik.android.a d;
    private by e;

    public au(List list, Context context, ab ab, com.kik.android.a a1, by by)
    {
        a = list;
        b = context;
        c = ab;
        d = a1;
        e = by;
    }

    public final int a()
    {
        return a.size() + 1;
    }

    public final int a(int i)
    {
        return i > 0 ? 1 : 0;
    }

    public final android.support.v7.widget.RecyclerView.t a(ViewGroup viewgroup, int i)
    {
        if (i == 1)
        {
            viewgroup = new ResultListGifView(viewgroup.getContext());
            viewgroup.setBackgroundColor(0xffcccccc);
            return new b(viewgroup, e);
        } else
        {
            viewgroup = new Space(b);
            viewgroup.setMinimumHeight(KikApplication.a(50));
            return new a(viewgroup);
        }
    }

    public final void a(android.support.v7.widget.RecyclerView.t t)
    {
        if (t instanceof b)
        {
            t = (b)t;
            String s = ((b) (t)).l.a();
            ((b) (t)).j.a(s, kik.android.gifs.a.f.a.d).a(new av(this, t));
        }
    }

    public final void a(android.support.v7.widget.RecyclerView.t t, int i)
    {
        if (t instanceof b)
        {
            f f1 = (f)a.get(i - 1);
            e e1 = f1.a(kik.android.gifs.a.f.a.d);
            Point point = e1.b();
            t = (b)t;
            ((b) (t)).j.c(point.x, point.y);
            kik.android.widget.b.a(t, f1);
            kik.android.widget.b.a(t, e1);
            kik.android.widget.b.a(t, i - 1);
        } else
        if (t instanceof a)
        {
            android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams layoutparams = new android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams(-1, -1);
            layoutparams.a();
            t.a.setLayoutParams(layoutparams);
            return;
        }
    }

    public final void b(android.support.v7.widget.RecyclerView.t t)
    {
        if (t instanceof b)
        {
            ((b)t).j.b();
            kik.android.widget.b.a((b)t, false);
        }
        super.b(t);
    }

    public final List d()
    {
        return a;
    }
}
