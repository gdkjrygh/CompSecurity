// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

final class cgx extends md
{

    final List b = new ArrayList();
    View c[];
    final cgp d;
    private Context e;

    public cgx(cgp cgp1, Context context)
    {
        d = cgp1;
        super();
        c = new View[0];
        e = (Context)b.a(context, "context", null);
    }

    static void a(cgx cgx1)
    {
        int k = cgp.f(cgx1.d).c;
        for (int i = k - 1; i <= k + 1; i++)
        {
            if (i < 0 || i >= cgx1.c.length || cgx1.c[i] == null)
            {
                continue;
            }
            ListView listview = (ListView)cgx1.c[i].findViewById(b.gJ);
            for (int j = 0; j < listview.getChildCount(); j++)
            {
                cqa cqa1 = (cqa)listview.getItemAtPosition(listview.getFirstVisiblePosition() + j);
                cgp.a(cgx1.d, listview.getChildAt(j), cqa1);
            }

        }

    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        View view = d.O_().getLayoutInflater().inflate(c.G, viewgroup, false);
        viewgroup.addView(view);
        c[i] = view;
        viewgroup = ((bwg)b.get(i)).a();
        if (viewgroup != null)
        {
            b.a(view, new msm(viewgroup));
        }
        viewgroup = (ListView)view.findViewById(b.gJ);
        viewgroup.setAdapter(new cgw(d, e, ((bwg)b.get(i)).b));
        viewgroup.setOnItemClickListener(new cgy(this));
        return view;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
        c[i] = null;
        cgp.v();
        (new StringBuilder(37)).append("destroyItem() [position: ").append(i).append("]");
    }

    public final boolean a(View view, Object obj)
    {
        return obj == view;
    }

    public final int b()
    {
        return b.size();
    }

    public final CharSequence b(int i)
    {
        return ((bwg)b.get(i)).a;
    }

    msm d()
    {
        return ((mso)cgp.h(d).a(mso)).r();
    }
}
