// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ac extends BaseAdapter
    implements Filterable
{
    private class a extends Filter
    {

        final ac a;

        protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
        {
            android.widget.Filter.FilterResults filterresults;
            ArrayList arraylist;
            int i;
            int k;
            filterresults = new android.widget.Filter.FilterResults();
            if (charsequence == null || charsequence.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_247;
            }
            charsequence = charsequence.toString().toLowerCase(Locale.getDefault());
            if (charsequence.charAt(0) == '@')
            {
                charsequence = charsequence.substring(1);
            }
            synchronized (ac.a(a))
            {
                arraylist = new ArrayList(ac.b(a));
            }
            k = arraylist.size();
            obj = new ArrayList();
            i = 0;
_L5:
            if (i >= k) goto _L2; else goto _L1
_L1:
            String s;
            String s1;
            s = (String)arraylist.get(i);
            s1 = s.toString().toLowerCase();
            if (!s1.startsWith((new StringBuilder()).append("@").append(charsequence).toString())) goto _L4; else goto _L3
_L3:
            ((ArrayList) (obj)).add(s);
_L7:
            i++;
              goto _L5
            charsequence;
            obj;
            JVM INSTR monitorexit ;
            throw charsequence;
_L4:
            String as[];
            int j;
            int l;
            as = s1.split(" ");
            l = as.length;
            j = 0;
_L9:
            if (j >= l) goto _L7; else goto _L6
_L6:
label0:
            {
                if (!as[j].startsWith(charsequence))
                {
                    break label0;
                }
                ((ArrayList) (obj)).add(s);
            }
            if (true) goto _L7; else goto _L8
_L8:
            j++;
              goto _L9
_L2:
            filterresults.values = obj;
            filterresults.count = ((ArrayList) (obj)).size();
            return filterresults;
              goto _L7
        }

        protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
        {
            if (filterresults.values != null)
            {
                ac.a(a, (ArrayList)filterresults.values);
                a.notifyDataSetChanged();
            }
        }

        private a()
        {
            a = ac.this;
            super();
        }

    }


    private List a;
    private List b;
    private int c;
    private Context d;
    private final Object e = new Object();

    public ac(Context context, int i, List list)
    {
        d = context;
        c = i;
        b = list;
        a = list;
    }

    static Object a(ac ac1)
    {
        return ac1.e;
    }

    static List a(ac ac1, List list)
    {
        ac1.a = list;
        return list;
    }

    static List b(ac ac1)
    {
        return ac1.b;
    }

    public String a(int i)
    {
        return (String)a.get(i);
    }

    public int getCount()
    {
        return a.size();
    }

    public Filter getFilter()
    {
        return new a();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ((LayoutInflater)d.getSystemService("layout_inflater")).inflate(c, null);
        }
        viewgroup = (TextView)view;
        viewgroup.setTextSize(13F);
        viewgroup.setText(a(i));
        return view;
    }
}
