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
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ffg extends BaseAdapter
{

    public final mmv a;
    public final List b = new ArrayList();
    private final mmr c;
    private final egf d;
    private final Context e;
    private final List f;
    private final List g;

    public ffg(Context context)
    {
        e = context;
        android.content.res.Resources resources = context.getResources();
        f = Collections.unmodifiableList(Arrays.asList(new ffi[] {
            ffi.a(resources, ffj.d, c.cI, b.og, pwv.e), ffi.a(resources, ffj.a, c.cH, b.oe, pwv.a), ffi.a(resources, ffj.b, c.cJ, b.oh, pwv.c), ffi.a(resources, ffj.c, c.cK, b.of, pwv.b)
        }));
        g = new ArrayList(f.size());
        a = (mmv)olm.a(context, mmv);
        c = (mmr)olm.a(context, mmr);
        d = (egf)olm.a(context, egf);
    }

    public final int a(int i)
    {
        if (i < b.size())
        {
            return ffh.a;
        } else
        {
            return ffh.b;
        }
    }

    public final void a()
    {
        b.clear();
        g.clear();
        int i = c.d();
        Iterator iterator = a.a(new String[] {
            "logged_in"
        }).iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            Integer integer = (Integer)iterator.next();
            mmx mmx1 = a.a(integer.intValue());
            if (integer.intValue() != i && !mmx1.a("is_managed_account", false))
            {
                b.add(mmx1);
            }
            boolean flag1;
            if (mmx1.a("page_count", 0) > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1 | flag;
        }
        if (flag)
        {
            g.addAll(f);
        } else
        {
            g.addAll(f.subList(1, f.size()));
        }
        notifyDataSetChanged();
    }

    final mmx b(int i)
    {
        return (mmx)b.get(i);
    }

    final ffi c(int i)
    {
        return (ffi)g.get(i - b.size());
    }

    public final int getCount()
    {
        return b.size() + g.size();
    }

    public final Object getItem(int i)
    {
        if (i < b.size())
        {
            return b(i);
        } else
        {
            return c(i);
        }
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        return a(i) - 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view = LayoutInflater.from(e);
            ImageView imageview;
            if (a(i) == ffh.a)
            {
                view1 = view.inflate(b.nU, viewgroup, false);
            } else
            {
                view1 = view.inflate(b.nV, viewgroup, false);
            }
        }
        if (a(i) == ffh.a)
        {
            viewgroup = b(i);
            view = viewgroup.b("profile_photo_url");
            viewgroup = viewgroup.b("account_name");
            imageview = (ImageView)view1.findViewById(p.z);
            d.a(view, imageview);
            ((TextView)view1.findViewById(p.A)).setText(viewgroup);
            b.a(view1, new msm(pwv.d));
        } else
        {
            view = c(i);
            ((ImageView)view1.findViewById(p.B)).setImageDrawable(((ffi) (view)).a);
            ((TextView)view1.findViewById(p.A)).setText(((ffi) (view)).b);
            if (((ffi) (view)).d != null)
            {
                b.a(view1, new msm(((ffi) (view)).d));
                return view1;
            }
        }
        return view1;
    }

    public final int getViewTypeCount()
    {
        return ffh.a().length;
    }
}
