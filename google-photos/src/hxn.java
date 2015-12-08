// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class hxn extends omp
    implements android.widget.AdapterView.OnItemClickListener, fpl, hwg
{

    final hwf a;
    private ListView b;
    private List c;
    private BaseAdapter d;

    public hxn()
    {
        c = new ArrayList();
        a = new hwf(af, this);
        new fpk(af, this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.yh, null);
        b = (ListView)layoutinflater.findViewById(c.eB);
        d = new hwe(ad, c);
        b.setAdapter(d);
        b.setOnItemClickListener(this);
        b.a(b, new msm(pwy.c));
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view.setBackgroundColor(g().getColor(p.ax));
        view.setVisibility(8);
    }

    public final void a(fpj fpj, Rect rect)
    {
        super.R.setPadding(0, rect.top, 0, rect.bottom);
    }

    public final void b(List list)
    {
        c.clear();
        c.addAll(list);
        super.R.setVisibility(0);
        d.notifyDataSetChanged();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mry.a(view, 4);
        adapterview = (hrr)c.get(i);
        ((hsq)olm.a(ad, hsq)).a(adapterview);
    }

    public final void r()
    {
        c.clear();
        if (d != null)
        {
            d.notifyDataSetChanged();
        }
        a.b.remove(this);
        if (super.R != null)
        {
            super.R.setVisibility(8);
        }
    }
}
