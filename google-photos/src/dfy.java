// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class dfy extends BaseAdapter
{

    private final LayoutInflater a;
    private final mmv b;
    private final egf c;
    private final List d = new ArrayList();

    public dfy(Context context)
    {
        a = LayoutInflater.from(context);
        b = (mmv)olm.a(context, mmv);
        c = (egf)olm.a(context, egf);
    }

    public final dfz a(int i)
    {
        return (dfz)d.get(i);
    }

    public final void a()
    {
        b.u();
        d.clear();
        for (Iterator iterator = b.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext();)
        {
            Object obj = (Integer)iterator.next();
            obj = b.a(((Integer) (obj)).intValue());
            int j = ((mmx) (obj)).a("page_count", 0);
            int i = 0;
            while (i < j) 
            {
                mmx mmx1 = ((mmx) (obj)).d("page").d(Integer.toString(i));
                List list = d;
                dga dga1 = new dga();
                dga1.a = ((mmx) (obj)).b("account_name");
                dga1.c = mmx1.b("display_name");
                dga1.b = mmx1.b("gaia_id");
                dga1.d = mmx1.b("avatar_url");
                list.add(new dfz(dga1));
                i++;
            }
        }

        Collections.sort(d);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return d.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return -1L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a.inflate(b.iC, viewgroup, false);
        }
        view = a(i);
        ((TextView)view1.findViewById(c.bZ)).setText(((dfz) (view)).c);
        viewgroup = (ImageView)view1.findViewById(c.bY);
        c.a(((dfz) (view)).d, viewgroup);
        return view1;
    }
}
