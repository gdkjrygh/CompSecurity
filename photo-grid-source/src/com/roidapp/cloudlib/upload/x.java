// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.b.a.h;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            aa, z, y, ab

public final class x extends Fragment
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    ListView a;
    ProgressBar b;
    private aa c;
    private ab d;
    private String e;
    private String f;
    private boolean g;
    private TextView h;
    private TextView i;
    private int j;

    public x()
    {
        j = -1;
    }

    static ab a(x x1)
    {
        return x1.d;
    }

    static void a(x x1, h h1)
    {
        x1.h.setVisibility(8);
        x1.i.setVisibility(8);
        x1.b.setVisibility(8);
        x1.a.setVisibility(0);
        x1.a.setOnItemClickListener(x1);
        if (x1.c == null || x1.a.getAdapter() == null)
        {
            x1.getActivity();
            x1.c = new aa(x1, h1);
            x1.a.setAdapter(x1.c);
        }
        x1.c.a(h1);
        x1.c.notifyDataSetChanged();
    }

    static void b(x x1)
    {
        x1.b.setVisibility(8);
        x1.a.setAdapter(null);
        x1.h.setText(at.ac);
        x1.i.setVisibility(8);
        x1.h.setVisibility(0);
    }

    static void c(x x1)
    {
        x1.b.setVisibility(8);
    }

    static void d(x x1)
    {
        x1.b.setVisibility(8);
        x1.a.setAdapter(null);
        x1.h.setVisibility(8);
        x1.i.setVisibility(0);
    }

    public final void a()
    {
        g = true;
    }

    public final void a(int k)
    {
        j = k;
    }

    public final void a(ab ab1)
    {
        d = ab1;
    }

    public final void a(String s)
    {
        e = s;
        if (b != null)
        {
            b.setVisibility(0);
        }
        if (a != null)
        {
            a.setVisibility(8);
        }
        s = q.a(false, s, new z(this));
        s.l();
        s.a(this);
    }

    public final void b(String s)
    {
        f = s;
    }

    public final void onClick(View view)
    {
        if (view.getId() == ar.cd)
        {
            l.a(getActivity(), null);
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.ao, viewgroup, false);
        layoutinflater.setOnClickListener(new y(this));
        if (!g) goto _L2; else goto _L1
_L1:
        viewgroup = layoutinflater.getLayoutParams();
        viewgroup.height = -1;
        layoutinflater.setLayoutParams(viewgroup);
_L4:
        a = (ListView)layoutinflater.findViewById(ar.cc);
        b = (ProgressBar)layoutinflater.findViewById(ar.bP);
        h = (TextView)layoutinflater.findViewById(ar.bY);
        i = (TextView)layoutinflater.findViewById(ar.cd);
        i.setOnClickListener(this);
        return layoutinflater;
_L2:
        if (j != -1)
        {
            viewgroup = layoutinflater.getLayoutParams();
            viewgroup.height = j;
            layoutinflater.setLayoutParams(viewgroup);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onItemClick(AdapterView adapterview, View view, int k, long l1)
    {
        adapterview = (com.roidapp.cloudlib.sns.b.x)c.getItem(k);
        if (d != null)
        {
            d.a(e, ((com.roidapp.cloudlib.sns.b.x) (adapterview)).b);
        }
    }

    public final void onResume()
    {
        super.onResume();
        if (f != null)
        {
            a(f);
            f = null;
        }
    }
}
