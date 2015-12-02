// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.c.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends ArrayAdapter
{

    protected List a;
    protected Context b;

    public a(Context context, List list)
    {
        super(context, 0);
        a = new ArrayList();
        b = context;
        a = list;
    }

    protected abstract void a(View view, int i, ViewGroup viewgroup);

    protected abstract int b();

    public int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.size();
        }
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
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(b(), viewgroup, false);
        }
        a(view1, i, viewgroup);
        return view1;
    }
}
