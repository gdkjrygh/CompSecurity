// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kik.android.chat.KikApplication;

public final class v extends ArrayAdapter
{
    private final class a extends Filter
    {

        final v a;

        protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
        {
            obj = new android.widget.Filter.FilterResults();
            if (charsequence == null || charsequence.length() == 0)
            {
                synchronized (v.a(a))
                {
                    obj.values = v.b(a);
                    obj.count = v.b(a).size();
                }
                return ((android.widget.Filter.FilterResults) (obj));
            }
            break MISSING_BLOCK_LABEL_67;
            obj;
            charsequence;
            JVM INSTR monitorexit ;
            throw obj;
            Object obj1 = v.a(a);
            obj1;
            JVM INSTR monitorenter ;
            ArrayList arraylist;
            ArrayList arraylist1;
            int j;
            charsequence = charsequence.toString().toLowerCase();
            arraylist = new ArrayList();
            arraylist1 = new ArrayList();
            arraylist1.addAll(v.b(a));
            j = arraylist1.size();
            int i = 0;
_L2:
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_173;
            }
            String s = (String)arraylist1.get(i);
            if (s.toString().toLowerCase().startsWith(charsequence))
            {
                arraylist.add(s);
            }
            break MISSING_BLOCK_LABEL_197;
            obj.values = arraylist;
            obj.count = arraylist.size();
            obj1;
            JVM INSTR monitorexit ;
            return ((android.widget.Filter.FilterResults) (obj));
            charsequence;
            obj1;
            JVM INSTR monitorexit ;
            throw charsequence;
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
        {
            charsequence = ((CharSequence) (v.a(a)));
            charsequence;
            JVM INSTR monitorenter ;
            filterresults = (ArrayList)filterresults.values;
            Collections.sort(filterresults, String.CASE_INSENSITIVE_ORDER);
            a.clear();
            String s;
            for (filterresults = filterresults.iterator(); filterresults.hasNext(); a.add(s))
            {
                s = (String)filterresults.next();
            }

            break MISSING_BLOCK_LABEL_72;
            filterresults;
            charsequence;
            JVM INSTR monitorexit ;
            throw filterresults;
            a.notifyDataSetChanged();
            charsequence;
            JVM INSTR monitorexit ;
        }

        private a()
        {
            a = v.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b
    {

        TextView a;

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final int a = KikApplication.a(40);
    private final Object b = new Object();
    private List c;
    private List d;
    private Filter e;
    private final int f = KikApplication.a(16);

    public v(Context context, List list)
    {
        super(context, 0x7f030058, list);
        c = list;
        d = new ArrayList(list);
    }

    static Object a(v v1)
    {
        return v1.b;
    }

    static List b(v v1)
    {
        return v1.d;
    }

    public final int a()
    {
        return a * c.size() + f;
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Filter getFilter()
    {
        if (e == null)
        {
            e = new a((byte)0);
        }
        return e;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = new b((byte)0);
            viewgroup = new LinearLayout(getContext());
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            TextView textview = new TextView(getContext());
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, a);
            textview.setGravity(16);
            textview.setLayoutParams(layoutparams);
            textview.setPadding(KikApplication.a(9), 0, 0, 0);
            textview.setSingleLine();
            textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textview.setTextSize(1, 18F);
            viewgroup.addView(textview);
            view.a = textview;
            viewgroup.setTag(view);
        } else
        {
            viewgroup = (LinearLayout)view;
            view = (b)viewgroup.getTag();
        }
        ((b) (view)).a.setText((CharSequence)getItem(i));
        return viewgroup;
    }

}
