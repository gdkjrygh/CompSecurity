// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
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

public final class jcy extends BaseAdapter
{

    public final List a = new ArrayList();
    private final LayoutInflater b;
    private final egf c;
    private final mmv d;

    public jcy(Context context, mmv mmv1)
    {
        b = LayoutInflater.from(context);
        c = (egf)olm.a(context, egf);
        d = mmv1;
    }

    private mmx a(int i)
    {
        return d.a(((Integer)a.get(i)).intValue());
    }

    public final void a()
    {
        b.u();
        a.clear();
        Iterator iterator = d.a(new String[] {
            "logged_in"
        }).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            if (!d.a(integer.intValue()).c("is_managed_account"))
            {
                a.add(integer);
            }
        } while (true);
        Collections.sort(a, new mmq(d));
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getDropDownView(i, view, viewgroup);
        view.setBackgroundColor(-1);
        i = view.getResources().getDimensionPixelOffset(b.BZ);
        view.setPadding(i, i, i, i);
        return view;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)((Integer)a.get(i)).intValue();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = b.inflate(b.Ca, null);
        }
        view = a(i);
        ImageView imageview = (ImageView)viewgroup.findViewById(c.fq);
        String s = view.b("profile_photo_url");
        c.a(s, imageview);
        ((TextView)viewgroup.findViewById(c.fs)).setText(view.b("display_name"));
        ((TextView)viewgroup.findViewById(c.fr)).setText(view.b("account_name"));
        return viewgroup;
    }

    public final boolean hasStableIds()
    {
        return true;
    }
}
