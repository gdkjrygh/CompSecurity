// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.ijoysoft.appwall:
//            q, d, ac, r, 
//            ab, o, aa, g

public final class p extends BaseAdapter
{

    private ArrayList a;
    private LayoutInflater b;
    private d c;
    private SharedPreferences d;
    private g e;
    private Context f;

    public p(Context context, GridView gridview)
    {
        b(null);
        b = LayoutInflater.from(context);
        f = context;
        e = new q(this, gridview);
        c = new d();
    }

    private void b(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            a = arraylist;
            return;
        } else
        {
            a = new ArrayList();
            return;
        }
    }

    public final void a(ArrayList arraylist)
    {
        b(arraylist);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = b.inflate(ac.c, null);
            viewgroup = new r(this, (byte)0);
            r.a(viewgroup, (ImageView)view.findViewById(ab.e));
            r.a(viewgroup, (TextView)view.findViewById(ab.k));
            r.b(viewgroup, (TextView)view.findViewById(ab.j));
            r.b(viewgroup, (ImageView)view.findViewById(ab.g));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (r)view.getTag();
        }
        obj = (o)a.get(i);
        r.a(viewgroup).setText(((o) (obj)).c());
        r.b(viewgroup).setText(((o) (obj)).d());
        r.c(viewgroup).setTag(((o) (obj)).e());
        d = f.getSharedPreferences("settings", 0);
        if (!d.getBoolean(((o) (obj)).b(), false))
        {
            r.d(viewgroup).setVisibility(0);
        } else
        {
            r.d(viewgroup).setVisibility(8);
        }
        obj = c.a(((o) (obj)), e);
        if (obj == null)
        {
            r.c(viewgroup).setImageResource(aa.a);
            return view;
        } else
        {
            r.c(viewgroup).setImageBitmap(((android.graphics.Bitmap) (obj)));
            return view;
        }
    }
}
