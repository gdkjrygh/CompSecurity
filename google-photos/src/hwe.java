// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class hwe extends BaseAdapter
{

    private static final Map a;
    private final List b;
    private final LayoutInflater c;
    private final hrs d;
    private final mmr e;
    private final ForegroundColorSpan f;

    hwe(Context context, List list)
    {
        b = list;
        c = LayoutInflater.from(context);
        d = (hrs)olm.a(context, hrs);
        e = (mmr)olm.a(context, mmr);
        f = new ForegroundColorSpan(context.getResources().getColor(p.aw));
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        hrr hrr1;
        view = c.inflate(b.ye, null);
        TextView textview = (TextView)view.findViewById(c.eD);
        viewgroup = (ImageView)view.findViewById(c.eC);
        hrr1 = (hrr)b.get(i);
        int j = hrr1.c().toLowerCase(Locale.getDefault()).indexOf(hrr1.aq_().toLowerCase(Locale.getDefault()));
        int k = hrr1.aq_().length();
        SpannableString spannablestring = new SpannableString(hrr1.c());
        if (j >= 0)
        {
            spannablestring.setSpan(f, j, j + k, 17);
        }
        textview.setText(spannablestring);
        if (!hrr1.e()) goto _L2; else goto _L1
_L1:
        viewgroup.setImageResource(((Integer)a.get(hsw.g)).intValue());
_L4:
        b.a(view, new ogr(pwy.b, i));
        return view;
_L2:
        if (hrr1.as_() != null)
        {
            d.a(viewgroup, hrr1.as_(), e.d());
        } else
        {
            d.a(viewgroup);
            Integer integer = (Integer)a.get(hrr1.a());
            if (integer != null)
            {
                viewgroup.setImageResource(integer.intValue());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        HashMap hashmap = new HashMap(3);
        hashmap.put(hsw.a, Integer.valueOf(b.yc));
        hashmap.put(hsw.g, Integer.valueOf(b.ya));
        hashmap.put(hsw.b, Integer.valueOf(b.yb));
        hashmap.put(hsw.e, Integer.valueOf(b.yd));
        a = Collections.unmodifiableMap(hashmap);
    }
}
