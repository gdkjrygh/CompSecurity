// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.jcp.JCP;
import com.jcp.util.af;
import com.jcp.util.as;
import com.jcp.util.bh;
import com.jcp.views.TypefaceTextView;
import java.util.List;

public class bs extends BaseAdapter
{

    private List a;
    private Context b;

    public bs(Context context)
    {
        b = context;
        a = as.a(context);
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        TypefaceTextView typefacetextview;
        view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(0x7f03008f, viewgroup, false);
        }
        view = b.getResources();
        viewgroup = (bh)getItem(i);
        typefacetextview = (TypefaceTextView)view1.findViewById(0x7f0e005a);
        typefacetextview.a(viewgroup.b(), 25);
        typefacetextview.setText(viewgroup.a());
        typefacetextview.setTextColor(view.getColor(0x7f0d000e));
        i;
        JVM INSTR tableswitch 0 1: default 108
    //                   0 111
    //                   1 145;
           goto _L1 _L2 _L3
_L1:
        return view1;
_L2:
        if (JCP.s().c())
        {
            typefacetextview.setText(view.getString(0x7f0703fd));
            typefacetextview.setTextColor(view.getColor(0x7f0d000e));
            return view1;
        }
          goto _L1
_L3:
        if (JCP.s().c())
        {
            typefacetextview.a(0x7f02019c, 25);
            typefacetextview.setTextColor(view.getColor(0x7f0d000e));
            return view1;
        } else
        {
            typefacetextview.a(0x7f02019f, 25);
            typefacetextview.setTextColor(view.getColor(0x7f0d005d));
            return view1;
        }
    }
}
