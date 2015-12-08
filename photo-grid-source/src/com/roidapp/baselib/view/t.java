// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.roidapp.baselib.f;
import com.roidapp.baselib.g;
import java.util.ArrayList;
import java.util.List;

public class t extends BaseAdapter
{

    private Context a;
    private List b;
    private int c;

    public t(Context context, int i)
    {
        a = context;
        b = new ArrayList();
        c = i;
    }

    public final void a(String s)
    {
        b.add(s);
    }

    public int getCount()
    {
        if (b != null)
        {
            return b.size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        if (b != null)
        {
            return (String)b.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        c;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 96
    //                   1 76;
           goto _L3 _L4 _L5
_L3:
        view1 = view;
_L2:
        view = (String)b.get(i);
        if (view1 != null && view != null)
        {
            ((TextView)view1.findViewById(f.g)).setText(view);
        }
        return view1;
_L5:
        view1 = LayoutInflater.from(a).inflate(g.c, viewgroup, false);
        continue; /* Loop/switch isn't completed */
_L4:
        view1 = LayoutInflater.from(a).inflate(g.b, viewgroup, false);
        if (true) goto _L2; else goto _L6
_L6:
    }
}
